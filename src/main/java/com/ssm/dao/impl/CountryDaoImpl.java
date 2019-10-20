package com.ssm.dao.impl;

import com.ssm.dao.ICountryDao;
import com.ssm.mapper.CountryMapper;
import com.ssm.model.Country;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

public class CountryDaoImpl implements ICountryDao {
    private SqlSessionFactory sessionFactory;
    private SqlSession session;
    private CountryMapper mapper;

    public CountryDaoImpl() {

        String resource = "config.xml";
        try {
            Reader reader = Resources.getResourceAsReader(resource);
            sessionFactory = new SqlSessionFactoryBuilder().build(reader);
            session = sessionFactory.openSession();
            mapper = session.getMapper(CountryMapper.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Country selectByPrimaryKey(String name) {
        if (mapper == null) {
            return null;
        }

        return mapper.getCountryByKey(name);
    }

    @Override
    public int insertAll(List<Country> countries) {
        return 0;
    }

    @Override
    public int insert(Country country) {
        return 0;
    }
}
