package com.Collecttion.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/14 15:51
 */
/*
    Map集合的获取功能：
    V get(Object key) 根据键获取值
    Set<K> keySet() 获取所有键的集合
    Collection<V> values() 获取所有值的集合

 */
public class MapDemo03 {
    public static void main(String[] args) {
        Map<String,String > map = new HashMap<String, String>();
        map.put("jason","tim");
        map.put("john","jim");
        map.put("cena","kim");

        //V get(Object key) 根据键获取值
        System.out.println(map.get("jason"));

        Set<String> keyset = map.keySet();
        for(String key:keyset){
            System.out.println(key);
        }

        Collection<String> values = map.values();
        for (String value: values){
            System.out.println(value);
        }

    }
}
