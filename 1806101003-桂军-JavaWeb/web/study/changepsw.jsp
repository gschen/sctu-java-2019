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
<table border="1" align="center">
    <caption>密码修改：</caption>
    <form name="form1" onsubmit="return userCheck()" action="changepsw1.jsp" method="post">
        <tr>
            <td>密码</td>
            <td><input id="psw1" type="password" name="password1"/></td>
        </tr>
        <tr>
            <td>确认密码</td>
            <td><input id="psw1" type="password" name="password2"/></td>
        </tr>
        <tr>
            <td><input type="submit" value="提交" ></td>
            <td><input type="reset" value="重置"></td>
        </tr>
    </form>
</table>
<script  type="text/javascript">
    function userCheck()
    {
        var pass1=document.form1.password1.value;
        var pass2=document.form1.password2.value;
        if(pass1=="" || pass2=="")
        {
            window.alert("请填写密码");
            return false;
        }
        else if(pass1!=pass2)
        {
            window.alert("请重新填写密码，两次得密码不正确");
            return false;
        }
    }
</script>
</body>
</html>
