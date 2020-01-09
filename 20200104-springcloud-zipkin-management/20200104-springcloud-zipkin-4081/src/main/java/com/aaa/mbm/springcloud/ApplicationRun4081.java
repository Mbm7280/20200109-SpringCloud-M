package com.aaa.mbm.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin2.server.internal.EnableZipkinServer;

/**
 * @program: 20200104-springcloud-ribbo-custom
 * @ClassName: ApplicationRun4081
 * @Package: com.aaa.mbm.springcloud
 * @description
 * @author: mbm
 * @create: 2020-01-08 13:01
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableZipkinServer
public class ApplicationRun4081 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun4081.class,args);
    }

}
