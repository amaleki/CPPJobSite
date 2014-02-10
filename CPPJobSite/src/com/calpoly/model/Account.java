package com.calpoly.model;

public class Account {
	
	private long userId;
	private String firstname;
	private String lastname;
	private String email;
	private String phone;
	private String accountType;
	private String password;
	private String favoriteIcecream;
	
	public Account(){
		
	}
	
	public Account(long userId, String firstname, String lastname,
			String email, String phone, String accountType, String password) {
		this.userId = userId;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.accountType = accountType;
		this.password = password;
	}
	
	public long getUserId() {
		return userId;
	}
	public void setUserId(long userId) {
		this.userId = userId;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Account [userId=" + userId + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", email=" + email + ", phone="
				+ phone + ", accountType=" + accountType + ", password="
				+ password + "]";
	}

}
