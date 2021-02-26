package com.类加载器.反射;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/24 14:19
 */

public class ReflectDemo6 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("com.类加载器.反射.Student");
        //Method[] getDeclaredMethods() (只有本类的方法)
        //返回包含一个数组 方法对象反射的类或接口的所有声明的方法，通过此表示 类对象，包括公共，保护，默认（包）访问和私有方法，但不包括继承的方法。
        //Method[] getMethods() （包含继承的方法）
        //返回包含一个数组 方法对象反射由此表示的类或接口的所有公共方法 类对象，包括那些由类或接口和那些从超类和超接口继承的声明。
        Method[] methods = c.getDeclaredMethods();
        for (Method method:methods){
            System.out.println(method);
        }

        //getMethod(String name, 类<?>... parameterTypes)
        //返回一个 方法对象，它反映此表示的类或接口的指定公共成员方法 类对象。
        //getDeclaredMethod(String name, 类<?>... parameterTypes)
        //返回一个 方法对象，它反映此表示的类或接口的指定声明的方法 类对象。

        Method m1 = c.getDeclaredMethod("method2", String.class);
        //获取无参构造方法创建对象
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        //invoke(Object obj, Object... args)
        //在具有指定参数的 方法对象上调用此 方法对象表示的底层方法。
        //Object：返回值类型
        //obj：调用方法的对象
        //args：方法需要的参数
        m1.invoke(obj,"jack");

    }
}
