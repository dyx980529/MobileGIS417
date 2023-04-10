package com.dyx.mobilegis.service;

import com.dyx.mobilegis.entity.User;
import com.dyx.mobilegis.entity.WebResult;

public interface UserService {
    /*Boolean selectUserByPeAndPs(User user);*/
    WebResult userLoginName(String userName , String userPassword);
    WebResult userLoginPhone(String userPhone , String userPassword);
     WebResult userRegister(String userName ,String userPhone,String userPassword ,String userPosition);
     WebResult changePassword(String userPhone ,String userOldPassword,String userNewPassword);
}

