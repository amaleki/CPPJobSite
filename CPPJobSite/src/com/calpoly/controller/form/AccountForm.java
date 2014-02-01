package com.calpoly.controller.form;

public class AccountForm {
	private String email;
	private String firstname;
	private String lastname;
	private Type accountType;
	private String phone;
	private String password;
	
	public enum Type{
		Student,Company
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public Type getAccountType() {
		return accountType;
	}

	public void setAccountType(Type accountType) {
		this.accountType = accountType;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "AccountForm [email=" + email + ", firstname=" + firstname
				+ ", lastname=" + lastname + ", accountType=" + accountType
				+ ", phone=" + phone + ", password=" + password + "]";
	}
	
}
