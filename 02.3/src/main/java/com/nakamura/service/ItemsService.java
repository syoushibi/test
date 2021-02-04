package com.nakamura.service;

import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.nakamura.bean.Items;

public interface ItemsService {
	List<Items> findItemsAll();

	Items findItemsById(Integer id);

	int updateitem(Items item, MultipartFile pictureFile);
}
