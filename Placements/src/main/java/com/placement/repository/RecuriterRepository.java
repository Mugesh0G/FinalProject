package com.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.placement.entity.RecuriterEntity;

public interface RecuriterRepository extends JpaRepository<RecuriterEntity, Integer> {
	public RecuriterEntity findByCompanyEmailAndCompanyPassword(String companyEmail, String companyPassword);
	
	public RecuriterEntity findByCompanyId(int id);
}
