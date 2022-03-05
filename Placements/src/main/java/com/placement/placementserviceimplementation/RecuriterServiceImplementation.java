package com.placement.placementserviceimplementation;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.placement.entity.RecuriterEntity;
import com.placement.placementservice.RecuriterService;
import com.placement.repository.RecuriterRepository;
@Service
public class RecuriterServiceImplementation implements RecuriterService {

	@Autowired
	RecuriterRepository recuriterRepository;
	
	@Override
	public void addRecuriterDetails(RecuriterEntity entityObj) {
		recuriterRepository.save(entityObj);
		
	}

	@Override
	public RecuriterEntity findByCompanyEmailAndCompanyPassword(String companyEmail,String companyPassword ) {
		// TODO Auto-generated method stub
		return recuriterRepository.findByCompanyEmailAndCompanyPassword(companyEmail, companyPassword) ;
	}

	@Override
	public RecuriterEntity addJobDetails(RecuriterEntity entity) {
		
		return recuriterRepository.save(entity);
	}

	@Override
	public RecuriterEntity findByCompanyId(int id) {
		// TODO Auto-generated method stub
		return recuriterRepository.findByCompanyId(id);
	}

	@Override
	public List<RecuriterEntity> displayRecuriterList() {
	
		return recuriterRepository.findAll();
	}

}
