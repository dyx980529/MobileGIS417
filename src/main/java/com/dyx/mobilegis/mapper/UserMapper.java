package com.dyx.mobilegis.mapper;


import com.dyx.mobilegis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//@Mapper
public interface UserMapper {

    //User selectPhone(User user);

    //    通过账号判断用户是否已经注册
    int getUserNumberByName(@Param("userName") String userName);
    int getUserNumberByPhone(@Param("userPhone") String userPhone);

    //    通过账户密码获取用户信息，验证用户是否存在
    User getPasswordByName(@Param("userName") String userName,
                       @Param("userPassword") String userPassword);
    User getPasswordByPhone(@Param("userPhone") String userPhone,
                       @Param("userPassword") String userPassword);
    //    创建用户
    void createUser(User user);
    //    更改密码
    void updatePassword(@Param("userPhone") String userPhone, @Param("userNewPassword") String userNewPassword);
    //    确认密码
    //int configCount(@Param("OriginalPassword") String OriginalPassword,@Param("id") String id);

}


