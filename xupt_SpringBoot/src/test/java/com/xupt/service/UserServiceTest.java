package com.xupt.service;

import com.xupt.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceTest {

    @Autowired
    private UserService userService;
    @Test
    public void findById() {
        User user = userService.findById(3);
        System.out.println(user);
    }

    @Test
    public void findAll() {
        List<User> userList = userService.findAll();
        System.out.println(userList);
    }

    @Test
    public void saveUser() {
        User user = new User();
        user.setUserName("jest");
        user.setName("cbTest");
        user.setAge(17);
        user.setSex(1);
        user.setPassword("2323154");
        user.setCreated(new Date());
        userService.saveUser(user);
    }
}