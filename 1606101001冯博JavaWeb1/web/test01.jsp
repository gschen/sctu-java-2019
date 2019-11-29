<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.DriverManager" %><%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2019/10/22
  Time: 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table>
    <tr>
        <td>编号</td>
        <td>用户名</td>
        <td>密码</td>
    </tr>
    <tr>
        <td>1</td>
        <td>fengbo</td>
        <td>fb123</td>
    </tr>
    <%
        for (int i = 0; i < 10; i++) {
            //先删除1，两个双引号，两个+号
            out.write("<tr>" + "<td>"+ i +"</td>" + "<td>fengbo</td>" + "<td>fb123</td>" + "</tr>");
        }
    %>
</table>
</body>

</html>
