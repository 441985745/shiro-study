package com.example.shiro.study.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class CustomRealm extends AuthorizingRealm {

    //设置real的名称
    @Override
    public void setName(String name) {
        super.setName("customRealm");
    }

    /**
     * 用于认证
     * @param token  UsernamePasswordToken usernamePasswordToken = new UsernamePasswordToken("zhangsan","111111");
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        //第一步从token中取出用户身份信息
        String usercode = (String) token.getPrincipal();//获得用户输入的usercode;
        //第二步根据用户输入的账号从数据库查询

        //模拟查询到密码
        String pwd = "1111112";

        //如果查询不到返回null
//        if(!usercode.equals("lisi")){
//            return null;
//        }
        //如果查询到返回认证信息AuthenticationInfo
        SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(usercode,pwd,this.getName());




        return simpleAuthenticationInfo;
    }

    //用于授权
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }


}