package com.nakamura.service;

import java.util.ArrayList;
import java.util.List;

import com.nakamura.bean.Student;

public interface StudentService {
	List<Student> findStudent();
	int deletStudent(Integer id);
	
}
