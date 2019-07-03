package com.example.shiro.study.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.example.shiro.study.domain.SysRole;

@Mapper
public interface SysRoleMapper {
    int insert(@Param("sysRole") SysRole sysRole);

    int insertSelective(@Param("sysRole") SysRole sysRole);

    int insertList(@Param("sysRoles") List<SysRole> sysRoles);

    int updateByPrimaryKeySelective(@Param("sysRole") SysRole sysRole);
}
