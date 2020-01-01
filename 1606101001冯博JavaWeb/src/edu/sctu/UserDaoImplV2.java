package edu.sctu;
import edu.sctu.model.User;
import edu.sctu.utils.DatabaseManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserDaoImplV2 implements UserDao{
    private DatabaseManager databaseManager = new DatabaseManager();
    @Override
    public void saveUser(User user) throws SQLException {
        String sql = "insert into t_users(username,password) values(user.getUsename()+','+user.getPassword())";
        Statement statement = databaseManager.open();
        try{
            statement.executeUpdate(sql);
        }catch (Exception e){}
        databaseManager.clsoe();
    }

    @Override
    public void deleteById(int id) throws SQLException {
        String sql = "delete from t_users where id = "+id+"";
        Statement statement = databaseManager.open();
        try{
            statement.executeUpdate(sql);
        }catch(Exception e){}
        databaseManager.clsoe();
    }

    @Override
    public void updateUser(User user) throws SQLException {
        String sql = "update t_users set username = 'harden' where id = 4";
        Statement statement = databaseManager.open();
        try{
            statement.executeUpdate(sql);
        }catch(Exception e){}
        databaseManager.clsoe();
    }

    @Override
    public List<User> selectAll() throws SQLException {
        return null;
    }
}
