package lab_03.Test_012;
//12、	简单SQL语句练习，以下操作均建立在上述t_users 用户表的基础上。
//        1)	查询所有记录；
//        2)	查询用户名为'admin'的记录；
//        3)	查询用户名为'admin'，密码为'123456'的记录；
//        4)	查询注册时间大于10000000的记录；

import java.sql.*;

public class Test_012 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String sql = "select * from t_users";
        String sql1 ="select * from t_users where username='admin'";
        String sql2 = "select * from t_users where username='admin'and password='123456'";
        String sql3 = "select * from t_users where register_datetime>10000000";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC&useSSL=False",//数据库连接字符串
                    "root",
                    "1419512991");
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql2);
            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String username = resultSet.getString(2);
                String password = resultSet.getString(3);
                long register_datetime = resultSet.getLong(4);
                System.out.println(id + "-" + username + "-" + password+"-"+register_datetime);
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }


    }
}
