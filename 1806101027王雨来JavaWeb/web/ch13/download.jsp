<%--
  Created by IntelliJ IDEA.
  User: 85007
  Date: 2019/11/29
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String fileName = request.getParameter("file");
    //filename指定了浏览器下载的文件名是什么名字
    response.setHeader("Content-Disposition","attachment;filename="+fileName);

    response.setContentType("image/jpeg");

    request.getRequestDispatcher("/upload/"+fileName).forward(request,response);
%>
