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
public class MapTraverseDemo {
    public static void main(String[] args) {
        // 掌握Map集合的方式遍历
        Map<String, Integer> map = new HashMap<>();
        map.put("嫦娥", 20);
        map.put("女儿国王", 31);
        map.put("嫦娥", 28);
        map.put("铁扇公主", 38);
        map.put("紫霞", 28);
        System.out.println(map);// {嫦娥=28, 铁扇公主=38, 紫霞=28, 女儿国王=31}
        // 1.提取Map的所有键到一个Set集合中
        Set<String> keys = map.keySet();
        // 2.遍历Set集合中的所有键
        for (String key : keys) {
            Integer value = map.get(key);
            System.out.println(key + "=" + value);
        }

        // 键值对遍历
        Map<String,Double> map2 = new HashMap<>();
        map2.put("张三", 99.9);
        map2.put("李四", 98.9);
        map2.put("王五", 97.9);
        map2.put("赵六", 96.9);
        Set<Map.Entry<String, Double>> entries = map2.entrySet();
        for (Map.Entry<String, Double> entry : entries) {
            String key = entry.getKey();
            Double value = entry.getValue();
            System.out.println(key + "=" + value);
        }
    }
}
