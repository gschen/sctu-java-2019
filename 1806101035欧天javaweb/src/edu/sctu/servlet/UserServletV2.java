package edu.sctu.servlet;

import edu.sctu.dao.UserDao;
import edu.sctu.dao.UserDaoImpl;
import edu.sctu.model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class UserServletV2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("This is a servlet!");

        UserDao userDao =new UserDaoImpl();

        List<User>userList=userDao.selectAll();

        req.setAttribute("userList",userList);
        //跳转
//        req.getRequestDispatcher("/tset06.jsp").forward(req,resp);

        req.getRequestDispatcher("/test08.jsp").forward(req,resp);
    }
}
