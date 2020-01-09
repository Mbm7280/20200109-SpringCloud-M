package com.aaa.mbm.springcloud.hystrix;

import com.aaa.mbm.springcloud.model.User;
import com.aaa.mbm.springcloud.service.SpringCloudService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: 20200104-springcloud-ribbo-custom
 * @ClassName: SpringCloudHystricFeign
 * @Package: com.aaa.mbm.springcloud.hystrix
 * @description
 * @author: mbm
 * @create: 2020-01-07 21:09
 * @Version: 1.0
 **/
@Component
public class SpringCloudHystricFeign implements FallbackFactory<SpringCloudService> {


    public SpringCloudService create(Throwable throwable) {
        SpringCloudService cloudService = new SpringCloudService() {

            public List<User> selectAllUsers() {
                List<User> userList = new ArrayList<User>();
                User user = new User();
                user.setId(18L);
                user.setUserage(20L);
                user.setUsername("wxf");
                userList.add(user);
                return userList;
            }
        };
        return null;
    }
}
