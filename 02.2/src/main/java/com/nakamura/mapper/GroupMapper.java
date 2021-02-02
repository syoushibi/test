package com.nakamura.mapper;

import java.util.List;

import com.nakamura.bean.TbItemParamGroup;
import com.nakamura.bean.TbItemParamKey;

public interface GroupMapper {
//	TbItemParamGroup findGroupById(Integer id);
	TbItemParamKey findParamKeyById(Integer groupId);
}
