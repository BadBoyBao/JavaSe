package com.IoDemo.TestCommonsIo;


import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file Demo
 * @date 2026/04/14  16:43
 * @email thexpxp233@qq.com
 **/
public class Demo {
    public static final String PATH = "day14-Max-Io/src/csb.txt";
    public static final String PATH2 = "day14-Max-Io/src/new_csb.txt";

    public static void main(String[] args) throws IOException {
        // 目标:Io框架
        FileUtils.copyFile(new File(PATH) , new File(PATH2));
    }
}
