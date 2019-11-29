<%--
  Created by IntelliJ IDEA.
  User: l
  Date: 2019/11/26
  Time: 11:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
//    String city=request.getParameter("city");

    String[] cities =request.getParameterValues("city");
%>
<%--您的城市是：<%= city%>--%>
<%

    for (String city :cities){
        out.write(city);
        out.write(",");
    }%>
</body>
</html>
