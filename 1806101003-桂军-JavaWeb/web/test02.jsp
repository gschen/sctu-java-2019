<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="edu.sctu.model.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
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
    //1、从数据库读取所有用户数据   3+1
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    String sql = "select * from t_users";
    Class.forName("com.mysql.cj.jdbc.Driver");
    connection = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",//数据库连接字符串
            "root",
            "980925"); //写你自己的账号和密码

    statement = connection.createStatement();
    resultSet = statement.executeQuery(sql);


    List<User> userList = new ArrayList<>();


    while (resultSet.next()){

        int id = resultSet.getInt("id");
        String username = resultSet.getString("username");
        String password = resultSet.getNString("password");
        User user = new User(id,username,password);

        /*System.out.println(id+"-"+username+"-" +password);*/
        userList.add(user);


    }

    resultSet.close();
    statement.close();
    connection.close();

%>
<table>
    <tr>
        <td>编号</td>
        <td>姓名</td>
        <td>密码</td>
        <td>删除操作</td>
    </tr>

    <%
        for (User user : userList){
            System.out.println(user.getId()+user.getUsername()+user.getPassword());
            out.write("<tr><td>"+user.getId()+"</td><td>"+user.getUsername()+"</td><td>"+user.getPassword()+"</td><td><a href='deleteUser.jsp?userId="+user.getId()+"'>删除</a></td></tr>");
        }
    %>
</table>
</body>
</html>
