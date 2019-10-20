package com.ssm.mapper;

import com.ssm.model.Orders;
import com.ssm.model.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class User2MapperTest {
    private SqlSessionFactory sessionFactory;
    private SqlSession session;
    private User2Mapper mapper;

    @Before
    public void setUp() {
        String resource = "config.xml";
        try {
            Reader reader = Resources.getResourceAsReader(resource);
            sessionFactory = new SqlSessionFactoryBuilder().build(reader);
            session = sessionFactory.openSession();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFindOrdersAndUser2() {
        mapper = session.getMapper(User2Mapper.class);
        List<Orders> list = mapper.findOrdersAndUser2();
        System.out.println(list);
        System.out.println("\r\n");
        List<User> userList = mapper.findUserAndOrders();
        System.out.println(userList);

    }
}