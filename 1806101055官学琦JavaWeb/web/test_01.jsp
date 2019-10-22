<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="edu_sctu_model.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: 官学琦
  Date: 2019/10/22
  Time: 11:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String sql="SELECT * FROM t_users";
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;

        Class.forName("com.mysql.jdbc.Driver");
        connection= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",
                "root",
                "601906@QJ"
        );
        statement=connection.createStatement();
        resultSet=statement.executeQuery(sql);

        List<User> userList=new ArrayList<>();

        while (resultSet.next()){
            int id=resultSet.getInt(1);
            String username=resultSet.getString(2);
            String password=resultSet.getString(3);
            User user=new User(id,username,password);
            userList.add(user);
        }
        for (User user:userList){
            System.out.println(user.getId()+user.getUsername()+user.getPassword());
        }
        resultSet.close();
        statement.close();
        connection.close();
    %>
<table>
    <tr>
        <td>编号</td>
        <td>用户</td>
        <td>密码</td>
    </tr>
    <%
        for (User user: userList){
            out.write("<tr>\n" +
                    "        <td>"+user.getId()+"</td>\n" +
                    "        <td>"+user.getUsername()+"</td>\n" +
                    "        <td>"+user.getPassword()+"</td>\n" +
                    "    </tr>");
        }
    %>
</table>

</body>
</html>
