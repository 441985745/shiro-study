package com.example.shiro.study;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.apache.shiro.mgt.SecurityManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class StudyApplicationTests {

    @Test
    public void contextLoads() {
        //创建securityManagerFactory工厂
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");

        //创建SecurityManager
        SecurityManager securityManager = factory.getInstance();

        //将SecurityManager设置到当前运行环境
        SecurityUtils.setSecurityManager(securityManager);

        //获取subject
        Subject subject = SecurityUtils.getSubject();

        //获取token
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken("zhangsan","111111");

        try {
            //执行认证提交
            subject.login(usernamePasswordToken);
        } catch (AuthenticationException e) {
            e.printStackTrace();
        }

        boolean authenticated = subject.isAuthenticated();
        System.out.println("是否认证通过:"+authenticated);
        subject.logout();
        authenticated= subject.isAuthenticated();
        System.out.println("是否认证通过:"+authenticated);

    }
    @Test
    public void testCustomRealm() {
        //创建securityManagerFactory工厂
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-realm.ini");

        //创建SecurityManager
        SecurityManager securityManager = factory.getInstance();

        //将SecurityManager设置到当前运行环境
        SecurityUtils.setSecurityManager(securityManager);

        //获取subject
        Subject subject = SecurityUtils.getSubject();

        //获取token
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken("zhangsan","111111");

        try {
            //执行认证提交
            subject.login(usernamePasswordToken);
        } catch (AuthenticationException e) {
            e.printStackTrace();
        }

        boolean authenticated = subject.isAuthenticated();
        System.out.println("是否认证通过:"+authenticated);
        subject.logout();
        authenticated= subject.isAuthenticated();
        System.out.println("是否认证通过:"+authenticated);

    }
    //自定义realm实现散列匹配
    @Test
    public void testCustomRealmMd5() {
        //创建securityManagerFactory工厂
        Factory<SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-realm-md5.ini");

        //创建SecurityManager
        SecurityManager securityManager = factory.getInstance();

        //将SecurityManager设置到当前运行环境
        SecurityUtils.setSecurityManager(securityManager);

        //获取subject
        Subject subject = SecurityUtils.getSubject();

        //获取token
        UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken("zhangsan","111111");

        try {
            //执行认证提交
            subject.login(usernamePasswordToken);
        } catch (AuthenticationException e) {
            e.printStackTrace();
        }

        boolean authenticated = subject.isAuthenticated();
        System.out.println("是否认证通过:"+authenticated);
        subject.logout();
        authenticated= subject.isAuthenticated();
        System.out.println("是否认证通过:"+authenticated);

    }
}
