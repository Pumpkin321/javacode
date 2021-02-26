package com.Thread;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/20 10:41
 */
/*
    进程：
          进程是正在运行的程序
          ·是系统进行资源分配和调用的独立单位
          ·每一个进程都有它自己的内存空间和系统资源


    线程：
          线程是进程中的单个顺序控制流，是一条执行路径
          ·单线程：一个进程如果只有一条执行路径，则称为单线程程序
          ·多线程：一个进程如果有多条执行路径，则称为多线程程序


    方法1：继承Thread类
            1定义一个MyThread类继承Thread类
            2在MyThread类中重写run()方法
            3创建MyThread类的对象
            4启动线程

            为什么要重写run()方法：因为run()是用来封装被线程执行的代码
            run()和start()方法的区别
            run()封装线程执行的代码，直接调用，相当于普通方法的调用
            start()启动线程;然后由JVM调用此线程的run()方法
 */
public class MyThreadDemo01 {
    public static void main(String[] args) {
        MyThread mt1 = new MyThread();
        MyThread mt2 = new MyThread();

//        mt1.run();
//        mt2.run();
        mt1.start();
        mt2.start();

    }
}
