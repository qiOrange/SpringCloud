package com.github.springcloud.service;

import java.util.List;

import com.github.springcloud.entities.Dept;

public interface DeptService {
	Integer addDept(Dept dept);
	
	Dept findById(Long id);
	
	List<Dept> findAll();
}
