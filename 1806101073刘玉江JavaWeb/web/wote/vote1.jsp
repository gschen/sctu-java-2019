<%@ page import="edu.sctu.dao.voteDao" %>
<%@ page import="edu.sctu.dao.voteDaoImpl" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String tno = request.getParameter("tno");
    voteDao voteDao = new voteDaoImpl();
    voteDao.voteTeacher(tno);

    request.getRequestDispatcher("index1.jsp").forward(request,response);
%>