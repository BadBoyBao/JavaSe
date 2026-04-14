package com.xpxp.Create;


import com.xpxp.DTO.MyThread;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file ThreadDemo1
 * @date 2026/04/14  17:19
 * @email thexpxp233@qq.com
 **/
public class ThreadDemo1 {

    // main方法本身是由一条主线程负责推进执行的
    public static void main(String[] args) {
        // 目标:认识多线程,掌握创建线程方式一:继承Thread类
        // 1.定义一个子类继承Thread类,成为一个线程类


        // 创建线程类的对象,代表线程
        Thread myThread = new MyThread("你好");
        myThread.start();   // 让线程启动,让线程执行run方法
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
