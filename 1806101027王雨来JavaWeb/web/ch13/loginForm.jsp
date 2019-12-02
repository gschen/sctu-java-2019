<%--
  Created by IntelliJ IDEA.
  User: 85007
  Date: 2019/11/29
  Time: 16:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form name="loginForm" method="post" action="handleCode.jsp">
    验证码:<input type="text" name="code"/> <img src="genCode.jsp" name="imgCode" onclick="refresh()">
    <input type="submit" value="登录"/>
</form>

<script type="application/javascript">
    function refresh() {
        loginForm.imgCode.src = "genCode.jsp?id=" + Math.random();
    }
</script>

${msg}
</body>
</html>
