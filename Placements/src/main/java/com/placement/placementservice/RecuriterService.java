package com.placement.placementservice;

import java.util.List;


import com.placement.entity.RecuriterEntity;


public interface RecuriterService {

	public void addRecuriterDetails(RecuriterEntity entityObj);
	public RecuriterEntity findByCompanyEmailAndCompanyPassword(String companyEmail,String companyPassword );
	public RecuriterEntity addJobDetails(RecuriterEntity entity);
	public RecuriterEntity findByCompanyId(int id);
	public List<RecuriterEntity>displayRecuriterList();
}
