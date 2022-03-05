package com.placement.placementservice;

import com.placement.entity.CollegeEntity;

public interface CollegeService {
	public void addCollegeDetails(CollegeEntity entityObj);
	public CollegeEntity findByCollegeEmailAndCollegePassword(String collegeEmail, String collegePassword);
	public CollegeEntity findByCollegeId(int id);
}
