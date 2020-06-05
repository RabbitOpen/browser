package org.file.test;

import junit.framework.TestCase;
import org.file.browse.utils.BigFileReader;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.io.*;
import java.util.List;

/**
 * @author xiaoqianbin
 * @date 2020/6/5
 **/
@RunWith(JUnit4.class)
public class FileTest {

    @Test
    public void readTest() throws IOException, InterruptedException {
        String fileName = "d:\\a.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        int count = 10;
        for (int i = 0; i < count; i++) {
            writer.write("abcdefghijkj" + i);
            writer.newLine();
        }
        writer.close();
        BigFileReader reader = new BigFileReader(fileName);
        reader.setStepSize(30);
        int lineCount = 0;
        while (reader.hasMore()) {
            List<String> list = reader.readLines();
            System.out.println(list);
            lineCount += list.size();
        }
        TestCase.assertEquals(lineCount, count);
        System.gc();
        Thread.sleep(3000);
        System.out.println(new File(fileName).delete());
    }
}
