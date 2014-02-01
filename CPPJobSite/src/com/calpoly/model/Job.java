package com.calpoly.model;

import java.util.Date;

public class Job {
	private long jobid;
	private String title;
	private String description;
	private String requirements;
	private String rate;
	private String city;
	private String state;
	private String division;
	private long companyid;
	private Date create_date;
	
	public Job(){
	}
	
	public Job(long jobid, String title, String description,
			String requirements, String rate, String city, String state,
			String division, long companyid, Date create_date) {
		super();
		this.jobid = jobid;
		this.title = title;
		this.description = description;
		this.requirements = requirements;
		this.rate = rate;
		this.city = city;
		this.state = state;
		this.division = division;
		this.companyid = companyid;
		this.create_date = create_date;
	}
	
	public long getJobid() {
		return jobid;
	}
	public void setJobid(long jobid) {
		this.jobid = jobid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRequirements() {
		return requirements;
	}
	public void setRequirements(String requirements) {
		this.requirements = requirements;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
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
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}

	public long getCompanyid() {
		return companyid;
	}

	public void setCompanyid(long companyid) {
		this.companyid = companyid;
	}

	@Override
	public String toString() {
		return "Job [jobid=" + jobid + ", title=" + title + ", description="
				+ description + ", requirements=" + requirements + ", rate="
				+ rate + ", city=" + city + ", state=" + state + ", division="
				+ division + ", companyid=" + companyid + ", create_date="
				+ create_date + "]";
	}
	
}
