package com.loamen.javadoctest.service.impl;

import com.loamen.javadoctest.entity.Gender;
import com.loamen.javadoctest.entity.User;
import com.loamen.javadoctest.service.UserService;

/**
 * The type User service.
 *
 * @Author Don
 * @Description Don
 * @Date 2021 /1/21 10:35
 */
public class UserServiceImpl implements UserService {
    /**
     * 编号
     */
    public Integer id = 1;
    /**
     * 名称
     */
    private String name = "张三";
    /**
     * 年龄
     */
    private final int age = 24;

    /**
     * 获取用户.
     *
     * @param id the id
     * @return the user
     */
    @Override
    public User getUser(Integer id) {
        User user = new User(name);
        user.id = id;
        user.gender = Gender.FEMALE;
        user.age = age;

        return user;
    }

    /**
     * 获取用户.
     *
     * @param name the name
     * @return the user
     */
    @Override
    public User getUser(String name) {
        User user = new User("李四");
        user.id = 1;
        user.gender = Gender.MALE;
        user.age = 24;

        return user;
    }
}
