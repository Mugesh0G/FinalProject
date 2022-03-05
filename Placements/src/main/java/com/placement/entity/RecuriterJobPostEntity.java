package com.placement.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
	@Column
	private String applyStatus = "Applied!!";
	
	@ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	List<StudentEntity>studentList;
	
	public String getApplyStatus() {
		return applyStatus;
	}
	public void setApplyStatus(String applyStatus) {
		this.applyStatus = applyStatus;
	}
	public List<StudentEntity> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<StudentEntity> studentList) {
		this.studentList = studentList;
	}
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
				+ jobDescription + ", jobDeadline=" + jobDeadline + ", applyStatus=" + applyStatus + ", studentList="
				+ studentList + "]";
	}
	public RecuriterJobPostEntity(int jobId, String jobName, String companyName, String jobSalary,
			String jobQualification, String jobDescription, String jobDeadline, String applyStatus,
			List<StudentEntity> studentList) {
		super();
		this.jobId = jobId;
		this.jobName = jobName;
		this.companyName = companyName;
		this.jobSalary = jobSalary;
		this.jobQualification = jobQualification;
		this.jobDescription = jobDescription;
		this.jobDeadline = jobDeadline;
		this.applyStatus = applyStatus;
		this.studentList = studentList;
	}
	public RecuriterJobPostEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}