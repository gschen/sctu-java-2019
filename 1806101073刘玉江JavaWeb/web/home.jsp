<%--
  Created by IntelliJ IDEA.
  User: LiuYuJiang
  Date: 2019/11/12
  Time: 10:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%

    if (session.getAttribute("username")==null){
        request.getRequestDispatcher("/login.jsp").forward(request,response);
    }

%>
<h1>欢迎${sessionScope.username}来到您的个人中心</h1>

</body>
</html>
