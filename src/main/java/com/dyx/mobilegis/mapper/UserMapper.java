package com.dyx.mobilegis.mapper;


import com.dyx.mobilegis.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
//@Mapper
public interface UserMapper {

    User selectPhone(User user);

}
