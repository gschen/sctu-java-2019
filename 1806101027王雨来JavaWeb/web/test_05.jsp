<%--
  Created by IntelliJ IDEA.
  User: 85007
  Date: 2019/10/29
  Time: 10:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<a href="test_04.jsp">list</a>
<form action="saveUser.jsp" method="post">
    <p>用户名：<input name="username"></p>
    <p>密码：<input name="password" id="pw1"></p>
    <p>确认密码：<input name="passwordAgain" id="pw2" onkeyup="validate()"><span id="tishi"></span></p>
    <p><input type="submit" value="保存" id="submit">
        <input type="reset" value="重置" /></p>
</form>

<script>
    function validate() {
        var pw1 = document.getElementById("pw1").value;
        var pw2 = document.getElementById("pw2").value;
        if(pw1 == pw2) {
            document.getElementById("tishi").innerHTML = "<font color='green'>两次密码相同</font>";
            document.getElementById("submit").disabled = false;
        } else {
            document.getElementById("tishi").innerHTML = "<font color='red'>两次密码不相同</font>";
            document.getElementById("submit").disabled = true;
        }
    }
</script>

<%--<a href="test_04.jsp">list</a>
<form action="saveUser.jsp" method="post">
    输入户名： <input type="text" name="username" />
    <P>输入密码： <input type="password" name="password" id="pw1" /></P>
    <p>确认密码： <input type="password" name="pw" id="pw2" onkeyup="validate()" /><span id="tishi"></span></p>
    <p><input type="submit" value="注册" id="submit" />
        <input type="reset" value="重置" /></p>
</form>

<script>
    function validate() {
        var pw1 = document.getElementById("pw1").value;
        var pw2 = document.getElementById("pw2").value;
        if(pw1 == pw2) {
            document.getElementById("tishi").innerHTML = "<font color='green'>两次密码相同</font>";
            document.getElementById("submit").disabled = false;
        } else {
            document.getElementById("tishi").innerHTML = "<font color='red'>两次密码不相同</font>";
            document.getElementById("submit").disabled = true;
        }
    }
</script>--%>


</body>
</html>
