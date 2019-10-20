package com.ssm.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Orders {
    private Integer id;
    private Integer userId;
    private String number;
    private Date createtime;
    private String note;
    private User2 user;
}
