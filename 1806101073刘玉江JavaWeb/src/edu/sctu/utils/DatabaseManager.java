package edu.sctu.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {
    Connection connection;
    Statement statement;
    public  final Statement open()  {
        //打开数据库
        //0.加载数据库驱动程序
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //1.connection
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",//数据库连接字符串
                    "root",
                    "1914571065lyj"//写你自己的账号和密码
            );
            //2.statement
            statement = connection.createStatement();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statement;

    }
    public void close(){
        //关闭数据库
        try {
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
