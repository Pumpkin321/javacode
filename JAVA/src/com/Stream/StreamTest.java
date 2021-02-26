package com.Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/23 15:46
 */

public class StreamTest {
    public static void main(String[] args) {
        ArrayList<String> man = new ArrayList<String>();
        man.add("jack");
        man.add("rose");
        man.add("tim");
        man.add("kim");
        ArrayList<String> woman = new ArrayList<String>();
        woman.add("jim");
        woman.add("zoe");
        woman.add("lisa");
        woman.add("loo");

//        Stream<String> manstream = man.stream().filter(s -> s.length() == 3).limit(1);
//        Stream<String> womastream = woman.stream().filter(s -> s.startsWith("l")).skip(1);
//
//        Stream<String> stream = Stream.concat(manstream, womastream);
//
//        stream.map(Actor::new).forEach(p-> System.out.println(p.getName()));

        Stream.concat(man.stream().filter(s->s.length()==3).skip(1),
                woman.stream().filter(s->s.startsWith("l")).limit(1)).
                map(Actor::new).forEach(p-> System.out.println(p.getName()));
    }
}
