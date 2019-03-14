package com.winnie.testserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//注意：早期的版本（Dalston及更早版本）还需在启动类上添加注解@EnableDiscoveryClient 或@EnableEurekaClient ，从Edgware开始，该注解可省略。
//@EnableDiscoveryClient
@SpringBootApplication
public class TestServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestServerApplication.class, args);
    }

}
