package com.example.shiro.study.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.example.shiro.study.domain.SysPermission;
import com.example.shiro.study.mapper.SysPermissionMapper;
import com.example.shiro.study.service.SysPermissionService;

@Service
public class SysPermissionServiceImpl implements SysPermissionService{

    @Resource
    private SysPermissionMapper sysPermissionMapper;

    @Override
    public int insert(SysPermission sysPermission){
        return sysPermissionMapper.insert(sysPermission);
    }

    @Override
    public int insertSelective(SysPermission sysPermission){
        return sysPermissionMapper.insertSelective(sysPermission);
    }

    @Override
    public int insertList(List<SysPermission> sysPermissions){
        return sysPermissionMapper.insertList(sysPermissions);
    }

    @Override
    public int updateByPrimaryKeySelective(SysPermission sysPermission){
        return sysPermissionMapper.updateByPrimaryKeySelective(sysPermission);
    }
}
