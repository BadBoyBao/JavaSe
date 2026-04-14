package com.xpxp233;


import java.util.Arrays;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file paramDemo
 * @date 2026/04/12  15:03
 * @email thexpxp233@qq.com
 **/
public class paramDemo {
    public static void main(String[] args) {
        // 认识:可变参数
        sum();
        sum(10);
        sum(10 , 20);

    }

    public static void sum(int... nums) {
        System.out.println(nums.length);
        System.out.println(Arrays.toString(nums));
    }
}
