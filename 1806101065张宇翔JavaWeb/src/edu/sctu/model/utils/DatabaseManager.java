package edu.sctu.model.utils;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseManager {
    Connection connection;
    Statement statement;

    public  void open(){


    }
    public  void close(){

        try {
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

}
