package edu.sctu.model;

import java.sql.*;
import java.util.List;

public class UserDaoimpl implements UserDao {
    public UserDaoimpl(){

        /*try {
            Class.forName("com.mysql.cj.jdbc");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }*/

    }

    @Override
    public void saveUser(User user) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public List<User> selectAll() throws ClassNotFoundException, SQLException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String sql ="select * from t_users ";
        Class.forName("com.mysql.cj.jdbc.Driver");

        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/javaweb ",
                "root",
                "123456"
        );
        statement = connection.createStatement();

        while (
                resultSet.next()

        ){
            int id = resultSet.getInt(1);
            String username = resultSet.getString(2);
            String password = resultSet.getString(3);

            System.out.println(id+username+password);
        }

        resultSet.close();
        statement.close();
        connection.close();
        return null;
    }
}
