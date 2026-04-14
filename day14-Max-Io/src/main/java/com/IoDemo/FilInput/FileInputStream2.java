package com.IoDemo.FilInput;


import java.io.FileInputStream;
import java.util.Arrays;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file Main
 * @date 2026/04/13  17:01
 * @email thexpxp233@qq.com
 **/
public class FileInputStream2 {
    private static final String PATH = "day14-Max-Io/src/text1.txt";

    public static void main(String[] args) throws Exception {
        // 目标:掌握文件字节输入流读取文件中的字节数组到内存中
        // 1.创建文件字节输入流管道于源文件接通
        FileInputStream fileInputStream = new FileInputStream(PATH);

        // 2.一次性读完
        byte[] bytes = fileInputStream.readAllBytes();
        System.out.println(Arrays.toString(bytes));
        System.out.println(new String(bytes));


        fileInputStream.close();

    }
}
