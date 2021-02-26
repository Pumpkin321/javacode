package com.Thread;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/21 16:06
 */
/*
同步代码块：
synchronized （任意对象）{
        代码段；
}
相当于给代码加锁了，任意对象就可以看成时一把锁

同步的好处和弊端
好处：解决了多线程的数据安全问题
弊端：当线程很多时，因为每个线程都会去判断同步上的锁，这是很耗费资源的，无形中会降低程序的运行效率。
 */
public class SellTicket implements Runnable {
    private static int ticket = 100;
    private Object obj = new Object();
    private int x = 0;

    @Override
    public void run() {
        while (true) {
            if (x % 2 == 0) {
//                synchronized (obj)
//                synchronized (this)
                synchronized (SellTicket.class){
                    if (ticket > 0) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket + "张票");
                        ticket--;
                    }
                }
            } else {
//                synchronized (obj) {
//                    if (ticket > 0) {
//                        try {
//                            Thread.sleep(100);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket + "张票");
//                        ticket--;
//                    }
//                }
                sellTicket();
            }
            x++;
        }

    }

    private static synchronized void sellTicket() {

        if (ticket > 0) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在出售第" + ticket + "张票");
            ticket--;
        }
    }
}
