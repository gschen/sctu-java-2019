package edu.sctu.servlet;

import edu.sctu.model.User;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class Test01Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("<h1>hello,world!<h1>");
        User user =new User(1806101007,"侯帅","1205");
        req.setCharacterEncoding("UTF-8");
        req.setAttribute("name","ZhangSan");
        req.setAttribute("age",18);
        req.setAttribute("user",user);

        //使用session来存
        HttpSession session = req.getSession();
        session.setAttribute("gerder","male");

        //application
        ServletContext application = req.getSession().getServletContext();
        application.setAttribute("app","666");

        //

        //跳转
        req.getRequestDispatcher("/test_07_1.jsp").forward(req,resp);
    }
}
