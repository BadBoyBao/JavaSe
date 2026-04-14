package com.xpxp.Create;


import com.xpxp.DTO.MyRunnable;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file RunnableDemo
 * @date 2026/04/14  17:53
 * @email thexpxp233@qq.com
 **/
public class RunnableDemo {
    public static void main(String[] args) {
        // 目标:掌握多线程的创建方式二:实现Runnable接口来创建
        // 1.定义一个线程任务类实现Runnable接口

        // 3.创建一个线程任务对象,代表一个线程任务
        Runnable myRunnable = new MyRunnable();
        Thread t = new Thread(myRunnable);
        t.start();

        // 主线程
        for (int i = 0 ; i < 5 ; i++) {
            System.out.println("主线程输出:" + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
