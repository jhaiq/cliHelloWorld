package com.ssm.mapper;

import com.ssm.model.Orders;
import com.ssm.model.User;

import java.util.List;

public interface User2Mapper {
    List<Orders> findOrdersAndUser2();

    List<User> findUserAndOrders();
}
