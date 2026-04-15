package com.xpxp.Thread;


import com.xpxp.Thread.DTO.PeopleThread;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file Main
 * @date 2026/04/15  14:09
 * @email thexpxp233@qq.com
 **/
public class Main {
    public static void main(String[] args) {
        // 目标:完成多线程的综合小案例
        // 红包雨
        /**
         * 红包雨游戏,某企业有100名员工,员工的工号依次是1,2,3,4,...到100
         * 现在公司举办了年会活动,活动中有一个红包雨环节,要求共计发出200个红包雨,其中小红包在[1-30]元之间.
         * 总占比为80%,大红包在[31-100]元之间,占比为20%
         * 分析:100个员工实际上就是100个线程,来竞争200个红包
         */

        // 1.准备200个随机红包
        List<Integer> redPackets = getRedPackets();
        // 2.定义线程类,创建100个线程,竞争同一个集合;
        for (int i = 1 ; i <= 100 ; i++) {
            new PeopleThread(redPackets , "人" + i).start();
        }

    }

    // 准备200个随机红包返回,放在List集合中返回
    public static List<Integer> getRedPackets() {
        Random r = new Random();
        // 其中小红包在[1-30]元之间 80%,大红包在[31-100]元之间 20%
        List<Integer> redPackets = new ArrayList<>();
        for (int i = 1 ; i <= 160 ; i++) {
            redPackets.add(r.nextInt(30) + 1);
        }
        for (int i = 1 ; i <= 40 ; i++) {
            redPackets.add(r.nextInt(70) + 31);
        }
        return redPackets;
    }
}
