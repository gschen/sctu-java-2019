package edu.sctu.listener;

import edu.sctu.dao.UserDao;
import edu.sctu.dao.UserDaoImpl;
import edu.sctu.model.User;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.List;

public class DemoListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        //事件：当网站初始化成功后
        System.out.println(">>>>>>>>>>>>>>>>>>>>网站初始化成功了，奥利给>>>>>>>>>>>>>>>>>>>>>>>>");

        UserDao userDao = new UserDaoImpl();
        List<User> userlist = userDao.selectAll();

        sce.getServletContext().setAttribute("userList",userlist);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        //事件2：当网站关闭后
        System.out.println(">>>>>>>>>>>>>>>>>>>>网站没了>>>>>>>>>>>>>>>>>>>>>");
    }
}
