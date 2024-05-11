package com.orm.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.orm.entity.JobRecruiter;
import com.orm.entity.JobSeeker;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class JobSeekerImpl implements JobSeekerRepo{

	
	@PersistenceContext
	private EntityManager entitymanager;

	@Override
	public JobSeeker createUser(JobSeeker jobseek) {
		entitymanager.persist(jobseek);
		return jobseek;
	}

	@Override
	public List<JobSeeker> getAllSeeker() {
		Query query = entitymanager.createQuery("from JobSeeker ");
		return query.getResultList();
	}

	
}
	

