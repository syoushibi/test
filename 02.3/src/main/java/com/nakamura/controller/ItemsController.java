package com.nakamura.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.nakamura.bean.Items;
import com.nakamura.service.ItemsService;

@Controller
public class ItemsController {
	@Autowired
	private ItemsService service;
	@RequestMapping("/item")
	public ModelAndView showIndex() {
		List<Items> items = service.findItemsAll();
		System.out.println(items);
		
		ModelAndView andView = new ModelAndView();
		andView.addObject("itemList",items);
		andView.setViewName("itemList");
		return andView;
	}
	@RequestMapping("/showUpdate")
	public String showUpdate(Integer id,Model model) {
		Items item = service.findItemsById(id);
		model.addAttribute("item",item);
		return "editItem";
	}
	@RequestMapping("/updateitem")
	public String updateitem(Items item,MultipartFile pictureFile) {
		int count = service.updateitem(item,pictureFile);
		if(count>0) {
			return "redirect:/item.action";
		}
		return "forward:/showUpdate.action?id"+item.getId();
	}
}
