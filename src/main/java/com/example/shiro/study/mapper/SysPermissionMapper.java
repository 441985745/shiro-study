package com.example.shiro.study.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.example.shiro.study.domain.SysPermission;

@Mapper
public interface SysPermissionMapper {
    int insert(@Param("sysPermission") SysPermission sysPermission);

    int insertSelective(@Param("sysPermission") SysPermission sysPermission);

    int insertList(@Param("sysPermissions") List<SysPermission> sysPermissions);

    int updateByPrimaryKeySelective(@Param("sysPermission") SysPermission sysPermission);



}
