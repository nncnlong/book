package com.atguigu.dao;

import com.atguigu.pojo.User;

public interface UserDao {

    /**
     * 根据用户名查询用户信息
     * @param username 用户名
     * @return 如果返回Null，说明没有这个用户。
     */
    public User queryUserByUserName(String username);

    /**
     * 保存用户信息
     * @param user
     * @return
     */
    public int saveUser(User user);

    /**
     * 根据用户名和密码查询用户信息
     * @param username
     * @param password
     * @return 如果返回Null,说明用户名或密码错误
     */
    public User queryUserByUserNameAndPassword(String username,String password);
}
