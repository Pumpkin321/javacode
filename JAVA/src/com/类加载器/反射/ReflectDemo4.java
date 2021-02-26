package com.类加载器.反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/23 17:43
 */
/*
getFields()
返回包含一个数组 Field对象反射由此表示的类或接口的所有可访问的公共字段 类对象。
getDeclaredFields()
返回的数组 Field对象反映此表示的类或接口声明的所有字段 类对象。
getField(String name)
返回一个 Field对象，它反映此表示的类或接口的指定公共成员字段 类对象。
getDeclaredField(String name)
返回一个 Field对象，它反映此表示的类或接口的指定已声明字段 类对象。
 */
public class ReflectDemo4 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("com.类加载器.反射.Student");
        Field[] fields = c.getFields();
//        Field[] fields = c.getDeclaredFields();
        for (Field field:fields){
            System.out.println(field);
        }
        Field addressField = c.getField("address");
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        addressField.set(obj,"LAL");
        System.out.println(obj);
    }
}
