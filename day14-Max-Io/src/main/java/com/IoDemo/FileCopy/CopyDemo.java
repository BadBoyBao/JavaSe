package com.IoDemo.FileCopy;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file CopyDemo
 * @date 2026/04/13  22:00
 * @email thexpxp233@qq.com
 **/
public class CopyDemo {

    // 操作路径
    private static final String PATH = "E:/CodeStudy/resource";

    public static void main(String[] args) {
        // 目标:使用字节流完成文件的复制操作
        // 目标文件
        String FileName = PATH + "/证明.png";

        copyFile(FileName , PATH + "/aaa/newPic.png");

    }

    // 复制文件方法
    public static void copyFile(String srcPath , String destPath) {
        // 这是try-with-resource的写法,()里只能放置资源对象,什么是资源对象:创建的类实现AutoCloseable接口的类
        try ( // 1.创建一个文件字节输入流通道与源文件接通
              InputStream fileInputStream = new FileInputStream(srcPath) ;
              // 2.创建一个文件字节输出流通道与目标文件接通
              OutputStream fileOutputStream = new FileOutputStream(destPath)) {
            // 3.开始复制
            byte[] buffer = new byte[1024];
            int len;
            while ((len = fileInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer , 0 , len);
            }
            fileOutputStream.close();
            fileInputStream.close();
            System.out.println("复制完成");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
