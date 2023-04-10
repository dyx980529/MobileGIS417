package com.dyx.mobilegis;

import com.dyx.mobilegis.entity.User;
import com.dyx.mobilegis.mapper.UserMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SpringBootApplication
@MapperScan("com.dyx.mobilegis.mapper")

public class MobileGisApplication {

    public static void main(String[] args) {
        SpringApplication.run(MobileGisApplication.class, args);
    }

}

