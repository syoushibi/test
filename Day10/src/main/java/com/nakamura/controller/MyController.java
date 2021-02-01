package com.nakamura.controller;

import java.util.ArrayList;
import java.util.Date;
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
		List<Student> list = service.findStudentAll();
		for(Student stu:list) {
			System.out.println(stu);
		}
	}
	@Test
	public void demo2() {
		Student stu = service.findStudentById(1);
		System.out.println(stu);
	}
	@Test
	public void demo3() {
		Student s = new Student();
		s.setName("maeda");
		s.setScore(55d);
		Date date = new Date();
		s.setCreated(date);
		service.addStudent(s );
	}
	@Test
	public void demo4() {
		Student s = new Student();
		s.setId(4);
		s.setName("maeda2");
		s.setScore(55d);
		Date date = new Date();
		s.setCreated(date);
		service.updateStudent(s);
	}
	@Test
	public void demo5() {
		service.deleteStudent(4);
	}
	@Test
	public void demo6() {
		List<Student> list = service.findLikeByUserName("naka");
		for(Student stu:list) {
			System.out.println(stu);
		}
	}
	@Test
	public void demo7() {
		Student s = new Student();
		
		s.setScore(99d);
		List<Student> list = service.findStudentBySearch(s);
		for(Student stu:list) {
			System.out.println(stu);
		}
	}
	@Test
	public void demo8() {
		List<Integer> ids = new ArrayList<Integer>();
		ids.add(6);
		ids.add(7);
		service.deleteStudentSelet(ids );
	}
}
