package com.nakamura.controller;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nakamura.bean.Student;
import com.nakamura.service.StudentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MyController {
	@Autowired
	private StudentService service;
	@Test
	public void demo() {
		List<Student> findStudent = service.findStudent();
		for(Student stu:findStudent) {
			System.out.println(stu);
		}
	}
}
