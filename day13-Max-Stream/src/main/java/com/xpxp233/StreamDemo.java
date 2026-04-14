package com.xpxp233;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file StreamDemo
 * @date 2026/04/11  20:17
 * @email thexpxp233@qq.com
 **/
public class StreamDemo {
    public static void main(String[] args) {
        // 目标:认识Stream流,掌握其基本使用步骤,体会他的优势和特点
        List<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        list.add("张无忌");
        list.add("张翠山");
        // 1.使用传统方式,找出姓张的的人,存入一个新的集合中
        List<String> newList = new ArrayList<>();
        for (String s : list) {
            if(s.startsWith("张") && s.length() == 3){
                newList.add(s);
            }
        }
        System.out.println(newList);

        // 2.使用Stream流
        List<String> newList2 = list.stream().filter(s -> s.startsWith("张"))
                              .filter(s -> s.length() == 3)
                              .collect(Collectors.toList());
        System.out.println(newList2);

    }
}
