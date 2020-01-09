package com.aaa.mbm.springcloud;

import com.aaa.mbm.springcloud.model.User;
import com.aaa.mbm.springcloud.service.SpringCloudHystrixFeignApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @program: 20200104-springcloud-ribbo-custom
 * @ClassName: ApplicationRun6088
 * @Package: com.aaa.mbm.springcloud
 * @description
 * @author: mbm
 * @create: 2020-01-07 20:35
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ApplicationRun6088 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun6088.class,args);
    }

}
