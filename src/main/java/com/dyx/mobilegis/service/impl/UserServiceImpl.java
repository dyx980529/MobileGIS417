package com.dyx.mobilegis.service.impl;

import com.dyx.mobilegis.entity.IDSet;
import com.dyx.mobilegis.entity.User;
import com.dyx.mobilegis.entity.WebResult;
import com.dyx.mobilegis.mapper.UserMapper;
import com.dyx.mobilegis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public WebResult userLoginName(String userName , String userPassword){
        WebResult webResultName =new WebResult();
        int countName =userMapper.getUserNumberByName(userName);
        // 账号不存在
        if(countName==0){
            System.out.println("账号不存在");
            webResultName.setCode(-2);
            webResultName.setMessage("账号不存在");
        }
        else {
            User user= userMapper.getPasswordByName(userName,userPassword);
            if(user==null){
                System.out.println(userName+"密码错误");
                webResultName.error("密码错误");
            }
            else{
                System.out.println(userName+"登录成功");
                webResultName.success(userName+"登录成功");
            }
        }
        return webResultName;
    }
    public WebResult userLoginPhone(String userPhone , String userPassword){
        WebResult webResultPhone =new WebResult();
        int countPhone=userMapper.getUserNumberByPhone(userPhone);
        // 账号不存在
        if(countPhone==0){
            System.out.println("账号不存在");
            webResultPhone.setCode(-2);
            webResultPhone.setMessage("账号不存在");
        }
        else {
            User user= userMapper.getPasswordByPhone(userPhone,userPassword);
            if(user==null){
                System.out.println(userPhone+"密码错误");
                webResultPhone.error("密码错误");
            }
            else{
                System.out.println(userPhone+"登录成功");
                webResultPhone.success(userPhone+"登录成功");
            }
        }
        return webResultPhone;
    }


    public WebResult userRegister(String userName , String userPhone, String userPassword , String userPosition){
        WebResult webResultRegister = new WebResult();
        int userNameCount  = userMapper.getUserNumberByName(userName);
        int userPhoneCount  = userMapper.getUserNumberByPhone(userPhone);
        if( userNameCount ==0 && userPhoneCount==0){
            System.out.println("此账号为新用户");
            User userReg =new User(userName,userPhone,userPassword,userPosition);
            userMapper.createUser(userReg);
            webResultRegister.success("账号注册成功");
        }
        else{
            if(userNameCount !=0 && userPhoneCount !=0){
                webResultRegister.error(userName+"该用户已存在");
                System.out.println(userName+"该用户已存在");
            }
            else if(userNameCount!=0){
                webResultRegister.error(userName+"该姓名已存在");
                webResultRegister.setCode(-3);
                System.out.println(userName+"该姓名已存在");
            }else if(userPhoneCount!=0){
                webResultRegister.error(userName+"该手机号已存在");
                webResultRegister.setCode(-2);
                System.out.println(userName+"该手机号已存在");
            }
        }
        return webResultRegister;
    }


    public WebResult changePassword(String userPhone , String userOldPassword,String userNewPassword){
        WebResult webResultPassword = new WebResult();
        User userChange= userMapper.getPasswordByPhone(userPhone,userOldPassword);
        if(userChange==null){
            System.out.println(userPhone+"原密码错误");
            webResultPassword.error("原密码错误");
        }
        else{
            userMapper.updatePassword(userPhone,userNewPassword);
            webResultPassword.success("修改密码成功");
        }
        return webResultPassword;
    }

}
