package com.IO.Properties;

import java.util.Properties;
import java.util.Set;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/19 15:35
 */
/*
Properties
是一个Map体系的集合类
Properties可以保存到流中或从流中加载

练习：Properties作为Map集合的使用
 */
public class PropertiesDemo01 {
    public static void main(String[] args) {
        //创建集合对象
//        Properties<String,String> prop = new Properties<String,String>();//错误
        Properties prop = new Properties();
        prop.put("id001","jason");
        prop.put("id002","tim");
        prop.put("id003","jackson");
        Set<Object> keySet = prop.keySet();

        for (Object key:keySet){
            Object value = prop.get(key);
            System.out.println(key+","+value);
        }

    }


}
