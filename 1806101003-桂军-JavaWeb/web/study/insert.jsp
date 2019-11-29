<%--
  Created by IntelliJ IDEA.
  User: Agoni
  Date: 2019/10/29
  Time: 15:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=utf-8" language="java" %>
<%@page import="java.sql.*"%>
<html>
<head>
    <title>插入数据</title>
</head>
<body>
<%
    try{
        String username=request.getParameter("name");
        String id=request.getParameter("id");
        String phone=request.getParameter("phone");
        String psw=request.getParameter("psw");
        int age=Integer.parseInt(request.getParameter("age"));
        String address=request.getParameter("address");
        String city=request.getParameter("city");
        //装载驱动程序
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",//数据库连接字符串
                "root",
                "980925"); //写你自己的账号和密码
        //使用preparedstatement
        PreparedStatement pstmt = conn.prepareStatement("insert into myuser values(?,?,?,?,?,?,?)");
        pstmt.setString(1,id);
        pstmt.setString(2,username);
        pstmt.setString(3,psw);
        pstmt.setInt(4,age);
        pstmt.setString(5,phone);
        pstmt.setString(6,address);
        pstmt.setString(7,city);
        pstmt.execute();
        session.invalidate();
        response.sendRedirect("login.jsp");
        //关闭连接、释放资源
        pstmt.close();
        conn.close();
    }catch(ClassNotFoundException cnfe){
        out.print(cnfe);
    }catch(SQLException sqle){
        out.print(sqle);
    }catch(Exception e){
        out.print(e);
    }
%>
</body>
</html>

