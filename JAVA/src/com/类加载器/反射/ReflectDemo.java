package com.类加载器.反射;

import com.Collecttion.Set.Stu;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/23 17:06
 */
/*
反射概述
Java反射机制:是指在运行时去获取一一个类的变量和方法信息。然后通过获取到的信息来创建对象，调用方法的一
种机制。由于这种动态性，可以极大的增强程序的灵活性，程序不用在编译期就完成确定，在运行期仍然可以扩展
2.2获取Class类的对象
我们要想通过反射去使用一个类,首先我们要获取到该类的字节码文件对象，也就是类型为Class类型的对象
这里我们提供三种方式获取Class类型的对象
●使用类的class属性来获取该类对应的Class对象。 举例: Student.class将 会返回Student类对应的Class对象
●调用对象的getClass0方法, 返回该对象所属类对应的Class对象
该访法是Object类中的方法,所有的Java对象都可以调用该方法
●使用Class类中的静态方法forName(String className),该访法需要传入字符串参数,该字符串参数的值是某
个类的全路径，也就是完整包名的路径

 */
public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<Student> c1 = Student.class;
        System.out.println(c1);

        Student s = new Student();
        Class<? extends Student> c3 = s.getClass();
        System.out.println(c3==c1);

        Class<?> c4 = Class.forName("com.类加载器.反射.Student");
        System.out.println(c4==c1);

    }
}
