package com.nakamura.service.impl;

import org.springframework.stereotype.Service;

import com.nakamura.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	
	@Override
	public void addStudent() {
		System.out.println("service addStudent");

	}

	@Override
	public void deletStudent() {
		System.out.println("service deletStudent");

	}

}
