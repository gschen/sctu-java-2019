<%--
  Created by IntelliJ IDEA.
  User: LiuYuJiang
  Date: 2019/11/29
  Time: 15:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%

    String fileName = request.getParameter("file");
    response.setHeader("Content-Disposition","attachment;filename="+fileName);

    response.setContentType("image/jpg");

    request.getRequestDispatcher("/upload/"+fileName).forward(request,response);
%>
</body>
</html>
