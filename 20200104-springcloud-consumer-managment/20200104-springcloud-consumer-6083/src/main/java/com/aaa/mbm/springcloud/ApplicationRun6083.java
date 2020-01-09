package com.aaa.mbm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: 20200104-springcloud-ribbo-custom
 * @ClassName: ApplicationRun6083
 * @Package: com.aaa.mbm.springcloud
 * @description
 *      耦合度太高
 * @author: mbm
 * @create: 2020-01-07 17:46
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationRun6083 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun6083.class,args);
    }
}
