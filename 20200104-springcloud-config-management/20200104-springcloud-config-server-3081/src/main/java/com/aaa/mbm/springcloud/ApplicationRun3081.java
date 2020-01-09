package com.aaa.mbm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @program: 20200104-springcloud-ribbo-custom
 * @ClassName: ApplicationRun3081
 * @Package: com.aaa.mbm.springcloud
 * @description
 * @author: mbm
 * @create: 2020-01-09 13:53
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableConfigServer
public class ApplicationRun3081 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun3081.class,args);
    }

}
