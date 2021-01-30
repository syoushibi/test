package com.nakamura.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.nakamura.dao.BankDao;
import com.nakamura.service.BankService;
@Service
public class BankServiceImpl implements BankService {
	@Autowired
	private BankDao bankDao;
	@Transactional(isolation=Isolation.DEFAULT)
	@Override
	public void transfer(String sName, String tName, int money) {
		bankDao.outMoney(sName, money);
		bankDao.addMoney(tName, money);

	}

}
