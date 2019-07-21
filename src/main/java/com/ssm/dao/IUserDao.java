package com.ssm.dao;

import com.ssm.model.User;

import java.util.List;

public interface IUserDao {
    User findUserById(int id); //查询

    void addUser(User user); //添加

    List<User> getAllUsers();
}
