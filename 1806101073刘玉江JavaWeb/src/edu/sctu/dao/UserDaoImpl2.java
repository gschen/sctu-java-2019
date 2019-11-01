package edu.sctu.dao;

import edu.sctu.model.User;
import edu.sctu.utils.DatabaseManager;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class UserDaoImpl2 implements UserDao{
    private DatabaseManager databaseManager = new DatabaseManager();
    @Override
    public void saveUser(User user) throws SQLException {
        String sql = "INSERT INTO t_users(username,password)VALUES('"+user.getUsername()+"','"+user.getPassword()+"')";
        Statement statement = databaseManager.open();
        try {
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        databaseManager.close();
    }

    @Override
    public void deleteById(int id) throws SQLException {
        String sql = "DELETE FROM t_users WHERE id = "+id+"";
        Statement statement = databaseManager.open();
        try {
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        databaseManager.close();
    }

    @Override
    public void updateUser(User user) {

    }

    @Override
    public List<User> selectAll() throws ClassNotFoundException, SQLException {
        return null;
    }
}
