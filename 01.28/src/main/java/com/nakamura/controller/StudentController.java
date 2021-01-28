package com.nakamura.controller;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nakamura.service.StudentService;
import com.nakamura.service.TeacherService;

public class StudentController {
	@Test
	public void demo() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService service = (StudentService) ac.getBean("studentService");
		TeacherService service1= (TeacherService) ac.getBean("teacherService");
		service.deletStudent(1);
		service1.addTeacher();
	}
}
