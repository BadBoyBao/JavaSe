package com.IoDemo.FileReader;


import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file ReaderDemo
 * @date 2026/04/14  11:03
 * @email thexpxp233@qq.com
 **/
public class ReaderDemo {
    public static final String PATH = "day14-Max-Io/src/text2.txt";

    public static void main(String[] args) {

        // 目标:掌握文件字符输入流读取字符内容到程序中
        try (
                // 创建字符输入流通道与源文件接通
                Reader reader = new FileReader(PATH)) {

            // 定义一个字符数组,每次读取多个字符
            char[] buffer = new char[3];
            int len;
            while ((len = reader.read(buffer)) != -1) {
                System.out.print(new String(buffer , 0 , len));
            }
            // 扩展:文件字符流每次读取多个字符,性能较好,而且读取中文是按照字符读取,不会乱码,这是一个读取中文很好的方案
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
