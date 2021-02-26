package com.函数式接口;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/4 15:46
 */

public class RunnableDemo {
    public static void main(String[] args) {
        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"线程启动了");
            }
        });

        startThread(()-> System.out.println(Thread.currentThread().getName()+"线程启动了"));
    }

    private static void startThread(Runnable r){
        new Thread(r).start();
    }
}
