package org.file.browse.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.AccessController;
import java.security.PrivilegedAction;

/**
 * 大文件读取工具
 * @author xiaoqianbin
 * @date 2020/6/4
 **/
public class BigFileReader {
	
	private Logger logger = LoggerFactory.getLogger(getClass());

    private String fileName;

    // 全局游标
    private long globalCursor = 0;
    
    // 局部游标
    private int cursor = 0;

    private long fileSize = 0L;

    // 单次读取的步长
    private long stepSize = 512L * 1024 * 1024;
    
    // 本次映射步长
    private long currentStepSize = 0L;
    
    // 本次映射起始偏移
    private long currentOffset = 0L;
    
    RandomAccessFile raf;
    
    private MappedByteBuffer buffer;
    
    // 缓冲区 8k
    private byte[] dist = new byte[8 * 1024];

    public BigFileReader(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        fileSize = file.length();
        this.fileName = fileName;
        raf = new RandomAccessFile(this.fileName, "r");
    }

    public boolean hasMore() {
        return globalCursor != fileSize;
    }
    
	public String readLine() throws IOException {
		initMapBuffer();
		for (int i = cursor; i < buffer.limit(); i++) {
			int c = buffer.get(i);
			if (c == 13) {
				// \r
				int len = i - cursor;
				readBytes(len);
				cursor += len + 1;
				return new String(dist, 0, len);
			} else if (c == 10) {
				// \n
				cursor += 1;
			}
		}
		if (0 == cursor && 0 != buffer.limit()) {
			// 步长不够，扩容
			stepSize = stepSize * 2;
		}
		if (currentOffset + currentStepSize == fileSize) {
			// 最后一次映射
			if (cursor != buffer.limit()) {
				int len = buffer.limit() - cursor;
				readBytes(len);
				cursor = buffer.limit();
				globalCursor += cursor;
				return new String(dist, 0, len);
			} else {
				globalCursor += cursor;
				return null;
			}
		} else {
			releaseMappedByteBufferResources();
			buffer = null;
			return readLine();
		}
	}

	protected void initMapBuffer() throws IOException {
		if (null == buffer) {
			globalCursor += cursor;
			// 剩余未读文件大小
			long left = fileSize - globalCursor;
			// 本次映射大小
			currentStepSize = left > stepSize ? stepSize : left;
			currentOffset = globalCursor;
			cursor = 0;
			try {
				buffer = raf.getChannel().map(FileChannel.MapMode.READ_ONLY, globalCursor, currentStepSize);
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
			}
		}
	}

	/**
	 * 释放资源
	 * <b>@description  </b>
	 * @throws IOException
	 */
	public void close() throws IOException {
		releaseMappedByteBufferResources();
		raf.close();
	}

	protected void releaseMappedByteBufferResources() {
		AccessController.doPrivileged(new PrivilegedAction<String>() {
			@SuppressWarnings("restriction")
			public String run() {
				try {
					Method getCleanerMethod = buffer.getClass().getMethod("cleaner");
					getCleanerMethod.setAccessible(true);
					sun.misc.Cleaner cleaner = (sun.misc.Cleaner) getCleanerMethod.invoke(buffer);
					cleaner.clean();
				} catch (Exception e) {
					e.printStackTrace();
				}
				return null;
			}
		});
	}
	
	protected void readBytes(int len) {
		if (dist.length < len) {
			dist = new byte[len];
		}
		buffer.position(cursor);
		buffer.get(dist, 0, len);
	}

    public long getStepSize() {
        return stepSize;
    }

    public void setStepSize(long stepSize) {
        if (stepSize > 0) {
            this.stepSize = stepSize;
        }
    }

}
