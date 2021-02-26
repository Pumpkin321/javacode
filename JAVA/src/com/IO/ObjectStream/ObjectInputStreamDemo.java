package com.IO.ObjectStream;

import com.Collecttion.Set.Stu;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/19 15:16
 */
/*
ObjectInputStream反序列化先前使用ObjectOutputStream编写的原始数据和对象。
ObjectInputStream(InputStream in)
创建从指定的InputStream读取的ObjectInputStream。

Object readObject() 从ObjectInputStream 读取一个对象
 */
public class ObjectInputStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\找工作\\JAVA\\src\\com\\IO\\ObjectStream\\oos.txt"));
        Object obj = ois.readObject();

        Student s = (Student) obj;
        System.out.println(s);
        ois.close();
    }
}
