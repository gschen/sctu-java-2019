package edu.sctu.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseManager {

    Connection connection;
    Statement statement;

    public  final Statement open(){
       try {
           Class.forName("com.mysql.jdbc.Driver");


        // 1. connection
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC", // 数据库连接字符串
                "root",
                "123456" //写你自己的账号和密码

                // 远程服务器信息
//              "jdbc:mysql://47.104.80.155:3306/javaweb", // 数据库连接字符串
//              "javaweb",
//              "sctu123!@#",
        );

        // 2. statement
        statement = connection.createStatement(); }
       catch (Exception e){

       }
       return statement;
    }//打开数据库
    public  final void colse(){
        try{
            statement.close();
            connection.close();
        }catch (Exception e){

        }

    }//关闭

}
