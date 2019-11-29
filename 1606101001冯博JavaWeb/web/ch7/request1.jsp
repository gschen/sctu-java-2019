<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2019/11/19
  Time: 8:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
RemoteAddr = <%= request.getRemoteAddr()%> <br>

ServletPath = <%= request.getServletPath()%> <br>

Method = <%= request.getMethod()%> <br>

QueryString = <%= request.getQueryString()%>>  //框架

name = <%= request.getParameter("name")%>>
age = <%= request.getParameter("age")%>

</body>
</html>
