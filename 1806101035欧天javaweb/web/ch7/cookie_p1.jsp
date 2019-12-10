<%--
  Created by IntelliJ IDEA.
  User: l
  Date: 2019/11/19
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    int number =12;
    //如何在cookie空间上定义一个变量
    Cookie cookie =new Cookie("number",String.valueOf(number));
    cookie.setMaxAge(60);
    response.addCookie(cookie);
%>
该数字的平方和：<%= number*number %>
</body>
</html>
