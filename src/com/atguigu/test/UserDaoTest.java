package com.atguigu.test;

import com.atguigu.dao.UserDao;
import com.atguigu.dao.impl.UserDaoImpl;
import com.atguigu.pojo.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class UserDaoTest {
    UserDao userDao = new UserDaoImpl();

    @Test
    public void queryUserByUserName() {
        if (userDao.queryUserByUserName("admin")==null){
            System.out.println("用户名可用！");
        }else {
            System.out.println("用户名已存在！");
        }
    }

    @Test
    public void savaUser() {
        System.out.println(userDao.saveUser(new User(null,"wzg168","123456","wzg168@qq.com")));

    }

    @Test
    public void queryUserByUserNameAndPassword() {
        if (userDao.queryUserByUserNameAndPassword("admin","admin")==null){
            System.out.println("用户名或密码错误，登陆失败");
        }else {
            System.out.println("登陆成功");
        }
    }
}