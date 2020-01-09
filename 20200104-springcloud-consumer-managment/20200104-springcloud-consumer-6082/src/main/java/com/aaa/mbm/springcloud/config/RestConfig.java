package com.aaa.mbm.springcloud.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: 20200104-springcloud-ribbo-custom
 * @ClassName: RestConfig
 * @Package: com.aaa.mbm.springcloud.config
 * @description
 * @author: mbm
 * @create: 2020-01-07 15:14
 * @Version: 1.0
 **/

@Configuration
public class RestConfig {


    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
