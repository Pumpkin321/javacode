<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/12/14
  Time: 21:46
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
    <title>用户添加</title>
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
        <form class="form-inline" name="myForm" action="UserServlet?method=add_User" method="post">
            <div class="best-hot"style="float: right;margin-left: -100px;margin-right: 200px;margin-top: 50px;">
                <!-- 头部提示信息-->
                <tr>

                <div class="logD logDtip">
                    <p class="p2">添加用户</p>
                </div></tr>
                <!-- 输入框-->
                <tr>
                    <div class="lgD">
                        <img class="img1" src="images/日子.png" /><input type="text" id="user_name" name="user_name"
                                                                       placeholder="输入用户姓名" />
                    </div>
                </tr>
                <tr>
                <div class="lgD">
                    <img class="img1" src="images/人物.png" /><input type="text" id="user_phone" name="user_phone"
                                                                   placeholder="输入用户电话" />
                </div>
                </tr>
                <tr>
                <div class="lgD">
                    <img class="img1" src="images/价格.png" /><input type="text" id="user_date" name="user_date"
                                                                   placeholder="输入用户入住日期" />
                </div>
                </tr>
                <tr>
                    <div class="lgD">
                        <img class="img1" src="images/价格.png" /><input type="text" id="user_liveday" name="user_liveday"
                                                                       placeholder="输入用户入住天数" />
                    </div>
                </tr>
                <tr>
                    <div class="lgD">
                        <img class="img1" src="images/价格.png" /><input type="text" id="room_id" name="room_id"
                                                                       placeholder="输入用户入住房间号" />
                    </div>
                </tr>
                <tr>
                    <div class="lgD">
                        <img class="img1" src="images/价格.png" /><input type="text" id="room_loc" name="room_loc"
                                                                       placeholder="输入用户入住房间地址" />
                    </div>
                </tr>
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
