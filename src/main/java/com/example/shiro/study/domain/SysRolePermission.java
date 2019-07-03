package com.example.shiro.study.domain;

import lombok.Data;

@Data
public class SysRolePermission {
    private String id;

    /**
    * 角色id
    */
    private String sysRoleId;

    /**
    * 权限id
    */
    private String sysPermissionId;
}