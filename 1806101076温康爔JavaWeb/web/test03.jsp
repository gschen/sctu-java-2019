<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="edu.sctu.model.User" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%--
  Created by IntelliJ IDEA.
  User: 温kang'x
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
     //1.从数据库中读取所有的用户数据 3+1
    Connection connection = null;
    Statement statement = null;
    ResultSet resultSet = null;

    String sql = "select * from t_users";

    Class.forName("com.mysql.cj.jdbc.Driver");

    //1.connection
    connection = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",//"jdbc:mysql://47.104.80.155:3306/javaweb"
            "root",
            "dl921021"//写自己的数据库的账号密码
    );
    //2.statement
    statement = connection.createStatement();

    //3.resultSet
    resultSet = statement.executeQuery(sql);

    List<User> userList = new ArrayList<>();
    while (resultSet.next()){
        int id = resultSet.getInt(1);
        String username = resultSet.getString(2);
        String password = resultSet.getString(3);

        User user = new User(id,username,password);
        userList.add(user);
        //System.out.println(id+username+password);
    }
    for (User user:userList){
        System.out.println(user.getId()+user.getUsername()+user.getPassword());
    }
    resultSet.close();
    statement.close();
    connection.close();
%>

<%--ctrl+d 复制一行--%>
<%--ctrl+x 剪切一行--%>
<%--ctrl+/ 注释--%>
<table>
    <tr>
        <td>编号</td>
        <td>用户名</td>
        <td>密码</td>
    </tr>

    <%
//        for (int i=0;i<10;i++){
//            //先删除1，然后一对""，一对+。
//            out.write("<tr><td>"+(i+1)+"</td><td>wkx</td><td>123456</td></tr>");
//        }

        for (User user:userList){
            out.write("<tr><td>"+user.getId()+"</td><td>"+user.getUsername()+"</td><td>"+user.getPassword()+"</td></tr>");
        }
    %>
</table>
</body>
</html>
