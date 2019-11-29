package edu.sctu.listener;

import edu.sctu.UserDao;
import edu.sctu.UserDaoImpl;
import edu.sctu.model.User;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.sql.SQLException;
import java.util.List;

public class DemoListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //事件1：网站初始化成功后


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>网站初始化成功了！>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        UserDao userdao = new UserDaoImpl();
        List<User> userList = null;
        try {
            userList = userdao.selectAll();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        sce.getServletContext().setAttribute("userList",userList);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        //事件2：当网站关闭后


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>网站关闭了！>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
}
