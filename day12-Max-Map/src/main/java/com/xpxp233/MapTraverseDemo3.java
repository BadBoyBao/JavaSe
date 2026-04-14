package com.xpxp233;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file MapTraverseDemo
 * @date 2026/04/11  16:15
 * @email thexpxp233@qq.com
 **/
public class MapTraverseDemo3 {
    public static void main(String[] args) {
        // 掌握Map集合的方式遍历方式三:lambda方式
        Map<String, Integer> map = new HashMap<>();
        map.put("嫦娥", 20);
        map.put("女儿国王", 31);
        map.put("嫦娥", 28);
        map.put("铁扇公主", 38);
        map.put("紫霞", 28);
        System.out.println(map);// {嫦娥=28, 铁扇公主=38, 紫霞=28, 女儿国王=31}
        // 1.直接调用Map集合的forEach方法完成遍历
        map.forEach((s , integer) -> System.out.println(s + "=" + integer));
        map.forEach((a,b)-> System.out.println(a+b));



    }
}
