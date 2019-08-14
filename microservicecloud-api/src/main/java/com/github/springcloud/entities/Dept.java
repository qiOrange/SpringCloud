package com.github.springcloud.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Dept implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private Long deptNo;
	private String deptName;
	private String dbSource;

}
