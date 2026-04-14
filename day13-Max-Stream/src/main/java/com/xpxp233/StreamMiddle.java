package com.xpxp233;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file StreamMiddle
 * @date 2026/04/12  11:44
 * @email thexpxp233@qq.com
 **/
public class StreamMiddle {
    public static void main(String[] args) {
        // 掌握Stream中间方法,对流上的数据进行处理,(返回新流,支持链式编程)
        List<String> list = new ArrayList<>();
        list.add("张三丰");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        list.add("张无忌");
        list.add("张翠山");
        // 1.过滤方法,
        System.out.println("过滤方法");
        list.stream().filter(s -> s.startsWith("张") && s.length() == 3).forEach(System.out::println);
        // 2.排序 方法
        List<Double> score = new ArrayList<>();
        score.add(90.6);
        score.add(80.2);
        score.add(100.4);
        score.add(60.5);
        System.out.println("排序方法");
        score.stream().sorted().forEach(System.out::println);
        System.out.println("排序方法");
        score.stream().sorted((s1 , s2) -> Double.compare(s2 , s1)).forEach(System.out::println);
        System.out.println("只取前2名");
        score.stream().sorted((s1 , s2) -> Double.compare(s2 , s1)).limit(2).forEach(System.out::println);
        System.out.println("跳过前2名");
        score.stream().sorted((s1 , s2) -> Double.compare(s2 , s1)).skip(2).forEach(System.out::println);
        System.out.println("去重");
        // 如果希望自定义对象,需要重写hashCode()和equals()方法,才可以去重
        score.stream().sorted((s1 , s2) -> Double.compare(s2 , s1)).distinct().forEach(System.out::println);


        // Map
        // 加工方法/映射方法: 把流上原来的数据拿出来变成新数据又放到流上面
        System.out.println("映射方法");
        score.stream().map(s -> "加10分后:" + (s + 10)).forEach(System.out::println);
        System.out.println("合并流");

        Stream<String> s1 = Stream.of("张三丰" , "张无忌" , "张翠山");
        Stream<Integer> s2 = Stream.of(1 , 2 , 3);
        Stream<Object> s3 = Stream.concat(s1 , s2);
        System.out.println(s3.count());
    }
}
