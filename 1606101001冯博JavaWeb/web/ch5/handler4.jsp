<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2019/11/26
  Time: 11:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    int num = Integer.parseInt(request.getParameter("num"));
%>

该数字的立方和是：<%= num*num*num %>

</body>
</html>
