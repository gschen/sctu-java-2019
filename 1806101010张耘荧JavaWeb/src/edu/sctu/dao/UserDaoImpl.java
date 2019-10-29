package edu.sctu.dao;

import edu.sctu.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao{

//    private Connection connection=null;
//    private Statement statement=null;
//    private ResultSet resultSet=null;
//    private String sql=null;
//
//    public UserDaoImpl() throws SQLException,ClassNotFoundException{
//
//        Class.forName("com.mysql.cj.jdbc.Driver");
//
//        connection = DriverManager.getConnection(
//                "jdbc:mysql://localhost:3306/java2019? serverTimezone=UTC",
//                "root",
//                "123456"
//        );
//
//    }




    @Override
    public void saveUser(User user) {
//        sql = "insert into t_users(username,password) values('','')";

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public List<User> selectAll() {
//        sql = "select * form t_users";

        //从数据库中读取所有的用户3+1
        List<User> userlist=new ArrayList<>();
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;
        String sql = "select * from t_users";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019? serverTimezone=UTC",
                    "root",
                    "123456"
            );
            //2.statement
            statement=connection.createStatement();

            //3.resultset
            resultSet=statement.executeQuery(sql);




            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String username=resultSet.getString(2);
                String password = resultSet.getString(3);

                User user=new User(id,username,password);
                userlist.add(user);

                //System.out.println(id+username+password);

            }
        }catch (Exception e){

        }finally {

        }



        return userlist;
    }
}
