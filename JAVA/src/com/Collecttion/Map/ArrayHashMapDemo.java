package com.Collecttion.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/14 16:28
 */
/*
创建一个ArrayList集合 存储三个元素 都是HashMap 每一个HashMap的键和值都是String 并遍历

1创建ArrayList集合
2创建HashMap集合 添加键值对
3把HashMap作为元素添加到ArrayList集合
4遍历ArrayList集合
 */
public class ArrayHashMapDemo {
    public static void main(String[] args) {
        ArrayList<HashMap<String,String>> array = new ArrayList<HashMap<String, String>>();

        HashMap<String,String> hm1 = new HashMap<String, String>();
        hm1.put("张飞","刘备");
        hm1.put("诸葛亮","关羽");
        array.add(hm1);

        HashMap<String,String> hm2 = new HashMap<String, String>();
        hm2.put("张无忌","赵敏");
        hm2.put("杨过","小龙女");
        array.add(hm2);

        HashMap<String,String> hm3 = new HashMap<String, String>();
        hm3.put("令狐冲","任盈盈");
        hm3.put("林平之","岳灵珊");
        array.add(hm3);

        //遍历ArrayList集合
        for(HashMap<String,String> hm : array){
            Set<String> keySet = hm.keySet();
            for (String key : keySet){
                String value = hm.get(key);
                System.out.println(key+","+value);
            }
        }


    }
}
