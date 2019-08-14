package com.github.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.github.springcloud"})
@ComponentScan("com.github.springcloud")
public class DeptProviderFeign_APP {
	public static void main(String[] args) {
		SpringApplication.run(DeptProviderFeign_APP.class, args);
	}
}
