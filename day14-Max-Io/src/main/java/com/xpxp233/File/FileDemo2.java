package com.xpxp233.File;


import com.xpxp233.DTO.Path;

import java.io.File;
import java.util.Arrays;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file FileDemo2
 * @date 2026/04/13  11:41
 * @email thexpxp233@qq.com
 **/
public class FileDemo2 {
    public static final String FILE = "E:/CodeStudy/resource";

    public static void main(String[] args) {
        // 目标: 掌握File遍历一级文件对象的操作
        File file = new File(Path.FILE_PATH2);


        /**
         * 当主调是文件，或者路径不存在时，返回null
         * 当主调是空文件夹时，返回一个长度为0的数组
         * 当主调是一个有内容的文件夹时，将里面所有一级文件和文件夹的路径放在File数组中返回
         * 当主调是一个文件夹，且里面有隐藏文件时，将里面所有文件和文件夹的路径放在File数组中返回，包含隐藏文件
         * 当主调是一个文件夹，但是没有权限访问该文件夹时，返回null
         */

        File[] files = file.listFiles(); // 当主调是文件，或者路径不存在时，返回null
        System.out.println(files);

        File file1 = new File(FILE + "/aaa");
        File[] files1 = file1.listFiles();
        System.out.println(Arrays.toString(files1)); // 当主调是空文件夹时，返回一个长度为0的数组

    }
}
