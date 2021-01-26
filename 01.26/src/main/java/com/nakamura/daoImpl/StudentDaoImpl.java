package com.nakamura.daoImpl;

import com.nakamura.dao.StudentDao;

public class StudentDaoImpl implements StudentDao {

	@Override
	public void addStudent() {
		System.out.println("我是Dao层 我可以添加学生");

	}

}
