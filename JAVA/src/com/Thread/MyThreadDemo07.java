package com.Thread;

import java.util.*;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/21 16:42
 */
/*
线程安全的类：
StringBuffer
线程安全 可变的字符序列
从版本JDK 5开始，这个类别已经被一个等级类补充了，这个类被设计为使用一个线程StringBuilder 。
StringBuilder应该使用StringBuilder类，因为它支持所有相同的操作，但它更快，因为它不执行同步。



Vector

从Java 2平台v1.2，这个类被改造为实现List接口，使其成为成员Java Collections Framework 。
与新集合实现不同， Vector是同步的。 如果不需要线程安全的实现，建议使用ArrayList代替Vector 。



Hashtable
该类实现了一个哈希表 它将键映射到值。任何非null对象都可以用作键或者值
从Java 2平台v1.2，这个类被改造为实现Map接口，使其成为成员Java Collections Framework 。
与新的集合实现不同， Hashtable是同步的。 如果不需要线程安全的实现，建议使用HashMap代替Hashtable 。
如果需要线程安全的并发实现，那么建议使用ConcurrentHashMap代替Hashtable 。

 */
public class MyThreadDemo07 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuilder sb2= new StringBuilder();
        Vector<String > v = new Vector<String>();
        ArrayList<String > arrayList = new ArrayList<String >();
        Hashtable<String,String > ht = new Hashtable<String ,String>();
        HashMap<String,String> hm = new HashMap<String, String>();
        List<String> list = Collections.synchronizedList(new ArrayList<String>());
    }
}
