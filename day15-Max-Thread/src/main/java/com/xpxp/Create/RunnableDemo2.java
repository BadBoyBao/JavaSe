package com.xpxp.Create;


/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file RunnableDemo
 * @date 2026/04/14  17:53
 * @email thexpxp233@qq.com
 **/
public class RunnableDemo2 {
    public static void main(String[] args) {

        // 目标:使用Runnable匿名内部类

        // 方式一:
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0 ; i < 5 ; i++) {
                    System.out.println("子线程1输出:" + i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        Thread t = new Thread(r);
        t.start();


        // 方式二:
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0 ; i < 5 ; i++) {
                    System.out.println("子线程2输出:" + i);
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();

        // 方式三:
        new Thread(() -> {
            for (int i = 0 ; i < 5 ; i++) {
                System.out.println("子线程3输出:" + i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        // 主线程:
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
