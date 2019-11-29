<%--
  Created by IntelliJ IDEA.
  User: LiuYuJiang
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
    <table border="1" cellspacing="0">
        <tr>
            <td>编号</td>
            <td>用户名</td>
            <td>密码</td>

        </tr>

        <%
            int a= 1;
        for (int i = 0;i<=10;i++){
            out.write("<tr>\n" +
                    "            <td>"+(i+1)+"</td>\n" +
                    "            <td>张三</td>\n" +
                    "            <td>123456</td>\n" +

                    "        </tr>");
        }
        %>
        <%for (int i = 1;i<=10;i++){%>
        <tr>
            <td> <%= i%> </td>
            <td> 张三 </td>
            <td> 123456 </td>

        </tr>
        <%}%>
    </table>
</body>
</html>
