package com.loamen.javadoctest.entity;

import lombok.Data;
import lombok.NonNull;

/**
 * The type User.
 *
 * @Author Administrator
 * @Description 一个苦逼的程序员
 * @Date 2021 /1/21 10:16
 */
@Data
public class User {
    /**
     * The Id.
     */
    public Integer id;
    /**
     * The Name.
     */
    @NonNull
    public String name;
    /**
     * The Gender.
     */
    public Gender gender;
    /**
     * The Age.
     */
    public Integer age;
}
