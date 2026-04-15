package com.xpxp.Thread.create;


import com.xpxp.Thread.Runnable.MyRunnable;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file CreateThreadPool
 * @date 2026/04/15  11:06
 * @email thexpxp233@qq.com
 **/
public class CreateThreadPool_execute {
    public static void main(String[] args) {
        // 目标:创建线程池对象来使用
        // 1.使用线程池实现类ThreadPoolExecutor声明7个参数来创建线程池对象
        ThreadPoolExecutor executor = new ThreadPoolExecutor(3 , 5 , 10 , TimeUnit.SECONDS ,
                new ArrayBlockingQueue<>(3) , Executors.defaultThreadFactory() , new ThreadPoolExecutor.CallerRunsPolicy());

        // 2.使用线程池处理任务!看会不会复用线程?
        MyRunnable myRunnable = new MyRunnable();
        executor.execute(myRunnable); // 提交第一个任务 创建1线程 自动启动线程处理这个任务
        executor.execute(myRunnable); //  提交第二个任务 创建2线程 自动启动线程处理这个任务
        executor.execute(myRunnable); //  提交第三个任务 创建3线程 自动启动线程处理这个任务
        executor.execute(myRunnable); // 预期是:复用线程
        executor.execute(myRunnable); // 预期是:复用线程
        executor.execute(myRunnable); // 预期是:复用线程

        executor.execute(myRunnable); // 预期是:复用线程
        executor.execute(myRunnable); // 预期是:复用线程

//        executor.execute(myRunnable); // 拒绝策略 ThreadPoolExecutor.AbortPolicy() 丢弃任务并抛异常
//        executor.execute(myRunnable); // 拒绝策略 ThreadPoolExecutor.DiscardPolicy() 丢弃任务,不抛异常,这是不推荐的方法
//        executor.execute(myRunnable); // 拒绝策略 ThreadPoolExecutor.DiscardOldestPolicy() 抛弃队列中等待最久的任务 然后把当前任务加入队列中
        executor.execute(myRunnable); // 拒绝策略 ThreadPoolExecutor.CallerRunsPolicy()  由主线程负责调用任务的run()方法从而绕过线程池直接执行

        // 3.关闭线程池 : 一般不关闭线程池
//        executor.shutdown();
//        executor.shutdownNow();


    }
}
