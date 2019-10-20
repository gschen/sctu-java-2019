package lab_03.Test_13;

import java.sql.*;

//用java操控数据库
public class Test_13_4 {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String sql = "select * from t_students";

        //0.加载数据库驱动程序——查
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
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String stu_no = resultSet.getString(2);
                String real_name = resultSet.getString(3);
                String age = resultSet.getString(4);
                String gender = resultSet.getString(5);
                String department = resultSet.getString(6);
                System.out.println(id+"-"+stu_no+"-"+real_name+"-"+age+"-"+gender+"-"+department);
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

