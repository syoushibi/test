package com.nakamura.service.impl;

import com.nakamura.service.StudentService;

public class StudentServiceImpl implements StudentService {

	@Override
	public void addStudent() {
		System.out.println("service addStudent");

	}

	@Override
	public void deletStudent(Integer id) {
		System.out.println("service deletStudent");

	}

}
