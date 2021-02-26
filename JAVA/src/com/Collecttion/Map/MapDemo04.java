package com.Collecttion.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/14 16:00
 */
/*
Map集合遍历1： 获取所有键集合 通过键得到值的集合
 */
public class MapDemo04 {
    public static void main(String[] args) {
        Map<String,String > map = new HashMap<String, String>();
        map.put("jason","tim");
        map.put("john","jim");
        map.put("cena","kim");

        Set<String > keyset = map.keySet();
        for (String key:keyset){
            String value = map.get(key);
            System.out.println(key+","+value);
        }
    }
}
