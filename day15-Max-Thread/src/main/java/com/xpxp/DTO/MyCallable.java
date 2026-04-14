package com.xpxp.DTO;


import java.util.concurrent.Callable;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file MyCallable
 * @date 2026/04/14  20:59
 * @email thexpxp233@qq.com
 **/
public class MyCallable implements Callable<String> {
    private int n;

    public MyCallable(int n) {
        this.n = n;
    }

    /**
     * @return
     * @throws Exception
     */
    @Override
    public String call() throws Exception {

        int sum = 0;
        for (int i = 0 ; i < n ; i++) {
            sum += i;
        }
        return "子线程计算1-" + n + "出结果是:" + sum;
    }
}
