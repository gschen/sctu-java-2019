<%--
  Created by IntelliJ IDEA.
  User: Agoni
  Date: 2019/10/29
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=utf-8" language="java" %>
<html>
<head>
    <title>用户登陆界面</title>
</head>
<body>
<%
    if(!session.isNew())
    {
        String name=(String)session.getAttribute("username");
        if(name==null) name="";
    }
%>
<table border="1" align="center">
    <caption>用户登陆：</caption>
    <form action="yanzheng.jsp" method="post">
        <tr>
            <td>用户名</td>
            <td><input type="text" name="username"/></td>
        </tr>
        <tr>
            <td>密码</td>
            <td><input type="password" name="password"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="登陆" /></td>
            <td><input type="button" value="注册" onclick="window.location.href='zhuce.jsp';">
        </tr>
    </form>
</table>
</body>
</html>
