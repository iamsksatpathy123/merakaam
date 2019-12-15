package com.bloodDoner.repository;

import java.util.List;

import com.bloodDoner.entity.bloodDoner;



public interface IDonorDAO {
	 List<bloodDoner> getAlldoner();
	    bloodDoner getbloodDonerById(int donorId);
	    void createDoner(bloodDoner doner);
	    void updateDoner(bloodDoner doner);
	    void deleteDoner(int donorId);
	 

}
