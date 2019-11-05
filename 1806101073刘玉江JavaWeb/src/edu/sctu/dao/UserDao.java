package edu.sctu.dao;

import edu.sctu.model.User;

import java.sql.SQLException;
import java.util.List;

//database access object
public interface UserDao {
    void saveUser(User user) throws SQLException;
    List<User> deleteById(int id) throws SQLException;
    void updateUser(User user);

    List<User> selectAll() ;
}
