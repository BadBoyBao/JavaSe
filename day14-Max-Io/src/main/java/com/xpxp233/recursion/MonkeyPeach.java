package com.xpxp233.recursion;


/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file MonkeyPeach
 * @date 2026/04/13  13:24
 * @email thexpxp233@qq.com
 **/
public class MonkeyPeach {
    public static void main(String[] args) {
        // 目标:解决猴子吃桃问题

        System.out.println(f(1));
        System.out.println(f(2));
        System.out.println(f(3));
        System.out.println(f(4));
        System.out.println(f(5));
        System.out.println(f(6));
        System.out.println(f(7));
        System.out.println(f(8));
        System.out.println(f(9));
        System.out.println(f(10));
        // 终点:f(10) = 1

    }

    public static int f(int day) {
        if (day == 10) {
            return 1;
        } else {
            return 2 * f(day + 1) + 2;
        }

    }

}
