package com.dyx.mobilegis.controller;

import com.dyx.mobilegis.entity.User;
import com.dyx.mobilegis.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    //@RequestParam：将请求参数绑定到你控制器的方法参数上（是springmvc中接收普通参数的注解）
    @RequestMapping("/login")
    public Boolean login(@RequestParam("userphone") String userPhone,
                            @RequestParam("userpassword") String userPassword){
        User user = new User (userPhone,userPassword);
        Boolean aBoolean = userService.selectUserByPeAndPs(user);
        System.out.println(aBoolean);
        return aBoolean;
    }
}
