package com.dyx.mobilegis.service.impl;

import com.dyx.mobilegis.entity.User;
import com.dyx.mobilegis.mapper.UserMapper;
import com.dyx.mobilegis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Boolean selectUserByPeAndPs(User user) {
        User user1 = userMapper.selectPhone(user);
        System.out.println(user1);
        if (user1 != null) {
            return true;
        }
        return false;
    }
}
