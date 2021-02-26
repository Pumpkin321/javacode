package com.Collecttion.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/14 15:17
 */
/*
Map集合概述
interface Map<K,V> K 键的类型 V：值的类型
将键映射到值的对象，不能包含重复的键，每个键可以映射到最多一个值

 创建Map集合的对象
 多态的方式
 具体的实现类HashMap
 */
public class MapDemo01 {
    public static void main(String[] args) {
        //创建Map对象
        Map<String,String > map = new HashMap<String, String>();

        //V put (K key,V value) 将指定的值与该映射中的键关联
        map.put("id001","jason");
        map.put("id002","jack");
        map.put("id003","rose");

        System.out.println(map);
    }
}
