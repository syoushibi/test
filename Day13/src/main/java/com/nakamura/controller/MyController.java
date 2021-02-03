package com.nakamura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.nakamura.bean.Items;
import com.nakamura.service.ItemsService;

@Controller
public class MyController {
	@Autowired
	private ItemsService service;
	@RequestMapping("/item")
	public ModelAndView showIndex() {
		List<Items> itemsAll = service.findItemsAll();
		ModelAndView andView = new ModelAndView();
		andView.addObject("itemList",itemsAll);
		andView.setViewName("itemList");
		return andView;
	}
}
