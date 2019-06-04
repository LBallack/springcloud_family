package com.huawei.cn.servicelpb;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ServiceLpbApplication {
    @Value("${server.port}")
    String port;

    @RequestMapping("/lpb")
    public String lpb(@RequestParam(value = "name",defaultValue = "吕鹏博") String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

    public static void main(String[] args) {
        SpringApplication.run(ServiceLpbApplication.class, args);
    }

}
