package com.calpoly.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.calpoly.controller.form.AccountForm;
import com.calpoly.dao.jdbc.JdbcAccountDAO;
import com.calpoly.model.Account;

public class AccountService {
	
	@Autowired
	private JdbcAccountDAO accountDAO;

	public void createAccount(AccountForm accountForm){
		
		accountDAO.insert(new Account(0,
									  accountForm.getFirstname(),
									  accountForm.getLastname(),
									  accountForm.getEmail(),
									  accountForm.getPhone(),
									  "",
									  accountForm.getPassword()));
		
	}
	
	public Account findbyEmail(String email){
		
		return accountDAO.findByEmail(email);
		
	}
	
	public void setAccountDAO(JdbcAccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

}
