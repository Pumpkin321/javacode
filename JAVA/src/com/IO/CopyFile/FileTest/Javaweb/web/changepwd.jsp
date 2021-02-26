<%--
  Created by IntelliJ IDEA.
  User: 朱家豪
  Date: 19/12/17
  Time: 21:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@page import="com.hotel.bean.Manager" %>
<%
    Manager manager = (Manager) request.getSession().getAttribute("manager");
    System.out.println(manager+"changePWD.jsp");
    String pass = manager.getMana_password();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>修改密码</title>
    <link rel="stylesheet" type="text/css" href="css/css.css" />
    <script type="text/javascript" src="js/jquery.min.js"></script>
</head>
<body>
<div id="pageAll">
    <div class="pageTop">
        <div class="page">
            <img src="images/coin02.png" /><span><a href="index2.html">首页</a>&nbsp;-&nbsp;<a
                href="manager_table.jsp">系统管理</a>&nbsp;-</span>&nbsp;修改密码
        </div>
    </div>
    <div class="page ">
        <!-- 修改密码页面样式 -->
        <div class="bacen">

            <form name="MyPassForm" action="ManagerServlet?method=changePassword" method="post">
                <tr>
            <div class="bbD">
                &nbsp;&nbsp;&nbsp;&nbsp;管理员UID:<%=manager.getMana_id()%>
                <input type="hidden" id="mana_id" name="mana_id" value="${manager.getMana_id()}"/>
            </div>
                </tr><tr>
            <div class="bbD">管理员账户:<%=manager.getMana_account()%></div>
            </tr><tr>
            <div class="bbD">管理员用户名:<%=manager.getMana_name()%></div>
            </tr>
<%--                <tr>--%>
<%--            <div class="bbD">--%>
<%--                &nbsp;&nbsp;&nbsp;&nbsp;输入旧密码:<input type="password"--%>
<%--                                                     name="mama_password" id="mama_password"  /> <span id="password_1"></span><img class="imga"--%>
<%--                                                                                            src="images/ok.png" />--%>
<%--            </div></tr><tr>--%>
<%--            <div class="bbD">--%>
<%--                &nbsp;&nbsp;&nbsp;&nbsp;输入新密码:<input type="password" class="input3"--%>
<%--                                                     name="mama_password1" id="mama_password1" /><span id="password_2"></span>--%>
<%--            </div></tr><tr>--%>
<%--            <div class="bbD">--%>
<%--                再次确认密码:<input type="password" class="input3"--%>
<%--                              name="mama_passwpord2" id="mama_password2" /><span id="password_3"></span>--%>
<%--            </div></tr>--%>
                <tr>
                    <div class="bbD">
                        <img class="img1" src="images/人物.png"/>输入旧密码:<input type="text" id="mana_password" name="mana_password"
                                                                       placeholder="输入旧密码" />
                    </div>
                </tr>
                <tr>
                    <div class="lgD">
                        <img class="img1" src="images/日子.png" />输入新密码：<input type="password" id="password1" name="password1"
                                                                       placeholder="输入新密码" />
                    </div>
                </tr>
                <tr>
                    <div class="lgD">
                        <img class="img1" src="images/价格.png" />确认新密码：<input type="password" id="password2" name="password2"
                                                                       placeholder="确认新密码" />
                    </div>
                </tr>
       <tr>
            <div class="bbD">
                <p class="bbDP">
                    <input type="submit" value="确认修改密码" style="width:80px;height:30px;font-family:楷体 ;color:#5856ff;border-radius: 10px">
                </p>
            </div></tr>
            </form>
        </div>
        <!-- 修改密码页面样式end -->
    </div>
</div>

<%--<script  type="text/javascript">--%>
<%--    function checkpwd1(){--%>

<%--        var use11 = document.getElementById("mama_password").innerHTML;--%>
<%--        var password1 = "<%=pass%>";--%>

<%--        if (user.equals(password1)!=0) {--%>
<%--            document.getElementById("password_1").innerText="密码错误";--%>
<%--        }--%>
<%--    }--%>
<%--    function checkpwd2(){--%>
<%--        var user = document.getElementById("mama_password1").innerHTML;--%>
<%--        var password = document.getElementById("mama_password2").innerHTML;--%>
<%--       if(user==null||password==null)--%>
<%--           document.getElementById("passwpord_2").innerText="密码不可为空"--%>
<%--       else if (!user.equals(password)==0) {--%>
<%--            document.getElementById("password_2").innerText="与原密码相同";--%>
<%--        }--%>
<%--        else{--%>
<%--            document.getElementById("password_2").innerText="请再次确认密码";--%>
<%--       }--%>
<%--    }--%>
<%--    function checkpwd3(){--%>
<%--        var user = document.getElementById("mama_password2").innerHTML;--%>
<%--        var password = document.getElementById("mama_password3").innerHTML;--%>
<%--        if(user==null||password==null)--%>
<%--            document.getElementById("passwpord_2").innerText="密码不可为空"--%>
<%--        else if (user!=password) {--%>
<%--            document.getElementById("password_3").innerText="重新输入";--%>
<%--        }else {--%>
<%--            document.getElementById("passwprd_3").innerText="请提交";--%>
<%--        }--%>
<%--    }--%>
<%--</script>--%>
</body>
</html>