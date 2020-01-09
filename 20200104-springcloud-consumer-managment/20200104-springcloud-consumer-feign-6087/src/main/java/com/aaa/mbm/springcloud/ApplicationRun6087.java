package com.aaa.mbm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @program: 20200104-springcloud-ribbo-custom
 * @ClassName: ApplicationRun6087
 * @Package: com.aaa.mbm.springcloud
 * @description
 * @author: mbm
 * @create: 2020-01-07 20:02
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ApplicationRun6087 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun6087.class,args);
    }

}
