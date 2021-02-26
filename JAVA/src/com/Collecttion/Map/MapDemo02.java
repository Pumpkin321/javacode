package com.Collecttion.Map;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/14 15:43
 */
/*
V remove（Object key）根据键删除键值对元素
void clear() 移除所有的键值对元素
boolean containsKey(Object key) : 判断集合是否包含指定的键
boolean containsValue(Object value) : 判断集合是否包含指定的值
boolean isEmpty() :判断集合是否为空
返回集合的长度，也就是键值对的个数
 */
public class MapDemo02 {
    public static void main(String[] args) {
        //创建Map对象
        Map<String,String> map = new HashMap<String, String>();
        //V put (K key,V value) 添加元素
        map.put("jason","kim");
        map.put("jasoo","tim");
        map.put("jaso","jim");
        //V remove（Object key）根据键删除键值对元素
//        System.out.println(map.remove("jaso"));
//        System.out.println(map.remove("jas"));
        //void clear() 移除所有的键值对元素
//        map.clear();
        //boolean containsKey(Object key) : 判断集合是否包含指定的键
//        System.out.println(map.containsKey("jason"));
        //boolean containsValue(Object value) : 判断集合是否包含指定的值
//        System.out.println(map.containsValue("tim"));
        //boolean isEmpty() :判断集合是否为空
        System.out.println(map.isEmpty());
        //int size() :返回集合的长度，也就是键值对的个数
        System.out.println(map.size());

        //输出集合对象
        System.out.println(map);
    }
}
