package com.nakamura.service;

public interface BankService {
	/**
	 * 
	 * @param sName 转账人
	 * @param tName 收钱人
	 * @param Money 转账金额
	 */
	void transfer(String sName,String tName,int money);
}
