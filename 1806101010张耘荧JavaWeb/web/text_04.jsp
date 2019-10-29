<%@ page import="edu.sctu.dao.UserDao" %>
<%@ page import="edu.sctu.dao.UserDaoImpl" %>
<%@ page import="edu.sctu.model.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 张耘荧
  Date: 2019/10/29
  Time: 9:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    UserDao userDao=new UserDaoImpl();
    List<User> userList = userDao.selectAll();
%>

<table>
    <tr>
        <td>编号</td>
        <td>名字</td>
        <td>密码</td>
    </tr>
    <tr>
        <%--ctlr+d复制一行--%>
        <td>1</td>
        <td>张三</td>
        <td>123</td>
    </tr>
    <%
        for (User user:userList){


            //先删除1，然后两个双引号，两个加号
            out.write("<tr><td>"+user.getId()+"</td><td>"+user.getUsername()+"</td><td>"+user.getPassword()+"</td></tr>");


        }
    %>
</table>

</body>
</html>
