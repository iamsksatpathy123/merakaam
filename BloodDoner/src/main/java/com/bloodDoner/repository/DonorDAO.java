package com.bloodDoner.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bloodDoner.entity.bloodDoner;


@Repository
@Transactional
public class DonorDAO implements IDonorDAO{
    @PersistenceContext
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<bloodDoner> getAlldoner() {
		String hql = "FROM bloodDoner as atcl ORDER BY atcl.donorId DESC";
		return (List<bloodDoner>) entityManager.createQuery(hql).getResultList();
	}

	@Override
	public bloodDoner getbloodDonerById(int donorId) {
		return entityManager.find(bloodDoner.class, donorId);
			}

	@Override
	public void createDoner(bloodDoner doner) {
		entityManager.persist(doner);
				
	}

	@Override
	public void updateDoner(bloodDoner doner) {
		bloodDoner artcl = getbloodDonerById(doner.getDonorId());
		artcl.setBloodGroup(doner.getBloodGroup());
		artcl.setUserName(doner.getUserName());
	  entityManager.flush();
	
	}

	@Override
	public void deleteDoner(int donorId) {
		entityManager.remove(getbloodDonerById(donorId));

	}

}
