<%--
  Created by IntelliJ IDEA.
  User: 85007
  Date: 2019/11/5
  Time: 9:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="GB2312">
    <title>Title</title>
</head>
<body>
<%--<%
    String zs = (String) request.getAttribute("name");
    //out.write("<p>Username:"+zs+"<p>");
%>
<h1>hello,<%= zs%></h1>--%>

<h1>hello,${requestScope.name}</h1>
<h1>age:${requestScope.age}</h1>
<table border="1" cellspacing="0">
    <tr>
        <td>id:${requestScope.user.id}</td>
        <td>name:${requestScope.user.username}</td>
        <td>password:${requestScope.user.password}</td>
        <td>gerder:${sessionScope.gerder}</td>
        <td>app:${applicationScope.app}</td>
        <%
            pageContext.setAttribute("a","1234");
        %>
    </tr>
</table>
<h1></h1>
<%--<h1>王雨来</h1>--%>
</body>
</html>
