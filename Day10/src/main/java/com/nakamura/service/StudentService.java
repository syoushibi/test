package com.nakamura.service;

import java.util.List;

import com.nakamura.bean.Student;

public interface StudentService {
	List<Student> findStudentAll();
	Student findStudentById(Integer id);
	void addStudent(Student s);
	void deleteStudent(Integer id);
	void updateStudent(Student s);
	List<Student> findLikeByUserName(String username);
	/**
	 * 
	 * @param s 输入多条件查询的条件 也可以不输
	 * @return 返回多条件查询的结果集
	 */
	List<Student> findStudentBySearch(Student s);
	
	void deleteStudentSelet(List<Integer> ids);
}
