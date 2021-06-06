package com.atguigu.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class UserServletTest {
    public void login(){
        System.out.println("这是login");
    }
    public void regist(){
        System.out.println("这是regist");
    }
    public void updateUser(){
        System.out.println("这是updateUser");
    }
    public void updateUserPassword(){
        System.out.println("这是updateUserPassword");
    }

    public static void main(String[] args) {
        String action="regist";

        try {
            //通过action业务鉴别字符串，获取相应的业务方法反射对象
            Method method = UserServletTest.class.getDeclaredMethod(action);
            //调用目标业务方法
            method.invoke(new UserServletTest());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
