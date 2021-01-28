package com.nakamura.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nakamura.bean.Student;
import com.nakamura.dao.StudentDao;
import com.nakamura.rowmapper.MyRowMapper;
@Repository
public class StudentDaoImpl implements StudentDao {
	@Autowired
	JdbcTemplate template;
	@Override
	public List<Student> findStudent() {
		List<Student> list = template.query("SELECT * FROM student",new MyRowMapper());
		
		return list;
	}

	@Override
	public int deletStudent(Integer id) {
		int i = template.update("DELETE FROM student WHERE id = ?",id);
		return i;
	}

}
