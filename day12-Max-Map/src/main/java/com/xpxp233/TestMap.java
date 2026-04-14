package com.xpxp233;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file TestMap
 * @date 2026/04/11  15:44
 * @email thexpxp233@qq.com
 **/
public class TestMap {
    public static void main(String[] args) {
        Map<Object, Object> map = new HashMap<>();
        map.put(1,2);
        map.put("测试",4);
        map.put("xpxp",new Student("123",12,"123"));
        System.out.println(map);
        Stream<Map.Entry<Object, Object>> stream = map.entrySet().stream();

    }
}
