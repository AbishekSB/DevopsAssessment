package com.orm.repo;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.orm.entity.JobRecruiter;
import com.orm.entity.JobSeeker;



//public interface JobSeekerRepo extends JpaRepository<JobSeeker, Integer> {
//	
//	@Query("select applicantId from JobSeeker order by applicantId")
//	public List<Integer> getIdList();
//
//}


public interface JobSeekerRepo {
	
	public JobSeeker createUser(JobSeeker jobseek);
	public List<JobSeeker> getAllSeeker();
	
	
	

}
