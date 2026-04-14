package com.xpxp233;


import com.xpxp233.DTO.Teacher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file StreamEnd
 * @date 2026/04/12  12:39
 * @email thexpxp233@qq.com
 **/
public class StreamEnd {
    public static void main(String[] args) {
        // 掌握stream的终止方法,将流中的数据映射成新的数据,得到新的流,并返回给调用者
        List<Teacher> list = new ArrayList<>();
        list.add(new Teacher("张三丰" , 18 , 25000));
        list.add(new Teacher("张无忌" , 33 , 15000));
        list.add(new Teacher("李四" , 44 , 55000));
        list.add(new Teacher("金毛狮王" , 22 , 50600));
        list.add(new Teacher("白眉鹰王" , 66 , 25000));
        list.add(new Teacher("张翠山" , 33 , 15000));
        list.add(new Teacher("张三" , 18 , 25000));

        list.stream().filter(t -> t.getSalary() > 30000).forEach(System.out::println);

        System.out.println("统计个数");
        long count = list.stream().filter(t -> t.getSalary() > 30000).count();
        System.out.println(count);

        System.out.println("--------------------------------------------");
        Optional<Teacher> max = list.stream().max((t1 , t2) -> Double.compare(t1.getSalary() , t2.getSalary()));
        Teacher teacher = max.get();
        System.out.println(teacher);
        System.out.println("--------------------------------------------");
        Optional<Teacher> min = list.stream().min((t1 , t2) -> Double.compare(t1.getSalary() , t2.getSalary()));
        Teacher teacher1 = min.get();
        System.out.println(teacher1);
        System.out.println("--------------------------------------------");

        // 收集

        List<String> nameList = new ArrayList<>();
        nameList.add("张三丰");
        nameList.add("李四");
        nameList.add("王五");
        nameList.add("赵六");
        nameList.add("张无忌");
        nameList.add("张翠山");
        // 收集到List集合中
        List<String> newList = nameList.stream().filter(s -> s.startsWith("张")).collect(Collectors.toList());
        System.out.println(newList);

        // 收集到Set集合中
        Set<String> set = new HashSet<>();
        set.addAll(newList);
        // 方法二:
        Set<String> s1 = nameList.stream().filter(s -> s.startsWith("张")).collect(Collectors.toSet());
        System.out.println("Set集合:" + s1);

        // 收集到数组中区
        Object[] array = list.stream().filter(t -> t.getSalary() > 30000).toArray();
        System.out.println("数组:" + Arrays.toString(array));

        System.out.println("------------Map-----------------");
//        list.stream().collect(Collectors.toMap(Teacher::getName , Teacher::getSalary));
        Map<String, Double> collect = list.stream().collect(Collectors.toMap(Teacher::getName , Teacher::getSalary));
        System.out.println(collect);
        // 收集到map,要求键是老师的名称,值是老师的薪水

        //

    }
}
