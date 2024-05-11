package com.orm.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class JobSeeker {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int applicantId;

	private String applicantName;
	private String applicantCity;
	private int age;
	private String gender;
	private String degree;
	private int yearOfGraduation;
	
	@ManyToOne(targetEntity = JobRecruiter.class, cascade = CascadeType.REFRESH)
	@JoinColumn(name="providerId")
	private JobRecruiter jobRecruiter;
	
	public JobSeeker() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JobSeeker(int applicantId, String applicantName, String applicantCity, int age, String gender, String degree,
			int yearOfGraduation, JobRecruiter jobRecruiter) {
		super();
		this.applicantId = applicantId;
		this.applicantName = applicantName;
		this.applicantCity = applicantCity;
		this.age = age;
		this.gender = gender;
		this.degree = degree;
		this.yearOfGraduation = yearOfGraduation;
		this.jobRecruiter = jobRecruiter;
	}

	public int getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public String getApplicantCity() {
		return applicantCity;
	}

	public void setApplicantCity(String applicantCity) {
		this.applicantCity = applicantCity;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public int getYearOfGraduation() {
		return yearOfGraduation;
	}

	public void setYearOfGraduation(int yearOfGraduation) {
		this.yearOfGraduation = yearOfGraduation;
	}

	public JobRecruiter getJobRecruiter() {
		return jobRecruiter;
	}

	public void setJobRecruiter(JobRecruiter jobRecruiter) {
		this.jobRecruiter = jobRecruiter;
	}

	@Override
	public String toString() {
		return "JobSeeker [applicantId=" + applicantId + ", applicantName=" + applicantName + ", applicantCity="
				+ applicantCity + ", age=" + age + ", gender=" + gender + ", degree=" + degree + ", yearOfGraduation="
				+ yearOfGraduation + ", jobRecruiter=" + jobRecruiter + "]";
	}

	
	
	
}
