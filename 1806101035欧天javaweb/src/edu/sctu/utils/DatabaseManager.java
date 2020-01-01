package edu.sctu.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DatabaseManager {
    Connection connection;
    Statement statement;

    //打开数据库
    public Statement open() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",
                    "root",
                    "123456"
            );
            statement = connection.createStatement();
        } catch (Exception e) {
        }return statement;
    }
    //关闭数据库
    public void close(){
        try {
            statement.close();
            connection.close();
        }catch (Exception e){

        }

    }
}
