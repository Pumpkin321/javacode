package com.Thread.生产者消费者问题;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/21 17:08
 */

public class Customer implements Runnable {
    private Box b;

    public Customer(Box b) {
        this.b=b;
    }

    @Override
    public void run() {
        while (true){
            b.get();
        }
    }
}
