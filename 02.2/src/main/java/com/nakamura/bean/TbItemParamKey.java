package com.nakamura.bean;

import java.io.Serializable;

public class TbItemParamKey implements Serializable{
	private Integer id;
	private String paramName;
	private TbItemParamGroup paramGroup;
	
	public TbItemParamGroup getParamGroup() {
		return paramGroup;
	}
	public void setParamGroup(TbItemParamGroup paramGroup) {
		this.paramGroup = paramGroup;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getParamName() {
		return paramName;
	}
	public void setParamName(String paramName) {
		this.paramName = paramName;
	}
	@Override
	public String toString() {
		return "TbItemParamKey [id=" + id + ", paramName=" + paramName + "]";
	}
	
}
