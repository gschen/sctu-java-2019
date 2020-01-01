<%--
  Created by IntelliJ IDEA.
  User: 85007
  Date: 2019/11/17
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<h1>这是注册页面</h1>
<form action="saveUser.jsp" method="post">
    <p>用户名：<input name="username"></p>
    <p>密码：<input name="password" id="pw1"></p>
    <p>确认密码：<input name="passwordAgain" id="pw2" onkeyup="validate()"><span id="tishi"></span></p>
    <p><input type="submit" value="保存" id="submit" disabled="disabled">
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
</body>
</html>
