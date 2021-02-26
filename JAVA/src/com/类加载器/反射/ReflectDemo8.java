package com.类加载器.反射;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/24 14:38
 */

public class ReflectDemo8 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        Class<? extends ArrayList> c = arr.getClass();
        Method m = c.getMethod("add", Object.class);
        m.invoke(arr,"hello");
        m.invoke(arr,"world");
        System.out.println(arr);
    }
}
