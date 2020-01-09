package com.aaa.mbm.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: 20200104-springcloud-ribbo-custom
 * @ClassName: ApplicationRun8082
 * @Package: com.aaa.mbm.springcloud
 * @description
 * @author: mbm
 * @create: 2020-01-07 14:59
 * @Version: 1.0
 **/
@SpringBootApplication
@MapperScan("com.aaa.mbm.springcloud.mapper")
@EnableDiscoveryClient
public class ApplicationRun8082 {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8082.class,args);
    }
}
