package com.calpoly.dao.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.calpoly.model.Account;
import com.calpoly.model.Company;

public class JdbcCompanyDAO {
	
	private JdbcTemplate jdbcTemplate;

	public void insert(Company company){
		
		this.jdbcTemplate.update("insert into company (companyid, name, url, address, city, state, zip) values (?,?,?,?,?,?,?)",
								 company.getCompanyId(),
								 company.getName(),
								 company.getUrl(),
								 company.getAddress(),
								 company.getCity(),
								 company.getState(),
								 company.getZip());
		
	}
	
	public void update(Company company){
		
	}
	
	public Company findById(long companyid){
		
		Company company = this.jdbcTemplate.queryForObject(
				"select companyid, name, url, address, city, state, zip from company where companyid = ?", 
				new Object[]{companyid},
				new RowMapper<Company>() {
						public Company mapRow(ResultSet rs, int rowNum) throws SQLException {
							Company company = new Company();
							company.setCompanyId(rs.getLong("companyid"));
							company.setName(rs.getString("name"));
							company.setUrl(rs.getString("url"));
							company.setAddress(rs.getString("address"));
							company.setCity(rs.getString("city"));
							company.setState(rs.getString("state"));
							company.setZip(rs.getString("zip"));
							return company;
						}
				});
		
		return company;
	}
	
	public List<Company> findAll(){
		
		List<Company> companies = this.jdbcTemplate.query(
		        "select companyid, name, url, address, city, state, zip from company",
		        new RowMapper<Company>() {
		            public Company mapRow(ResultSet rs, int rowNum) throws SQLException {
		            	Company company = new Company();
		            	company.setCompanyId(rs.getLong("companyid"));
		            	company.setName(rs.getString("name"));
		            	company.setUrl(rs.getString("url"));
		            	company.setAddress(rs.getString("address"));
		            	company.setCity(rs.getString("city"));
		            	company.setState(rs.getString("state"));
		            	company.setZip(rs.getString("zip"));
		                return company;
		            }
		        });
		
		return companies;
	}
	
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
}
