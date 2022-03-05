package com.placement.placementservice;

import java.util.List;

import com.placement.entity.RecuriterJobPostEntity;

public interface RecuriterJobService {
	
	public void addJobs(RecuriterJobPostEntity entityObj);
	public List<RecuriterJobPostEntity> viewAllJobs();
	public RecuriterJobPostEntity findByJobId(int id);
	public void deleteJob(int jobId);

}
