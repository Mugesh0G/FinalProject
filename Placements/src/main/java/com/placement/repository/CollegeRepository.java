package com.placement.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.placement.entity.CollegeEntity;
import com.placement.entity.RecuriterEntity;

public interface CollegeRepository extends JpaRepository<CollegeEntity, Integer> {
	public CollegeEntity findByCollegeEmailAndCollegePassword(String collegeEmail, String collegePassword);
	
	public CollegeEntity findByCollegeId(int id);

}
