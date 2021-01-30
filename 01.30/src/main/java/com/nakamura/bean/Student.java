package com.nakamura.bean;

import java.io.Serializable;

import com.mysql.fabric.xmlrpc.base.Data;

public class Student implements Serializable{
	private int id;
	private String name;
	private double score;
	private Data created;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public Data getCreated() {
		return created;
	}
	public void setCreated(Data created) {
		this.created = created;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", score=" + score + ", created=" + created + "]";
	}
	
}
