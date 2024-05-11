package com.orm.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class JobRecruiter {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int providerId;
	private String providerName;
	private String roleName;
	private int roleId;
	private String eligibilityCriteria;
	private String companyName;
	
	public JobRecruiter() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JobRecruiter(int providerId, String providerName, String roleName, int roleId, String eligibilityCriteria,
			String companyName) {
		super();
		this.providerId = providerId;
		this.providerName = providerName;
		this.roleName = roleName;
		this.roleId = roleId;
		this.eligibilityCriteria = eligibilityCriteria;
		this.companyName = companyName;
	}

	public int getProviderId() {
		return providerId;
	}

	public void setProviderId(int providerId) {
		this.providerId = providerId;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getEligibilityCriteria() {
		return eligibilityCriteria;
	}

	public void setEligibilityCriteria(String eligibilityCriteria) {
		this.eligibilityCriteria = eligibilityCriteria;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	

}
