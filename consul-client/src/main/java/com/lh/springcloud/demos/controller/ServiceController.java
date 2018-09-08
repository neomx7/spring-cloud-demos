package com.lh.springcloud.demos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

//    @Autowired
//    private LoadBalancerClient loadBalancer;
//    @Autowired
//    private DiscoveryClient discoveryClient;
//
//    /**
//     * 获取所有服务
//     */
//    @RequestMapping("/services")
//    public Object services() {
//        return discoveryClient.getInstances("service-producer");
//    }
//
//    /**
//     * 从所有服务中选择一个服务（轮询）
//     */
//    @RequestMapping("/discover")
//    public Object discover() {
//        return loadBalancer.choose("service-producer").getUri().toString();
//    }

    @RequestMapping("/home")
    public String home() {
        return "hi ,i'm consul client";
    }

    @Autowired
    private LoadBalancerClient loadBalancer;

    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * 从所有服务中选择一个服务（轮询）
     */
    @RequestMapping("/discover")
    public Object discover() {
        return loadBalancer.choose("config-server").getUri().toString();
    }

    /**
     * 获取所有服务
     */
    @RequestMapping("/services")
    public Object services() {
        return discoveryClient.getInstances("config-server");
    }


}