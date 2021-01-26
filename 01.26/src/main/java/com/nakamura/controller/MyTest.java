package com.nakamura.controller;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nakamura.service.StudentService;
import com.nakamura.serviceImpl.StudentServiceImpl;

public class MyTest {
	private StudentService service;
	@Test
	public void demo() {
		//这里就是创建spring对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService service = (StudentService) ac.getBean("studentService");
		service.addStudent();
	}
}
