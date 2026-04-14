package com.IoDemo.InputStreamReader;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file InputStreamReaderDemo
 * @date 2026/04/14  15:11
 * @email thexpxp233@qq.com
 **/
public class InputStreamReaderDemo {

    public static final String PATH = "day14-Max-Io/src/text3.txt";

    public static void main(String[] args) {
        // 目标: 演示一个问题,不同编码读取乱码的问题
        // 使用字符输入流InputStreamReader解决不同编码读取乱码的问题
        // 代码: UTF-8  文件 UTF-8 不乱码
        // 代码: UTF-8  文件 GBK 乱码
        try (
                // 先读取文件原始字节流
                InputStream is = new FileInputStream(PATH) ;
                // 指定字符集把原始字节流转换成字符输入流
                Reader isr = new InputStreamReader(is , "GBK") ;

//                // 1.创建一个字符缓冲输入流对象与源文件接通
//                Reader reader = new FileReader(PATH) ;
                // 创建缓冲字符输入流包装低级的字符输入流
                BufferedReader bufferReader = new BufferedReader(isr)

        ) {
            // 循环改造:
            String line;
            while ((line = bufferReader.readLine()) != null) {
                System.out.println(line);
            }
            // 目前获取文本性能最优雅的方案,性能好,不乱码,可以按照行读取
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
