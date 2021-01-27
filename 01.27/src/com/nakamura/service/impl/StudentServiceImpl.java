package com.nakamura.service.impl;

import com.nakamura.service.StudentService;

public class StudentServiceImpl implements StudentService {

	@Override
	public void addStudent() {
		//变成了动态代理之后就不用在这里写很多代码了
		System.out.println("service addStudent");

	}

}
