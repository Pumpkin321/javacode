package com.xupt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/9 17:50
 */
@Controller
public class targetController {

    @RequestMapping("/target")
    public ModelAndView show(){
        System.out.println("目标资源执行");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("name","xupt");
        modelAndView.setViewName("target");
        return modelAndView;
    }
}
