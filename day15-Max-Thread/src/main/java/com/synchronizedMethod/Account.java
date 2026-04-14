package com.synchronizedMethod;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file Account
 * @date 2026/04/14  22:00
 * @email thexpxp233@qq.com
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account {
    private String cardId;
    private double money;


    // 小明和小红都到这里了
    public synchronized void drawMoney(int money) {
        // 拿到当前谁来取钱
        String name = Thread.currentThread().getName();
        // 判断余额是否充足
        if (this.money >= money) {
            System.out.println(name + "取钱成功,取钱金额:" + money + "元成功!");
            // 更新余额
            this.money -= money;
            System.out.println(name + "取钱成功,取钱后,余额剩余:" + this.money);
        } else {
            System.out.println(name + "取钱失败,余额不足!");
        }

    }
}
