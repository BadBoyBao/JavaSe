package com.IoDemo.Print;


import java.io.DataOutputStream;
import java.io.FileOutputStream;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file DataStreamDemo
 * @date 2026/04/14  16:27
 * @email thexpxp233@qq.com
 **/
public class DataStreamDemo {
    public static final String PATH = "day14-Max-Io/src/data.txt";

    public static void main(String[] args) {
        // 目标:特殊数据流
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(PATH)) ;) {
            dos.writeInt(100);
            dos.writeBoolean(true);
            dos.writeChar('a');
            dos.writeDouble(3.14);
            dos.writeUTF("hello world");
            dos.writeByte(3);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
