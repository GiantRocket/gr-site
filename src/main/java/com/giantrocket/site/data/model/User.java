package com.giantrocket.site.data.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.despegar.integration.mongo.entities.IdentifiableEntity;

public class User implements IdentifiableEntity {
	
	private String id;
	private String mail;
	private String password;
	private List<UserRole> roles;
	private Country country;
	private State state;
	private Date creationDate;
	private Date birthday;
	private String idNumber;
	private String name;
	private String lastName;
	private String steamId;
	private String nick;
	
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
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSteamId() {
		return steamId;
	}
	public void setSteamId(String steamId) {
		this.steamId = steamId;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public State getState() {
		return state;
	}
	public void setState(State state) {
		this.state = state;
	}
}
		