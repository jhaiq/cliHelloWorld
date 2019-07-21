package com.ssm.dao.impl;

import com.ssm.dao.IUserDao;
import com.ssm.mapper.UserMapper;
import com.ssm.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class UserDaoImpl implements IUserDao {
    private SqlSessionFactory sessionFactory;
    private SqlSession session;
//    private UserMapper mapper;

    public UserDaoImpl() {
        String resource = "config.xml";
                try {
            Reader reader = Resources.getResourceAsReader(resource);
            sessionFactory = new SqlSessionFactoryBuilder().build(reader);
            session = sessionFactory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        try {
//            Reader reader = Resources.getResourceAsReader(resource);
//            sessionFactory = new SqlSessionFactoryBuilder().build(reader);
//            session = sessionFactory.openSession();
//            mapper = session.getMapper(UserMapper.class);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public User findUserById(int id) {
        String statement = "findUserById";
        User user = (User)session.selectOne(statement, 1);
        return user;
//        return mapper.findUserById(id);
    }

    @Override
    public void addUser(User user) {
        String statement = "addUser";
        session.insert(statement, user);
        session.commit();  //一定要记得commit
//        mapper.addUser(user);
//        session.commit();
    }

    @Override
    public List<User> getAllUsers() {
//        return mapper.getAllUsers();
        String statement = "getAllUsers";
        return session.selectList(statement);
    }
}
