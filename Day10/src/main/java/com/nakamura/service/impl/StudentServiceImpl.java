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
	public List<Student> findStudentAll() {
		List<Student> list = studentMapper.findStudentAll();
		
		return list;
	}
	@Override
	public Student findStudentById(Integer id) {
		Student s = studentMapper.findStudentById(id);
		return s;
	}
	@Override
	public void addStudent(Student s) {
		int i = studentMapper.addStudent(s);
		System.out.println(i);
		
	}
	@Override
	public void deleteStudent(Integer id) {
		int count = studentMapper.deleteStudent(id);
		System.out.println(count);
		
	}
	@Override
	public void updateStudent(Student s) {
		int count = studentMapper.updateStudent(s);
		System.out.println(count);
		
	}
	@Override
	public List<Student> findLikeByUserName(String username) {
		List<Student> list = studentMapper.findLikeByUserName(username);
		return list;
	}
	@Override
	public List<Student> findStudentBySearch(Student s) {
		List<Student> list = studentMapper.findStudentBySearch(s);
		return list;
	}
	@Override
	public void deleteStudentSelet(List<Integer> ids) {
		int count = studentMapper.deleteStudentSelet(ids);
		System.out.println(count);
		
	}

}
