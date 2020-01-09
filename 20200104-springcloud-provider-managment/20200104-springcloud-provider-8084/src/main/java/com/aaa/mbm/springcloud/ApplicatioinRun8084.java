package com.aaa.mbm.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @program: 20200104-springcloud-ribbo-custom
 * @ClassName: ApplicatioinRun8084
 * @Package: com.aaa.mbm.springcloud
 * @description
 * @author: mbm
 * @create: 2020-01-07 20:12
 * @Version: 1.0
 **/
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.aaa.mbm.springcloud.mapper")
public class ApplicatioinRun8084 {

    public static void main(String[] args) {
        SpringApplication.run(ApplicatioinRun8084.class,args);
    }

}
