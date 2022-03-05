package com.placement.entity;

import java.util.LinkedList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class RecuriterEntity 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int companyId;
	@Column
	private String companyName;
	@Column(unique = true)
	private String companyEmail;
	@Column
	private String companyPhoneNo;
	@Column
	private String recuriterName;
	@Column
	private String recuriterPhoneNo;
	@Column
	private String companyAddress;
	@Column
	private String companyCity;
	@Column
	private String companyCountry;
	@Column
	private String companyState;
	public RecuriterEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RecuriterEntity(int companyId, String companyName, String companyEmail, String companyPhoneNo,
			String recuriterName, String recuriterPhoneNo, String companyAddress, String companyCity,
			String companyCountry, String companyState, String companyPassword) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.companyEmail = companyEmail;
		this.companyPhoneNo = companyPhoneNo;
		this.recuriterName = recuriterName;
		this.recuriterPhoneNo = recuriterPhoneNo;
		this.companyAddress = companyAddress;
		this.companyCity = companyCity;
		this.companyCountry = companyCountry;
		this.companyState = companyState;
		this.companyPassword = companyPassword;
	}
	@Override
	public String toString() {
		return "RecuriterEntity [companyId=" + companyId + ", companyName=" + companyName + ", companyEmail="
				+ companyEmail + ", companyPhoneNo=" + companyPhoneNo + ", recuriterName=" + recuriterName
				+ ", recuriterPhoneNo=" + recuriterPhoneNo + ", companyAddress=" + companyAddress + ", companyCity="
				+ companyCity + ", companyCountry=" + companyCountry + ", companyState=" + companyState
				+ ", companyPassword=" + companyPassword + "]";
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyEmail() {
		return companyEmail;
	}
	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}
	public String getCompanyPhoneNo() {
		return companyPhoneNo;
	}
	public void setCompanyPhoneNo(String companyPhoneNo) {
		this.companyPhoneNo = companyPhoneNo;
	}
	public String getRecuriterName() {
		return recuriterName;
	}
	public void setRecuriterName(String recuriterName) {
		this.recuriterName = recuriterName;
	}
	public String getRecuriterPhoneNo() {
		return recuriterPhoneNo;
	}
	public void setRecuriterPhoneNo(String recuriterPhoneNo) {
		this.recuriterPhoneNo = recuriterPhoneNo;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public String getCompanyCity() {
		return companyCity;
	}
	public void setCompanyCity(String companyCity) {
		this.companyCity = companyCity;
	}
	public String getCompanyCountry() {
		return companyCountry;
	}
	public void setCompanyCountry(String companyCountry) {
		this.companyCountry = companyCountry;
	}
	public String getCompanyState() {
		return companyState;
	}
	public void setCompanyState(String companyState) {
		this.companyState = companyState;
	}
	public String getCompanyPassword() {
		return companyPassword;
	}
	public void setCompanyPassword(String companyPassword) {
		this.companyPassword = companyPassword;
	}
	@Column(unique = true)
	private String companyPassword;

	
	
	
	
	

}
