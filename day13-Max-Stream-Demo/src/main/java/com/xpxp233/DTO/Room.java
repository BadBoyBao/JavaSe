package com.xpxp233.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file Room
 * @date 2026/04/12  15:27
 * @email thexpxp233@qq.com
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Room {

    // 1.准备好54张牌,给房间使用:定义一个集合容器
    private List<Card> allCards = new ArrayList<>();

    // 2.初始化54张牌进去
    {
        // 3.准备点数
        String[] sizes = { "3" , "4" , "5" , "6" , "7" , "8" , "9" , "10" , "J" , "Q" , "K" , "A" , "2" };
        // 4.准备花色
        String[] colors = { "♠" , "♥" , "♣" , "♦" };
        int count = 0;
        // 5.组合点数和花色成为对象,加入集合中
        for (String size : sizes) {
            count++;
            for (String color : colors) {
                //
                allCards.add(new Card(size , color , count));
            }
        }
        Collections.addAll(allCards , new Card("" , "白" , ++count) , new Card("" , "黑" , ++count));
        System.out.println("新牌是：" + allCards);

    }

    public void start() {
        // 洗牌,打乱顺序
        Collections.shuffle(allCards);
        System.out.println("洗牌后：" + allCards);

        // 发牌 定义三个玩家
        Map<String, List<Card>> players = new HashMap<>();
        List<Card> player1 = new ArrayList<>();
        players.put("玩家1" , player1);
        List<Card> player2 = new ArrayList<>();
        players.put("玩家2" , player2);
        List<Card> player3 = new ArrayList<>();
        players.put("玩家3" , player3);
        // 只发出51张牌,需要轮询
        /**
         * 玩家2的牌:[Q♦, 3♥, K♥, 2♠, K♣, A♣, 4♥, 10♠, 7♦, 10♥, 3♦, J♥, 6♣, 8♣, 10♣, 7♠, 9♣]
         * 玩家1的牌:[4♠, 3♠, 4♦, 🃏, Q♠, 7♣, 5♥, 2♣, A♠, J♠, 8♦, 2♥, 2♦, 8♥, 5♠, 5♦, K♦]
         * 玩家3的牌:[🃏黑, A♦, Q♣, 6♠, J♣, K♠, 10♦, 9♦, A♥, 4♣, 9♥, 6♦, 3♣, 6♥, 9♠, 7♥, J♦]
         */
        for (int i = 0 ; i < allCards.size() - 3 ; i++) {
            Card card = allCards.get(i);
            switch (i % 3) {
                case 0:
                    player1.add(card);
                    break;
                case 1:
                    player2.add(card);
                    break;
                case 2:
                    player3.add(card);
                    break;
                default:
                    break;
            }
        }


        // 11.1取出三张底牌
        List<Card> lastCards = allCards.subList(allCards.size() - 3 , allCards.size());
        System.out.println("底牌是：" + lastCards);
        player3.addAll(lastCards);

        // 10.排序(牌的大小排序,黑白最大到2,A)
        sortCards(player1);
        sortCards(player2);
        sortCards(player3);
        // 11.看牌
        for (Map.Entry<String, List<Card>> entry : players.entrySet()) {
            System.out.println(entry.getKey() + "的牌:" + entry.getValue());
        }
    }

    private void sortCards(List<Card> player) {
        Collections.sort(player , (o1 , o2) -> o2.getNum() - o1.getNum());

    }
}
