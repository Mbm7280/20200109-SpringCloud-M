package com.aaa.mbm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @program: 20200104-springcloud-ribbo-custom
 * @ClassName: ApplicationRun6082
 * @Package: com.aaa.mbm
 * @description
 * @author: mbm
 * @create: 2020-01-07 15:12
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ApplicationRun6082 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun6082.class,args);
    }

}
