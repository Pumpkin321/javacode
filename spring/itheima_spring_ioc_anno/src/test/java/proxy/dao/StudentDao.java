package proxy.dao;

import proxy.StudentDaoInfo;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/1 15:38
 */

public class StudentDao implements StudentDaoInfo {

    public void add(String name) {
        System.out.println("add");
    }

    public int del(int id) {
        System.out.println("del");
        return 1;
    }

    public String update(String name, int id) {
        System.out.println("update");
        return "update success";
    }

    public String sel(int id) {
        System.out.println("sel");
        return "sel success";
    }
}
