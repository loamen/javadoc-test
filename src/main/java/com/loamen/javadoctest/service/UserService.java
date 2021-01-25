package com.loamen.javadoctest.service;

import com.loamen.javadoctest.entity.User;

/**
 * The interface User service.
 *
 * @Author Administrator
 * @Description 一个苦逼的程序员
 * @Date 2021 /1/21 10:15
 */
public interface UserService {
    /**
     * Gets user.
     *
     * @param id the id
     * @return the user
     */
    User getUser(Integer id);

    /**
     * Gets user.
     *
     * @param name the name
     * @return the user
     */
    User getUser(String name);
}
