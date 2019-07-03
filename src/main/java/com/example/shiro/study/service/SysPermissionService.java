package com.example.shiro.study.service;

import java.util.List;
import com.example.shiro.study.domain.SysPermission;
public interface SysPermissionService{

    int insert(SysPermission sysPermission);

    int insertSelective(SysPermission sysPermission);

    int insertList(List<SysPermission> sysPermissions);

    int updateByPrimaryKeySelective(SysPermission sysPermission);
}
