package com.nakamura.dao;

public interface BankDao {
	void addMoney(String name,int money);
	void outMoney(String name,int money);
}	
