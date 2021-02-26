package com.controller;

import com.domain.Account;
import com.service.AccountService;
import org.apache.ibatis.annotations.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/20 17:10
 */

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "/save")
    public String save(Account account) throws IOException {
        accountService.save(account);
        System.out.println(account);
        return "redirect:/account/findAll";
    }

    @RequestMapping("/findAll")
    public ModelAndView findAll() throws IOException {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("accountList");
        modelAndView.addObject("accountList",accountService.findAll());
        System.out.println("123456");
        return modelAndView;
    }
}
