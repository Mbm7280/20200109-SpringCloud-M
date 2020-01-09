package com.aaa.mbm.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: 20200104-springcloud-ribbo-custom
 * @ClassName: TestController
 * @Package: com.aaa.mbm.springcloud.controller
 * @description
 * @author: mbm
 * @create: 2020-01-09 15:03
 * @Version: 1.0
 **/
@RestController
public class TestController {

    @Value("${server.port}")
    private String port;

    @Value("${spring.application.name}")
    private String driver;

    @GetMapping("/test")
    public String getTry(){
        return port + "------------" + driver;
    }

}
