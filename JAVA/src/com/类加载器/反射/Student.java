package com.类加载器.反射;

import com.Collecttion.Set.Stu;

/**
 * @Description
 * @Author cyb
 * @Date 2020/11/23 17:08
 */

public class Student {
    private String name;
    int age;
    public String address;

    public Student() {
    }

    private Student(String name){
        this.name=name;
    }

    Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    public Student(String name,int age,String address){
        this.name=name;
        this.age=age;
        this.address=address;
    }

    private void function(){
        System.out.println("function");
    }
    public void method(){
        System.out.println("method");
    }
    public void method2(String s){
        System.out.println("method:"+s);
    }
    public String method3(String s,int i){
        return s+","+i;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
