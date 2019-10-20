package com.ssm.mapper;

import com.ssm.model.Orders;
import com.ssm.model.User;

import java.util.List;
//https://blog.csdn.net/qq_22172133/article/details/81290718
//https://blog.csdn.net/iCopper_/article/details/81879018
//https://blog.csdn.net/hjw0505521/article/details/88853259
//https://blog.csdn.net/musuny/article/details/46367451
//https://blog.csdn.net/yhq1913/article/details/64128441
//https://blog.csdn.net/dyy_gusi/article/details/49302519

public interface User2Mapper {
    List<Orders> findOrdersAndUser2();

    List<User> findUserAndOrders();
}
