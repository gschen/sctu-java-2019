<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/26
  Time: 11:15
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
%>
你的爱好是：<%
        for (String hobby:hobbies){out.write(hobby);
        out.write(",");}

%>
</body>
</html>
