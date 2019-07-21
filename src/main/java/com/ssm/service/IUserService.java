package com.ssm.service;

import com.ssm.model.User;

import java.util.List;

public interface IUserService {
    User findUserById(int id);

    void addUser(User user);

    List<User> getAllUsers();
}
