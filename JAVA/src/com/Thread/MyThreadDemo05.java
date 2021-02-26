package com.Thread;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/20 16:41
 */
/*
线程的生命周期
创建线程对象---start()-->有执行资格，没执行权---抢到CPU的执行权------>有执行资格，有执行权---run()结束/Stop()---->线程死亡，变成垃圾
                                           <--其他线程抢走CPU执行权---
    新建                      就绪                                     运行                                     死亡
 */

/*
 创建线程方法2：实现Runnable接口
                定义一个类MyRunnable实现Runnable接口
                在MyRunnable类中重写run()方法
                创建MyRunnable类的对象
                创建Thread类的对象 把MyRunnable对象作为构造方法的参数
                启动线程

       相比继承Thread类 实现Runnable接口的好处
       ·避免了Java单继承的局限性
       ·适合多个相同程序的代码区处理同一个资源的情况，把线程和程序的代码、数据
       有效分离，较好的体现了面向对象的设计思路


 */
public class MyThreadDemo05 {
    public static void main(String[] args) {
        //创建MyRunnable类的对象
        MyRunnable mr1 = new MyRunnable();
        //创建Thread类的对象，把MyRunnable对象作为构造方法的参数
        //Thread(Runnable target)
        Thread t1 = new Thread(mr1,"飞机");
        Thread t2 = new Thread(mr1,"火车");
        t1.start();
        t2.start();

    }
}
