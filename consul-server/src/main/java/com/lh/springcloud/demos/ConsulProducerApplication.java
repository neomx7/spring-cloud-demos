package com.lh.springcloud.demos;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableDiscoveryClient
@EnableScheduling
@RefreshScope
public class ConsulProducerApplication {
//        implements CommandLineRunner

//    @Value("${foobar}")
//    private String foobar;


    public static void main(String[] args) {
        SpringApplication.run(ConsulProducerApplication.class, args);
//        new SpringApplicationBuilder(Application.class).web(true).run(args);
//        new SpringApplicationBuilder(ConsulServerApplication.class).web(WebApplicationType.SERVLET).run(args);

    }

//    @Override
//    public void run(String... args) throws Exception {
//        System.out.println("foobar:" + foobar);
//    }
}