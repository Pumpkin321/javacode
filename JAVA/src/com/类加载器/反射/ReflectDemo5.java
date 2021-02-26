package com.类加载器.反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/24 14:11
 */

public class ReflectDemo5 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class<?> c = Class.forName("com.类加载器.反射.Student");
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        Field namefield = c.getDeclaredField("name");
        namefield.setAccessible(true);
        namefield.set(obj,"林青霞");
        System.out.println(obj);

        Field agefield = c.getDeclaredField("age");
        agefield.setAccessible(true);
        agefield.set(obj,25);

        Field addressfield = c.getDeclaredField("address");
        addressfield.setAccessible(true);
        addressfield.set(obj,"LAL");
        System.out.println(obj);

    }
}
