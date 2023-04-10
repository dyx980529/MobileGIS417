package com.dyx.mobilegis.controller;

import com.dyx.mobilegis.entity.User;
import com.dyx.mobilegis.entity.WebResult;
import com.dyx.mobilegis.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;


@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;
/*
    //@RequestParam：将请求参数绑定到你控制器的方法参数上（是springmvc中接收普通参数的注解）
    @RequestMapping("/login")
    public Boolean login(@RequestParam("userphone") String userPhone,
                            @RequestParam("userpassword") String userPassword){
        User user = new User (userPhone,userPassword);
        Boolean aBoolean = userService.selectUserByPeAndPs(user);
        System.out.println(aBoolean);
        return aBoolean;
    }*/
    @RequestMapping(path="/login",method= RequestMethod.POST)
    public WebResult login(@RequestBody HashMap<String, String> map) {
        String str =map.get("account");
        boolean account = str.matches("[0-9]+");
        if (!account){
            return userService.userLoginName(map.get("account"), map.get("password"));
        }else {
            return userService.userLoginPhone(map.get("account"), map.get("password"));
        }
    }
    @RequestMapping("/register")
    public WebResult register(@RequestBody HashMap<String ,String> map){

        return userService.userRegister(map.get("name"), map.get("phone"),
                                        map.get("password"),map.get("position"));
    }

    @RequestMapping("/password")
    public WebResult password(@RequestBody HashMap<String ,String> map){

        return userService.changePassword(map.get("phone"), map.get("opassword"), map.get("npassword"));
    }

}
