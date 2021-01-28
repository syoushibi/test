package com.nakamura.controller;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nakamura.bean.Student;
import com.nakamura.rowmapper.MyRowMapper;
import com.nakamura.service.StudentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class StudentController {
	@Autowired
	JdbcTemplate template;
	@Autowired
	private StudentService service;
	@Test
	public void demo() {
		//创建一个spring的数据库连接池对象
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		//配置数据库连接池的基本信息
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost/day06");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		//创建一个spring内置的对象
		JdbcTemplate template = new JdbcTemplate();
		//spring默认封装操作数据库的对象
		template.setDataSource(dataSource);
		int i = template.update("INSERT INTO student (name,age,mark) value (?,?,?)","nakamura",33,99);
		System.out.println(i);
	}
	//增加
	@Test
	public void demo1() {
		int i = template.update("INSERT INTO student (name,age,mark) value (?,?,?)","suda",28,99);
		System.out.println(i);
	}
	//删除
	@Test
	public void demo2() {
		int i = template.update("DELETE FROM student WHERE id = ?",2);
		System.out.println(i);
	}
	//修改
	@Test
	public void demo3() {
		int i = template.update("UPDATE student SET name=? WHERE id = ?","maeda",6);
		System.out.println(i);
	}
	//查询
	@Test
	public void demo4() {
		List<Student> list = template.query("SELECT * FROM student",new MyRowMapper());
		for(Student stu:list) {
			System.out.println(stu);
		}
	}
	@Test
	public void demo5() {
		List<Student> student = service.findStudent();
		for(Student stu:student) {
			System.out.println(stu);
		}
	}
	@Test
	public void demo6() {
		int i = service.deletStudent(7);
		System.out.println(i);
	}
	
}
