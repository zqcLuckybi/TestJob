<%--
  Created by IntelliJ IDEA.
  User: ShenMouMou
  Date: 2019/12/18
  Time: 13:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <a href="/20191218_Servlet__war_exploded/haha2?username=张三&password=123456">请求后台</a>
   <form action="/20191218_Servlet__war_exploded/haha2" method="post">
     <input type="text" name="username">
       <input type="text" name="password">
       <input type="submit" value="提交">

   </form>
  </body>
</html>

