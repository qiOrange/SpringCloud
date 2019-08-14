package com.github.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
//设值服务器端启动类，接收其他微服务注册进来
@EnableEurekaServer 
public class DeptProvider7003_APP {
	public static void main(String[] args) {
		SpringApplication.run(DeptProvider7003_APP.class, args);
	}
}
