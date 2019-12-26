<%--
  Created by IntelliJ IDEA.
  User: ShenMouMou
  Date: 2019/12/18
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<center>
    <form action="${pageContext.request.contextPath}/login" method="post">
        用户名：<input type="text" name="username" placeholder="请输入用户名"><br>
        密码：<input type="text" name="password" placeholder="请输入密码"><br>
        <input type="submit" value="提交">
    </form>
</center>
</body>
</html>
