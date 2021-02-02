package com.nakamura.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nakamura.bean.Student;

@Controller
public class MyController {
	@RequestMapping("/item/showIndex")
	public ModelAndView showIndex() {
		ArrayList<Student> list = new ArrayList<Student>();
		list.add(new Student(1,"nakamura",33,100));
		list.add(new Student(2,"suda",28,87));
		list.add(new Student(3,"maeda",23,67));
		ModelAndView andView = new ModelAndView();
		andView.addObject("list",list);
		andView.setViewName("/list.jsp");
		return andView;
		
	}
}
