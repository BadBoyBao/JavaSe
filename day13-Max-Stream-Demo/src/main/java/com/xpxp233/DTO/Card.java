package com.xpxp233.DTO;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 😊😊😊😊😊😊😊😊😊😊😊😊
 *
 * @author thexpxp233
 * @file Card
 * @date 2026/04/12  15:26
 * @email thexpxp233@qq.com
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {
    private String size;
    private String color;
    private int num;

    @Override
    public String toString() {
        return size + color;
    }
}
