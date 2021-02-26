package com.domain;

import com.sun.org.apache.xpath.internal.operations.Or;

import java.util.Date;
import java.util.List;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/18 16:28
 */

public class Emp {
    private int id;
    private String name;
    private Date birthday;
    //描述当前用户存在哪些订单
    private List<Order> orderList;
    //描述当前用户具有哪些角色
    private List<Role> roleList;

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", roleList=" + roleList +
                '}';
    }
}
