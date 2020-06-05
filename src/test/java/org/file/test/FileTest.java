package org.file.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.file.browse.utils.BigFileReader;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import junit.framework.TestCase;

/**
 * @author xiaoqianbin
 * @date 2020/6/5
 **/
@RunWith(JUnit4.class)
public class FileTest {

	private Logger logger = LoggerFactory.getLogger(getClass());
	
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
        reader.setStepSize(9);
        int lineCount = 0;
        while (reader.hasMore()) {
            String str = reader.readLine();
            if (null != str && !"".equals(str)) {
            	System.out.println(str);
            	lineCount++;
            }
        }
        reader.close();
        TestCase.assertEquals(lineCount, count);
        System.gc();
        Thread.sleep(3000);
        logger.info("{}", new File(fileName).delete());
    }
    
    /**
     * 内存映射文件读写
     * <b>@description  </b>
     * @throws IOException
     */
    @Test
    public void bigFileRead() throws IOException {
    	String fileName = "d:\\b.txt";
    	long start = System.currentTimeMillis();
    	BigFileReader reader = new BigFileReader(fileName);
    	long count = 0;
    	String line = null;
    	while (true) {
    		String s = reader.readLine();
    		if (null == s) {
    			break;
    		}
    		line = s;
    		count++;
    	}
    	logger.info("size: {}, cost: {}", count, System.currentTimeMillis() - start);
    	logger.info("line length: {}", line.length());
    	reader.close();
    }
    
    /**
     * 传统带缓冲读写
     * <b>@description  </b>
     * @throws IOException
     */
    @Test
    public void bufferTest() throws IOException {
    	String fileName = "d:\\b.txt";
    	long start = System.currentTimeMillis();
    	BufferedReader buffer = new BufferedReader(new FileReader(new File(fileName)));
    	long count = 0;
    	while (true) {
    		String line = buffer.readLine();
    		if (null == line && !"".equals(line)) {
    			break;
    		}
    		count++;
    	}
    	logger.info("size: {}, cost: {}", count, System.currentTimeMillis() - start);
    	buffer.close();
    }
   
    
    public static void main(String[] args) throws IOException {
    	String fileName = "d:\\b.txt";
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        int count = 1000 * 1000;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j< 100; j++) {
            	writer.write("abcdefghijkj" + j);
            }
            writer.newLine();
        }
        writer.close();
	}
	
}
