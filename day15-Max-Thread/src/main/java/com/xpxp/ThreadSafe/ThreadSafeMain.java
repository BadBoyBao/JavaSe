package com.xpxp.ThreadSafe;


import com.xpxp.DTO.Account;

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
        // 目标:模拟线程安全问题
        // 1.设计一个账户类,用于创建小明和小红的共同账户对象,存入一百万
        Account acc = new Account("ICBC-110" , 1000000);

        // 2.设计线程类: 创建小明和小红两个线程 模拟小明和小红同时去同一个账户取一百万
        new DrawThread("小明" , acc).start();

        new DrawThread("小红" , acc).start();

    }
}
