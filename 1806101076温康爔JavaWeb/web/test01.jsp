<%--
  Created by IntelliJ IDEA.
  User: 温kang'x
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
<%--ctrl+d 复制一行--%>
<%--ctrl+x 剪切一行--%>
<%--ctrl+/ 注释--%>
<table>
    <tr>
        <td>编号</td>
        <td>用户名</td>
        <td>密码</td>
    </tr>

<%--    <tr>--%>
<%--        <td>1</td>--%>
<%--        <td>wkx</td>--%>
<%--        <td>123456</td>--%>
<%--    </tr>--%>
    <%
        for (int i=0;i<10;i++){
            //先删除1，然后2个“”，两个+。
            out.write("<tr><td>"+(i+1)+"</td><td>wkx</td><td>123456</td></tr>");
        }
    %>
</table>

</body>
</html>
