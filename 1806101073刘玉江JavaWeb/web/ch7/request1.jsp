<%--
  Created by IntelliJ IDEA.
  User: LiuYuJiang
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
/demo 网站名字

Remote Addr = <%= request.getRemoteAddr()%><br/>

ServletPath = <%= request.getServletPath()%>><br/>

Method = <%= request.getMethod()%><br/>

QueryString = <%= request.getQueryString()%><br/>

name = <%= request.getParameter("name")%><br>

age = <%= request.getParameter("age")%><br>

<%
request.setAttribute("aa",465);
%>
a = <%= request.getAttribute("aa")%>
</body>
</html>
