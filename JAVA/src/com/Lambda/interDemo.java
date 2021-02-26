package com.Lambda;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/3 18:51
 */

public class interDemo {
    public static void main(String[] args) {
        //使用lambda必须有接口 并且要求接口中有且仅有一个抽象方法
        useInter(()->System.out.println("好好学习天天向上"));

//        Runnable runnable = () -> System.out.println("Lambda表达式");
//        new Thread(runnable).start();
        new Thread(() -> System.out.println("Lambda表达式")).start();
    }
    private static void useInter(Inter i ){
        i.show();
    }
}
