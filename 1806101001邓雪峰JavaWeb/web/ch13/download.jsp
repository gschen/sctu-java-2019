<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/29
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=ISO-2022-CN" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ page contentType="text/html; " language="java" %>
<%
    response.setHeader("Contenet-Disposition","attachment;filename=panda.jpg");
    response.setContentType("image/jpeg");
    request.getRequestDispatcher("/upload/panda.jpg").forward(request,response);

%>
</body>
</html>
