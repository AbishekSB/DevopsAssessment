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
import org.springframework.web.bind.annotation.RestController;

import com.orm.entity.JobRecruiter;
import com.orm.entity.JobSeeker;
import com.orm.repo.JobSeekerRepo;

@RestController 
@CrossOrigin("http://localhost:3000")
public class JobSeekerController {
	
	@Autowired
	JobSeekerRepo repo;
	
	//For Inserting the User
	@PostMapping("/CreateUser")
	public String createUser(@RequestBody JobSeeker jobSeeker)
	{
		String msg =" ";
		try
		{
			repo.createUser(jobSeeker);
			msg =" Object saved";		
		}
		catch(Exception e)
		{
			msg = " Object not Saved";
		}
		return msg;
	}
	
	

	
	@GetMapping("getAllDetailsSeeker")
	public
	List<JobSeeker> getAllSeeker() {		
		List<JobSeeker> st=repo.getAllSeeker();		
		return st;
	}
	
	
}

