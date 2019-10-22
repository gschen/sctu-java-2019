package lab_03.Test_13;

import java.sql.*;

public class Test_13_3 {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String addsql1 = "insert into t_students(stu_no,real_name,age,gender,department) values ('1021','dl','27','1','信工')";
        String addsql2 = "insert into t_students(stu_no,real_name,age,gender,department) values ('1015','kx','20','2','信工')";

        //0.加载数据库驱动程序——增
        try {
            Class.forName("com.mysql.jdbc.Driver");

            //1.Connection
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",//"jdbc:mysql://47.104.80.155:3306/javaweb"
                    "root",
                    "dl921021"//写自己的数据库的账号密码
            );

            //2.statement
            statement = connection.createStatement();

            //3.resultSet
            statement.executeUpdate(addsql1);
            statement.executeUpdate(addsql2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                //删除resultSet
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
