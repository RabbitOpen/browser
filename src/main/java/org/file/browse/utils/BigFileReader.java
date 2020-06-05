package org.file.browse.utils;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.List;

/**
 * 大文件读取工具
 * @author xiaoqianbin
 * @date 2020/6/4
 **/
public class BigFileReader {

    private String fileName;

    private long cursor = 0L;

    private long fileSize = 0L;

    // 单次读取的步长
    private long stepSize = 10L * 1024 * 1024;

    public BigFileReader(String fileName) {
        File file = new File(fileName);
        fileSize = file.length();
        this.fileName = fileName;
    }

    public boolean hasMore() {
        return cursor != fileSize;
    }

    /**
     * 根据设置的步长读取一定大小的文件内容到内存中
     * @author  xiaoqianbin
     * @date    2020/6/5
     **/
    public List<String> readLines() throws IOException {
        List<String> list = new ArrayList<>();
        File file = new File(fileName);
        long length = (fileSize - cursor) > stepSize ? stepSize : (fileSize - cursor);
        RandomAccessFile raf = new RandomAccessFile(file, "r");
        // 如果只需要一行一行的读取，利用raf.readLine()比较简单
        MappedByteBuffer buffer = raf.getChannel().map(FileChannel.MapMode.READ_ONLY, cursor, length);
        for (int i = 0; i < length; i++) {
            if (buffer.get(i) == 13) {
                // \r
                byte[] dist = new byte[i - buffer.position()];
                if (dist.length > 0) {
                    buffer.get(dist);
                    list.add(new String(dist));
                }
                buffer.position(i);
                continue;
            }
            if (buffer.get(i) == 10) {
                // \n
                buffer.getChar();
            }
        }
        if (cursor + length == fileSize) {
            // 这是最后一页
            byte[] dist = new byte[buffer.limit() - buffer.position()];
            if (dist.length > 0) {
                buffer.get(dist);
                list.add(new String(dist));
            }
        }
        cursor += buffer.position();
        buffer.clear();
        raf.close();
        return list;
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
