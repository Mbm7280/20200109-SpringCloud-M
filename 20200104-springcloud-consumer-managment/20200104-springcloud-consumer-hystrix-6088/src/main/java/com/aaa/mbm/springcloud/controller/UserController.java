package com.aaa.mbm.springcloud.controller;

import com.aaa.mbm.springcloud.model.User;
import com.aaa.mbm.springcloud.service.SpringCloudHystrixFeignApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: 20200104-springcloud-ribbo-custom
 * @ClassName: UserController
 * @Package: com.aaa.mbm.springcloud.controller
 * @description
 * @author: mbm
 * @create: 2020-01-07 20:53
 * @Version: 1.0
 **/

@RestController
public class UserController {

    @Autowired
    SpringCloudHystrixFeignApi springCloudHystrixFeignApi;

    @GetMapping("/all")
    public List<User> selectAllUsers(){
        return springCloudHystrixFeignApi.selectAllUsers();
    }

}
