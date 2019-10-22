import java.sql.*;

public class insert {
    public static void main(String[] args) {
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;
        String sql="insert into course (student,cno) values ('老蒋','12345678 ')";

        try {
            //加载数据库驱动程序
            Class.forName("com.mysql.cj.jdbc.Driver");
            //实例化

                connection= DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/java?serverTimezone=UTC&useSSL=false",//数据库连接字符串
                        "root",
                        "123456"
                );
                statement=connection.createStatement();
                statement.executeUpdate(sql);


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
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

    }
}
