package com.ssm.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;

@Setter
@Getter
@ToString
public class User2 {
    private int id;
    private String username;
    private String sex;
    private Date birthday;
    private String address;

    private List<Orders> orderList;
}
