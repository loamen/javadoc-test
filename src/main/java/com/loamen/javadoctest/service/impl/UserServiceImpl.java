package com.loamen.javadoctest.service.impl;

import com.loamen.javadoctest.entity.Gender;
import com.loamen.javadoctest.entity.User;
import com.loamen.javadoctest.service.UserService;

/**
 * The type User service.
 *
 * @Author Administrator
 * @Description 一个苦逼的程序员
 * @Date 2021 /1/21 10:35
 */
public class UserServiceImpl implements UserService {

    @Override
    public User getUser(Integer id) {
        User user = new User("张三");
        user.id = 1;
        user.gender = Gender.FEMALE;
        user.age = 22;

        return user;
    }

    @Override
    public User getUser(String name) {
        User user = new User("李四");
        user.id = 1;
        user.gender = Gender.MALE;
        user.age = 24;

        return user;
    }
}
