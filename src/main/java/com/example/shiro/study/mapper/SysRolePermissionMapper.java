package com.example.shiro.study.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.example.shiro.study.domain.SysRolePermission;

@Mapper
public interface SysRolePermissionMapper {
    int insert(@Param("sysRolePermission") SysRolePermission sysRolePermission);

    int insertSelective(@Param("sysRolePermission") SysRolePermission sysRolePermission);

    int insertList(@Param("sysRolePermissions") List<SysRolePermission> sysRolePermissions);

    int updateByPrimaryKeySelective(@Param("sysRolePermission") SysRolePermission sysRolePermission);
}
