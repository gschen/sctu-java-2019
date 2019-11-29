package edu.sctu.dao;
import edu.sctu.model.User;

import java.sql.SQLException;
import java.util.List;

public interface UserDao {

    void saveUser(User user) throws SQLException;

    void deleteById(int id) throws SQLException;

    void updateUser(User user) throws SQLException;

    List<User> selectAll() throws SQLException;//通过集合的方式

}
