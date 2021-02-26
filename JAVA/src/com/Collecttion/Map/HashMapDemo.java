package com.Collecttion.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/14 16:09
 */

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,Student> map = new HashMap<String,Student>();

        Student s1 = new Student("jim",12);
        Student s2 = new Student("him",22);
        Student s3 = new Student("kim",32);
        Student s4 = new Student("tim",2);

        map.put("001",s1);
        map.put("002",s2);
        map.put("003",s3);
        map.put("004",s4);

        //遍历方式1 键找值:
        Set<String> keySet = map.keySet();
        for (String key :keySet){
            Student value = map.get(key);
            System.out.println(value);
        }

        //遍历方式2 ： 键值对对象获取键和值
        Set<Map.Entry<String, Student>> entrySet = map.entrySet();
        for (Map.Entry<String, Student> me : entrySet){
            String key = me.getKey();
            Student value = me.getValue();
            System.out.println(key+","+value);
        }
    }
}
