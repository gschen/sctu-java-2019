<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/12
  Time: 11:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    int count;
    count = (int) application.getAttribute("count");
    if (count = 0){}
    else{count = (int) application.getAttribute("count");

    count = count + 1;

    application.setAttribute("count",count);}

%>

当前访问人数：${applicationScope.count}
</body>
</html>
