<%--
  Created by IntelliJ IDEA.
  User: Agoni
  Date: 2019/10/29
  Time: 15:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=utf-8" language="java" %>
<%@page import="java.sql.*"%>
<html>
<head>
    <title>注册用户</title>
</head>
<body>
<table border="1">
    <caption>
        信息填写：
    </caption>
    <form action="insert.jsp" method="post">
        <tr>
            <td>id:</td>
            <td><input type="text" name="id"></td>
        </tr>
        <tr>
            <td>密码:</td>
            <td><input type="password" name="psw"></td>
        </tr>
        <tr>
            <td>姓名:</td>
            <td><input type="text" name="name"></td>
        </tr>
        <tr>
            <td>年龄:</td>
            <td><input type="text" name="age"></td>
        </tr>
        <tr>
            <td>tel:</td>
            <td><input type="text" name="phone"></td>
        </tr>
        <tr>
            <td>地址:</td>
            <td><input type="text" name="address"></td>
        </tr>
        <tr>
            <td>城市:</td>
            <td><input type="text" name="city"></td>
        </tr>
        <tr>
            <td><input type="submit" value="注册" /></td>
        </tr>
    </form>
</table>

</body>
</html>



