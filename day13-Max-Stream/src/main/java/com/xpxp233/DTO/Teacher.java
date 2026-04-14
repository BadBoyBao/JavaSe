package com.xpxp233.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file Teacher
 * @date 2026/04/12  12:51
 * @email thexpxp233@qq.com
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teacher implements Comparable<Teacher> {
    private String name;
    private int age;
    private double salary;

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}' + "\n";
    }

    /**
     * @param o the object to be compared.
     * @return
     */
    // t2.compareTo(t1)
    // t2 == this 比较者
    // t1 == 0 被比较者
    // 规定1: 左边大于右边 , 返回正整数
    //      2: 左边小于右边 , 返回负整数
    //      3: 左边等于右边 , 返回0
    @Override
    public int compareTo(Teacher o) {
        // 注释这一段是垃圾代码
//        if(this.getAge() > o.getAge()){
//            return 1;
//        }
//        if(this.getAge() < o.getAge()){
//            return -1;
//        }
//        return 1;
//        return this.getAge() - o.getAge();// 升序
        return o.getAge() - this.getAge(); //  降序
    }
}
