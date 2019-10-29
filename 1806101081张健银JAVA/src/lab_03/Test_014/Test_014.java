package lab_03.Test_014;

import java.sql.*;

public class Test_014 {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;


        String sql = "select  * from t_userinfo";
        String sql1 = "insert into t_userinfo(usercode,username,password,email)values('7107','小张','12121','xiaozhang.com.cn')";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC&useSSL=False",
                    "root",
                    "1419512991");

            statement = connection.createStatement();
//            statement.executeUpdate(sql1);
            resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                String cdoe = resultSet.getString(1);
                String name = resultSet.getString(2);
                String password = resultSet.getString(3);
                String email = resultSet.getString(4);
                System.out.println(cdoe+"-"+name+"-"+password+"-"+email);
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
