<%@ page import="java.sql.*" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="edu.sctu.model.User" %>
<%--
  Created by IntelliJ IDEA.
  User: 彭彦乐
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
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    //1
    String sql = "select * from t_userinfo";
    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC&useSSL=False",
                "root",
                "1419512991"
        );
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sql);
        List<User> userList = new ArrayList<>();
        while (resultSet.next()){

            String id = resultSet.getString(1);
            String username = resultSet.getString(2);
            String password = resultSet.getString(3);
            System.out.println(id + username + password);
            User user = new User(id,username,password);
            userList.add(user);
        }
        for (User users:userList
        ) {
            System.out.println(users.getId()+users.getUsername()+users.getPassword()+"这是userList");
        }


    } catch (ClassNotFoundException e) {
        e.printStackTrace();
    } catch (SQLException e) {
        e.printStackTrace();
    }finally {
        try {
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

%>
</body>
</html>
