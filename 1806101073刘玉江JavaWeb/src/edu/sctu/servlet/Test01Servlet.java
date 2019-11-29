package edu.sctu.servlet;

import edu.sctu.model.User;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.Writer;

public class Test01Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Writer writer = resp.getWriter();
        writer.write("<h1>hello,world</h1>");

        req.setCharacterEncoding("UTF-8");
        req.setAttribute("name","zhangsan");
        req.setAttribute("age",18);
        User user = new User("liu","123456");
        req.setAttribute("user",user);
        HttpSession session = req.getSession();
        session.setAttribute("gender","male");

        ServletContext application = req.getSession().getServletContext();
        application.setAttribute("app","12306");
        req.getRequestDispatcher("Test07.jsp").forward(req, resp);
    }
}
