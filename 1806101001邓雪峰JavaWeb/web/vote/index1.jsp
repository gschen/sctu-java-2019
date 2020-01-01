<%@ page import="java.util.List" %>
<%@ page import="edu.sctu.model.Teacher" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="edu.sctu.dao.VoteDao" %>
<%@ page import="edu.sctu.dao.VoteDaoImpl" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/12/3
  Time: 8:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>四川旅游学院教师投票系统</title>
</head>
<body>

<%
    List<Teacher> teacherList = null;
    if (application.getAttribute("teacherList")==null){
        teacherList = new ArrayList<>();

        Teacher chen = new Teacher();
        chen.setTno("000096");
        chen.setRealName("张三");
        chen.setVoteNum(0);
        Teacher lisi = new Teacher();
        lisi.setTno("000097");
        lisi.setRealName("李四");
        lisi.setVoteNum(0);

        teacherList.add(chen);
    }else {
        teacherList = (List<Teacher>) application.getAttribute("teacherList");
    }


%>

<%

    VoteDao voteDao = new VoteDaoImpl();
    voteDao.selectAll();


%>
<table>
    <caption>欢迎给教师投票</caption>
    <tr bgcolor="yellow">
        <td>工号</td>
        <td>姓名</td>
        <td>得票数</td>
        <td>投票</td>

    </tr>

    <tr>
        <td>000001</td>
        <td>张三</td>
        <td>10</td>
        <td><a href="vote.jsp">投票</a></td>
    </tr>

</table>

<%
    for(Teacher teacher: teacherList){

        out.write("<tr>");
        out.write("<td>"+teacher.getTno()+"</td>");
        out.write("<td>"+teacher.getRealName()+"</td>");
        out.write("<td>"+teacher.getVoteNum()+"</td>");
        out.write("<td><a href='vote.jsp'>投票</a></td>");
        out.write("</tr>");
    }

%>
</body>
</html>
