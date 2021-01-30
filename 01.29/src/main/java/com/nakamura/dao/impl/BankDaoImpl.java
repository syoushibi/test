package com.nakamura.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nakamura.dao.BankDao;
@Repository
public class BankDaoImpl implements BankDao {
	@Autowired
	private JdbcTemplate template;
	@Override
	public void addMoney(String name, int money) {
		int i = template.update("UPDATE bank SET money = money + ? WHERE name = ?",money,name);

	}

	@Override
	public void outMoney(String name, int money) {
		int i = template.update("UPDATE bank SET money = money - ? WHERE name = ?",money,name);

	}

}
