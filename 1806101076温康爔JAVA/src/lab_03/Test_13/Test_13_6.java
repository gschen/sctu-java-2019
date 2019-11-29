package lab_03.Test_13;

import java.sql.*;

public class Test_13_6 {
    public static void main(String[] args) {

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        String sql = "select * from t_students where id='3'";

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
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
                statement.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        String updatesql = "update t_students set department='信息与工程学院' where id='3'";

        //0.加载数据库驱动程序
        try {
            Class.forName("com.mysql.jdbc.Driver");

            //1.Connection
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",//"jdbc:mysql://47.104.80.155:3306/javaweb"
                    "root",
                    "dl921021"//写自己的数据库的账号密码
                    //远程服务器的账号密码
                    //"jdbc:mysql://47.104.80.155:3306/javaweb"
                    //"javaweb"
                    //"sctu123!@#"
            );

            //2.statement
            statement = connection.createStatement();

            //3.resultSet
            statement.executeUpdate(updatesql);

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
}


