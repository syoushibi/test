package com.nakamura.service;

import java.util.List;

import com.nakamura.bean.TbItemParamGroup;
import com.nakamura.bean.TbItemParamKey;

public interface GroupService {
//	TbItemParamGroup findGroupById(Integer id);
	
	TbItemParamKey findParamKeyById(Integer groupId);
}
