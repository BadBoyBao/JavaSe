package com.xpxp233.recursion;


/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file RecursionDemo1
 * @date 2026/04/13  12:28
 * @email thexpxp233@qq.com
 **/
public class RecursionDemo1 {
    public static void main(String[] args) {
        // 目标:计算N的阶乘
        System.out.println(factorial(5));

        // 目标:求N的阶乘和
        System.out.println(sum(5));
    }

    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        }
        return factorial(n - 1) * n;
    }

    // f(n) = f(n-1) + n
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return sum(n - 1) + n;
    }
}
