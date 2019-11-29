<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2019/11/26
  Time: 11:13
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
您的爱好是：
<%
    for (String hobby : hobbies){
        out.write(hobby);
        out.write(",");
    }
%>

</body>
</html>
