package com.example.shiro.study.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import com.example.shiro.study.domain.SysUser;

@Mapper
public interface SysUserMapper {
    int insert(@Param("sysUser") SysUser sysUser);

    int insertSelective(@Param("sysUser") SysUser sysUser);

    int insertList(@Param("sysUsers") List<SysUser> sysUsers);

    int updateByPrimaryKeySelective(@Param("sysUser") SysUser sysUser);

     List<SysUser> findByUsercode(@Param("usercode")String usercode);

    SysUser findById(@Param("id")String id);





}
