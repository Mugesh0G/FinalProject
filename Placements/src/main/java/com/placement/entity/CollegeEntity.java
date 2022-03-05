package com.placement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CollegeEntity 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int collegeId;
	@Column
	private String collegeName;
	@Column
	private String collegeCode;
	@Column(unique = true)
	private String collegeEmail;
	@Column
	private String collegePhoneNo;
	@Column
	private String adminName;
	@Column
	private String collegeAddress;
	@Column
	private String collegeCity;
	@Column
	private String collegeCountry;
	@Column
	private String collegeState;
	@Column(unique = true)
	private String collegePassword;
	
	public int getCollegeId() {
		return collegeId;
	}
	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getCollegeCode() {
		return collegeCode;
	}
	public void setCollegeCode(String collegeCode) {
		this.collegeCode = collegeCode;
	}
	public String getCollegeEmail() {
		return collegeEmail;
	}
	public void setCollegeEmail(String collegeEmail) {
		this.collegeEmail = collegeEmail;
	}
	public String getCollegePhoneNo() {
		return collegePhoneNo;
	}
	public void setCollegePhoneNo(String collegePhoneNo) {
		this.collegePhoneNo = collegePhoneNo;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getCollegeAddress() {
		return collegeAddress;
	}
	public void setCollegeAddress(String collegeAddress) {
		this.collegeAddress = collegeAddress;
	}
	public String getCollegeCity() {
		return collegeCity;
	}
	public void setCollegeCity(String collegeCity) {
		this.collegeCity = collegeCity;
	}
	public String getCollegeCountry() {
		return collegeCountry;
	}
	public void setCollegeCountry(String collegeCountry) {
		this.collegeCountry = collegeCountry;
	}
	public String getCollegeState() {
		return collegeState;
	}
	public void setCollegeState(String collegeState) {
		this.collegeState = collegeState;
	}
	public String getCollegePassword() {
		return collegePassword;
	}
	public void setCollegePassword(String collegePassword) {
		this.collegePassword = collegePassword;
	}
	@Override
	public String toString() {
		return "CollegeEntity [collegeId=" + collegeId + ", collegeName=" + collegeName + ", collegeCode=" + collegeCode
				+ ", collegeEmail=" + collegeEmail + ", collegePhoneNo=" + collegePhoneNo + ", adminName=" + adminName
				+ ", collegeAddress=" + collegeAddress + ", collegeCity=" + collegeCity + ", collegeCountry="
				+ collegeCountry + ", collegeState=" + collegeState + ", collegePassword=" + collegePassword + "]";
	}
	public CollegeEntity(int collegeId, String collegeName, String collegeCode, String collegeEmail,
			String collegePhoneNo, String adminName, String collegeAddress, String collegeCity, String collegeCountry,
			String collegeState, String collegePassword) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.collegeCode = collegeCode;
		this.collegeEmail = collegeEmail;
		this.collegePhoneNo = collegePhoneNo;
		this.adminName = adminName;
		this.collegeAddress = collegeAddress;
		this.collegeCity = collegeCity;
		this.collegeCountry = collegeCountry;
		this.collegeState = collegeState;
		this.collegePassword = collegePassword;
	}
	public CollegeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
