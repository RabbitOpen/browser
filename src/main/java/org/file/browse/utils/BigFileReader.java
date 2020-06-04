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

    private StringBuilder lineBuffer = new StringBuilder();

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

    public List<String> readLines() throws IOException {
        List<String> list = new ArrayList<>();
        File file = new File(fileName);
        long length = (fileSize - cursor) > stepSize ? stepSize : (fileSize - cursor);
        RandomAccessFile raf = new RandomAccessFile(file, "rw");
        // 如果只需要一行一行的读取，利用raf.readLine()比较简单
        MappedByteBuffer buffer = raf.getChannel().map(FileChannel.MapMode.READ_ONLY,
                cursor, length);
        long index = 0;
        for (int i = 0; i < length; i++) {
            if (buffer.get(i) == 13) {
                // \r
                continue;
            }
            if (buffer.get(i) == 10) {
                // \n
                list.add(lineBuffer.toString());
                lineBuffer.delete(0, lineBuffer.length());
            } else {
                lineBuffer.append((char) buffer.get(i));
            }
        }
        if (length < stepSize) {
            if (0 != lineBuffer.length()) {
                list.add(lineBuffer.toString());
                lineBuffer.delete(0, lineBuffer.length());
            }
            cursor = fileSize;
        } else {
            cursor += length;
        }
        buffer.clear();
        raf.close();
        return list;
    }

    public long getStepSize() {
        return stepSize;
    }

    public void setStepSize(long stepSize) {
        this.stepSize = stepSize;
    }

    public static void main(String[] args) throws IOException {
        BigFileReader reader = new BigFileReader("d:\\a.txt");
        reader.setStepSize(30);
        while (reader.hasMore()) {
            List<String> list = reader.readLines();
            System.out.println(list);
        }
    }
}
