package com.xpxp.DTO;


/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file MyRunnable
 * @date 2026/04/14  17:53
 * @email thexpxp233@qq.com
 **/
public class MyRunnable implements Runnable {
    /**
     *
     */
    @Override
    public void run() {
        // 3.在run方法中编写线程要执行任务
        for (int i = 0 ; i < 5 ; i++) {
            System.out.println("子线程输出:" + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
