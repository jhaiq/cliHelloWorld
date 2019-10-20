package com.ssm.dao;

import com.ssm.model.Country;

import java.util.List;

public interface ICountryDao {
    Country selectByPrimaryKey(String name);

    int insertAll(List<Country> countries);

    int insert(Country country);
}
