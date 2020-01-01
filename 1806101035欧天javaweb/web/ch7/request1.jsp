<%--
  Created by IntelliJ IDEA.
  User: l
  Date: 2019/11/19
  Time: 8:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<%= request.getRemoteAddr()%><br>


<%--请求的路径--%>
<%--/demo 网站名字：contextPath--%>
<%= request.getServletPath()%><br>
<%= request.getMethod()%><br>
<%--查询字符串--%>
QueryString = <%= request.getQueryString()%><br>
name = <%= request.getParameter("name")%><br>
age = <%= request.getParameter("age")%>
</body>
</html>
