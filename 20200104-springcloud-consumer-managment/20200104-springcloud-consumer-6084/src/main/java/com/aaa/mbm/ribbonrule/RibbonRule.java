package com.aaa.mbm.ribbonrule;

import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @program: 20200104-springcloud-ribbo-custom
 * @ClassName: RibbonRule
 * @Package: com.aaa.mbm.ribbonrule
 * @description
 *      只能使用@Configuration 而不能使用@SpringBootApplication(爆冲突)
 *      官方声明使用这种方式
 * @author: mbm
 * @create: 2020-01-07 18:11
 * @Version: 1.0
 **/
@Configuration
public class RibbonRule {


    @Bean
    public RandomRule randomRule(){
        return new RandomRule();
    }

}
