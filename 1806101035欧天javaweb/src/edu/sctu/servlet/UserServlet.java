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

public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp) throws ServletException, IOException {
        UserDao userDao = new UserDaoImpl();
        List<User> userList =userDao.selectAll();
        for (User user : userList){
        resp.getWriter().write("<table><tr><td>\"+user.getId()+\"</td><td>\"+user.getUsername()+\"</td><td>\"+user.getPassword()+\"</td></tr></table>");
        }
    }
}