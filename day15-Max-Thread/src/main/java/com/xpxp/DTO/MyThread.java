package com.xpxp.DTO;


/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file MyThread
 * @date 2026/04/14  17:21
 * @email thexpxp233@qq.com
 **/
public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    // 重写Thread类的run方法
    @Override
    public void run() {
        // 3.在run方法中编写线程要执行的任务
        for (int i = 1 ; i <= 5 ; i++) {
            System.out.println(Thread.currentThread().getName() + "子线程输出:" + i);
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
    }
}
