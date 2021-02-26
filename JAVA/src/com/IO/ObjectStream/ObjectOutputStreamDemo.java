package com.IO.ObjectStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/19 15:02
 */
/*
ObjectOutputStream将Java对象的原始数据类型和图形写入OutputStream。
可以使用ObjectInputStream读取（重构）对象。
可以通过使用流的文件来实现对象的持久存储。
如果流是网络套接字流，则可以在另一个主机上或另一个进程中重构对象。

ObjectOutputStreamDemo(OutputStream out)
创建一个写入指定的OutputStream的ObjectOutputStream。
writeObject(Object obj)
将指定的对象写入ObjectOutputStream。

NotSerializableException:抛出一个实例需要一个Serializable接口。 序列化运行时或实例的类可能会抛出此异常。 参数应该是类的名称。

  Serializable :类的序列化由实现java.io.Serializable接口的类启用。
                不实现此接口的类将不会使任何状态序列化或反序列化。
                序列化接口仅仅是一个标识接口 实现该接口 不需要重写任何方法
                实现该接口该类的对象可以序列化或反序列化
 */

public class ObjectOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("D:\\找工作\\JAVA\\src\\com\\IO\\ObjectStream\\oos.txt"));
        //创建对象
        Student s1 = new Student("jason",12);
        oos.writeObject(s1);//NotSerializableException
        oos.close();
    }

}
