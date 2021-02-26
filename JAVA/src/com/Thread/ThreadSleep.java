package com.Thread;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/20 16:31
 */

public class ThreadSleep extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {
            System.out.println(getName()+":"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
