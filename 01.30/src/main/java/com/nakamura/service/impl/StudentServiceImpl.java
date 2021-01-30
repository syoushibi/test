package com.nakamura.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nakamura.bean.Student;
import com.nakamura.mapper.StudentMapper;
import com.nakamura.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentMapper studentMapper;
	@Override
	public List<Student> findStudent() {
		List<Student> findStudent = studentMapper.findStudent();
		return findStudent;
	}

}
