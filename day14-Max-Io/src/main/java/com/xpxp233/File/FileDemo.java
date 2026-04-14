package com.xpxp233.File;


import java.io.File;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file FileDemo
 * @date 2026/04/12  17:48
 * @email thexpxp233@qq.com
 **/
public class FileDemo {
    public static final String path = "E:/CodeStudy\\resource";
    public static String fileName; // 路径

    public static void main(String[] args) {
        show3();

    }

    // 1.创建File对象代表文件(文件/目录)
    public static void show() {
        fileName = path + "证明.png";
        // 1.创建File对象代表文件(文件/目录)
        File file = new File(fileName);
        System.out.println("文件名:" + file.getName());
        System.out.println("文件大小:" + file.length());
        System.out.println("文件是否存在:" + file.exists());
        System.out.println("文件是否可读:" + file.canRead());
        System.out.println("文件是否可写:" + file.canWrite());
        System.out.println("文件是否隐藏:" + file.isHidden());
        System.out.println("文件是否是目录:" + file.isDirectory());
        System.out.println("文件是否是文件:" + file.isFile());
        System.out.println("文件最后修改时间:" + file.lastModified());
        System.out.println("文件父目录:" + file.getParent());
        System.out.println("文件绝对路径:" + file.getAbsolutePath());
        System.out.println("文件相对路径:" + file.getPath());
        System.out.println("文件是否可执行:" + file.canExecute());
    }

    // 2.文件夹
    public static void show2() {
        fileName = path + "/aaa";
        File file = new File(fileName);
        boolean exists = file.exists();
        System.out.println(exists);
        System.out.println(file.mkdir()); // mkdir只能创建一级目录

        // 创建多级 目录
        File newFiles = new File(path + "/aaa/bbb");
        System.out.println(newFiles.mkdirs());

        // 删除文件,或者空文件夹
        System.out.println(newFiles.delete());

    }

    // 遍历指定文件夹下的所有文件
    public static void show3() {
        File file = new File(path);
        String[] list = file.list();
        for (String s : list) {
            System.out.println(s);
        }

        File[] files = file.listFiles();
        for (File f : files) {
            System.out.println(f.getPath());
        }
    }
}
