<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/19
  Time: 10:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    int number = 0;
    Cookie[] cookies = request.getCookies();
    for(Cookie cookie: cookies){
        if(cookie.getName().equals("number")){
            number = Integer.valueOf(cookie.getValue());
            break;
        }
    }
%>

</body>
</html>
