<%@ page import="edu.sctu.model.User" %><%--
  Created by IntelliJ IDEA.
  User: zyx99
  Date: 2019/10/29
  Time: 10:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //接收消息
    String username = request.getParameter("username");


    String password = request.getParameter("password");

    @Override
    public void saveUser(User user) {
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    String sql = "insert into t_users((username,password) values('"+user.getUsername()+"','"+user.getPassword()+"'))";

    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
    connection = DriverManager.getConnection()
    connection = DriverManager.getConnection
    connection = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",
    "root",
    "123456789"
    );

    statement = connection.createStatement();

    statement.executeUpdate(sql);   //其他
    // executeQuery()执行查询

    }catch (Exception e){

    }finally {
    try {
    connection.close();
    statement.close();
    resultSet.close();
    } catch (SQLException e) {
    e.printStackTrace();
    }

    }
    }





    System.out.println(username + password);

    User user = new User();


    //保存到数据
%>
</body>
</html>
