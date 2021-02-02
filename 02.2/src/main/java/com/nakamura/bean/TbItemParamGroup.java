package com.nakamura.bean;

import java.io.Serializable;
import java.util.List;

public class TbItemParamGroup implements Serializable{
	private Integer id;
	private String groupName;
	private Long itemCatId;
//	private List<TbItemParamKey> keys;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Long getItemCatId() {
		return itemCatId;
	}

	public void setItemCatId(Long itemCatId) {
		this.itemCatId = itemCatId;
	}

//	public List<TbItemParamKey> getKeys() {
//		return keys;
//	}
//
//	public void setKeys(List<TbItemParamKey> keys) {
//		this.keys = keys;
//	}

	@Override
	public String toString() {
		return "TbItemParamGroup [id=" + id + ", groupName=" + groupName + ", itemCatId=" + itemCatId + "]";
	}

}
