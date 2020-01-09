package com.aaa.mbm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: 20200104-springcloud-ribbo-custom
 * @ClassName: ApplicationRu6086
 * @Package: com.aaa.mbm.springcloud
 * @description
 *      ribbon脱离eureka的负载均衡
 * @author: mbm
 * @create: 2020-01-07 18:21
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationRu6086 {


    public static void main(String[] args) {
        SpringApplication.run(ApplicationRu6086.class,args);
    }

}
