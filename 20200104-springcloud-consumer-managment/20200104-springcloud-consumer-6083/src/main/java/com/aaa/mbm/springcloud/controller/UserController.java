package com.aaa.mbm.springcloud.controller;

import com.aaa.mbm.springcloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
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
 * @create: 2020-01-07 17:53
 * @Version: 1.0
 **/
@RestController
public class UserController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/all")
    public List<User> selectAllUsers(){
        return restTemplate.getForObject("http://USER-PROVIDER/all",List.class);
    }

}
