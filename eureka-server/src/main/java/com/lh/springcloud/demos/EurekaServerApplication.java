package com.lh.springcloud.demos;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Configuration;

@EnableEurekaServer
//@Configuration
//@EnableAutoConfiguration
//@EnableDiscoveryClient
@SpringBootApplication
public class EurekaServerApplication {
    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
//        new SpringApplicationBuilder(Application.class).web(true).run(args);
        new SpringApplicationBuilder(EurekaServerApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}