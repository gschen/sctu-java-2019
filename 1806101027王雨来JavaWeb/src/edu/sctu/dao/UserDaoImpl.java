package edu.sctu.dao;

import edu.sctu.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


//接口的实现类（旧）
public class UserDaoImpl implements UserDao {

    private Connection connection = null;
    private Statement statement = null;
    private ResultSet resultSet = null;
    private String sql = null;

    /*public UserDaoImpl() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",
                "root",
                "123456"
        );
    }*/
//---------------------------------------------------------------------------
    //从数据库中读取所有用户数据 3+1


//exe
//最原始的版本，包含了三加一和链接数据库
    @Override
    public void saveUser(User user) {
        Connection connection = null;
        Statement statement = null;
        sql = "insert into t_users(username,password) values('"+user.getUsername()
                +"','"+user.getPassword()+"')";


        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",
                    "root",
                    "123456"
            );
            statement = connection.createStatement();
            statement.executeUpdate(sql);
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @Override
    public void deleteById(int id) {
        Connection connection = null;
        Statement statement = null;
        sql = "delete from t_users where id="+id+"";


        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",
                    "root",
                    "123456"
            );
            statement = connection.createStatement();
            statement.executeUpdate(sql);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

//还没写的更新
    @Override
    public void updateUser(User user) {
//        sql = "";
    }


//没化简的，每步一try
    @Override
    public List<User> selectAll() {


        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String sql = "select * from t_users";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",
                    "root",
                    "123456"
            );
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            resultSet = statement.executeQuery(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        List<User> userList = new ArrayList<>();

        while (true){
            try {
                if (!resultSet.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            int id = 0;
            try {
                id = resultSet.getInt(1);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            String username = null;
            try {
                username = resultSet.getString(2);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            String password = null;
            try {
                password = resultSet.getString(3);
            } catch (SQLException e) {
                e.printStackTrace();
            }

            User user = new User(id,username,password);
            userList.add(user);
        }

        return userList;
    }

    @Override
    public String login(String username) {
        return null;
    }
}
