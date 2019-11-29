package edu.sctu.dao;

import edu.sctu.model.User;

import java.util.List;

public interface UserDao {

    void saveUser(User user);

    void deleteById(int id);

    void updateUser(User user);

    List<User> selectAll();
}
