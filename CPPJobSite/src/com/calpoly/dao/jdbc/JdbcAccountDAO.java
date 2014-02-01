package com.calpoly.dao.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.calpoly.dao.AccountDAO;
import com.calpoly.model.Account;

public class JdbcAccountDAO implements AccountDAO {
	
	private JdbcTemplate jdbcTemplate;

	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void insert(Account account){
		
		this.jdbcTemplate.update("insert into account (userid, firstname, lastname, email, phone, type, password) values (?,?,?,?,?,?,?)",
								 account.getUserId(),
								 account.getFirstname(),
								 account.getLastname(),
								 account.getEmail(),
								 account.getPhone(),
								 account.getAccountType(),
								 account.getPassword());

	}
	
	public void update(Account account){
		
	}
	
	public Account findByEmail(String email){
		
		Account account = this.jdbcTemplate.queryForObject(
				"select userid,  firstname, lastname, phone, type, email, password from account where email = ?", 
				new Object[]{email},
				new RowMapper<Account>() {
						public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
							Account account = new Account();
							account.setUserId(rs.getLong("userid"));
							account.setFirstname(rs.getString("firstname"));
							account.setLastname(rs.getString("lastname"));
							account.setEmail(rs.getString("email"));
							account.setPhone(rs.getString("phone"));
							account.setAccountType(rs.getString("type"));
							account.setPassword(rs.getString("password"));
							return account;
						}
				});
		
		return account;
	}
	
	public List<Account> findAll(){
		
		List<Account> account = this.jdbcTemplate.query(
		        "select userid, firstname, lastname, email, phone, type, password from account",
		        new RowMapper<Account>() {
		            public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
		            	Account account = new Account();
		            	account.setUserId(rs.getLong("userid"));
		            	account.setFirstname(rs.getString("firstname"));
		            	account.setLastname(rs.getString("lastname"));
		            	account.setEmail(rs.getString("email"));
		            	account.setPhone(rs.getString("phone"));
		            	account.setAccountType(rs.getString("type"));
		            	account.setPassword(rs.getString("password"));
		                return account;
		            }
		        });
		
		return account;
		
	}
}
