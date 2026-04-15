package com.xpxp.Thread.create;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file ExecutorsThread
 * @date 2026/04/15  13:10
 * @email thexpxp233@qq.com
 **/
public class ExecutorsThread {
    public static void main(String[] args) {
        // 目标:通过Executors线程池工具类,调用其静态方法直接得到线程池对象
        ExecutorService pool = Executors.newFixedThreadPool(3);

        // 废弃这个方案
        // 为什么
        /**
         * 1.Executors线程池工具类创建的线程池对象,默认情况下,线程池对象,没有核心线程,没有非核心线程,没有任务队列,没有拒绝策略
         * 2.阿里Java开发手册明确说明:Executors线程池工具类创建的线程池对象,不建议使用
         * 为什么不建议使用?
         *
         */

        int i = Runtime.getRuntime().availableProcessors();
        System.out.println(i);
    }
}
