package com.aaa.mbm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @program: 20200104-springcloud-ribbo-custom
 * @ClassName: ApplicationRun7083
 * @Package: com.aaa.mbm.springcloud
 * @description
 * @author: mbm
 * @create: 2020-01-07 16:04
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class ApplicationRun7083 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun7083.class,args);
    }

}
