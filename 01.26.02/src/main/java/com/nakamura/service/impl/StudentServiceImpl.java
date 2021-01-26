package com.nakamura.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nakamura.dao.StudentDao;
import com.nakamura.service.StudentService;
/**
 * 这里就相当于bean标签 <bean id="studentServiceImpl"
 *  class="com.nakamura.dao.impl.StudentDaoImpl">
 *  == new StudentServiceImpl();
 * @author lenovo
 *
 */
@Service
public class StudentServiceImpl implements StudentService{
	/*
	 * 依赖注入，它会去找有没有bean标签或者Repository，如果有的话就赋值到
	 * 这里 就变成了private StudentDao studentDao = new StudentDaoImpl();
	 */
	@Autowired
	private StudentDao studentDao;
	public void addStudent() {
		System.out.println("service addStudent");
		studentDao.addStudent();
		
	}

	public void deletStudent() {
		System.out.println("service deletStudent");
		
	}

}
