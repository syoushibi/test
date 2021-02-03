package com.nakamura.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nakamura.bean.Items;
import com.nakamura.mapper.ItemsMapper;
import com.nakamura.service.ItemsService;
@Service
public class ItemsServiceImpl implements ItemsService {
	@Autowired
	private ItemsMapper itemsMapper;
	@Override
	public List<Items> findItemsAll() {
		List<Items> itemsAll = itemsMapper.findItemsAll();
		return itemsAll;
	}

}
