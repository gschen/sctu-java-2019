<%--
  Created by IntelliJ IDEA.
  User: 85007
  Date: 2019/11/26
  Time: 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String[] hobbies = request.getParameterValues("hobby");
    /*String hobby = request.getParameter("hobby");*/  //这个只能接收一个
%>
你的，
<%
    for (String hobby : hobbies){
        out.write(hobby);
        out.write(",");
    }
%>
</body>
</html>
