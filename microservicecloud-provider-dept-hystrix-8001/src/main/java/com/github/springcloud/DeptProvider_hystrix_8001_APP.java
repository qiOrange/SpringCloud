package com.github.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient//本服务启动后会自动注册进Eureka中
@EnableDiscoveryClient//服务发现
@EnableCircuitBreaker//对hystrix 熔断机制的支持
public class DeptProvider_hystrix_8001_APP {
	public static void main(String[] args) {
		SpringApplication.run(DeptProvider_hystrix_8001_APP.class, args);
	}
}
