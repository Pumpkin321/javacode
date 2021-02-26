package com.Thread;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/20 16:26
 */
/*
static void sleep(long millis)
使当前正在执行的线程以指定的毫秒数暂停（暂时停止执行）
具体取决于系统定时器和调度程序的精度和准确性。
void join()
等待这个线程死亡。
void setDaemon(boolean on)
将此线程标记为守护线程或用户线程。 当运行的线程都是守护线程时，Java虚拟机将退出
 */
public class MyThreadDemo04 {
    public static void main(String[] args) {
        ThreadSleep my1 = new ThreadSleep();
        ThreadSleep my2 = new ThreadSleep();
        ThreadSleep my3 = new ThreadSleep();

        my1.setName("刘备");
        my2.setName("关羽");
        my3.setName("张飞");

        my1.start();
        try {
            my1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        my2.start();
        my3.start();
    }
}
