package com.example.shiro.study.service;

import java.util.List;
import com.example.shiro.study.domain.SysRolePermission;
public interface SysRolePermissionService{

    int insert(SysRolePermission sysRolePermission);

    int insertSelective(SysRolePermission sysRolePermission);

    int insertList(List<SysRolePermission> sysRolePermissions);

    int updateByPrimaryKeySelective(SysRolePermission sysRolePermission);
}
