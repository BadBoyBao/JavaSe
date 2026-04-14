package com.IoDemo.Print;


import java.io.PrintWriter;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file PrintStream
 * @date 2026/04/14  16:11
 * @email thexpxp233@qq.com
 **/
public class PrintStreamDemo {

    public static final String PATH = "day14-Max-Io/src/print.txt";

    public static void main(String[] args) {
        // 目标:打印流的作用
        try (
//                PrintStream ps = new PrintStream(PATH) ;
                PrintWriter ps = new PrintWriter(PATH) ;

        ) {
            ps.println("hello world");
            ps.println(123);
            ps.println(true);
            ps.println('a');
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
