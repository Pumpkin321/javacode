package com.Thread.生产者消费者问题;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/21 17:07
 */

public class Box {

    private int milk;
    private boolean state= false;
    public synchronized void put(int milk){
        if (state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.milk=milk;
        System.out.println("送奶工将第"+this.milk+"瓶奶放入奶箱");

        state=true;

        notifyAll();
    }
    public synchronized void get(){
        if(!state){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("客户将第"+this.milk+"瓶奶拿走");
        state=false;

        notifyAll();
    }
}
