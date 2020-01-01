<%--
  Created by IntelliJ IDEA.
  User: 85007
  Date: 2019/11/15
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    if (session.getAttribute("user") == null){
        request.getRequestDispatcher("/login.jsp")
                .forward(request,response);
    }
%>
<h1>用户管理页面</h1>

</body>
</html>
