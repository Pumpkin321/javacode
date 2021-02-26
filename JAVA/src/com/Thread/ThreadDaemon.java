package com.Thread;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/20 16:37
 */

public class ThreadDaemon {
    public static void main(String[] args) {
        MyThread my1= new MyThread();
        MyThread my2 = new MyThread();

        my1.setName("关羽");
        my2.setName("张飞");
        Thread.currentThread().setName("刘备");

        my1.setDaemon(true);
        my2.setDaemon(true);

        my1.start();
        my2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
