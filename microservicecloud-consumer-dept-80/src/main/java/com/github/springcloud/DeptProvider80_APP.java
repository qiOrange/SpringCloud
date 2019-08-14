package com.github.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.github.config.MyselfRule;

@SpringBootApplication
@EnableEurekaClient
//注意MyselfRule 不能在DeptProvider80_APP 同包及子包下
@RibbonClient(name = "MICROSERVICECLOUD-DEPT", configuration = MyselfRule.class)
public class DeptProvider80_APP {
	public static void main(String[] args) {
		SpringApplication.run(DeptProvider80_APP.class, args);
	}
}
