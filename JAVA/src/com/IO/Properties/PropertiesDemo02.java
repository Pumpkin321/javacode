package com.IO.Properties;

import java.util.Properties;
import java.util.Set;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/19 15:47
 */
/*
setProperty(String key, String value)
致电 Hashtable方法 put 。
getProperty(String key)
使用此属性列表中指定的键搜索属性。
stringPropertyNames()
从该属性列表中返回一个不可修改的键集 其中键及其对应的值是字符串
 */
public class PropertiesDemo02 {
    public static void main(String[] args) {
        //创建集合对象
        Properties prop = new Properties();
        prop.setProperty("id001", "jason");
        /*
            Object setProperty(String key, String value) {
                return put(key, value);
            }

            Object put(Object key, Object value) {
                 return map.put(key, value);
            }
         */
        prop.setProperty("id002", "tim");
        prop.setProperty("id003", "jackson");

        System.out.println(prop.getProperty("id001"));
        System.out.println(prop.getProperty("id002"));
        System.out.println(prop.getProperty("id003"));

        //stringPropertyNames()
        Set<String> names = prop.stringPropertyNames();
        for (String key:names){
            String value = prop.getProperty(key);
            System.out.println(key+","+value);
        }

    }
}
