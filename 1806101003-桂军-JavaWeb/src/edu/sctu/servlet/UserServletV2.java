package edu.sctu.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserServletV2 extends HelloServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("ebfufwbjredbfwoerr");
        //跳转
        req.getRequestDispatcher("test06.jsp").forward(req,resp);
    }
}
