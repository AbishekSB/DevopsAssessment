package com.orm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orm.entity.JobRecruiter;
import com.orm.repo.JobRecruiterRepo;



@RestController 
@CrossOrigin("http://localhost:3000")

public class JobRecruiterController {
	@Autowired
	JobRecruiterRepo repo;
	
	@PostMapping("/CreateJobRecruiter")
	public String createJobRecruiter(@RequestBody JobRecruiter jobRecruiter) {

		String msg = " ";
		try {
			repo.createJobRecruiter(jobRecruiter);
			msg = " Object Saved";
		} catch (Exception e) {
//			msg = " Object Not Saved";
			e.printStackTrace();
		}
		return msg;
	}
	
//	@GetMapping("/GetJobRecruiterById/{providerId}")
//	public JobRecruiter getJobRecruiterById(@PathVariable("providerId")int providerId) {
//		JobRecruiter recruiter = repo.findById(providerId).get();	
//		
//		return recruiter;
//	}
	
	
	
	@GetMapping("getSeekerIdList")
	List<Integer> getIdListtt(){
		return repo.getIdListtt();
		

		
	}
	
	@GetMapping("getAllDetailsOwner")
	public
	List<JobRecruiter> getAllJobRecruiter() {		
		List<JobRecruiter>  jobRecruiter=repo.getAllJobRecruiter();		
		return jobRecruiter;
	}
	

	


}
