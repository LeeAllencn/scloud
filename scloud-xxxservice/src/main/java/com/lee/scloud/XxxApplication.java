package com.lee.scloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient	//声明一个Eureka Client
public class XxxApplication {

	public static void main(String[] args) {
        SpringApplication.run(XxxApplication.class, args);
    }
}
