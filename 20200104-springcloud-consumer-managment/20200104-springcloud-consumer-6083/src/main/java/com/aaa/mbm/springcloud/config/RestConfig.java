package com.aaa.mbm.springcloud.config;

import com.netflix.loadbalancer.RandomRule;
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
 * @create: 2020-01-07 17:54
 * @Version: 1.0
 **/
@Configuration
public class RestConfig {


    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Bean
    public RandomRule randomRule(){
        return new RandomRule();
    }

}
