package com.placement.placementserviceimplementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.placement.entity.CollegeEntity;
import com.placement.placementservice.CollegeService;
import com.placement.repository.CollegeRepository;
@Service
public class CollegeServiceImplementation implements CollegeService
{
	@Autowired
	CollegeRepository collegeRepository;
	

	@Override
	public void addCollegeDetails(CollegeEntity entityObj) {
		
		collegeRepository.save(entityObj);
	}

	@Override
	public CollegeEntity findByCollegeEmailAndCollegePassword(String collegeEmail, String collegePassword) {
		
		return collegeRepository.findByCollegeEmailAndCollegePassword(collegeEmail, collegePassword);
	}

	@Override
	public CollegeEntity findByCollegeId(int id) {
		
		return collegeRepository.findByCollegeId(id);
	}

}
