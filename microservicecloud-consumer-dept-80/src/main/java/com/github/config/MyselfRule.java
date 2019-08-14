package com.github.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
/**
 * 自定义配置Rule 类
 * @author 小七
 *
 */
@Configuration
public class MyselfRule {
	
	@Bean
	public IRule myRule() {
		// 如果突然间一个服务挂了访问带挂的服务器会报错，出现错误页面
		// return new RoundRobinRule();
		// return new RandomRule(); //达到的目的，用我们重新选择的随机算法替代默认的轮询。
		// 如果突然间一个服务挂了访问带挂的服务器会报错，出现错误页面，但是过一下子他不会再访问挂的机器，不会显示出错误的页面。
		return new RandomRule_GMJ();
	}
}
