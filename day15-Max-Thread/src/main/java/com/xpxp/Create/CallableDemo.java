package com.xpxp.Create;


import com.xpxp.DTO.MyCallable;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file CallableDemo
 * @date 2026/04/14  20:58
 * @email thexpxp233@qq.com
 **/
public class CallableDemo {
    public static void main(String[] args) {
        // 目标:搞清楚多线程创建方式三: 实现Callable接口,方式三的优势:可以获取线程执行完后的结果
        // 3.创建一个Callable对象
        Callable<String> callable = new MyCallable(100);
        // 4.把Callable对象封装成一个FutureTask对象
        /**
         * 未来任务的作用?
         * a.本质是一个Runnable线程任务对象,可以交给Thread线程对象处理
         * b.可以获取线程执行完后的结果
         */
        FutureTask<String> futureTask = new FutureTask<>(callable);  // public FutureTask(Callable<V> callable)
        // 5.把FutureTask对象交给Thread线程对象处理
        new Thread(futureTask).start();


        Callable<String> callable2 = new MyCallable(50);
        FutureTask<String> futureTask2 = new FutureTask<>(callable2);
        new Thread(futureTask2).start();


        // 获取线程的执行结果
        try {
            // 如果主线程发现第一个线程还没有执行完毕,会让出cpu资源,等待第一个线程执行完毕,再获取结果
            System.out.println(futureTask.get());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            System.out.println(futureTask2.get());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
