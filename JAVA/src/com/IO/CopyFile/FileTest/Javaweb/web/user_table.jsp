<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2019/12/14
  Time: 21:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="com.hotel.bean.User" %>
<%
    String contextPath = request.getContextPath();
    request.setAttribute("contextPath", contextPath);
    String rs=(String)request.getAttribute("result");
%>
<%@page import="com.hotel.bean.Manager"%>
<%
    Manager manager = (Manager) request.getSession().getAttribute("manager");
    if(manager==null)
        response.sendRedirect("login.html");
%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title></title>
    <meta name="keywords" content="" />
    <meta name="description" content="" />
    <meta name="generator" content="" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width; initial-scale=1.0; maximum-scale=1.0; user-scalable=0;">
    <link href="css/haiersoft.css" rel="stylesheet" type="text/css" media="screen,print" />
    <link href="css/print.css" rel="stylesheet" type="text/css"  media="print" />
    <script src="js/jquery-1.10.1.min.js"></script>
    <script src="js/side.js" type="text/javascript"></script>
    <!--[if lt IE 9]>
    <script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
    <script src="http://css3-mediaqueries-js.googlecode.com/svn/trunk/css3-mediaqueries.js"></script>
    <![endif]-->
    <style type="text/css">
        ul{
            display: table;
            margin:40px auto;
        }
        li{
            display: table-cell;
        }
        ul li a{
            text-decoration: none;
            padding: 5px 8px;
            background-color: #ddd;
            color: #000;
            margin-right: 1px;
        }
        ul li a:hover{
            background-color: #ffcc00;
            color: #fff;
        }
    </style>
    <script>
        window.onload = function x() {
            var flag='<%=request.getAttribute("result")%>';
            console.log(flag);
            function f() {
                if(flag=='null'){
                    return;
                }
                else{
                    alert(flag);
                }
            }
            f();
        }
    </script>

</head>
<body>

<div style="height:50px;line-height:50px;font-size:25px;vertical-align: middle;text-align: center" class="bg-primary">皇家酒店用户管理</div>

<div class="row" style="padding:10px 10px">

    <!-- 左导航栏 -->

    <div class="col-md-10" style="padding-top:10px">

        <!-- 查询块 -->
        <div class="search" >
            <form class="form-inline" name="myForm" action="UserServlet?method=searchByPage_User" method="post">
                <!-- <input type="hidden" name="method" value="search"/> -->
                <input type="text" class="form-control" name="user_name" value="${user_name}"/>
                <input type="submit" class="btn btn-primary" value="查   询" />&nbsp;&nbsp;
                <input type="button" class="btn btn-danger" value="增   加" onclick="javascript:window.location='user_add.jsp'">
            </form>
        </div>
        <!-- 员工信息显示-->
        <div id="MainForm">
            <div class="form_boxA">
                <h2>用户列表</h2>
                <table cellpadding="0" cellspacing="0">
                    <tr>
                        <th>序号</th>
                        <th>用户姓名</th>
                        <th>用户电话</th>
                        <th>入住日期</th>
                        <th>天数</th>
                        <th>房间号</th>
                        <th>房间地址</th>
                    </tr>
                    <%
                        int currentPage=1;  //当前页
                        int allCount=0;     //总记录数
                        int allPageCount=0; //总页数
                        User user=null;
                        //查看request中是否有currentPage信息，如没有，则说明首次访问该页
                        if(request.getAttribute("allUser")!=null)
                        {
                            //获取Action返回的信息
                            currentPage=((Integer)request.getAttribute("currentPage")).intValue();
                            ArrayList<User> list=(ArrayList<User>)request.getAttribute("allUser");
                            allCount=((Integer)request.getAttribute("allCount")).intValue();
                            allPageCount=((Integer)request.getAttribute("allPageCount")).intValue();
                            if(list!=null && list.size()>0)
                            {
                                for(int i=0;i<list.size();i++)
                                {
//                                if(i%2==0)
//                                    out.println("<tr class='success'>");
//                                else
//                                    out.println("<tr class='active'>");
                    %>
                    <td><%=list.get(i).getUser_id()%></td>
                    <td><%=list.get(i).getUser_name()%></td>
                    <td><%=list.get(i).getUser_phone()%></td>
                    <td><%=list.get(i).getUser_date()%></td>
                    <td><%=list.get(i).getUser_liveday()%></td>
                    <td><%=list.get(i).getRoom_id()%></td>
                    <td><%=list.get(i).getRoom_loc()%></td>

                    <td><a href="UserServlet?method=searchById_User&user_id=<%=list.get(i).getUser_id()%>&currentPage=${currentPage}&user_name=${user_name}">修改</a></td>
                    <td><a href="UserServlet?method=delete_User&user_id=<%=list.get(i).getUser_id()%>&currentPage=${currentPage}&user_name=${user_name}">删除</a></td>
                    <td><a href="OrderServlet?method=add_Order&user_id=<%=list.get(i).getUser_id()%>&currentPage=${currentPage}
                    &user_name=${user_name}&room_id=<%=list.get(i).getRoom_id()%>&user_liveday=<%=list.get(i).getUser_liveday()%>">退订房间</a></td>
                    </tr>
                    <%
                                }
                            }
                        }
                    %>
                </table>
                <div  >
                    <ul class="pager">
                        <li><a href="UserServlet?method=searchByPage_User&currentPage=1&user_name=${user_name}">首页</a></li>
                        <li><a href="UserServlet?method=searchByPage_User&currentPage=<%=(currentPage-1)<1?1:(currentPage-1)%>&user_name=${user_name}">上一页</a></li>
                        <li><a href="UserServlet?method=searchByPage_User&currentPage=<%=(currentPage+1)>allPageCount?allPageCount:(currentPage+1)%>&user_name=${user_name}">下一页</a></li>
                        <li><a href="UserServlet?method=searchByPage_User&currentPage=<%=allPageCount%>&user_name=${user_name}">末页</a></li>
                    </ul>
                </div>
            </div>
            <!-- 分页 -->
        </div>
    </div>
</div>

</body>
</html>
