package com.placement.entity;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class StudentEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int studentId;
	@Column
	private String studentName;
	@Column(unique = true)
	private String studentEmail;
	@Column
	private String studentPhoneno;
	@Column
	private String studentDateOfBirth;
	@Column
	private String studentDegree;
	@Column
	private String studentBranch;
	@Column
	private int studentAcademicYear;
	@Column
	private String studentAddress;
	@Column
	private String studentCity;
	@Column
	private String studentCountry;
	@Column
	private String studentState;
	@Column(unique = true)
	private String studentPassword;
	@Column
	private boolean jobStatus;
	
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentEmail() {
		return studentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}
	public String getStudentPhoneno() {
		return studentPhoneno;
	}
	public void setStudentPhoneno(String studentPhoneno) {
		this.studentPhoneno = studentPhoneno;
	}
	public String getStudentDateOfBirth() {
		return studentDateOfBirth;
	}
	public void setStudentDateOfBirth(String studentDateOfBirth) {
		this.studentDateOfBirth = studentDateOfBirth;
	}
	public String getStudentDegree() {
		return studentDegree;
	}
	public void setStudentDegree(String studentDegree) {
		this.studentDegree = studentDegree;
	}
	public String getStudentBranch() {
		return studentBranch;
	}
	public void setStudentBranch(String studentBranch) {
		this.studentBranch = studentBranch;
	}
	public int getStudentAcademicYear() {
		return studentAcademicYear;
	}
	public void setStudentAcademicYear(int studentAcademicYear) {
		this.studentAcademicYear = studentAcademicYear;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	public String getStudentCountry() {
		return studentCountry;
	}
	public void setStudentCountry(String studentCountry) {
		this.studentCountry = studentCountry;
	}
	public String getStudentState() {
		return studentState;
	}
	public void setStudentState(String studentState) {
		this.studentState = studentState;
	}
	public String getStudentPassword() {
		return studentPassword;
	}
	public void setStudentPassword(String studentPassword) {
		this.studentPassword = studentPassword;
	}
	public boolean isJobStatus() {
		return jobStatus;
	}
	public void setJobStatus(boolean jobStatus) {
		this.jobStatus = jobStatus;
	}
	@Override
	public String toString() {
		return "StudentEntity [studentId=" + studentId + ", studentName=" + studentName + ", studentEmail="
				+ studentEmail + ", studentPhoneno=" + studentPhoneno + ", studentDateOfBirth=" + studentDateOfBirth
				+ ", studentDegree=" + studentDegree + ", studentBranch=" + studentBranch + ", studentAcademicYear="
				+ studentAcademicYear + ", studentAddress=" + studentAddress + ", studentCity=" + studentCity
				+ ", studentCountry=" + studentCountry + ", studentState=" + studentState + ", studentPassword="
				+ studentPassword + ", jobStatus=" + jobStatus + "]";
	}
	public StudentEntity(int studentId, String studentName, String studentEmail, String studentPhoneno,
			String studentDateOfBirth, String studentDegree, String studentBranch, int studentAcademicYear,
			String studentAddress, String studentCity, String studentCountry, String studentState,
			String studentPassword, boolean jobStatus) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.studentPhoneno = studentPhoneno;
		this.studentDateOfBirth = studentDateOfBirth;
		this.studentDegree = studentDegree;
		this.studentBranch = studentBranch;
		this.studentAcademicYear = studentAcademicYear;
		this.studentAddress = studentAddress;
		this.studentCity = studentCity;
		this.studentCountry = studentCountry;
		this.studentState = studentState;
		this.studentPassword = studentPassword;
		this.jobStatus = jobStatus;
	}
	public StudentEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
			
	
	
	
}
