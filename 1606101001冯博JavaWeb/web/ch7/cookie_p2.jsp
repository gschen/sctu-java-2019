<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2019/11/19
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    int number = 0;
    Cookie[] cookies = request.getCookies();
    for(Cookie cookie : cookies){
        if(cookie.getName().equals("number")){
            number = Integer.valueOf(cookie.getValue());
    }
    }
%>
该数字的立方和是：<%= number * number * number %>
</body>
</html>
