<%--
  Created by IntelliJ IDEA.
  User: Agoni
  Date: 2019/10/29
  Time: 15:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=utf-8" language="java" %>
<html>
<head>
    <title>用户欢送页面</title>
</head>

<body>
<%
    String name=(String)session.getAttribute("name");
    session.invalidate();
    out.println(name+"再见！欢迎再来！");
%>
<a href="login.jsp">去登陆 </a>
</body>
</html>
