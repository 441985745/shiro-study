package com.example.shiro.study.service;

import java.util.List;
import com.example.shiro.study.domain.SysRole;
public interface SysRoleService{

    int insert(SysRole sysRole);

    int insertSelective(SysRole sysRole);

    int insertList(List<SysRole> sysRoles);

    int updateByPrimaryKeySelective(SysRole sysRole);
}
