package com.xpxp233;


import java.io.Serializable;
import java.util.*;
import java.util.stream.Stream;

public class StreamDemo2 {
    public static void main(String[] args) {
        // 目标:获取Stream流的方式
        // 1.获取集合的Stream流,调用集合提供的stream()方法
        Collection<String> list = new ArrayList<>();
        Stream<String> s1 = list.stream();


        // 2.Map集合,怎么拿Stream流
        Map<String, Integer> map = new HashMap<>();
        Stream<String> stream = map.keySet().stream();
        Stream<Integer> stream1 = map.values().stream();
        Stream<Map.Entry<String, Integer>> stream2 = map.entrySet().stream();

        // 3.获取数组stream流
        String[] arr = { "张三丰" , "张无忌" , "张翠山" , "张三" , "张三" };
        Stream<String> stream3 = Arrays.stream(arr);
        Stream<? extends Serializable> 测试 = Stream.of("测试" , 1 , 2 , 2.4 , true);
    }
}
