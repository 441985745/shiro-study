package com.example.shiro.study.domain;

import lombok.Data;

@Data
public class SysPermission {
    /**
    * 主键
    */
    private Long id;

    /**
    * 资源名称
    */
    private String name;

    /**
    * 资源类型：menu,button,
    */
    private String type;

    /**
    * 访问url地址
    */
    private String url;

    /**
    * 权限代码字符串
    */
    private String percode;

    /**
    * 父结点id
    */
    private Long parentid;

    /**
    * 父结点id列表串
    */
    private String parentids;

    /**
    * 排序号
    */
    private String sortstring;

    /**
    * 是否可用,1：可用，0不可用
    */
    private String available;
}