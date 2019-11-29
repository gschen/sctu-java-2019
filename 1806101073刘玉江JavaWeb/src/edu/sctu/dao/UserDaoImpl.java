package edu.sctu.dao;

import edu.sctu.model.User;

import java.awt.datatransfer.DataFlavor;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    private DataFlavor request;
    
    /*private Connection connection = null;
    private Statement statement = null;
    private ResultSet resultSet = null;
    private String sql = null;
    public UserDaoImpl() throws SQLException,ClassNotFoundException{
        Class.forName("com.mysql.jdbc.Driver");
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/java2019",
                "root",
                "1914571065lyj"
        );
        statement = connection.createStatement();
    }*/

    @Override
    public void saveUser(User user) {
        
        //3+1
        //3
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        //1增加

        String sql = "INSERT INTO t_users(id,username,password)VALUES('"+user.getId()+"','"+user.getUsername()+"','"+user.getPassword()+"')";

        try {
            //0.加载数据库驱动程序
            Class.forName("com.mysql.jdbc.Driver");
            //1.connection
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",//数据库连接字符串
                    "root",
                    "1914571065lyj"//写自己的账号和密码
            );

            System.out.println();
            //2.statement
            statement = connection.createStatement();
            //3.update
            statement.executeUpdate(sql);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();

            }

        }
    }

    @Override
    public List<User> deleteById(String id) {
        //sql = "delete from t_user where id = ''"
        //3+1
        //3
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        //1删除
        String sql = "DELETE FROM t_users WHERE id = "+id+"";

        try {
            //0.加载数据库驱动程序
            Class.forName("com.mysql.jdbc.Driver");
            //1.connection
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",//数据库连接字符串
                    "root",
                    "1914571065lyj"//写你自己的账号和密码
            );
            //2.statement
            statement = connection.createStatement();
            //3.update
            statement.executeUpdate(sql);
            System.out.println();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {

                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();

            }

        }
        return null;
    }

    @Override
    public void updateUser(String id,String username,String password) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        //1增加

        String sql = "update t_users set username = '"+username+"'，password = '"+password+"' where id = '"+id+"'";

        try {
            //0.加载数据库驱动程序
            Class.forName("com.mysql.jdbc.Driver");
            //1.connection
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",//数据库连接字符串
                    "root",
                    "1914571065lyj"//写自己的账号和密码
            );

            System.out.println();
            //2.statement
            statement = connection.createStatement();
            //3.update
            statement.executeUpdate(sql);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();

            }

        }


    }

    @Override
    public List<User> selectAll() {
        //3+1
        List<User> userList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String sql = "select * from t_users";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",
                    "root",
                    "1914571065lyj"
            );
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()){
                String id = resultSet.getString(1);
                String username = resultSet.getString(2);
                String password = resultSet.getString(3);

                User user = new User(id,username,password);
                user.getId();
                user.getPassword();
                user.getUsername();
                userList.add(user);
            }
        }catch (Exception e){

        }finally {

        }


        return userList;
    }
}
