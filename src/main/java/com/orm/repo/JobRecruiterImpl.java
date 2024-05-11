package com.orm.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.orm.entity.JobRecruiter;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class JobRecruiterImpl implements JobRecruiterRepo{

	
	@PersistenceContext
	private EntityManager entitymanager;
	
	public JobRecruiter createJobRecruiter(JobRecruiter jobrec) {
		entitymanager.persist(jobrec);
		return jobrec;
		
	}


	public List<JobRecruiter> getAllJobRecruiter() {
		Query query = entitymanager.createQuery("from JobRecruiter ");
		return query.getResultList();
		
	}
	
	@Override
	public List<Integer> getIdListtt() {
		List<Integer> idList =  entitymanager.createQuery("select providerId from JobRecruiter").getResultList();
		return idList;
	}

	

}
