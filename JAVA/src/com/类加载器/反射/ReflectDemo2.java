package com.类加载器.反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/23 17:23
 */
/*
getConstructors()
返回包含一个数组 Constructor对象反射由此表示的类的所有公共构造 类对象。
getDeclaredConstructors()
返回一个反映 Constructor对象表示的类声明的所有 Constructor对象的数组 类 。
getConstructor(类<?>... parameterTypes)
返回一个 Constructor对象，该对象反映 Constructor对象表示的类的指定的公共 类函数。
getDeclaredConstructor(类<?>... parameterTypes)
返回一个 Constructor对象，该对象反映 Constructor对象表示的类或接口的指定 类函数。

Constructor类中用于创建对象的方法
●T newlnstance(Objet... initargs):根据指定的构造方法创建对象

 */
public class ReflectDemo2 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("com.类加载器.反射.Student");
//        Constructor<?>[] cons = c.getConstructors();
        Constructor<?>[] cons = c.getDeclaredConstructors();
        for (Constructor con:cons ){
            System.out.println(con);
        }
        Constructor<?> con = c.getConstructor();
        //Constructor提供了- -个类的单个构造函数的信息和访问权限
        //newInstance(Object... initargs)
        //使用此 Constructor对象表示的构造函数，使用指定的初始化参数来创建和初始化构造函数的声明类的新实例。
        Object obj = con.newInstance();
        System.out.println(obj);
    }
}
