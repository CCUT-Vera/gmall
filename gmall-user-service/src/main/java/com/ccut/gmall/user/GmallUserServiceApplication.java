package com.ccut.gmall.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @description:
 * @author: Sunwei
 * @time: 2020/4/29 10:46 PM
 */


@SpringBootApplication
@MapperScan(basePackages = "com.ccut.gmall.user.mapper")
public class GmallUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallUserServiceApplication.class, args);
    }

}
