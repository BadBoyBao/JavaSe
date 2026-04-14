package com.xpxp233.Bytes;


import java.util.Arrays;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file ByteDemo
 * @date 2026/04/13  16:49
 * @email thexpxp233@qq.com
 **/
public class ByteDemo {
    public static void main(String[] args) throws Exception {
        // 目标:写程序实现字符编码,解码
        String name = "我爱你中国abc123";
        byte[] bytes = name.getBytes("GBK");
        System.out.println(bytes.length);
        System.out.println(Arrays.toString(bytes));


        // 解码
        String s = new String(bytes);
        System.out.println(s);

    }
}
