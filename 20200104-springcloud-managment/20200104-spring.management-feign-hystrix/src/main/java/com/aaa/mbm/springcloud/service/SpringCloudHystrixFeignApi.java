package com.aaa.mbm.springcloud.service;

import com.aaa.mbm.springcloud.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @program: 20200104-springcloud-ribbo-custom
 * @ClassName: SpringCloudHystrixFeignApi
 * @Package: com.aaa.mbm.springcloud.service
 * @description
 * @author: mbm
 * @create: 2020-01-07 20:49
 * @Version: 1.0
 **/
@FeignClient(value = "USER-PROVIDER")
public interface SpringCloudHystrixFeignApi {

    @GetMapping("/all")
    List<User> selectAllUsers();

}
