<%--
  Created by IntelliJ IDEA.
  User: l
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
<%--上传表单    enctype="multipart/form-data":文件上传--%>
<form method="post" action="/demo/upload" enctype="multipart/form-data">
    <input name="myFile" type="file"/>
    <input type="submit" value="上传"/>
</form>
${msg}
</body>
</html>
