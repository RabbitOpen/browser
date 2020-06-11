package org.file.test;

import com.jd.fastjson.JSONObject;
import com.jdd.fintech.megrez.loan.core.common.submit.ReportObjectReader;
import com.jdd.fintech.megrez.loan.core.common.submit.model.credit.UserAccountInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author xiaoqianbin
 * @date 2020/6/8
 **/
@RunWith(JUnit4.class)
public class ReadWrite {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void analyseFiles() throws IOException, InstantiationException, IllegalAccessException {
        String dir = "C:\\Users\\xiaoqianbin\\Downloads";
        String[] files = new File(dir).list();
        for (String file : files) {
            BufferedReader reader = new BufferedReader(new FileReader(new File(dir + "/" + file)));
            String line = reader.readLine();
            System.out.println(line);
            if (file.startsWith("JD_Net_AccountInfo")) {
                Object o = ReportObjectReader.parseStrToObj(UserAccountInfo.class, line);
                logger.info(JSONObject.toJSONString(o));
            }
            reader.close();
        }

    }

    @Test
    public void cal() {
        int n = 8;
        List<Integer> arr = new ArrayList<>();
        int[] sub = new int[]{ n + 1, n - 1, 2 * n + 1, 2 * n - 1, 3 * n + 1, 3 * n - 1, 4 * n + 1, 5 * n - 1, 30};
        for (int j : sub) {
            arr.clear();
            for (int i = 0; i < j; i++) {
                arr.add(i, (n * i + 1) % j);
            }
            arr.sort((o1, o2) -> o1 - o2);
            System.out.println(j + ": " + arr);
        }
    }

}
