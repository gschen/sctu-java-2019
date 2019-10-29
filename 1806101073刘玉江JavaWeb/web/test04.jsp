<%@ page import="edu.sctu.dao.UserDao" %>
<%@ page import="edu.sctu.dao.UserDaoImpl" %>
<%@ page import="java.util.List" %>
<%@ page import="edu.sctu.model.User" %><%--
  Created by IntelliJ IDEA.
  User: LiuYuJiang
  Date: 2019/10/29
  Time: 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    UserDao userDao = new UserDaoImpl();
    List<User> userList = userDao.selectAll();

%>

<form>
    <table border="1px" cellspacing="0">
        <tr>
            <td>id</td>
            <td>username</td>
            <td>password</td>
        </tr>
        <%
        for (User user:userList){
            out.write("<tr>\n" +
                    "            <td>"+user.getId()+"</td>\n" +
                    "            <td>"+user.getUsername()+"</td>\n" +
                    "            <td>"+user.getPassword()+"</td>\n" +
                    "        </tr>");
        }
        %>
    </table>

</form>
</body>
</html>
