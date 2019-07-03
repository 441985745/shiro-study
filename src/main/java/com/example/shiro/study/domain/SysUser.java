package com.example.shiro.study.domain;

import lombok.Data;

@Data
public class SysUser {
    /**
    * 主键
    */
    private String id;

    /**
    * 账号
    */
    private String usercode;

    /**
    * 姓名
    */
    private String username;

    /**
    * 密码
    */
    private String password;

    /**
    * 盐
    */
    private String salt;

    /**
    * 账号是否锁定，1：锁定，0未锁定
    */
    private String locked;
}