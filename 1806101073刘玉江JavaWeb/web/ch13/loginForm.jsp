<%--
  Created by IntelliJ IDEA.
  User: LiuYuJiang
  Date: 2019/11/29
  Time: 16:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="handleCode.jsp" name="loginform" method="post">
     验证码：<input type="text" name="code"> <img src="genCode.jsp" alt="" name="imgcode" onclick="refresh()">
    <input type="submit" value="登录">
</form>
${msg}
<script type="text/javascript">
    function refresh() {
        loginform.imgcode.src = "genCode.jsp?id="+ Math.random();
    }

</script>
</body>
</html>
