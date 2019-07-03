package com.example.shiro.study.service;

import java.util.List;
import com.example.shiro.study.domain.SysUserRole;
public interface SysUserRoleService{

    int insert(SysUserRole sysUserRole);

    int insertSelective(SysUserRole sysUserRole);

    int insertList(List<SysUserRole> sysUserRoles);

    int updateByPrimaryKeySelective(SysUserRole sysUserRole);
}
