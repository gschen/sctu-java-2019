package src.lab_03.Test_13;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        String sql = "select * from t_students";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",
                    "root",
                    "1914571065lyj"
            );
            statement = connection.createStatement();
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String stu_no = resultSet.getString(2);
                String real_name = resultSet.getString(3);
                int age = resultSet.getInt(4);
                int gender = resultSet.getInt(5);
                String department = resultSet.getString(6);
                System.out.println("学号："+stu_no+",姓名："+real_name+"，年龄："+age+"，性别："+gender+"，学院："+department);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
