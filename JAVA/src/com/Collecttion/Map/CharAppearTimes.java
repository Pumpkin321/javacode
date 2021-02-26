package com.Collecttion.Map;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/14 16:48
 */
/*
从键盘录入一个字符串 统计字符串中每个数字出现次数

思路：
1录入一个字符串
2创建HashMap 键是Character 值是Integer
3遍历字符串得到每一个字符
4拿得到的每一个字符作为键得到HashMap集合中去找对应的值，看其返回值
    如果返回null 说明该字符在HashMap中不存在 该字符作为键 1 作为值存储
    如果返回不是null 说明存在 把该值+1 重新存储该字符和对应的值
5遍历HashMap得到键和值 按照要求拼接
6输出结果

 */
public class CharAppearTimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一串字符串");
        String s = sc.nextLine();

//        HashMap<Character,Integer> hm = new HashMap<Character, Integer>();
        TreeMap<Character,Integer> hm = new TreeMap<Character, Integer>();
        for (int i = 0; i <s.length() ; i++) {
            char key = s.charAt(i);

            Integer value = hm.get(key);
            if(value== null){
                hm.put(key,1);
            }else {
                value++;
                hm.put(key,value);
            }
        }

        StringBuilder sb = new StringBuilder();
        Set<Character> keySet = hm.keySet();
        for (Character key : keySet){
            Integer value = hm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }
        String result = sb.toString();
        System.out.println(result);
    }
}
