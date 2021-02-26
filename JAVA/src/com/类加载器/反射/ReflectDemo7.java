package com.类加载器.反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/24 14:32
 */

public class ReflectDemo7 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("com.类加载器.反射.Student");
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        Method m1 = c.getMethod("method");
        m1.invoke(obj);
        Method m2 = c.getMethod("method2", String.class);
        m2.invoke(obj,"林青霞");
        Method m3 = c.getMethod("method3", String.class, int.class);
        Object o = m3.invoke(obj, "林青霞", 25);
        System.out.println(o);
        Method m4 = c.getDeclaredMethod("function");
        m4.setAccessible(true);
        m4.invoke(obj);

    }
}
