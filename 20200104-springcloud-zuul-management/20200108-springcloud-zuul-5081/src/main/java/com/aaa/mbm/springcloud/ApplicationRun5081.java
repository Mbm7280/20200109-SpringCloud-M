package com.aaa.mbm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @program: 20200104-springcloud-ribbo-custom
 * @ClassName: ApplicationRun5081
 * @Package: com.aaa.mbm.springcloud
 * @description
 * @author: mbm
 * @create: 2020-01-08 12:36
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableZuulProxy
@EnableDiscoveryClient
public class ApplicationRun5081 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun5081.class,args);
    }

}
