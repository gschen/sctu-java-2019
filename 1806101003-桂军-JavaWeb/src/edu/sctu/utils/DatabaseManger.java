package edu.sctu.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseManger {
    Connection connection;
    Statement statement;

    public Statement open(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",//数据库连接字符串
                    "root",
                    "980925"); //写你自己的账号和密码

            statement = connection.createStatement();
        }catch (Exception e){

        }finally {

        }

        return null;
    }

    public  void close(){

    }
}
