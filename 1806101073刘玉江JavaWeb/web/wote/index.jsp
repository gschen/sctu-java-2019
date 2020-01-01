<%@ page import="java.util.List" %>
<%@ page import="edu.sctu.model.Teacher" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: LiuYuJiang
  Date: 2019/12/3
  Time: 8:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>四川旅游学院教室投票系统</title>
</head>
<style type="text/css">
    body{
        margin: 0 auto;
    }

</style>
<body>

<%
    List<Teacher> teacherList = new ArrayList<>();
    if (application.getAttribute("teacher") == null){
        //第一次访问application空间时
        Teacher chen = new Teacher();
        chen.settNo("0000926");
        chen.setRealName("张三");
        chen.setVoteNum(0);

        Teacher zhang = new Teacher();
        zhang.settNo("0000927");
        zhang.setRealName("李四");
        zhang.setVoteNum(0);

        teacherList.add(chen);
        teacherList.add(zhang);

        application.setAttribute("teacherList",teacherList);
    }else {
        //后续再访问application时
        teacherList = (List<Teacher>) application.getAttribute("teacherList");
    }





%>
<table cellspacing="10px" cellpadding="1px" border="1px">
    <caption>欢迎给教师投票</caption>
    <tr bgcolor="#87ceeb">
        <td>工号</td>
        <td>姓名</td>
        <td>得票数</td>
        <td>投票</td>
    </tr>

    <%
    for (Teacher teacher : teacherList){
        out.write("<tr>");
        out.write("<td>"+teacher.gettNo()+"</td>");
        out.write("<td>"+teacher.getRealName()+"</td>");
        out.write("<td>"+teacher.getVoteNum()+"</td>");
        out.write("<td><a href='wote.jsp?tNo="+teacher.gettNo()+"'>投票</a></td>");
        out.write("</tr>");
    }
    %>
</table>
</body>
</html>
