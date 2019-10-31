<%--
  Created by IntelliJ IDEA.
  User: Agoni
  Date: 2019/10/29
  Time: 15:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=utf-8" language="java" %>
<%@page import="java.sql.*"%>
<html>
<head>
    <title>修改密码</title>
</head>
<body>
<script type="text/javascript">
    alert("密码修改成功");
</script>
<%
    try{
        String pass=request.getParameter("password1");
        String id=(String)session.getAttribute("username");
        //装载驱动程序
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",//数据库连接字符串
                "root",
                "980925"); //写你自己的账号和密码
        //建立statement
        Statement stmt=conn.createStatement();
        //执行update
        String sql1="update myuser set psw='"+pass+"'where id='"+id+"'";
        stmt.executeUpdate(sql1);
        session.invalidate();
        response.sendRedirect("login.jsp");
        //关闭连接、释放资源
        stmt.close();
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
