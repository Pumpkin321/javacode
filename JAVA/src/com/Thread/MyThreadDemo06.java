package com.Thread;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/21 16:05
 */
/*
判断多线程程序是否会有数据安全问题的标准：
1是否时多线程环境
2是否有共享数据
3是否有多条语句操作共享数据

如何解决：
基本思想：让程序没有安全问题的环境

如何实现:
把多条语句操作共享数据的代码锁起来，让任意时刻只能有一个线程执行即可

//同步方法：
把synchronized关键字加到方法上
格式：修饰符 synchronized 返回值类型 方法名（方法参数）{}

//同步方法的锁对象是：this

同步静态方法的锁对象是：类名.class
 */
public class MyThreadDemo06 {
    public static void main(String[] args) {
        SellTicket st = new SellTicket();
        Thread t1= new Thread(st,"一号窗口");
        Thread t2= new Thread(st,"二号窗口");
        Thread t3= new Thread(st,"三号窗口");

        t1.start();
        t2.start();
        t3.start();
    }
}
