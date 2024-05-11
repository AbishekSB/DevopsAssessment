package com.orm.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.orm.entity.JobRecruiter;



public interface JobRecruiterRepo {


public JobRecruiter createJobRecruiter(JobRecruiter jobrec);
public List<JobRecruiter> getAllJobRecruiter();
public List<Integer> getIdListtt();
}

