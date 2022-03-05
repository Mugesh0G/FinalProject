package com.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.placement.entity.RecuriterJobPostEntity;

public interface RecuriterJobRepository extends JpaRepository<RecuriterJobPostEntity, Integer> {
	
	public RecuriterJobPostEntity findByJobId(int id);

}
