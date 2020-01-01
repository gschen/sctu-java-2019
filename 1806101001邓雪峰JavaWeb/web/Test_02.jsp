<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.DriverManager" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/22
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title3</title>
</head>
<body>
    <%
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String sql ="select * from t_users ";
        Class.forName("com.mysql.cj.jdbc.Driver");

        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/javaweb?serverTimezone=UTC",
                "root",
                "123456"
        );
        statement = connection.createStatement();

        while (
                resultSet.next()

        ){
            int id = resultSet.getInt(1);
            int age = resultSet.getInt(2);
            //String password = resultSet.getString(3);

            System.out.println(id+age);
        }

        resultSet.close();
        statement.close();
        connection.close();
    %>
</body>
</html>
