package com.Collecttion.Generic;

import javax.imageio.ImageTranscoder;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/14 13:46
 */
/*
    泛型定义格式：
    <类型> 指定一种类型的格式。可以看作形参
    <类型1，类型2...>可以指定多种类型的格式，多种类型用逗号隔开。可以看成是形参
    将来调用时给定的类型可以看作是实参，并且实参的类型只能是引用数据类型

    泛型好处
    把运行时期的问题提前到编译期间
    避免强制类型转换
 */
public class GenericDemo {
    public static void main(String[] args) {
        //创建集合对象
//        Collection c = new ArrayList();
        Collection<String> c = new ArrayList<String>();

        //添加元素
        c.add("halo");
        c.add("word");
//        c.add(100);
        Iterator<String> it = c.iterator();
//        Iterator it = c.iterator();

        while (it.hasNext()){
//            Object object = it.next();
//            System.out.println(object);
//            String s = (String) it.next();
            String s = it.next();
            System.out.println(s);
        }
    }
}