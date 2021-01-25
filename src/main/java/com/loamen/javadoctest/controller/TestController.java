package com.loamen.javadoctest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Test控制器
 */
@RestController
public class TestController {
    /**
     * 获取名称
     * @param name 名称
     * @return string
     */
    @GetMapping(path = "/getName")
    public String getName(String name){
        return "hello," + name;
    }


    /**
     * 获取编号
     *
     * @param name 名称
     * @param id   用户ID
     * @return int 编号
     * @throws NullPointerException  空指针异常
     * @throws IllegalArgumentException the illegal argument exception
     */
    public Integer getId(String name, Integer id) throws NullPointerException,IllegalArgumentException{
        return  1;
    }
}
