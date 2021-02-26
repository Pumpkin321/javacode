package com.Collecttion;

import java.util.Comparator;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/7 15:16
 */

public class Student implements Comparable<Student> {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        return name != null ? name.equals(student.name) : student.name == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public int compareTo(Student o) {
//        return 0;元素重复不添加
//        return 1;升序排序
//        return -1;降序排序
        int num= this.age-o.age;//升序排序
//        int num= o.age-this.age;降序排序
        int num2 = num==0?this.name.compareTo(o.name):num;
        return num2;
    }
}
