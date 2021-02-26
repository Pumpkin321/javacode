package com.Lambda;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/3 18:35
 */

public class LambdaDemo {
    public static void main(String[] args) {
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("启动");
//            }
//        }).start();

        new Thread(()->{
            System.out.println("启动");
        }).start();
    }
}
