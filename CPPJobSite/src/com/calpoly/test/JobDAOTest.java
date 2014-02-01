package com.calpoly.test;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.calpoly.dao.jdbc.JdbcJobDAO;
import com.calpoly.model.Job;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:WebContent/WEB-INF/spring/config.xml"})
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = true)
@Transactional
public class JobDAOTest {

	@Autowired
	private JdbcJobDAO jobDAO;

	@Test
	public void insertAndRetrieve(){
	
		Job job = new Job(0,"Software Intern", "Join a great team helping develop cool software", "Requirements", "Hourly", "Brea", "CA", "OP", 0, new Date());
		
		jobDAO.insert(job);
		
		List<Job> jobs = jobDAO.findAll();
		
		System.out.println(jobs.toString());
		
	}
	
	public void setJobDAO(JdbcJobDAO jobDAO) {
		this.jobDAO = jobDAO;
	}
	
}
