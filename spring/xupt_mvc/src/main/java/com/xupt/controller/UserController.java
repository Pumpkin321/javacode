package com.xupt.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.xupt.domain.User;
import com.xupt.domain.VO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @Description
 * @Author cyb
 * @Date 2020/12/7 15:21
 */

@Controller
@RequestMapping("/user")
public class UserController  {
    //回写数据
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
        model.addAttribute("username", "com/xupt");
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

    //SpringMVC
    //请求数据
    //基本类型参数
    @RequestMapping("/quick11")
    @ResponseBody
    public void save11(String username,int age) throws IOException{
        System.out.println(username);
        System.out.println(age);
    }
    //POJO参数
    @RequestMapping("/quick12")
    @ResponseBody
    public void save12(User user) throws IOException{
        System.out.println(user);
    }
    //数组类型参数
    @RequestMapping("/quick13")
    @ResponseBody
    public void save13(String[] strs) throws IOException{
        System.out.println(Arrays.asList(strs));
    }
    //集合对象参数
    @RequestMapping("/quick14")
    @ResponseBody
    public void save14(VO vo) throws IOException{
        System.out.println(vo);
    }

    @RequestMapping("/quick15")
    @ResponseBody
    public void save15(@RequestBody List<User> userList) throws IOException{
        System.out.println(userList);
    }

    //RequestParam
    //注解@RequestParam还有如下参数可以使用:
    //value:与请求参数名称
    //required:此在指定的请求参数是否必须包括，默认是true,提交时如果没有此参数则报错
    //defaultValue: 当没有指定请求参数时，则使用指定的默认值赋值
    @RequestMapping("/quick16")
    @ResponseBody
    public void save16(@RequestParam(value = "name",required = false,defaultValue = "xupt") String username) throws IOException{
        System.out.println(username);
    }
    //获得Restful风格的参数
    //Restful是一种软件架构风格、设计风格,而不是标准，只是提供了一组设计原则和约束条件。 主要用于客户端和服务
    //器交互类的软件，基于这个风格设计的软件可以更简洁，更有层次，更易于实现缓存机制等。
    //Restful风格的请求是使用"url+ 请求方式”示次请求目的的，HTTP 协议里面四个表示操作方式的动词如下:
    //GET:用于获取资源
    //POST:用于新建资源
    //PUT:于更新资源
    //DELETE:用于删除资源
    @RequestMapping("/quick17/{name}")
    @ResponseBody
    public void save17(@PathVariable(value = "name",required = true) String username) throws IOException{
        System.out.println(username);
    }

    //自定义转换器
    //Converter编写及配置
    @RequestMapping("/quick18")
    @ResponseBody
    public void save18(Date date) throws IOException{
        System.out.println(date);
    }

    //获取请求头
    @RequestMapping("/quick19")
    @ResponseBody
    public void save19(@RequestHeader(value = "User-Agent",required = false) String user_agent) throws IOException{
        System.out.println(user_agent);
    }

    //获取请求头
    @RequestMapping("/quick20")
    @ResponseBody
    public void save20(@CookieValue(value = "JSESSIONID",required = false) String jsessionId) throws IOException{
        System.out.println(jsessionId);
    }

    //文件上传
    //单文件上传
    //多文件上传
    @RequestMapping("/quick21")
    @ResponseBody
    public void save21(String username, MultipartFile upload,MultipartFile upload2,MultipartFile upload3) throws IOException{
        System.out.println(username);
        System.out.println(upload);
        //获得文件名称
        String filename = upload.getOriginalFilename();
        //保持文件
        upload.transferTo(new File("C:\\Users\\25218\\Desktop\\Test"+filename));
        String filename2 = upload2.getOriginalFilename();
        upload2.transferTo(new File("C:\\Users\\25218\\Desktop\\Test"+filename2));
        String filename3 = upload3.getOriginalFilename();
        upload3.transferTo(new File("C:\\Users\\25218\\Desktop\\Test"+filename3));
    }

    @RequestMapping("/quick22")
    @ResponseBody
    public void save22(String username, MultipartFile[] upload) throws IOException{
        System.out.println(username);
        for (MultipartFile multipartFile : upload) {
            String originalFilename = multipartFile.getOriginalFilename();
            multipartFile.transferTo(new File("C:\\Users\\25218\\Desktop\\Test"+originalFilename ));
        }
        //获得文件名称

        //保持文件

    }
}
