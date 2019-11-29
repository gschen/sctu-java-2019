<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="edu.sctu.model.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
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
    <%
    //1.从数据库中读取所有的用户数据  3+1
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String sql = "select * from t_users";
        Class.forName("com.mysql.cj.jdbc.Driver");
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",
                "root",
                "1914571065lyj"
        );
        statement = connection.createStatement();
        resultSet = statement.executeQuery(sql);
        List<User> userList = new ArrayList<>();
        while (resultSet.next()){
            int id = resultSet.getInt(1);
            String username = resultSet.getString(2);
            String password = resultSet.getString(3);

            User user = new User(id,username,password);
            user.getId();
            user.getPassword();
            user.getUsername();
            userList.add(user);


            //System.out.println(id+" "+username+" "+password+" ");
            //out.write(id+" "+username+" "+password);
        }

        for (User user:userList) {
            System.out.println(user.getId()+" "+user.getUsername()+" "+user.getPassword());
            out.write(user.getId()+" "+user.getUsername()+" "+user.getPassword());
        }
        resultSet.close();
        statement.close();
        connection.close();
    %>
</body>
</html>
