package org.file.browse.bean;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author xiaoqianbin
 * @date 2020/6/4
 **/
public class FileDescriptor {

    // 文件名
    private String fileName;

    // yyyy-MM-dd HH:mm:ss
    private String created;

    // 是否是目录
    private boolean directory;


    // 文件全路径
    private String fullPath;

    // 上级目录
    private String parent;

    // 当前目录
    private String currentDir;

    private String size = "";

    public FileDescriptor(String current) {
        this.currentDir = current;
        this.directory = true;
        this.parent = null == new File(current).getParent() ? "/" : new File(current).getParent().replaceAll("\\\\", "/");
        this.fileName = "上级目录";
        this.created = "";
    }

    public FileDescriptor(String fileName, String path) throws IOException {
        if (!path.endsWith("/")) {
            path = path + "/";
        }
        BasicFileAttributeView basicview= Files.getFileAttributeView(Paths.get(path + fileName), BasicFileAttributeView.class, LinkOption.NOFOLLOW_LINKS );
        BasicFileAttributes attr = basicview.readAttributes();
        created = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date(attr.creationTime().toMillis()));
        this.fileName = fileName;
        directory = new File(path + fileName).isDirectory();
        fullPath = path + fileName;
        parent = path;
        if (!directory) {
            long fileSize = getFileSize(fullPath);
            size = fileSize + "b";
            if (fileSize > 1024) {
                size = fileSize / 1024 + "k";
            }
            if (fileSize > 1024 * 1024) {
                size = fileSize / 1024 / 1024 + "m";
            }
        }
    }

    private long getFileSize(String filePath) {
        long size = 0;
        FileInputStream fis = null;
        FileChannel fc = null;
        try {
            File f = new File(filePath);
            fis = new FileInputStream(f);
            fc = fis.getChannel();
            size = fc.size();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (null != fc) {
                try {
                    fc.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (null != fis) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return size;
    }



    public String getFileName() {
        return fileName;
    }

    public String getCreated() {
        return created;
    }

    public boolean isDirectory() {
        return directory;
    }

    public String getFullPath() {
        return fullPath;
    }

    public String getParent() {
        return parent;
    }

    public String getCurrentDir() {
        return currentDir;
    }

    public String getSize() {
        return size;
    }
}
