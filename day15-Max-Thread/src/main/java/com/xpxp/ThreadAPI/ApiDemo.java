package com.xpxp.ThreadAPI;


import com.xpxp.DTO.MyThread;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file ApiDemo
 * @date 2026/04/14  21:23
 * @email thexpxp233@qq.com
 **/
public class ApiDemo {
    public static void main(String[] args) {
        // 目标:搞清楚Thread常用方法

        Thread t1 = new MyThread("1号线程");
        t1.start();
        System.out.println(t1.getName()); // 线程名:Thread-索引

        Thread t2 = new MyThread("2号线程");
        t2.start();
        System.out.println(t2.getName());//  线程名:Thread-索引

        // 哪个线程调用这个代码.这个代码就拿到哪个线程
        Thread m = Thread.currentThread();
        System.out.println(m.getName());
    }
}
