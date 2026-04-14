package com.IoDemo.FileOutPtu;


import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file FileOutPutDemo1
 * @date 2026/04/13  20:54
 * @email thexpxp233@qq.com
 **/
public class FileOutPutDemo1 {

    private static final String PATH = "day14-Max-Io/src";

    public static void main(String[] args) throws Exception {
        // 目标:学会使用字节输出流
        // 1.创建文件字节输出流管道与目标文件接通
//        OutputStream os = new FileOutputStream(PATH + "/xpxp-out.txt");// 覆盖管道
        OutputStream os = new FileOutputStream(PATH + "/xpxp-out.txt" , true); // 追加管道


        // 换行
        os.write("\r\n".getBytes());
        // 写入数据
        os.write(97);
        os.write('b');
//        os.write('嘘'); // 会乱码
        os.write("1".getBytes());

        // 换行
        os.write("\r\n".getBytes());

        // 3.写一个字节数组出去
        byte[] bytes = "我爱你中国".getBytes();
        os.write(bytes);

        // 换行
        os.write("\r\n".getBytes());

        // 4.写一个字节数组的一部分出去
        os.write(bytes , 0 , 6);

        // 换行
        os.write("\r\n".getBytes());
        os.close();
        os.flush();
    }
}
