package com.lh.springcloud.demos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulConsumerApplication {
    public static void main(String[] args) {
       SpringApplication.run(ConsulConsumerApplication.class, args);
//        new SpringApplicationBuilder(Application.class).web(true).run(args);
//        new SpringApplicationBuilder(ConsulServerApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}