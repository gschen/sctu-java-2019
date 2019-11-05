package edu.sctu.servlet;


import edu.sctu.dao.UserDao;
import edu.sctu.dao.UserDaoImpl;
import edu.sctu.model.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Writer;
import java.util.List;

public class userServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDao userDao = new UserDaoImpl();
        List<User> userList = null;
        try {
            userList = userDao.selectAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Writer writer = resp.getWriter();

        writer.write("<table>");
        for (User user:userList){
            resp.getWriter().write("<tr>\n" +
                    "            <td>"+user.getId()+"</td>\n" +
                    "            <td>"+user.getUsername()+"</td>\n" +
                    "            <td>"+user.getPassword()+"</td>\n" +

                    "        </tr>");
        }
        writer.write("</table>");
    }
}
