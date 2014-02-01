package com.calpoly.dao.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.calpoly.dao.ApplicationDAO;
import com.calpoly.model.Account;
import com.calpoly.model.Application;

public class JdbcApplicationDAO implements ApplicationDAO {
	
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void insert(Application application){
		
		this.jdbcTemplate.update("insert into application (jobid, userid, resume, coverletter, create_date) values (?,?,?,?,?)",
				 application.getJobid(),
				 application.getUserid(),
				 application.getResume(),
				 application.getCoverletter(),
				 application.getCreatedate());
	
	}
	
	public void update(){
		
	}
	
	public List<Application> findByJobId(long jobid){
		
		List<Application> applications = this.jdbcTemplate.query(
		        "select jobid, userid, resume, coverletter, create_date from application where jobid = ?",
		        new Object[]{jobid},
		        new RowMapper<Application>() {
		            public Application mapRow(ResultSet rs, int rowNum) throws SQLException {
		            	Application application = new Application();
		            	application.setJobid(rs.getLong("jobid"));
		            	application.setUserid(rs.getLong("userid"));
		            	application.setResume(rs.getString("resume"));
		            	application.setCoverletter(rs.getString("coverletter"));
		            	application.setCreatedate(rs.getDate("create_date"));
		                return application;
		            }
		        });
		
		return applications;
	
	}
	
	public List<Application> findByUserId(long userid){
		
		List<Application> applications = this.jdbcTemplate.query(
		        "select jobid, userid, resume, coverletter, create_date from application where userid = ?",
		        new Object[]{userid},
		        new RowMapper<Application>() {
		            public Application mapRow(ResultSet rs, int rowNum) throws SQLException {
		            	Application application = new Application();
		            	application.setJobid(rs.getLong("jobid"));
		            	application.setUserid(rs.getLong("userid"));
		            	application.setResume(rs.getString("resume"));
		            	application.setCoverletter(rs.getString("coverletter"));
		            	application.setCreatedate(rs.getDate("create_date"));
		                return application;
		            }
		        });
		
		return applications;
	}
	
	public List<Application> findAll(){
		
		List<Application> applications = this.jdbcTemplate.query(
		        "select jobid, userid, resume, coverletter, create_date from application",
		        new RowMapper<Application>() {
		            public Application mapRow(ResultSet rs, int rowNum) throws SQLException {
		            	Application application = new Application();
		            	application.setJobid(rs.getLong("jobid"));
		            	application.setUserid(rs.getLong("userid"));
		            	application.setResume(rs.getString("resume"));
		            	application.setCoverletter(rs.getString("coverletter"));
		            	application.setCreatedate(rs.getDate("create_date"));
		                return application;
		            }
		        });
		
		return applications;		
	}
}
