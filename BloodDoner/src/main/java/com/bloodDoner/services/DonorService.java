package com.bloodDoner.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bloodDoner.entity.bloodDoner;
import com.bloodDoner.repository.IDonorDAO;

@Service
public class DonorService implements IDonorService{

	@Autowired
	private IDonorDAO donorDAO;
	@Override
	public List<bloodDoner> getAlldoner() {
		
		return donorDAO.getAlldoner();
	}

	@Override
	public bloodDoner getbloodDonerById(int donorId) {
		bloodDoner obj = donorDAO.getbloodDonerById(donorId);
		return obj;
	
	}

	@Override
	public void createDoner(bloodDoner doner) {
	
		donorDAO.createDoner(doner);
	}

	@Override
	public void updateDoner(bloodDoner doner) {
	donorDAO.updateDoner(doner);
		
	}

	@Override
	public void deleteDoner(int donorId) {
		donorDAO.deleteDoner(donorId);
		
	}

}
