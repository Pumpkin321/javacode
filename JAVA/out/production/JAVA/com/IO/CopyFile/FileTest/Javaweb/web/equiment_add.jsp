<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/12/15
  Time: 13:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String contextPath = request.getContextPath();
    request.setAttribute("contextPath", contextPath);
%>
<%@page import="com.hotel.bean.Manager"%>
<%
    Manager manager = (Manager) request.getSession().getAttribute("manager");
    if(manager==null)
        response.sendRedirect("login.html");
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>器材</title>
    <link rel="stylesheet" type="text/css" href="css/public.css" />
    <link rel="stylesheet" type="text/css" href="css/page.css" />

</head>
<body style="background:url(images/bg.jpg);top: 0;
	left: 0;
	width:100%;
	height:100%;
	min-width: 1000px;
	z-index:-10;
	zoom: 1;
	background-color: #fff;
	background-repeat: no-repeat;
	background-size: cover;
	-webkit-background-size: cover;
	-o-background-size: cover;
	background-position: center 0;">
<div class="logDiv">
    <%--    <img class="logBanner" src="images/logBanner.png" />--%>
    <div class="banner-text">
        <form class="form-inline" name="myForm" action="EquimentServlet?method=add_Equiment" method="post">
            <div class="best-hot"style="float: right;margin-left: -100px;margin-right: 200px;margin-top: 50px;">
                <!-- 头部提示信息--><tr>

                <div class="logD logDtip">
                    <p class="p2">添加器材</p>
                </div></tr>
                <!-- 输入框--><tr>
                <tr>
                    <div class="lgD">
                        <img class="img1" src="images/位置（指南针）.png" /><input type="text" id="equ_name" name="equ_name"
                                                                            placeholder="输入器材名字"/>
                    </div></tr><tr>
                <tr>
                    器材类型：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select name="equ_type" id="equS_type" >
                    <option name="equ_type" value="有氧运动">有氧运动</option>
                    <option name="equ_type" value="无氧运动">无氧运动</option>
                </select>
                    <%--                <div class="lgD">--%>

                    <%--                    <div class="type1" >房间类型：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<select name="room_type" id="room_type">--%>
                    <%--                        <option name="room_type" value="总统套房">总统套房</option>--%>
                    <%--                        <option name="room_type" value="圆床房">圆床房</option>--%>
                    <%--                        <option name="room_type" value="大床房">大床房</option>--%>
                    <%--                        <option name="room_type" value="标准间">标准间</option>--%>
                    <%--                    </select>--%>
                    <%--                    </div>--%>
                    <%--                </div>--%>
                </tr>
                <tr>
                    <div class="lgD">
                        <img class="img1" src="images/酒店.png" /><input type="text" id="equ_num" name="equ_num"
                                                                       placeholder="输入器材数量" />
                    </div></tr><tr>
                <div class="lgD">
                    <img class="img1" src="images/价格.png" /><input type="text" id="equ_remark" name="equ_remark"
                                                                   placeholder="输入器材备注" />
                </div></tr>
                <tr>
                    <div class="lgD">
                        <img class="img1" src="images/价格.png" /><input type="text" id="equ_explain" name="equ_explain"
                                                                       placeholder="输入器材说明" />
                    </div></tr>
                <tr>
                    <div class="lgD">
                        <img class="img1" src="images/价格.png" /><input type="text" id="equ_picpath" name="equ_picpath"
                                                                       placeholder="输入器材展示" />
                    </div></tr>
                <tr>
                    <div class="lgD">
                        <img class="img1" src="images/价格.png" /><input type="text" id="emp_id" name="emp_id"
                                                                       placeholder="输入器材维修人员id" />
                    </div></tr>
                <tr>
                <div class="logC">
                    <input type="submit" value="添加" style="width:80px;height:30px;font-family:楷体 ;color:#5856ff;border-radius: 10px">
                </div>
            </tr>
            </div>
        </form></div>
</div>

<!-- 登录body  end-->

<!-- 登录页面底部 -->
<div class="logFoot">
    <p class="p1"style="margin-left: 42%;">版权所有：皇家酒店</p>
</div>
<!-- 登录页面底部end -->

</body>
</html>
