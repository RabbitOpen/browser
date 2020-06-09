package org.file.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.security.AccessController;
import java.security.PrivilegedAction;

/**
 * @author xiaoqianbin
 * @date 2020/6/8
 **/
@RunWith(JUnit4.class)
public class ReadWrite {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void bufferedInputStreamRead() throws IOException {
        String fileName = "d:\\b.txt";
        long start = System.currentTimeMillis();
        int size = 16 * 1024 * 1024;
        BufferedInputStream in = new BufferedInputStream(new FileInputStream(new File(fileName)), size);
        byte[] b = new byte[size];
        int len = 0;
        FileOutputStream fos = new FileOutputStream("d:\\out.txt");
        while (-1 != (len = in.read(b))) {
            fos.write(b, 0, len);
            fos.flush();
        }
        logger.info("write over! cost: {}", System.currentTimeMillis() - start);
        in.close();
        fos.close();;

    }

    @Test
    public void mappedBufferRead() throws IOException {
        String fileName = "d:\\b.txt";
        long start = System.currentTimeMillis();
        RandomAccessFile raf = new RandomAccessFile(fileName, "r");
        int size = 4 * 1024 * 1024;
        long cursor = 0;
        long step = size;
        FileOutputStream fos = new FileOutputStream("d:\\out.txt");
        byte[] b = new byte[size];
        while (step == size) {
            long left = new File(fileName).length() - cursor;
            step = left > size ? size : left;
            MappedByteBuffer buffer = raf.getChannel().map(FileChannel.MapMode.READ_ONLY, cursor, step);
            cursor += step;
            buffer.get(b, 0, buffer.limit());
            fos.write(b, 0, buffer.limit());
            releaseMappedByteBufferResources(buffer);
        }
        logger.info("write over! cost: {}", System.currentTimeMillis() - start);
        raf.close();
        fos.close();;

    }

    protected void releaseMappedByteBufferResources(MappedByteBuffer buffer) {
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

}
