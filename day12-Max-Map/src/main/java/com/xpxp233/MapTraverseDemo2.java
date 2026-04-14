package com.xpxp233;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file MapTraverseDemo
 * @date 2026/04/11  16:15
 * @email thexpxp233@qq.com
 **/
public class MapTraverseDemo2 {
    public static void main(String[] args) {
        // 掌握Map集合的方式遍历方式二:键值对
        Map<String, Integer> map = new HashMap<>();
        map.put("嫦娥", 20);
        map.put("女儿国王", 31);
        map.put("嫦娥", 28);
        map.put("铁扇公主", 38);
        map.put("紫霞", 28);
        System.out.println(map);// {嫦娥=28, 铁扇公主=38, 紫霞=28, 女儿国王=31}
        // 1.把Map的所有键值对都提取到一个Set集合中,集合中元素都是Map.Entry<String , Integer>
        /**
         * map = {嫦娥=28, 铁扇公主=38, 紫霞=28, 女儿国王=31}
         * ↓
         * map.entrySet()
         * ↓
         * Set<Map.Entry<String, Integer>> entries = [{嫦娥=28, 铁扇公主=38, 紫霞=28, 女儿国王=31}]
         *
         */

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + "=" + value);

        }

    }
}
