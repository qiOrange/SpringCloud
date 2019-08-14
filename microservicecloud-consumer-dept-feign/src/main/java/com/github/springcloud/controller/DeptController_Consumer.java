package com.github.springcloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.springcloud.entities.Dept;
import com.github.springcloud.service.DeptClientService;

@RestController
public class DeptController_Consumer {
	@Autowired
	private DeptClientService service;

	@PostMapping(path = "/consumer/dept/add")
	public Integer add(Dept dept) {
		return this.service.addDept(dept);
	}

	@GetMapping(path = "/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		return this.service.findById(id);
	}

	@GetMapping(path = "/consumer/dept/list")
	public List<Dept> list(Dept dept) {
		return this.service.findAll();
	}


}
