package edu.sctu.dao;
import edu.sctu.model.User;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao{

    @Override
    public void saveUser(User user) throws SQLException {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String sql = "insert into t_users(username,password) values(user.getUsename()+','+user.getPassword())";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC", // 数据库连接字符串
                    "root",
                    "fb199708"
            );
            statement = connection.createStatement();
                statement.executeUpdate(sql);
        }catch(Exception e){

        }finally {
            connection.close();
            statement.close();
            resultSet.close();
        }
    }
    @Override
    public void deleteById(int id) throws SQLException {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String sql = "delete from t_users where id = "+id+"";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC", // 数据库连接字符串
                    "root",
                    "fb199708"
            );
            statement = connection.createStatement();
            statement.executeUpdate(sql);
        }catch (Exception e){

        }finally{
            connection.close();
            statement.close();
            resultSet.close();
        }
        }

    @Override
    public void updateUser(User user) throws SQLException {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String sql = "update t_users set username = 'harden' where id = 4";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC", // 数据库连接字符串
                    "root",
                    "fb199708"
            );
            statement = connection.createStatement();
            statement.executeUpdate(sql);
        }catch (Exception e){

        }finally{
           connection.close();
           statement.close();
           resultSet.close();
        }
    }

    @Override
    public List<User> selectAll() throws SQLException {
        //1. 从数据库中读取所有用户数据  3 + 1
        List<User> userList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String sql = "select * from t_users";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC", // 数据库连接字符串
                    "root",
                    "fb199708"
            );
            statement = connection.createStatement();
            statement.executeUpdate(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                User user = new User(id, username, password);
                userList.add(user);
            }
        } catch (Exception e) {

        } finally {
            return userList;
        }
    }
}
