package com.richy.consumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

	@Autowired
	RestTemplate restTemplate;
	@Autowired
    private DiscoveryClient discoveryClient;
	
	@RequestMapping("/hello")
	public String hello() {
		// 根据服务名称，获取服务实例
        List<ServiceInstance> instances = discoveryClient.getInstances("service-provider");
        // 因为只有一个UserService,因此我们直接get(0)获取
        ServiceInstance instance = instances.get(0);
        // 获取ip和端口信息
        String baseUrl = "http://"+instance.getHost() + ":" + instance.getPort()+"/index/";
		return restTemplate.getForEntity(baseUrl, String.class).getBody();
	}
}
