package com.Lambda;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/3 18:42
 */

public class FlyableDemo {
    public static void main(String[] args) {
        useFlyable(new Flyable() {
            @Override
            public void fly(String s) {
                System.out.println("芜湖~");
                System.out.println(s);
            }
        });

        useFlyable((String s)->{
            System.out.println("芜湖~");
            System.out.println(s);
        });
    }

    private static void useFlyable(Flyable f){
        f.fly("起飞咯");
    }
}
