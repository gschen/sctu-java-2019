<%--
  Created by IntelliJ IDEA.
  User: l
  Date: 2019/11/15
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    if(session.getAttribute("user") == null){
        request.getRequestDispatcher("/login.jsp")
                .forward(request,response);
    }else{
        chain.doFilter(request,response);
    }


%>
用户管理页面
</body>
</html>
