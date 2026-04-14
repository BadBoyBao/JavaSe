package com.IoDemo.Print;


import java.io.DataInputStream;
import java.io.FileInputStream;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file DataStreamDemo
 * @date 2026/04/14  16:27
 * @email thexpxp233@qq.com
 **/
public class DataStreamDemo2 {
    public static final String PATH = "day14-Max-Io/src/data.txt";

    public static void main(String[] args) {
        // 目标:特殊数据流
        try (DataInputStream dos = new DataInputStream(new FileInputStream(PATH)) ;) {
            System.out.println(dos.readInt());
            System.out.println(dos.readBoolean());
            System.out.println(dos.readChar());
            System.out.println(dos.readDouble());
            System.out.println(dos.readUTF());
            System.out.println(dos.readByte());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
