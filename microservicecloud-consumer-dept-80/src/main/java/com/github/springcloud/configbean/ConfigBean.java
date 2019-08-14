package com.github.springcloud.configbean;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;

@Configuration
public class ConfigBean {

	@Bean
	@LoadBalanced // spring cloud Ribbon是基于Netfix Ribbon实现的一套客户端 负载均衡的工具
	public RestTemplate geRestTemplate() {
		return new RestTemplate();
	}
	
	/*
	* 注意：不可以放在与注解下 @ComponentScan 的同包或者子包下，否则更换算法规则不起作用 （自定义算法也是一样）
	* 切换 访问的算法 很简单只需要换成我们要返回算法的实例即可
	* 默认有七个算法，可以自定义自己的算法
	* */
	@Bean
	public IRule myRule() {
		// 如果突然间一个服务挂了访问带挂的服务器会报错，出现错误页面
		// return new RoundRobinRule();
		// return new RandomRule(); //达到的目的，用我们重新选择的随机算法替代默认的轮询。
		// 如果突然间一个服务挂了访问带挂的服务器会报错，出现错误页面，但是过一下子他不会再访问挂的机器，不会显示出错误的页面。
		return new RetryRule();
	}

}
