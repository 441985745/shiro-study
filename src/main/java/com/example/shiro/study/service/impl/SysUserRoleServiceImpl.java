package com.example.shiro.study.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.example.shiro.study.domain.SysUserRole;
import com.example.shiro.study.mapper.SysUserRoleMapper;
import com.example.shiro.study.service.SysUserRoleService;

@Service
public class SysUserRoleServiceImpl implements SysUserRoleService{

    @Resource
    private SysUserRoleMapper sysUserRoleMapper;

    @Override
    public int insert(SysUserRole sysUserRole){
        return sysUserRoleMapper.insert(sysUserRole);
    }

    @Override
    public int insertSelective(SysUserRole sysUserRole){
        return sysUserRoleMapper.insertSelective(sysUserRole);
    }

    @Override
    public int insertList(List<SysUserRole> sysUserRoles){
        return sysUserRoleMapper.insertList(sysUserRoles);
    }

    @Override
    public int updateByPrimaryKeySelective(SysUserRole sysUserRole){
        return sysUserRoleMapper.updateByPrimaryKeySelective(sysUserRole);
    }
}
