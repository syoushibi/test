package com.nakamura.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nakamura.bean.TbItemParamGroup;
import com.nakamura.bean.TbItemParamKey;
import com.nakamura.mapper.GroupMapper;
import com.nakamura.service.GroupService;
@Service
public class GroupServiceImpl implements GroupService {

	@Autowired
	private GroupMapper groupMapper;
//	@Override
//	public TbItemParamGroup findGroupById(Integer id) {
//		TbItemParamGroup findGroupById = groupMapper.findGroupById(id);
//		return findGroupById;
//	}
	@Override
	public TbItemParamKey findParamKeyById(Integer groupId) {
		TbItemParamKey keyById = groupMapper.findParamKeyById(groupId);
		return keyById;
	}

}
