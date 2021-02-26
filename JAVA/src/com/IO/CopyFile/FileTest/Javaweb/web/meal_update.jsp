<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/12/14
  Time: 23:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@page import="com.hotel.bean.Meal" %>
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
    <title>修改餐品</title>
    <link rel="stylesheet" type="text/css" href="css/public.css" />
    <link rel="stylesheet" type="text/css" href="css/page.css" />

</head>
<script type="javascript">

</script>
<body style="background:url(images/c4.jpg);top: 0;
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
        <form class="form-inline" name="myForm" action="MealServlet?method=update_Meal" method="post">
            <div class="best-hot"style="float: right;margin-left: -100px;margin-right: 200px;margin-top: 50px;">
                <!-- 头部提示信息--><tr>

                <div class="logD logDtip">
                    <p class="p2">修改餐品信息</p>
                </div></tr>
                <!-- 输入框--><tr>
                <div class="lgD">
                    <img class="img1" src="images/酒店.png" /><input type="text" id="meal_id" name="meal_id"
                                                                   placeholder="输入餐品序号" value="${meal.meal_id}"/>
                </div></tr>
                <tr>
                    <div class="lgD">
                        <img class="img1" src="images/人物.png" /><input type="text" id="meal_type" name="meal_type"
                                                                       placeholder="输入餐品类型" value="${meal.meal_type}"/>
                    </div>
                </tr>
                <tr>
                    <div class="lgD">
                        <img class="img1" src="images/日子.png" /><input type="text" id="meal_name" name="meal_name"
                                                                       placeholder="输入餐品名字" value="${meal.meal_name}"/>
                    </div>
                </tr>
                <tr>
                    <div class="lgD">
                        <img class="img1" src="images/价格.png" /><input type="text" id="meal_explain" name="meal_explain"
                                                                       placeholder="输入餐品描述" value="${meal.meal_explain}"/>
                    </div>
                </tr>
                <tr>
                    <div class="lgD">
                        <img class="img1" src="images/价格.png" /><input type="text" id="meal_place" name="meal_place"
                                                                       placeholder="输入餐厅地点" value="${meal.meal_place}"/>
                    </div>
                </tr>
                <tr>
                    <div class="lgD">
                        <img class="img1" src="images/价格.png" /><input type="text" id="emp_id" name="emp_id"
                                                                       placeholder="输入员工号" value="${meal.emp_id}"/><span id="emp_id_1"></span>
                    </div>
                </tr>
                <tr>
                    <div class="lgD">
                        <img class="img1" src="images/价格.png" /><input type="text" id="meal_picpath" name="meal_picpath"
                                                                       placeholder="输入图片源" value="${meal.meal_picpath}"/>
                    </div>
                </tr>
                <tr>
                    <div class="logC">
                        <input type="submit" value="确认修改" style="width:80px;height:30px;font-family:楷体 ;color:#5856ff;border-radius: 10px">
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
