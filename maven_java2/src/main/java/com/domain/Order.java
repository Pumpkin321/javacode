package com.domain;

import java.util.Date;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/18 17:21
 */

public class Order {
    private int id;
    private Date ordertime;
    private double total;

    //表示当前属于那一个用户
    private Emp emp;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Emp getEmp() {
        return emp;
    }

    public void setEmp(Emp emp) {
        this.emp = emp;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", ordertime=" + ordertime +
                ", total=" + total +
                ", emp=" + emp +
                '}';
    }
}
