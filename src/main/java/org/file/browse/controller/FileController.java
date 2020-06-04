package org.file.browse.controller;

import org.file.browse.bean.FileDescriptor;
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

/**
 * @author xiaoqianbin
 * @date 2020/6/4
 **/
@RequestMapping("/browser")
@Controller
public class FileController {

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

}
