package com.lh.springcloud.demos;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

//@EnableEurekaServer
//@Configuration
//@EnableAutoConfiguration
//@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {
    public static void main(String[] args) {
//        SpringApplication.run(Application.class, args);
//        new SpringApplicationBuilder(Application.class).web(true).run(args);
        new SpringApplicationBuilder(ConfigServerApplication.class).web(true).run(args);
    }
}