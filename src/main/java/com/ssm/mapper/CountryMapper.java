package com.ssm.mapper;

import com.ssm.model.Country;

public interface CountryMapper {
    Country getCountryByKey(String name);
}
