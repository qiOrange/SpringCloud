package com.github.springcloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.github.springcloud.entities.Dept;

@Mapper
public interface DeptDao {
	Integer addDept(Dept dept);
	
	Dept findById(Long id);
	
	List<Dept> findAll();
}
