package edu.sctu.servlet;

import edu.sctu.model.User;
import edu.sctu.model.UserDao;
import edu.sctu.model.UserDaoimpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class UserServletV2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/Test06.jsp").forward(req,resp);
        System.out.print("this is a servlet");

        UserDao userDao = new UserDaoimpl();

        List<User> userList = null;
        try {
            userList = userDao.selectAll();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.setAttribute("userList",userList);

        req.getRequestDispatcher("/Test_08.jsp").forward(req,resp);
    }
}
