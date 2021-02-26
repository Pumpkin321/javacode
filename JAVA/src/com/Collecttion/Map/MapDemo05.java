package com.Collecttion.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/14 16:03
 */
/*
Map集合遍历2：
获取所有键值对对象集合 Set<Map.Etry<K,V>> entrySet(); 获取所有键值对对象的集合。
遍历键值对对象的集合，得到每一个键值对对象 Map.Entry
根据键值对对象获取键和值：getKey();getValue();

 */
public class MapDemo05 {
    public static void main(String[] args) {
        Map<String,String > map = new HashMap<String, String>();
        map.put("jason","tim");
        map.put("john","jim");
        map.put("cena","kim");

        Set<Map.Entry<String, String>> entrySet = map.entrySet();

        for (Map.Entry<String, String> me:entrySet){
            String key = me.getKey();
            String value = me.getValue();
            System.out.println(key+","+value);
        }

    }
}
