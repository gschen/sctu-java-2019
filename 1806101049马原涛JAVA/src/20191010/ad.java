import java.sql.*;

public class ad {
    public static void main(String[] args) {
        Connection connection=null;
        Statement statement=null;
        ResultSet resultSet=null;
        String sql="select * from course";

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
                resultSet=statement.executeQuery(sql);
                while (resultSet.next()){
                    String student=resultSet.getString(1);
                    String cno=resultSet.getString(2);
                    System.out.println(student+"--"+cno);
                }

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
