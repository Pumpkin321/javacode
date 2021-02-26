package com.Thread;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/20 15:49
 */
/*
    Thread类中获取和设置线程名称的方法
    void setName(String name) 将此线程的名称更改为等于参数 name
    String getName() 返回此线程的名称

    public static Thread currentThread(): 返回对当前正在执行的线程对象的引用

 */
public class MyThreadDemo02 {
    public static void main(String[] args) {
//        MyThread my1= new MyThread();
//        MyThread my2= new MyThread();
//        my1.setName("汽车");
//        my2.setName("飞机");
//        my1.start();
//        my2.start();
        System.out.println(Thread.currentThread().getName());

    }
}
