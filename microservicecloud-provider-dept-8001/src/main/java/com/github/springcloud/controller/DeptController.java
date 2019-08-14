package com.github.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.springcloud.entities.Dept;
import com.github.springcloud.service.DeptService;

@RestController
public class DeptController {

	@Autowired
	private DeptService deptService;
	@Autowired
	private DiscoveryClient client;

	@PostMapping(path = "/dept/add")
	public Integer add(@RequestBody Dept dept) {
		return deptService.addDept(dept);
	}

	@GetMapping(path = "/dept/get/{id}")
	public Dept get(@PathVariable Long id) {
		return deptService.findById(id);
	}

	@GetMapping(path = "/dept/list")
	public List<Dept> list() {
		return deptService.findAll();
	}
	/**
	 * 暴露微服务发现
	 * @return
	 */
	@RequestMapping("/dept/discovery")
	public Object discovery() {
		List<String> list = client.getServices();
		System.out.println("***********" + list);
		List<ServiceInstance> srvList = client.getInstances("MICROSERVICECLOUD-DEPT");
		for (ServiceInstance serviceInstance : srvList) {
			System.out.println(serviceInstance.getServiceId() + "\t" + serviceInstance.getHost() + "\t"
					+ serviceInstance.getPort() + "\t" + serviceInstance.getUri() + "\t");
		}
		return this.client;
	}
}
