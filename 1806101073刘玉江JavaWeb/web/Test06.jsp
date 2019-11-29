<%@ page import="edu.sctu.model.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: LiuYuJiang
  Date: 2019/11/1
  Time: 15:30
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
        List<User> userList = (List<User>) request.getAttribute("userList");
        for (User user:userList){
            out.write("<tr>\n" +
                    "            <td>"+user.getId()+"</td>\n" +
                    "            <td>"+user.getUsername()+"</td>\n" +
                    "            <td>"+user.getPassword()+"</td>\n" +

                    "        </tr>");
        }
    %>
    ${requestScope.userList}
</table>
</body>
</html>
