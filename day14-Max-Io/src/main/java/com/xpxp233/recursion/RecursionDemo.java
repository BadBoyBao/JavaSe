package com.xpxp233.recursion;


/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file RecursionDemo
 * @date 2026/04/13  12:15
 * @email thexpxp233@qq.com
 **/
public class RecursionDemo {
    public static void main(String[] args) {
        // 认识递归:
        printA();

    }

    public static void printA() {
        System.out.println("方法A执行了");
        printA();// 直接递归, 会栈溢出 
    }
}
