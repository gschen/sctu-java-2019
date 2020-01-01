package day20191011;


import java.sql.*;

public class Test_01 {

    //3+1

    //3
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
    //1
        String sql = "select * from t_students";

        try {
            //加载数据库驱动程序
            Class.forName("com.mysql.jdbc.Driver");

            //1.connection
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/test?serverTimezone=UTC",
                    "root",
                    "123456"
            );

            //2.statement
            statement = connection.createStatement();

            //3.resultSet
            resultSet = statement.executeQuery(sql);

            while (resultSet.next()){

                int id = resultSet.getInt(1);
                String username = resultSet.getString(2);
                String password = resultSet.getString(3);
                String t4 = resultSet.getString(4);
                String t5 = resultSet.getString(5);


                System.out.println(id + " - " + username + " - " + password +
                        " - " + t4 + " - " + t5);
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

