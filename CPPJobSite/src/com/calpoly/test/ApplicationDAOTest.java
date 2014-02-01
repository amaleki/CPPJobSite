package com.calpoly.test;

import static org.junit.Assert.assertNotNull;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.calpoly.dao.jdbc.JdbcApplicationDAO;
import com.calpoly.model.Application;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:WebContent/WEB-INF/spring/config.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class ApplicationDAOTest {
	
	@Autowired
	private JdbcApplicationDAO applicationDAO;

	@Test
	public void insertAndRetrieve(){
	
		Application application = new Application(0,0,"resume","coverletter", new Date());
		
		applicationDAO.insert(application);
		
		List<Application> applications  = applicationDAO.findAll();
		
		System.out.println(applications.toString());	
		
		assertNotNull(applications);
					
	}
	
	@Test 
	public void insertAndFindByJobId(){
		
		Application application = new Application(1,2,"resume","coverletter", new Date());
		
		applicationDAO.insert(application);
		
		List<Application> applications  = applicationDAO.findByJobId(1);
		
		System.out.println(applications.toString());
		
		assertNotNull(applications);
		
	}
	
	@Test
	public void insertAndFindByUserId(){
		
		
		Application application = new Application(1,2,"resume","coverletter", new Date());
		
		applicationDAO.insert(application);
		
		List<Application> applications  = applicationDAO.findByUserId(2);
		
		System.out.println(applications.toString());
		
		assertNotNull(applications);
		
	}
	
}
