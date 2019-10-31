<%@ page import="edu.sctu.dao.UserDao.UserDao" %>
<%@ page import="edu.sctu.dao.UserDao.UserDaoImpl" %><%--
  Created by IntelliJ IDEA.
  User: Agoni
  Date: 2019/10/29
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //1.得到删除用户的操作
    String id = request.getParameter("userId");
    System.out.println(id);




    //2.执行数据库的删除操作
    UserDao userDao= new UserDaoImpl();
    userDao.deleteByid(Integer.parseInt(id));




%>
<a href="test02.jsp" >返回</a>
</body>
</html>
