//package edu.sctu.dao;
//
//import edu.sctu.model.User;
//
//import java.sql.*;
//import java.util.ArrayList;
//import java.util.List;List
//
//public class UserDaoImpl implements UserDao {
//
//    public UserDaoImpl() {
//
//    }
//
//    @Override
//    public void saveUser(User user) {
//
//    }
//
//    @Override
//    public void deleteById(int id) {
//
//    }
//
//    @Override
//    public void updateUser(User user) {
//
//    }
//
//    @Override
//    public List<User> selectAll() {
//
//        List<User> userList = new ArrayList<>();
//
//        //1.从数据库中读取所有用户的数据
//        Connection connection = null;
//        Statement statement = null;
//        ResultSet resultSet = null;
//
//        String sql = "select * from t_users";
//
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//
//            connection = DriverManager.getConnection(
//                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",
//                    "root",
//                    "123456789"
//            );
//
//            statement = connection.createStatement();
//
//            resultSet = statement.executeQuery(sql);
//
//            while (resultSet.next()){
//                while
//                int id = resultSet.getInt(1);
//                String username = resultSet.getString(2);
//                String password = resultSet.getString(3);
//
//                User user = new User(id,username,password);
//                userList.add(user);
//
////        System.out.println(id+username+password);
//            }
//        }catch (Exception e){
//
//        }finally {
//            try {
//                connection.close();
//                statement.close();
//                resultSet.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//
//
//        return userList;
//    }
//}
//
