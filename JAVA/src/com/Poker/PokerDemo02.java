package com.Poker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/15 16:04
 */
/*
通过HashMap 建立键值对来发牌
使用Treeset接受牌 保证牌的自然排序
 */
public class PokerDemo02 {
    public static void main(String[] args) {
        //创建HashMap 键是编号 值是牌
        HashMap<Integer,String > hm  = new HashMap<Integer, String>();
        //创建ArrayList 存储编号
        ArrayList<Integer> array = new ArrayList<Integer>();

        //定义花色
        String[] colors = {"♦","♠","♥","♠"};
        //定义点数
        String[] numbers = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
        //从0开始存储编号
        int index = 0;
        for (String number:numbers){
            for (String color:colors){
                hm.put(index,color+number);
                array.add(index);
                index++;
            }
        }
        hm.put(index,"小王");
        array.add(index);
        index++;
        hm.put(index,"大王");
        array.add(index);
        index++;
        //洗牌
        Collections.shuffle(array);
        //发牌 使用Treeset接受 保证编号是排序的
        TreeSet<Integer> p1Set = new TreeSet<Integer>();
        TreeSet<Integer> p2Set = new TreeSet<Integer>();
        TreeSet<Integer> p3Set = new TreeSet<Integer>();
        TreeSet<Integer> dpSet = new TreeSet<Integer>();

        for (int i = 0; i <array.size() ; i++) {
            int x = array.get(i);
            if(i>=array.size()-3){
                dpSet.add(x);
            }else if (i%3==0){
                p1Set.add(x);
            }else if (i%3==1){
                p2Set.add(x);
            }else if (i%3==2){
                p3Set.add(x);
            }
        }

        lookPoker("player1",p1Set,hm);
        lookPoker("player2",p2Set,hm);
        lookPoker("player3",p3Set,hm);
        lookPoker("底牌",dpSet,hm);

    }

    public static void lookPoker(String name , TreeSet<Integer> ts , HashMap<Integer,String> hm){
        System.out.println(name + "的牌是");
        for (Integer key :ts){
            String poker = hm.get(key);
            System.out.print(poker+",");
        }
        System.out.println();
    }
}
