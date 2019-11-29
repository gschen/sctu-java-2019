<%@ page import="java.sql.*" %><%--
  Created by IntelliJ IDEA.
  User: LiuYuJiang
  Date: 2019/10/27
  Time: 17:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script language="JavaScript">
    function on_submit() {
        if (form1.username.value==""){
            alert("用户名不能为空，请重新输入")
            form1.username.focus();
            return false
        }if (form1.userpassword.value()==""){
            alert("密码不能为空！请重新输入！");
            form1.userpassword.focus();
            return false
        }
    }
</script>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

%>
<%!
   public String codeToString(String str){
       String s = str;
       try{
           byte tempB[] = s.getBytes("ISO-8859-1");
           s = new String(tempB);
           return s;
       }catch (Exception e){
           return s;
       }
   }
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>Title</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
</head>
<body>
    <form name="form1" action="123.jsp" method="post" onsubmit="return on_submit()">
        用户名
        <input type="text" name="username">
        密码
        <input type="password" name="userpassword">
        <input type="submit" name="submit" value="提交">

    </form>
    <br>
    <%
    out.print("请输入你的账户为："+codeToString(request.getParameter("username")));
    out.print("请输入你的密码为："+codeToString(request.getParameter("userpassword")));
    %>
    <%
        Statement statement;
        ResultSet rs;
        //加载驱动程序以连接数据库
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hacker?serverTimezone=UTC","root","1914571065lyj");
            System.out.println("连接成功");
            statement = connection.createStatement();
            rs = statement.executeQuery("select password from user where username="+""+request.getParameter("username")+"");
            if (rs.next()){
                String bb = rs.getString("password");
                System.out.println("tongguo");
                if (request.getParameter("userpassword").equals(bb)){
                    out.print("登录成功");
                }
                else {
                    out.print("登陆失败");
                }

            }connection.close();
        }catch (ClassNotFoundException confex){
            System.out.println("装载jdbc/odbc 驱动程序失败");
        }catch (SQLException sqlex){
            System.out.println("无法连接数据库");
        }
    %>
</body>
</html>
