package com.Collecttion.Map;

import java.util.HashMap;
import java.util.Set;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/14 16:18
 */

public class HashMapDemo02 {
    public static void main(String[] args) {
        HashMap<Student,String> hm = new HashMap<Student, String>();

        Student s1 = new Student("jim",12);
        Student s2 = new Student("him",22);
        Student s3 = new Student("tim",32);
        Student s4 = new Student("tim",32);

        hm.put(s1,"西安");
        hm.put(s2,"北京");
        hm.put(s3,"神木");
        hm.put(s4,"广州");

        Set<Student> keySet = hm.keySet();
        for (Student key:keySet ){
            String value = hm.get(key);
            System.out.println(key+":"+value);
        }


    }
}
