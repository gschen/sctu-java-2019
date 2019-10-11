package day20191011.Test_01;

import java.sql.*;

public class Test_01 {
    public static void main(String[] args) throws SQLException {
        //3+1 :三个变量
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;
        //1
        String sql="select * from t_users";
        //加载数据库驱动程序
        try {
            Class.forName("com.mysql.jdbc.Driver");
            //1.connection
            try {
                connection= DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/java2019?serverTimezone=UTC",
                        "root",
                        "601906@QJ"
                );
                //2.statement
                statement=connection.createStatement();

                //3.resultSet
                resultSet=statement.executeQuery(sql);

                while (resultSet.next()){
                    int id=resultSet.getInt(1);//第一列
                    String user_name=resultSet.getString(2);
                    String password=resultSet.getString(3);
                    System.out.println(id+"-"+user_name+"-"+password);
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            resultSet.close();
            statement.close();
            connection.close();
        }
    }
}
