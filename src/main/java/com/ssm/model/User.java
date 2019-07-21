package com.ssm.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NonNull
@AllArgsConstructor
@NoArgsConstructor
//@RequiredArgsConstructor(staticName = "argsConstrutor")
//@Builder //用一个内部类去实例化一个对象，避免一个类出现过多构造函数
public class User {
    private String username;
    private String password;
    private int id;
}
