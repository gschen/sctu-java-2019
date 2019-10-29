package edu.sctu.dao;

import edu.sctu.model.User;

import java.util.List;

public interface UserDao {

    //数据库接受对象
    //database access object
    //增加
    void saveUser(User user);

    //删除
    void deleteById(int id);

    //修改
    void updateUser(User user);

    //查询所有
    List<User> selectAll();


}
