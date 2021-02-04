package com.nakamura.mapper;

import java.util.List;


import com.nakamura.bean.Items;

public interface ItemsMapper {
	List<Items> findItemsAll();

	Items findItemsById(Integer id);

	int updateitem(Items item);
}
