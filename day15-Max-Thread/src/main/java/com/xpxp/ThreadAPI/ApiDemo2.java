package com.xpxp.ThreadAPI;


import com.xpxp.DTO.MyThread;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file ApiDemo2
 * @date 2026/04/14  21:35
 * @email thexpxp233@qq.com
 **/
public class ApiDemo2 {
    public static void main(String[] args) {
        // 目标:搞清楚线程的join方法:线程插队,让调用这个方法程序先执行
        Thread myThread = new MyThread("默认线程");
        myThread.start();
        // 主线程
        for (int i = 1 ; i <= 5 ; i++) {
            System.out.println(Thread.currentThread().getName() + "主线程输出:" + i);
            if (i == 1) {
                try {
                    myThread.join();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
