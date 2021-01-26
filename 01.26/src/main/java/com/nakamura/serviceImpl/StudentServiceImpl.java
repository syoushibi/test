package com.nakamura.serviceImpl;

import com.nakamura.dao.StudentDao;
import com.nakamura.daoImpl.StudentDaoImpl;
import com.nakamura.service.StudentService;

public class StudentServiceImpl implements StudentService {
	private StudentDao studentDao;
	private String name;
	@Override
	
	public void addStudent() {
		System.out.println("我是Service层 我可以添加学生"+name);
		studentDao.addStudent();
	}

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void deletStudent() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateStudent() {
		// TODO Auto-generated method stub

	}

	@Override
	public void showStudent() {
		// TODO Auto-generated method stub

	}

	@Override
	public void showStudentById() {
		// TODO Auto-generated method stub

	}

}
