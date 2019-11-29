<%@ page import="edu.sctu.dao.UserDao" %>
<%@ page import="edu.sctu.dao.UserDaoImpl" %>
<%@ page import="edu.sctu.model.User" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: LiuYuJiang
  Date: 2019/11/7
  Time: 19:46
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
            <td>删除</td>
            <td>更新</td>

        </tr>
        <%
            for (User user:userList){
                out.write("<tr>\n" +
                        "            <td>"+user.getId()+"</td>\n" +
                        "            <td>"+user.getUsername()+"</td>\n" +
                        "            <td>"+user.getPassword()+"</td>\n" +
                        "<td><a href=\"deletUser.jsp?userId="+user.getId()+"\">删除</a></td>\n" +
                        "<td><a href=\"updateUser.jsp?userId="+user.getId()+"\">更新</a></td>"+
                        "        </tr>");
            }
        %>
    </table>

</form>
<a href="userAdd.jsp">添加数据</a>
</body>
</html>
