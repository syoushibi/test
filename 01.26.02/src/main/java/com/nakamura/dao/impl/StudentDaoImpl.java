package com.nakamura.dao.impl;

import org.springframework.stereotype.Repository;

import com.nakamura.dao.StudentDao;
/*
 * 这里就相当于bean标签
 * <bean id="studentDaoImpl" 
 * class="com.nakamura.dao.impl.StudentDaoImpl">
 * == new StudentDaoImpl();
 */
@Repository
public class StudentDaoImpl implements StudentDao {

	public void addStudent() {
		System.out.println("dao addStudent");
		
	}

	public void deletStudent() {
		System.out.println("dao deletStudent");
		
	}

}
