package com.Collecttion.List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/7 14:46
 */

public class Collection_1 {
    public static void main(String[] args) {
        Collection<String> c =new ArrayList<String>();

        c.add("abc");
        System.out.println(c);

        Iterator<String > it = c.iterator();
        System.out.println(it.next());

    }
}
