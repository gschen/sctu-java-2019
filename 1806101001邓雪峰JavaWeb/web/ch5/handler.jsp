<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/26
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String gender = request.getParameter("gender");
%>
你的性别是：<%= gender%>
</body>
</html>
