package com.calpoly.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.calpoly.dao.jdbc.JdbcJobDAO;
import com.calpoly.model.Job;

public class JobService {

	@Autowired
	private JdbcJobDAO jobDAO;
	
	public List<Job> openJobs(){
		
		return jobDAO.findAll();
		
	}
	
}
