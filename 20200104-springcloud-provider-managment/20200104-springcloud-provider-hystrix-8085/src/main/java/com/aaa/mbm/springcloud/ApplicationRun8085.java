package com.aaa.mbm.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: 20200104-springcloud-ribbo-custom
 * @ClassName: Application8085
 * @Package: com.aaa.mbm.springclooud
 * @description
 * @author: mbm
 * @create: 2020-01-07 20:56
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.aaa.mbm.springcloud.mapper")
@EnableCircuitBreaker
public class ApplicationRun8085 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationRun8085.class,args);
    }

}
