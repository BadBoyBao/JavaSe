package com.IoDemo.FilInput;


import java.io.FileInputStream;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file Main
 * @date 2026/04/13  17:01
 * @email thexpxp233@qq.com
 **/
public class FileInputStream1 {
    private static final String PATH = "day14-Max-Io/src/text1.txt";

    public static void main(String[] args) throws Exception {
        // 目标:掌握文件字节输入流读取文件中的字节数组到内存中
        // 1.创建文件字节输入流管道于源文件接通
        FileInputStream fileInputStream = new FileInputStream(PATH);


        // 2.开始读取文件中的字节并输出
        // 垃圾代码↓↓↓↓↓↓↓↓
//        int b;
//        while ((b = fileInputStream.read()) != -1) {
//            System.out.print((char) b);
//        }


        // 每次读取一个字节问题:性能较差,读取汉字一定会乱码
        // 为什么会乱码: 一个汉字占用三个字节,一个字节一个字节的读取,导致乱码

        // 解决方法:定义一个字节数组
        byte[] buffer = new byte[3]; //3
        // 定义一个变量记录每次读取了多少字节个数
        int len;
        while ((len = fileInputStream.read(buffer)) != -1) {
            // 注意:读多少字节个数,就截取多少字节个数
            String s = new String(buffer , 0 , len);
            System.out.print(s);
        }

        fileInputStream.close();

        // 扩展:每次读取多个字节,性能得到提升,因为每次读取多个字节,可以减少硬盘和内存的交互次数,提升性能
    }
}
