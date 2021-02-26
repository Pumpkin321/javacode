package com.Thread;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/20 16:08
 */
/*
线程调度
分时调度模型：所有线程轮流使用CPU的使用权 平均分配每个线程占用CPU的时间片
抢占调度模型：优先让优先级高的线程使用CPU 如果线程优先级相同 那么会随机选择一个
优先级高的线程获取的CPU时间片相对多一些

Java采用的是抢占调度模型
int getPriority()
返回此线程的优先级。
void setPriority(int newPriority)
更改此线程的优先级。

线程默认优先级是5
线程优先级范围1-10
线程优先级仅仅表示获取CPU时间片的几率高


 */
public class MyThreadDemo03 {
    public static void main(String[] args) {
        MyThread my1= new MyThread();
        MyThread my2= new MyThread();
        MyThread my3= new MyThread();

        my1.setPriority(10);
        my2.setPriority(5);
        my3.setPriority(1);

        my1.setName("飞机");
        my2.setName("高铁");
        my3.setName("火车");

        my1.start();
        my2.start();
        my3.start();

    }

}
