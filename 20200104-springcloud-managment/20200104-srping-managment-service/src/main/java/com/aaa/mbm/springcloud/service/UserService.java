package com.aaa.mbm.springcloud.service;

import com.aaa.mbm.springcloud.mapper.UserMapper;
import com.aaa.mbm.springcloud.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: 20200104-springcloud-ribbo-custom
 * @ClassName: UserService
 * @Package: com.aaa.mbm.springcloud.service
 * @description
 * @author: mbm
 * @create: 2020-01-07 14:37
 * @Version: 1.0
 **/
@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public List<User> selectAllUsers(){
        return userMapper.selectAll();
    }

}
