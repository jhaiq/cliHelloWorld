package com.ssm.service.impl;

import com.ssm.dao.ICountryDao;
import com.ssm.dao.IUserDao;
import com.ssm.dao.impl.UserDaoImpl;
import com.ssm.model.Country;
import com.ssm.model.User;
import com.ssm.service.IUserService;

import java.util.List;

public class UserServiceImpl implements IUserService {
    private IUserDao userDao;
    private ICountryDao countryDao;

    public UserServiceImpl() {
        userDao = new UserDaoImpl();
    }

    public User findUserById(int id) {
        return userDao.findUserById(id);
    }

    public void addUser(User user) {
        userDao.addUser(user);
    }

    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

    public Country getCountry(Country country) {
        return countryDao.selectByPrimaryKey(country.getName());
    }

}
