<%--
  Created by IntelliJ IDEA.
  User: Agoni
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
<%
    for (int i = 0; i <10 ; i++) {
        out.write("<tr>" +
                "        <td>"+i+1+"</td>" +
                "        <td>桂军</td>" +
                "        <td>123456</td>" +
                "    </tr>");
    }
%>
<table>
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>密码</td>
    </tr>
    <tr>
        <td>1</td>
        <td>桂军</td>
        <td>123456</td>
    </tr>
<%
%>
</table>
</body>
</html>
