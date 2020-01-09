package com.aaa.mbm.springcloud.controller;

import com.aaa.mbm.springcloud.model.User;
import com.aaa.mbm.springcloud.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: 20200104-springcloud-ribbo-custom
 * @ClassName: UserService
 * @Package: com.aaa.mbm.springclooud.controller
 * @description
 * @author: mbm
 * @create: 2020-01-07 20:37
 * @Version: 1.0
 **/
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/all")
    public List<User> selectAllUsers() throws Exception {
        List<User> userList = userService.selectAllUsers();
        if(userList.size() > 0){
            throw new Exception("自定义异常");
        }
        return null;
    }

}
