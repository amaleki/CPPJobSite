package com.calpoly.model;

public class Company {
	
	private long companyId;
	private String name;
	private String url;
	private String address;
	private String city;
	private String state;
	private String zip;
	
	public Company(){
		
	}
	
	public Company(long companyId, String name, String url, String address,
			String city, String state, String zip) {
		this.companyId = companyId;
		this.name = name;
		this.url = url;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	public long getCompanyId() {
		return companyId;
	}
	public void setCompanyId(long companyId) {
		this.companyId = companyId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	@Override
	public String toString() {
		return "Company [companyId=" + companyId + ", name=" + name + ", url="
				+ url + ", address=" + address + ", city=" + city + ", state="
				+ state + ", zip=" + zip + "]";
	}
	
}
