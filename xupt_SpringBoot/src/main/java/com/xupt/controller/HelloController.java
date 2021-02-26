package com.xupt.controller;

import com.xupt.pojo.User;
import com.xupt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.List;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/26 15:55
 */
@RestController
public class HelloController {
    @Autowired
    private DataSource dataSource;
    @Value("${baidu.url}")
    private String baiduUrl;
    @Value("${douyu.url}")
    private String douyuUrl;

    @Autowired
    private UserService userService;

    @GetMapping("hello")
    public String hello(){
        System.out.println("baiduUrl = "+baiduUrl);
        System.out.println("douyuUrl = "+douyuUrl);
        System.out.println("DataSource = " + dataSource);
        return "hello spring boot";
    }

    @GetMapping("/user/{id}")
    public User findById(@PathVariable Integer id){
        /*
        根据用户Id查询用户
         */
        System.out.println("findById"+id);
        return userService.findById(id);
    }

    @GetMapping("/user")
    public List<User> findAll(){
        /*
        根据用户Id查询用户
         */
        System.out.println("findById");
        return userService.findAll();
    }
}
