package com.xpxp.Thread.create;


import com.xpxp.Thread.Runnable.MyCallable;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
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
public class CreateThreadPool_submit {
    public static void main(String[] args) {
        // 目标:创建线程池对象来使用
        // 1.使用线程池实现类ThreadPoolExecutor声明7个参数来创建线程池对象
        ThreadPoolExecutor executor = new ThreadPoolExecutor(3 , 5 , 10 , TimeUnit.SECONDS ,
                new ArrayBlockingQueue<>(3) , Executors.defaultThreadFactory() , new ThreadPoolExecutor.CallerRunsPolicy());

        // 2.使用Callable接口实现类来创建任务
        Future<String> f1 = executor.submit(new MyCallable(100));
        Future<String> f2 = executor.submit(new MyCallable(200));
        Future<String> f3 = executor.submit(new MyCallable(300));
        Future<String> f4 = executor.submit(new MyCallable(400));
        Future<String> f5 = executor.submit(new MyCallable(500));
        try {
            System.out.println(f1.get());
            System.out.println(f2.get());
            System.out.println(f3.get());
            System.out.println(f4.get());
            System.out.println(f5.get());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
