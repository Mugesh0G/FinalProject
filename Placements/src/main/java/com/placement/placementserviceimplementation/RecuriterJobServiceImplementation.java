package com.placement.placementserviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.placement.entity.RecuriterJobPostEntity;
import com.placement.placementservice.RecuriterJobService;
import com.placement.repository.RecuriterJobRepository;
@Service
public class RecuriterJobServiceImplementation implements RecuriterJobService {
	
	@Autowired
	RecuriterJobRepository jobRepository;

	@Override
	public void addJobs(RecuriterJobPostEntity entityObj) {
		
		 jobRepository.save(entityObj);
		
	}

	@Override
	public List<RecuriterJobPostEntity> viewAllJobs() {
		
		return jobRepository.findAll();
	}

	@Override
	public void deleteJob(int jobId) {
		
		jobRepository.deleteById(jobId);
		
	}
	

	@Override
	public RecuriterJobPostEntity findByJobId(int id) {
	
		return jobRepository.findByJobId(id);
	}

}
