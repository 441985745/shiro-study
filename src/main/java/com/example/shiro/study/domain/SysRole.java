package com.example.shiro.study.domain;

import lombok.Data;

@Data
public class SysRole {
    private String id;

    private String name;

    /**
    * 是否可用,1：可用，0不可用
    */
    private String available;
}