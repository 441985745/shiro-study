package com.example.shiro.study.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.example.shiro.study.domain.SysUserRole;

@Mapper
public interface SysUserRoleMapper {
    int insert(@Param("sysUserRole") SysUserRole sysUserRole);

    int insertSelective(@Param("sysUserRole") SysUserRole sysUserRole);

    int insertList(@Param("sysUserRoles") List<SysUserRole> sysUserRoles);

    int updateByPrimaryKeySelective(@Param("sysUserRole") SysUserRole sysUserRole);
}
