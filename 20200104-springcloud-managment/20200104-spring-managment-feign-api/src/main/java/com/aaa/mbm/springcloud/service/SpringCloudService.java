package com.aaa.mbm.springcloud.service;

import com.aaa.mbm.springcloud.hystrix.SpringCloudHystricFeign;
import com.aaa.mbm.springcloud.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @program: 20200104-springcloud-ribbo-custom
 * @ClassName: UserService
 * @Package: com.aaa.mbm.springcloud.service
 * @description
 * @author: mbm
 * @create: 2020-01-07 20:14
 * @Version: 1.0
 **/
@FeignClient(value = "USER-PROVIDER",fallbackFactory = SpringCloudHystricFeign.class)
public interface SpringCloudService {

    @GetMapping("/all")
    List<User> selectAllUsers();

}
