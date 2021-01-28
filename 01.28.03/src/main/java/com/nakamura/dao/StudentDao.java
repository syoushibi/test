package com.nakamura.dao;

import java.util.ArrayList;
import java.util.List;

import com.nakamura.bean.Student;

public interface StudentDao {
	List<Student> findStudent();
	int deletStudent(Integer id);
}
