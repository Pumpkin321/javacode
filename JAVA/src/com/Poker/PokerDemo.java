package com.Poker;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/15 15:19
 */
/*
通过程序实现斗地主过程中洗牌 发牌 看牌

思路
1：创建牌盒 定义集合对象 ArrayList
2：装牌
3：洗牌 Collections.shuffle();
4：发牌 遍历
5：看牌 玩家遍历
 */

public class PokerDemo {
    public static void main(String[] args) {
        //创建牌盒
        ArrayList<String> array = new ArrayList<String>();

       //装牌
       /*
       ♦2，3，4，。。。K,A
       ♠2，3，4，。。。K,A
       ♥2，3，4，。。。K,A
       ♠2，3，4，。。。K,A
       大王 小王
        */
        //定义花色
        String[] colors = {"♦","♠","♥","♠"};
       //定义点数
        String[] numbers = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        for(String color : colors){
            for(String number : numbers){
                array.add(color+number);
            }
        }
        array.add("小王");
        array.add("大王");
        Collections.shuffle(array);
        System.out.println(array);

        ArrayList<String> p1Array = new ArrayList<String>();
        ArrayList<String> p2Array = new ArrayList<String>();
        ArrayList<String> p3Array = new ArrayList<String>();
        ArrayList<String> dpArray = new ArrayList<String>();

        for (int i = 0; i < array.size(); i++) {
            String poker = array.get(i);
            if(i>=array.size()-3){
                dpArray.add(poker);
            }else if (i%3==0){
                p1Array.add(poker);
            }else if (i%3==1){
                p2Array.add(poker);
            }else if (i%3==2){
                p3Array.add(poker);
            }
        }
        lookPoker("player1",p1Array);
        lookPoker("player2",p2Array);
        lookPoker("player3",p3Array);
        lookPoker("底牌",dpArray);
    }

    //看牌的方法
    public static void lookPoker(String name,ArrayList<String> array){
        System.out.print(name + " 的牌是：");
        for (String poker:array){
            System.out.print(poker+",");
        }
        System.out.println();
    }

}
