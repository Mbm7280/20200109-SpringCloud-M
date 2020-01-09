package com.aaa.mbm.springcloud.controller;

import com.aaa.mbm.springcloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @program: 20200104-springcloud-ribbo-custom
 * @ClassName: UserController
 * @Package: com.aaa.mbm.springcloud.controller
 * @description
 * @author: mbm
 * @create: 2020-01-07 18:21
 * @Version: 1.0
 **/
@RestController
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @GetMapping("/allLB")
    public List<User> selectAllUsers(){

        // 获取provider服务器
        ServiceInstance serviceInstance = loadBalancerClient.choose("user-provider");
        // 获取 provider 的host
        String host = serviceInstance.getHost();
        // 获取 provider 的ip
        int port = serviceInstance.getPort();
        System.out.println(port);
        // 拼接地址
        return restTemplate.getForObject("http://"+host+":"+port+"/all",List.class);
    }

}
