package com.example.shiro.study;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.crypto.hash.SimpleHash;

public class MD5Test {

    public static void main(String[] args) {
        //原始明文
        String source = "111111";
        //盐
        String salt = "qwerty";
        int hashIterations = 1;
        //构造方法中
        //第一个参数:明文,原始密码
        //第二个参数:盐
        //第三个参数:散列的次数,比如散列两次,相当于md5(md5(''))
        Md5Hash md5Hash = new Md5Hash(source,salt,hashIterations);
        String pwd_md5 = md5Hash.toString();
        System.out.println(pwd_md5);

        //第一个参数:散列算法
        SimpleHash simpleHash = new SimpleHash("md5",source,salt,hashIterations);
        System.out.println(simpleHash.toString());

    }
}
