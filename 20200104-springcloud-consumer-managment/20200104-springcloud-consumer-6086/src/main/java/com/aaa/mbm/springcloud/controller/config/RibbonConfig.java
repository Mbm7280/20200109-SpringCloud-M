package com.aaa.mbm.springcloud.controller.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @program: 20200104-springcloud-ribbo-custom
 * @ClassName: RibbonConfig
 * @Package: com.aaa.mbm.springcloud.controller.config
 * @description
 * @author: mbm
 * @create: 2020-01-07 18:38
 * @Version: 1.0
 **/
@Configuration
public class RibbonConfig {


    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}
