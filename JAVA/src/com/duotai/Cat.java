package com.duotai;

/**
 * @Description
 * @Author cyb
 * @Date 2020/9/8 17:01
 */

public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃老鼠");
    }
    public void play(){
        System.out.println("猫捉老鼠");
    }
}
