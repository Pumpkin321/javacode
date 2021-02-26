package com.IO.ObjectStream;

import com.Collecttion.Set.Stu;

import java.io.*;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/19 12:04
 */
/*
对象序列化：就是将对象保存到磁盘中 或者在网络中传输对象
这种机制就是使用一个字节序列表示一个对象 该字节序列包含 对象的类型 对象的数据和对象中存储的属性等信息
字节序列写到文件之后 相当于文件中持久保存了一个对象的信息
反之 该字节序列还可以从文件中读取回来 重构对象 对他进行发序列化

要实现序列化和反序列化就要使用对象序列化流和对象反序列化流
对象序列化流 ObjectOutputStreamDemo
对象反序列化流 ObjectInputStream

用对象序列流序列化一个对象后，加入修改了对象所属的文件 读取数据会不会出现问题？
InvalidClassException
当序列化运行时检测到类中的以下问题之一时抛出。
类的串行版本与从流中读取的类描述符的类型不匹配
该类包含未知的数据类型
该类没有可访问的无参数构造函数

出现了问题 如何解决？
给对象所属的类加一个值：private static final long serialVersionUID = 42L;

如果一个对象中的某个成员变量的值不想被序列化 又该如何实现？
private transient 类型 变量名;

 */
public class ObjectStreamDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        write();
        read();
    }

    private static void read() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("D:\\找工作\\JAVA\\src\\com\\IO\\ObjectStream\\oos.txt"));
        Object obj = ois.readObject();
        Student s = (Student) obj;
        System.out.println(s);
        ois.close();
    }

    private static void write() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\找工作\\JAVA\\src\\com\\IO\\ObjectStream\\oos.txt"));
        Student s = new Student("jim",14);
        oos.writeObject(s);
        oos.close();
    }

}
