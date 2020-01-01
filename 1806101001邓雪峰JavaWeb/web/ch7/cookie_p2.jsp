<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/19
  Time: 10:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    int number = 12;
    Cookie cookie = new Cookie("number",String.valueOf(number));
    cookie.setMaxAge(60);

    response.addCookie(cookie);
%>
该数字的立方和是:<%= number *number%>
</body>
</html>
