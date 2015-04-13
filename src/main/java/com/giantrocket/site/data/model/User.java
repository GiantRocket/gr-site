package com.giantrocket.site.data.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.despegar.integration.mongo.entities.IdentifiableEntity;

public class User implements IdentifiableEntity {
	
	private String id;
	private String userName;
	private List<UserRole> roles;
	private Country country;
	private Date creationDate;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<UserRole> getRoles() {
		return roles;
	}
	public void setRoles(List<UserRole> roles) {
		this.roles = roles;
	}
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;		
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public void addRole(UserRole role) {
		if (this.roles == null) {
			this.roles = new ArrayList<UserRole>();
		}
		
		this.roles.add(role);
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
}
