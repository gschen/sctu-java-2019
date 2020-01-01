<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/11/29
  Time: 16:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form name="loginForm" method="post" action="handleCode.jsp">
    验证码:<input type="text" name="code"/><img src="genCode.jsp" name="imgCode" onclick="refresh()"/>
    <input type="submit" value="登录"/>

</form>
<p>${msg}</p>

<script type="text/javascript">
    function refresh() {
      //alert("hello");
        loginForm.imgCode.src = "genCode.jsp?id="+Math.random();

    }
</script>
</body>
</html>
