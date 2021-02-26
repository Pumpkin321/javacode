package com.Collecttion.Set;

/**
 * @Description
 * @Author cyb
 * @Date 2020/10/13 21:46
 */

public class Stu {
    /**
     * @Description
     * @Author cyb
     * @Date 2020/10/7 15:16
     */

    private String name;
    private int age;
    private int chineseGrade;
    private int mathGrade;
    private int engGrade;

    public Stu() {
    }

    public Stu(String name, int age, int chineseGrade, int mathGrade, int engGrade) {
        this.name = name;
        this.age = age;
        this.chineseGrade = chineseGrade;
        this.mathGrade = mathGrade;
        this.engGrade = engGrade;
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

    public int getChineseGrade() {
        return chineseGrade;
    }

    public void setChineseGrade(int chineseGrade) {
        this.chineseGrade = chineseGrade;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }

    public int getEngGrade() {
        return engGrade;
    }

    public void setEngGrade(int engGrade) {
        this.engGrade = engGrade;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", chineseGrade=" + chineseGrade +
                ", mathGrade=" + mathGrade +
                ", engGrade=" + engGrade +
                '}';
    }

    public int getNum(){
        return this.chineseGrade+this.engGrade+this.mathGrade;
    }
}
