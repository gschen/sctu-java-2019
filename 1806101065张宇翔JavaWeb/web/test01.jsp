<%--
  Created by IntelliJ IDEA.
  User: zyx99
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

    <%
    for(int i = 0;i < 10 ; i++){
        out.write("<tr><td>"+(i+1)+"</td>><td>张山</td>><td>111111</td>></tr>");
    }
    %>
</table>

</body>
</html>
