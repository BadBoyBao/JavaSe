package com.xpxp.Thread.DTO;


import java.util.List;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file PeopleThread
 * @date 2026/04/15  14:39
 * @email thexpxp233@qq.com
 **/
public class PeopleThread extends Thread {

    private List<Integer> redPackets;

    public PeopleThread(List<Integer> redPackets , String s) {
        super(s);
        this.redPackets = redPackets;
    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        while (true) {
            // 100个人抢红包
            synchronized (redPackets) {
                if (redPackets.size() == 0) {
                    break;
                }
                // 随机一个索引得到红包
                int index = (int) (Math.random() * redPackets.size());
                Integer money = redPackets.remove(index);
                System.out.println(name + "抢到红包:" + money + "元");
                if (redPackets.size() == 0) {
                    System.out.println("活动结束");
                    break;
                }

                try {
                    Thread.sleep(10);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
