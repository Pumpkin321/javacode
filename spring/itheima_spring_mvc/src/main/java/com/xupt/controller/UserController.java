package com.xupt.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.xupt.domain.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/7 15:21
 */

@Controller
@RequestMapping("/user")
public class UserController  {

    //请求地址:http://localhost:8080/user/quick
    @RequestMapping("/quick")
    public String save(){
        System.out.println("Controller Running");
        return "success";
    }

    @RequestMapping("/quick2")
    public ModelAndView save2(){
        System.out.println("controller running");
        /*
        Model 模型：作用封装数据
        View  视图：作用展示数据
         */
        ModelAndView modelAndView = new ModelAndView();
        //设置模型数据
        modelAndView.addObject("username","cyb");
        //设置视图数据
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/quick3")
    public  ModelAndView save3(ModelAndView modelAndView){
        modelAndView.addObject("username","cyb");
        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/quick4")
    public String save4(Model model){
        model.addAttribute("username","xupt");
        return "success";
    }

    @RequestMapping("/quick5")
    public String save5(HttpServletRequest request){
        request.setAttribute("username","小帅哥");
        return "success";
    }

    @RequestMapping("/quick6")
    public String save6(HttpServletResponse response) throws IOException {
        response.getWriter().println("hello xupt");
        return "success";
    }

    @RequestMapping("/quick7")
    @ResponseBody //告知SpringMVC框架该方法不进行视图跳转 直接进行数据响应
    public String save7() throws IOException {
        return "hello world";
    }

    @RequestMapping("/quick8")
    @ResponseBody
    public String save8() throws IOException{
        return "{\"username\":\"cyb\",\"age\":18}";
    }

    @RequestMapping("/quick9")
    @ResponseBody
    public String save9() throws IOException{
        System.out.println("12345");
        User user = new User();
        user.setAge(18);
        user.setName("cyb");
        //使用json的转换工具将对象转换成java字符串在返回
        ObjectMapper objectMapper= new ObjectMapper();
        System.out.println("objectMapper"+objectMapper);
        String json = objectMapper.writeValueAsString(user);
        System.out.println(json);
        return json;
    }

    @RequestMapping("/quick10")
    @ResponseBody
    public User save10() throws IOException{
        System.out.println("123");
        User user = new User();
        user.setAge(18);
        user.setName("cyb");
        //使用json的转换工具将对象转换成java字符串在返回
        return user;
    }



}
