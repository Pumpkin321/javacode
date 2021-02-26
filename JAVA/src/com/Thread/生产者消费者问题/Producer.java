package com.Thread.生产者消费者问题;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/21 17:08
 */

public class Producer implements Runnable{
    private Box b;

    public Producer(Box b) {
        this.b= b;
    }

    @Override
    public void run() {
        for (int i = 1; i <=5 ; i++) {
            b.put(i);
        }
    }
}
