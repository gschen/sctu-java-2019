<%--
  Created by IntelliJ IDEA.
  User: 85007
  Date: 2019/10/22
  Time: 10:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table border="3">
    <tr>
        <td width="60px">编号</td>
        <td width="100px">用户名</td>
        <td>密码</td>
    </tr>

    <%
        for (int i = 0; i < 10; i++) {
            out.write("<tr><td>" + ( i + 1 )+"</td><td>李四狗</td><td>123456</td></tr>");

        }
    %>
</table>

</body>
</html>
