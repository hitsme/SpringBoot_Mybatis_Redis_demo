package com.hitsme.springboot.demo.demo.entity;

import lombok.Data;

import java.io.Serializable;

/**
* 用户信息表
* @author mgl
* @date 2018-09-28 01:44:33
*/
@Data
public class User implements Serializable{

    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 用户名称
     */
    private String userName;


    /**
     * 密码
     */
    private String password;




}