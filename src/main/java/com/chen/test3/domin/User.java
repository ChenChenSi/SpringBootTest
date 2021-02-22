package com.chen.test3.domin;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 用户类，与数据库t_user表的列一一对应
 * @author 淡
 * @version 1.0
 * @description
 * @create 2021-02-23 0:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private String id;
    private String name;
    private String password;
    private String phone;
    private String pay_id;
    private String pay_password;
}
