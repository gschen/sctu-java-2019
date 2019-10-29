<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="edu.sctu.model.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.sql.DriverManager" %><%--
  Created by IntelliJ IDEA.
  User: h
  Date: 2019/10/22
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>从数据库中读取数据</title>
</head>
<body>

<table>
    <tr>
        <td>编号</td>
        <td>用户名</td>
        <td>密码</td>
        <td>删除操作</td>
    </tr>

<%
    //1.从数据库中读取所有用户的数据
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    String sql = "select * from t_users";

    Class.forName("com.mysql.cj.jdbc.Driver");

    connection = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",
            "root",
            "hxf08520215"
    );

    statement = connection.createStatement();

    resultSet = statement.executeQuery(sql);


    List<User> userList = new ArrayList<>();

    while (resultSet.next()){
        int id = resultSet.getInt(1);
        String username = resultSet.getString(2);
        String password = resultSet.getString(3);

        User user = new User(id,username,password);
        userList.add(user);

//        System.out.println(id+username+password);
    }

    for (User user : userList){
        System.out.println(user.getId()+user.getUsername()+user.getPassword());
    }

    resultSet.close();
    statement.close();
    connection.close();

        for (User user : userList){
            out.write("<tr><td>"+user.getId()+"</td><td>"+user.getUsername()+"</td><td>"+user.getPassword()+"</td><td><a href='deleteUser.jsp?userId="+user.getId()+"'>删除</a></td></tr>"+"\n");
        }
    %>
</table>

</body>
</html>
