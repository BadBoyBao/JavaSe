package com.xpxp233;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file CollectionsDemo
 * @date 2026/04/12  15:14
 * @email thexpxp233@qq.com
 **/
public class CollectionsDemo {
    public static void main(String[] args) {
        // 掌握Collections类
        List<String> list = new ArrayList<>();
        Collections.addAll(list , "张三丰" , "张无忌" , "张翠山" , "张三" , "张三");
        System.out.println(list);

        // 打乱顺序
        Collections.shuffle(list);
        System.out.println(list);

        // 排序
        Collections.sort(list);
        System.out.println(list);

        // 排序，自定义规则
        Collections.sort(list , (s1 , s2) -> s2.length() - s1.length());
        System.out.println(list);
    }
}
