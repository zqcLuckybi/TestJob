<%--
  Created by IntelliJ IDEA.
  User: ShenMouMou
  Date: 2019/12/18
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h1>注册用户</h1>
    <form action="${pageContext.request.contextPath}/haha6" method="post">
        用户名：<input type="text" name="username" placeholder="请输入用户名"><br>
        密码：<input type="text" name="password" placeholder="请输入密码"><br>

        性别:<input type="radio"  name="sex" value="1"> 男
        <input type="radio" name="sex" value="0"> 女
        <br>
        爱好：<input type="checkbox" name="hooby" value="lq">篮球
        <input type="checkbox" name="hooby" value="zq">足球
        <br>
        <input type="submit" value="提交">
    </form>
</center>
</body>
</html>
