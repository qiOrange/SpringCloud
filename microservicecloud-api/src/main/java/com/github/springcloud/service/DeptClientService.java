package com.github.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.github.springcloud.entities.Dept;

@FeignClient(value = "MICROSERVICECLOUD-DEPT")
public interface DeptClientService {

	@PostMapping(path = "/dept/add")
	Integer addDept(Dept dept);

	@GetMapping(path = "/dept/get/{id}")
	Dept findById(@PathVariable("id") Long id);

	@GetMapping(path = "/dept/list")
	List<Dept> findAll();
}
