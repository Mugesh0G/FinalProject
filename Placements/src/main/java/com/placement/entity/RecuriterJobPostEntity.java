package com.placement.entity;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class RecuriterJobPostEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int jobId;
	@Column
	private String jobName;
	@Column
	private String companyName;
	@Column
	private String jobSalary;
	@Column
	private String jobQualification;
	@Column
	private String jobDescription;
	@Column
	private String jobDeadline;
	
	
	
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getJobSalary() {
		return jobSalary;
	}
	public void setJobSalary(String jobSalary) {
		this.jobSalary = jobSalary;
	}
	public String getJobQualification() {
		return jobQualification;
	}
	public void setJobQualification(String jobQualification) {
		this.jobQualification = jobQualification;
	}
	public String getJobDescription() {
		return jobDescription;
	}
	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}
	public String getJobDeadline() {
		return jobDeadline;
	}
	public void setJobDeadline(String jobDeadline) {
		this.jobDeadline = jobDeadline;
	}
	@Override
	public String toString() {
		return "RecuriterJobPostEntity [jobId=" + jobId + ", jobName=" + jobName + ", companyName=" + companyName
				+ ", jobSalary=" + jobSalary + ", jobQualification=" + jobQualification + ", jobDescription="
				+ jobDescription + ", jobDeadline=" + jobDeadline + "]";
	}
	public RecuriterJobPostEntity(int jobId, String jobName, String companyName, String jobSalary,
			String jobQualification, String jobDescription, String jobDeadline) {
		super();
		this.jobId = jobId;
		this.jobName = jobName;
		this.companyName = companyName;
		this.jobSalary = jobSalary;
		this.jobQualification = jobQualification;
		this.jobDescription = jobDescription;
		this.jobDeadline = jobDeadline;
	}
	public RecuriterJobPostEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}