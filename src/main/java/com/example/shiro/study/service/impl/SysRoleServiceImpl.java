package com.example.shiro.study.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.example.shiro.study.domain.SysRole;
import com.example.shiro.study.mapper.SysRoleMapper;
import com.example.shiro.study.service.SysRoleService;

@Service
public class SysRoleServiceImpl implements SysRoleService{

    @Resource
    private SysRoleMapper sysRoleMapper;

    @Override
    public int insert(SysRole sysRole){
        return sysRoleMapper.insert(sysRole);
    }

    @Override
    public int insertSelective(SysRole sysRole){
        return sysRoleMapper.insertSelective(sysRole);
    }

    @Override
    public int insertList(List<SysRole> sysRoles){
        return sysRoleMapper.insertList(sysRoles);
    }

    @Override
    public int updateByPrimaryKeySelective(SysRole sysRole){
        return sysRoleMapper.updateByPrimaryKeySelective(sysRole);
    }
}
