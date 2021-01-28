package com.nakamura.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nakamura.bean.Student;
import com.nakamura.dao.StudentDao;
import com.nakamura.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDao studentDao;
	@Override
	public List<Student> findStudent() {
		List<Student> student = studentDao.findStudent();
		
		return student;
	}

	@Override
	public int deletStudent(Integer id) {
		int i = studentDao.deletStudent(id);
		if(i>0) {
			System.out.println("删除成功");
		}else {
			System.out.println("删除失败");
		}
		return i;
	}

}
