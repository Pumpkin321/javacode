package com.类加载器.反射;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/24 14:44
 */

public class ReflectDemo9 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Properties prop = new Properties();
        FileReader fr = new FileReader("D:\\找工作\\JAVA\\src\\com\\类加载器\\反射\\class.txt");
        prop.load(fr);
        fr.close();
        String className = prop.getProperty("className");
        String methodName = prop.getProperty("methodName");

        Class<?> c = Class.forName(className);
        Constructor<?> con = c.getConstructor();
        Object obj = con.newInstance();
        Method m = c.getMethod(methodName);
        m.invoke(obj);
    }
}
