package com.example.shiro.study.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.example.shiro.study.domain.SysUser;
import com.example.shiro.study.mapper.SysUserMapper;
import com.example.shiro.study.service.SysUserService;

@Service
public class SysUserServiceImpl implements SysUserService{

    @Resource
    private SysUserMapper sysUserMapper;

    @Override
    public int insert(SysUser sysUser){
        return sysUserMapper.insert(sysUser);
    }

    @Override
    public int insertSelective(SysUser sysUser){
        return sysUserMapper.insertSelective(sysUser);
    }

    @Override
    public int insertList(List<SysUser> sysUsers){
        return sysUserMapper.insertList(sysUsers);
    }

    @Override
    public int updateByPrimaryKeySelective(SysUser sysUser){
        return sysUserMapper.updateByPrimaryKeySelective(sysUser);
    }
}
