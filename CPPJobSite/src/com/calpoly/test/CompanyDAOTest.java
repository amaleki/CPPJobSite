package com.calpoly.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.calpoly.dao.jdbc.JdbcAccountDAO;
import com.calpoly.dao.jdbc.JdbcCompanyDAO;
import com.calpoly.model.Company;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:WebContent/WEB-INF/spring/config.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class CompanyDAOTest {
	
	@Autowired
	private JdbcCompanyDAO companyDAO;

	@Test
	public void insertAndRetrieve(){
		
		Company company = new Company(0,
									  "Avery Product Corp", 
									  "http://www.avery.com", 
									  "50 Pointe Drive", 
									  "Brea", 
									  "CA", 
									  "92821");
		
		companyDAO.insert(company);
		
		List<Company> companies = companyDAO.findAll();
		
		System.out.println(companies.toString());
		
	}
	
	
	public void setCompanyDAO(JdbcCompanyDAO companyDAO) {
		this.companyDAO = companyDAO;
	}

}
