package com.lgl.service;

import com.lgl.domain.User;
import org.junit.Test;

public class TestUserService {
    @Test
    public void test01(){
        UserService userService = new UserService();

        User user =userService.findUserByName("jackhello");

        if (user == null){
            System.out.println("不存在");
        }else {
            System.out.println("存在");
        }

    }

    @Test
    public void test02(){
        UserService userService = new UserService();

        User user = new User();
        user.setUsername("jackhello");
        user.setPassword("123456");
//        user.setStatus('Y');
        int code = userService.login(user);

        if (code == -1){
            System.out.println("未注册");
        }else if (code == -2){
            System.out.println("已注册,但未激活");
        }else if (code == -3){
            System.out.println("注册,已激活，密码不对");
        }else if (code == 1){
            System.out.println("注册,已激活,密码对");
        }

 //       System.out.println(code);
    }
}