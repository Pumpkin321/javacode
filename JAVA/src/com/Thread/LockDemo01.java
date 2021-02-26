package com.Thread;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/21 16:54
 */
/*
Lock实现提供比使用synchronized方法和语句可以获得更广泛的锁定操作
lock();
获得锁
unlock():
释放锁

Lock是接口不能直接实例化 这里采用它的实现类ReentrantLock方法来实例化
ReentrantLock的构造方法
·ReentrantLock(): 创建一个ReentrantLock的实例
 */
public class LockDemo01 {
    public static void main(String[] args) {
        sell s = new sell();

        Thread t1= new Thread(s,"一号窗口");
        Thread t2= new Thread(s,"二号窗口");
        Thread t3= new Thread(s,"三号窗口");

        t1.start();
        t2.start();
        t3.start();
    }
}
