package com.calpoly.model;

import java.util.Date;

public class Application {
	private long jobid;
	private long userid;
	private String resume;
	private String coverletter;
	private Date createdate;
	
	public Application(){
		
	}
	
	public Application(long jobid, long userid, String resume,
			String coverletter, Date createdate) {
		this.jobid = jobid;
		this.userid = userid;
		this.resume = resume;
		this.coverletter = coverletter;
		this.createdate = createdate;
	}
	
	public long getJobid() {
		return jobid;
	}
	public void setJobid(long jobid) {
		this.jobid = jobid;
	}
	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public String getResume() {
		return resume;
	}
	public void setResume(String resume) {
		this.resume = resume;
	}
	public String getCoverletter() {
		return coverletter;
	}
	public void setCoverletter(String coverletter) {
		this.coverletter = coverletter;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	@Override
	public String toString() {
		return "Application [jobid=" + jobid + ", userid=" + userid
				+ ", resume=" + resume + ", coverletter=" + coverletter
				+ ", createdate=" + createdate + "]";
	}
		
}
