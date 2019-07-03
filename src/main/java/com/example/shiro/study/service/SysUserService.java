package com.example.shiro.study.service;

import java.util.List;
import com.example.shiro.study.domain.SysUser;
public interface SysUserService{

    int insert(SysUser sysUser);

    int insertSelective(SysUser sysUser);

    int insertList(List<SysUser> sysUsers);

    int updateByPrimaryKeySelective(SysUser sysUser);
}
