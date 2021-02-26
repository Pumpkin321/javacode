package com.IO.Properties;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/19 16:00
 */
/*
Properties和IO流结合的方法：

void load(Reader reader)
以简单的线性格式从输入字符流读取属性列表（关键字和元素对）。


void store(Writer writer, String comments)
将此属性列表（键和元素对）写入此 Properties表中，
以适合使用 load(Reader)方法的格式输出到输出字符流。

 */
public class PropertiesIODemo {
    public static void main(String[] args) throws IOException {
        //把集合中的数据保存到文件
        myStore();
        //把文件中的数据加载到集合中
        myLoad();
    }

    private static void myLoad() throws IOException {
        Properties prop = new Properties();
        FileReader fr = new FileReader("D:\\找工作\\JAVA\\src\\com\\IO\\Properties\\fw.txt");
        prop.load(fr);
        fr.close();
        System.out.println(prop);
    }

    private static void myStore() throws IOException {
        Properties prop = new Properties();
        prop.setProperty("id001","jason");
        prop.setProperty("id002","tim");
        prop.setProperty("id003","kaka");
        //void store(Writer writer, String comments)
        FileWriter fw = new FileWriter("D:\\找工作\\JAVA\\src\\com\\IO\\Properties\\fw.txt");
        prop.store(fw,null);
        fw.close();
    }
}
