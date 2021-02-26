package com.Thread.生产者消费者问题;

import java.io.PrintWriter;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/21 17:01
 */
/*
生产者消费者问题

Object类中的Objcet的等待和唤醒方法
void wait();导致当前线程等待，直到另一个线程调用该对象的notify()方法或notifyAll()方法
void notify();唤醒正在等待对象监视器的单个线程
void notifyAll();唤醒正在等待对象监视器的所有线程

 */
public class BoxDemo {
    public static void main(String[] args) {
        Box b= new Box();
        Producer p = new Producer(b);
        Customer c = new Customer(b);

        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);

        t1.start();
        t2.start();
    }
}
