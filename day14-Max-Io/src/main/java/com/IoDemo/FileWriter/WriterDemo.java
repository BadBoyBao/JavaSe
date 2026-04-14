package com.IoDemo.FileWriter;


import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file WriterDemo
 * @date 2026/04/14  11:47
 * @email thexpxp233@qq.com
 **/
public class WriterDemo {
    public static final String PATH = "day14-Max-Io/src/writer.txt";

    public static void main(String[] args) {
        // 目标:掌握文件字符输出流写入字符内容到文件中
        // 1.创建一个字符输出流对象,指定写出的目的地

        try (Writer wr = new FileWriter(PATH , true) ;) {
            // 2.开始写入  public void write(int c)
            wr.write("\r\n");
            wr.write('a');
            wr.write(98);
            wr.write('沛');
            wr.write("\r\n");

            // 3.写一个字符串出去,public void write(String str)
            wr.write("我爱Java,想找一段小厂实习");
            wr.write("JAVA");
            wr.write("\r\n");

            // 3.1 写一个字符串一部分出去,public void write(String str, int off, int len)
            wr.write("JAVA" , 1 , 2);
            wr.write("\r\n");

            // 4.写一个数组出去,public void write(char[] cbuf)
            char[] chars = "JAVA".toCharArray();
            wr.write(chars);
            wr.write("\r\n");

            // 5.写一个数组一部分出去,public void write(char[] cbuf, int off, int len)
            wr.write(chars , 1 , 2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
