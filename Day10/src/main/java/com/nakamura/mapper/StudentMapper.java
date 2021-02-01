package com.nakamura.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.nakamura.bean.Student;

public interface StudentMapper {
	List<Student> findStudentAll();

	Student findStudentById(Integer id);

	int addStudent(Student s);

	int deleteStudent(Integer id);

	int updateStudent(Student s);

	List<Student> findLikeByUserName(String username);

	List<Student> findStudentBySearch(Student s);

	int deleteStudentSelet(@Param("ids")List<Integer> ids);
}
