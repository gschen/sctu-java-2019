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
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //1.从数据库中查出所有用户数据
        UserDao userDao = new UserDaoImpl();
        List<User> userList = userDao.selectAll();

//        resp.getWriter().write("<meta charset=\"utf-8\">");

        resp.getWriter().write("<table>");
        //2.向页面输出信息
        for (User user : userList) {
            resp.getWriter().write("<tr><td>" + user.getId() + "</td><td>" + user.getUsername()
                    + "</td><td>u" + user.getPassword() + "</td><td>" +
                    "<a href='deleteUser.jsp?userId=" + user.getId() + "'>删除</a></td></tr>");
        }
        resp.getWriter().write("<table>");
    }
}
