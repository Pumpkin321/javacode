package com.Collecttion.List;

import java.util.LinkedList;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/13 16:22
 */
/*
LinkedList特点：底层数据结构是链表
查询慢 增删快
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("hello");
        linkedList.add("world");

        linkedList.addFirst("wow");
        linkedList.addLast("hi");
        System.out.println(linkedList);
        linkedList.removeFirst();
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList);
    }
}
