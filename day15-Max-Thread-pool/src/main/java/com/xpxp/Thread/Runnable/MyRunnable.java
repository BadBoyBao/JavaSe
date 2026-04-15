package com.xpxp.Thread.Runnable;


/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file MyRunnable
 * @date 2026/04/15  11:42
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
            System.out.println(Thread.currentThread().getName() + "输出:" + i);
            try {
                Thread.sleep(Integer.MAX_VALUE);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
