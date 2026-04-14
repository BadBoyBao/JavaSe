package com.synchronizedDemo;


/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file ThreadSafeMain
 * @date 2026/04/14  21:58
 * @email thexpxp233@qq.com
 **/
public class ThreadSafeMain {
    public static void main(String[] args) {
        // 目标:线程同步的方式一演示:同步代码块
        // 1.设计一个账户类,用于创建小明和小红的共同账户对象,存入一百万
        Account acc = new Account("ICBC-110" , 1000000);

        // 2.设计线程类: 创建小明和小红两个线程 模拟小明和小红同时去同一个账户取一百万
        new DrawThread("小明" , acc).start();

        new DrawThread("小红" , acc).start();


        Account acc2 = new Account("ICBC-110" , 1000000);
        new DrawThread("小黑" , acc2).start();
        new DrawThread("小紫" , acc2).start();

    }
}
