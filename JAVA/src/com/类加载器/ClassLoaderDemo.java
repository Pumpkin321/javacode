package com.类加载器;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/23 16:52
 */
/*
ClassLoader中的两个方法
●static ClassLoader getSystemClassLoader(:返回用于委派的系统类加载器
●ClassLoader getParent0:返回父类加载器进行委派

 */
public class ClassLoaderDemo {
    public static void main(String[] args) {
        ClassLoader c = ClassLoader.getSystemClassLoader();
        System.out.println(c);//AppClassLoader

        ClassLoader c2 = c.getParent();
        System.out.println(c2);//PlatformClassLoader

        ClassLoader c3 = c2.getParent();
        System.out.println(c3);//null Bootstrap class loader:它是虚拟机的内置类加载器,通常表示为null，并且没有父null
    }
}
