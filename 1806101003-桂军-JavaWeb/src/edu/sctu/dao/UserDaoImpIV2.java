package edu.sctu.dao;

import edu.sctu.model.User;
import edu.sctu.utils.DatabaseManger;

import java.sql.Statement;
import java.util.List;

public class UserDaoImpIV2 implements UserDao{
    private DatabaseManger databaseManger = new DatabaseManger();

    @Override
    public void saveUser(User user) {
        String sql = "insert into  t_users(username,password) values('"+user.getUsername()+"','"+user.getPassword()+"')";
        Statement statement = databaseManger.open();

    }

    @Override
    public void deleteByid(int id) {

    }

    @Override
    public void updataUser(User user) {

    }

    @Override
    public List<User> selectAll() {
        String sql = "select * from t_users";
        Statement statement = databaseManger.open();
        return null;
    }
}
