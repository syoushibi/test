package com.nakamura.controller;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.nakamura.bean.TbItemParamGroup;
import com.nakamura.bean.TbItemParamKey;
import com.nakamura.service.GroupService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class MyController {
	@Autowired
	private GroupService service;
//	@Test
//	public void demo() {
//		TbItemParamGroup findGroupById = service.findGroupById(1);
//		System.out.println(findGroupById);
//		List<TbItemParamKey> keys = findGroupById.getKeys();
//		for(TbItemParamKey key:keys) {
//			System.out.println(key);
//		}
//	}
	@Test
	public void demo2() {
		TbItemParamKey id = service.findParamKeyById(1);
		System.out.println(id);
		TbItemParamGroup group = id.getParamGroup();
		System.out.println(group);
	}
}
