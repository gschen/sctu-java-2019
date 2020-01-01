<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/12
  Time: 10:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
    if(session.getAttribute("username")==null){
        request.getRequestDispatcher("/login.jsp").forward(request,response);
    }
%>
欢迎您，${sessionScope.username}! 这是用户个人中心页面。

</body>
</html>
