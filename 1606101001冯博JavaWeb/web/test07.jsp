<%@ page import="edu.sctu.servlet.Test01Servlet" %><%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2019/11/5
  Time: 9:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>获取name</title>
</head>
<body>
    <%
        /*String name = (String) request.getAttribute("name");  // (类型)为强制类型转化
        out.write("hello"+name);*/
        pageContext.setAttribute("a","123123");//范围最小
    %>
    <%--<h1>hello,<%= name%></h1>--%>

<h1>hello,${requestScope.name}</h1>
<h2>age:${requestScope.age}</h2>
<h3>user:${requestScope.user.username}<br>
    password:${requestScope.user.password}</h3>

<h2>gender:${sessionScope.gender}</h2>

<h2>app:${applicationScope.app}</h2>

</body>
</html>
