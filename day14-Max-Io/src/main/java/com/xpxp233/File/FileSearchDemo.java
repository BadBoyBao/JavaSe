package com.xpxp233.File;


import java.io.File;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file FileSearchDemo
 * @date 2026/04/13  13:38
 * @email thexpxp233@qq.com
 **/
public class FileSearchDemo {
    public static void main(String[] args) {
        // 目标:找到D:盘下QQ.exe的位置
        File file = new File("D:/");
        fileSearch(file , "QQ.exe");
    }

    /**
     * 搜索文件
     *
     * @param dir      目录
     * @param fileName 文件名
     */
    public static void fileSearch(File dir , String fileName) {
        // 记录开始时间
        long startTime = System.currentTimeMillis();
        // 1.判断极端情况
        if (dir == null || !dir.exists() || dir.isFile()) {
            return; // 不搜索
        }

        // 2.获取目录下的所有一级文件或者文件夹对象
        File[] files = dir.listFiles();


        // 3.判断当前目录下是否存在一级文件对象,存在才可以遍历
        if (files != null && files.length > 0) {
            for (File file : files) {
                if (file.isFile()) {
                    if (file.getName().contains(fileName)) {
                        System.out.println("找到目标文件:" + file.getAbsolutePath());
                        long endTime = System.currentTimeMillis();
                        System.out.println("文件搜索完成，耗时: " + (endTime - startTime) + " 毫秒");
                    }
                } else {
                    // 递归
                    fileSearch(file , fileName);
                }
            }
        }

    }
}
