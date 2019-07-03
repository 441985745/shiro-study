package com.example.shiro.study;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthorizationTest {

    //角色授权.资源授权测试
    @Test
    public void testAuthorization(){
        //创建工厂
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-permission.ini");

        //创建SecurityManager
        SecurityManager securityManager = factory.getInstance();

        //将SecurityManager设置到运行环境中,和spring整合后,一般都是单例管理
        SecurityUtils.setSecurityManager(securityManager);

        //获取主体
        Subject subject = SecurityUtils.getSubject();
        //创建token
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken("zhang","123");
        //执行认证
        try {
            subject.login(usernamePasswordToken);
        } catch (AuthenticationException e) {
            e.printStackTrace();
        }

        System.out.println("认证状态"+subject.isAuthenticated());
        //认证通过后执行授权

        //基于角色的授权
        boolean isHasRole= subject.hasRole("role3");
        System.out.println("具有角色role3:"+isHasRole);
        //是否具有多个角色
        boolean isHasRoles = subject.hasAllRoles(Arrays.asList("role1","role2"));
        System.out.println("具有角色role1,role2:"+isHasRoles);
        //使用check方法进行授权,如果授权不通过会抛出异常
        try {
            subject.checkRole("role1");
        } catch (AuthorizationException e) {
            e.printStackTrace();
        }


        //基于资源的授权
        boolean isHasPermisson= subject.isPermitted("user:create");
        System.out.println("具有权限user:create:"+isHasPermisson);
        try {
            subject.checkPermission("user:import");
        } catch (AuthorizationException e) {
            e.printStackTrace();
        }


    }



    //自定义realm来进行资源授权测试
    @Test
    public void testAuthorizationCostomRealm(){
        //创建工厂
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-realm.ini");

        //创建SecurityManager
        SecurityManager securityManager = factory.getInstance();

        //将SecurityManager设置到运行环境中,和spring整合后,一般都是单例管理
        SecurityUtils.setSecurityManager(securityManager);

        //获取主体
        Subject subject = SecurityUtils.getSubject();
        //创建token
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken("zhang","123");
        //执行认证
        try {
            subject.login(usernamePasswordToken);
        } catch (AuthenticationException e) {
            e.printStackTrace();
        }

        System.out.println("认证状态"+subject.isAuthenticated());
        //认证通过后执行授权



        //基于资源的授权
        boolean isHasPermisson= subject.isPermitted("user:create");
        System.out.println("具有权限user:create:"+isHasPermisson);
        try {
            subject.checkPermission("items:add");
        } catch (AuthorizationException e) {
            e.printStackTrace();
        }


    }



}
