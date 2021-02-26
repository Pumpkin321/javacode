<%--
  Created by IntelliJ IDEA.
  User: 25218
  Date: 2020/12/20
  Time: 17:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>保存用户信息</title>
</head>
<body>
    <h1>保存账户信息表单</h1>
    <form action="${pageContext.request.contextPath}/account/save" method="post">
        账户名称<input type="text" name="name"><br/>
        账户金额<input type="text" name="money"><br/>
    <input type="submit" value="保存"> <br/>
</form>
</body>
</html>
