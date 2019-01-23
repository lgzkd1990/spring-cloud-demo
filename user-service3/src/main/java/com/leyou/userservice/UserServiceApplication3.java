package com.leyou.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient//通用的注册的中心
public class UserServiceApplication3 {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication3.class, args);
    }

}

