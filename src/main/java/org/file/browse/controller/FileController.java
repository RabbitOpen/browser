package org.file.browse.controller;

import org.file.browse.bean.FileDescriptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * @author xiaoqianbin
 * @date 2020/6/4
 **/
@RequestMapping("/browser")
@Controller
public class FileController {

    protected static final Logger logger = LoggerFactory.getLogger(FileController.class);

    public static String supervisePath = "/tmp/megrez/loan/";
    public static String jarName = "supervise-deserialize-tool-1.0-SNAPSHOT.jar";
    Pattern pattern = Pattern.compile("^[\\d]*$");

    @ResponseBody
    @RequestMapping("/browse")
    public List<FileDescriptor> browse(@RequestParam(name = "path") String path, HttpServletResponse response) throws IOException {
        File file = new File(path);
        List<FileDescriptor> descriptors = new ArrayList<>();
        if (StringUtils.isEmpty(path) || !file.exists()) {
            String[] list = new File("/").list();
            for (String f : list) {
                descriptors.add(new FileDescriptor(f, "/"));
            }
            descriptors.sort((o1, o2) -> o1.getFileName().compareTo(o2.getFileName()));
            descriptors.add(0, new FileDescriptor("/"));
            return descriptors;
        }
        if (file.isDirectory()) {
            String[] list = file.list();
            if (null != list) {
                for (String f : list) {
                    descriptors.add(new FileDescriptor(f, path));
                }
            }
            descriptors.sort((o1, o2) -> o1.getFileName().compareTo(o2.getFileName()));
            descriptors.add(0, new FileDescriptor(path));
            return descriptors;
        }
        return null;
    }

    @GetMapping("/download")
    public void downloand(@RequestParam(name = "file") String file, HttpServletResponse response) throws IOException {
        response.setHeader("Content-Disposition", "attachment;filename="
                + file.substring(file.lastIndexOf("/") + 1));
        //4.转化为输入流
        InputStream is = new FileInputStream(file);
        //5.创建输出流
        OutputStream os = response.getOutputStream();
        //6.读写数据
        int len;
        byte[] bys = new byte[1024 * 1024];
        while ((len = is.read(bys)) != -1) {
            os.write(bys, 0, len);
        }
        os.flush();
        os.close();
        is.close();
    }

    /**
     * 首页
     * @author xiaoqianbin
     * @date 2020/6/4
     **/
    @RequestMapping("/portal")
    public String portal(HttpServletRequest request, @RequestParam(name = "path", required = false) String path) {
        request.setAttribute("path", null == path ? "/" : path);
        return "portal";
    }

    @RequestMapping("/deserialize")
    public String deserialize(HttpServletRequest request) {
        return "deserialize";
    }

    @RequestMapping("/deserializeList")
    @ResponseBody
    public String[] deserializeList(HttpServletRequest request) {
        logger.info("开始查询可以进行反序列化的文件夹");
        File supervisePathFile = new File(supervisePath);
        List<String> folderList = new ArrayList<>();
        String[] files = supervisePathFile.list();
        for(int i = 0; i < files.length; i++){
            if(pattern.matcher(files[i]).matches()){
                folderList.add(files[i]);
            }
        }

        String[] rtnArr = null;
        if(folderList.size()>0){
            rtnArr = new String[folderList.size()];
            for (int i = 0; i < folderList.size(); i++){
                rtnArr[i] = folderList.get(i);
            }
        }
        return rtnArr;
    }

    @RequestMapping("/startDeserialize")
    @ResponseBody
    public String startDeserialize(HttpServletRequest request, @RequestParam(name = "chklist", required = true) String chklist) throws IOException, InterruptedException {
        logger.info("进入反序列化方法, chklist:{}", chklist);
        List<String> folderList = new ArrayList<>();
        logger.info(chklist.toString());
        String[] folderArr = chklist.split(",");
        for (int i = 0; i < folderArr.length; i++){
            if(!StringUtils.isEmpty(folderArr[i])){
                folderList.add(folderArr[i]);
            }
        }

        for(String folder:folderList){
            String shellPath = this.getClass().getClassLoader().getResource("deserialize.sh").getPath();
            String permissionCommand = "chmod 777 ".concat(shellPath);
            logger.info("shell赋权命令：{}", permissionCommand);
            Process ps1 = Runtime.getRuntime().exec(permissionCommand);
            int exitValue1 = ps1.waitFor();
            logger.info("脚本赋权执行结果为:{}", exitValue1);

            String deserializePath = supervisePath.concat(folder);
            String command = shellPath.concat(" ").concat(jarName).concat(" ").concat(deserializePath);
            logger.info("开始执行反序列化脚本"+folder+", 命令:"+command);
            Process ps2 = Runtime.getRuntime().exec(command);
            int exitValue2 = ps2.waitFor();
            logger.info("反序列化执行结果为:{}", exitValue2);
        }
        return "SUCCESS";
    }
}
