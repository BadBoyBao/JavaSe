package com.synchronizedMethod;


/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file DrawThread
 * @date 2026/04/14  22:02
 * @email thexpxp233@qq.com
 **/
public class DrawThread extends Thread {

    private Account acc;


    public DrawThread(String name , Account acc) {
        super(name);
        this.acc = acc;
    }

    /**
     *
     */
    @Override
    public void run() {
        // 小明和小红同时取一百网
        acc.drawMoney(1000000);
    }
}
