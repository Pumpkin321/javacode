package com.xupt.domain;

import java.util.List;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/8 16:51
 */

public class VO {
    private List<User> userList;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    @Override
    public String toString() {
        return "VO{" +
                "userList=" + userList +
                '}';
    }
}
