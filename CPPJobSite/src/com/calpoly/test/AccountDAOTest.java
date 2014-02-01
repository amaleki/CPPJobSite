package com.calpoly.test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.calpoly.dao.jdbc.JdbcAccountDAO;
import com.calpoly.model.Account;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:WebContent/WEB-INF/spring/config.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class AccountDAOTest {
	
	@Autowired
	private JdbcAccountDAO accountDAO;
	
	@Test
	public void insertAndRetreive(){
		
		Account account = new Account(0,"arian", "maleki","ahmaleki@gmail.com","714-555-1212","student", "password");
		
		accountDAO.insert(account);
		
		List<Account> accounts = accountDAO.findAll();
		
		System.out.println("size:" + accounts.toString());
		
		assertNotNull(accounts);
		
	}

	public void setAccountDAO(JdbcAccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

}
