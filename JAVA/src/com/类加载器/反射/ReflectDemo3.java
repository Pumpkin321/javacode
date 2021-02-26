package com.类加载器.反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/23 17:36
 */

public class ReflectDemo3 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("com.类加载器.反射.Student");
//        Constructor<?> con = c.getConstructor(String.class,int.class,String.class);
//        Object obj = con.newInstance("林青霞", 20, "西安");
//        System.out.println(obj);
        Constructor<?> con = c.getDeclaredConstructor(String.class);
        con.setAccessible(true);
        Object obj = con.newInstance("林青霞");
        System.out.println(obj);
    }
}
