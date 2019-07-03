package com.example.shiro.study.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.example.shiro.study.domain.SysRolePermission;
import com.example.shiro.study.mapper.SysRolePermissionMapper;
import com.example.shiro.study.service.SysRolePermissionService;

@Service
public class SysRolePermissionServiceImpl implements SysRolePermissionService{

    @Resource
    private SysRolePermissionMapper sysRolePermissionMapper;

    @Override
    public int insert(SysRolePermission sysRolePermission){
        return sysRolePermissionMapper.insert(sysRolePermission);
    }

    @Override
    public int insertSelective(SysRolePermission sysRolePermission){
        return sysRolePermissionMapper.insertSelective(sysRolePermission);
    }

    @Override
    public int insertList(List<SysRolePermission> sysRolePermissions){
        return sysRolePermissionMapper.insertList(sysRolePermissions);
    }

    @Override
    public int updateByPrimaryKeySelective(SysRolePermission sysRolePermission){
        return sysRolePermissionMapper.updateByPrimaryKeySelective(sysRolePermission);
    }
}
