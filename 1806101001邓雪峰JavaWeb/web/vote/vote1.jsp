<%@ page import="java.util.List" %>
<%@ page import="edu.sctu.model.Teacher" %>
<%@ page import="edu.sctu.dao.VoteDao" %>
<%@ page import="edu.sctu.dao.VoteDaoImpl" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String tno = request.getParameter("tno");

    VoteDao voteDao = new VoteDaoImpl();
    voteDao.voteTeacher(tno);

    request.getRequestDispatcher("index.jsp").forward(request,response);
%>