package com.leyou.userconsumer.controller;

import com.leyou.userconsumer.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("consume")
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;
    @GetMapping
    public User consume(@RequestParam("ids") long id) {
       /* List<ServiceInstance> instances = discoveryClient.getInstances("user-service");
        ServiceInstance instance = instances.get(0);

        String url = "http://"+instance.getHost()+":"+instance.getPort()+"/user/" + id;*/
       String url="http://user-service/user/";
        User user = restTemplate.getForObject(url, User.class);
        return user;
    }
}