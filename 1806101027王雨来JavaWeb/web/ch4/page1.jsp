<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 85007
  Date: 2019/11/26
  Time: 9:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %><%--忽略EL表达式--%>
<%--一个页面可以有多个page指令--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    session.setAttribute("user","张三");//EL表达式
    List<String> names = new ArrayList<>();
%>

${sessionScope.user}
</body>
</html>
