package com.Thread;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/21 15:58
 */

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
