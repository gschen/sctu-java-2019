<%--
  Created by IntelliJ IDEA.
  User: LiuYuJiang
  Date: 2019/11/29
  Time: 14:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form method="post" action="/upload" enctype="multipart/form-data">
    <input name="myFile" type="file" />
    <input type="submit" value="上传">

</form>
${msg}
</body>
</html>
