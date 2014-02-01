package com.calpoly.dao.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.calpoly.model.Company;
import com.calpoly.model.Job;

public class JdbcJobDAO {

	private JdbcTemplate jdbcTemplate;

	public void insert(Job job){
		this.jdbcTemplate.update(
				"insert into job (jobid, title, description,requirements,rate,city,state,division,companyid,create_date) values (?,?,?,?,?,?,?,?,?,?)",
				job.getJobid(),
				job.getTitle(),
				job.getDescription(),
				job.getRequirements(),
				job.getRate(),
				job.getCity(),
				job.getState(),
				job.getDivision(),
				job.getCompanyid(),
				job.getCreate_date()
				);
	}
	
	public void update(){
		
	}
	
	public Job findById(long jobid){
		
		Job jobs = this.jdbcTemplate.queryForObject(
				"select jobid, title, description,requirements, rate, city, state, division, companyid, create_date from job where jobid = ?", 
				new Object[]{jobid},
				new RowMapper<Job>() {
						public Job mapRow(ResultSet rs, int rowNum) throws SQLException {
							Job job = new Job();
							job.setJobid(rs.getLong("jobid"));
							job.setTitle(rs.getString("title"));
							job.setDescription(rs.getString("description"));
							job.setRequirements(rs.getString("requirements"));
							job.setRate(rs.getString("rate"));
							job.setCity(rs.getString("city"));
							job.setState(rs.getString("state"));
							job.setDivision(rs.getString("division"));
							job.setCompanyid(rs.getLong("companyid"));
							job.setCreate_date(rs.getDate("create_date"));
							return job;
						}
				});
		
		return jobs;
		
	}
	
	public List<Job> findAll(){
		
		List<Job> jobs = this.jdbcTemplate.query(
		        "select jobid, title, description,requirements, rate, city, state, division, companyid, create_date from job",
		        new RowMapper<Job>() {
		            public Job mapRow(ResultSet rs, int rowNum) throws SQLException {
		            	Job job = new Job();
		            	job.setJobid(rs.getLong("jobid"));
		            	job.setTitle(rs.getString("title"));
		            	job.setDescription(rs.getString("description"));
		            	job.setRequirements(rs.getString("requirements"));
		            	job.setRate(rs.getString("rate"));
		            	job.setCity(rs.getString("city"));
		            	job.setState(rs.getString("state"));
		            	job.setDivision(rs.getString("division"));
		            	job.setCompanyid(rs.getLong("companyid"));
		            	job.setCreate_date(rs.getDate("create_date"));
		                return job;
		            }
		        });
		
		return jobs;
	}
	
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
}
