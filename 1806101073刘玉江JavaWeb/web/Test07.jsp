<%@ page import="javax.print.DocFlavor" %><%--
  Created by IntelliJ IDEA.
  User: LiuYuJiang
  Date: 2019/11/5
  Time: 9:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="GB2312">
    <title>servlet</title>
</head>
<body>
<%--<%

    String name = (String) request.getAttribute("name");
  //  out.write("username:"+name);
%>--%>
<%--<h1>hello,<%= name%></h1>--%>
<%
    String a = "aaa";
%>
<h1>hello, ${requestScope.name}</h1>
<h2>age:${requestScope.age}</h2>
<h3>username:${requestScope.user.username}</h3>
<h3>password:${requestScope.user.password}</h3>
<h2>gender:${sessionScope.gender}</h2>

<h2>app:${applicationScope.app}</h2>
<h2>${pageScope.a}</h2>
</body>
</html>
