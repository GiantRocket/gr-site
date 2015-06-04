package com.giantrocket.site.data.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.despegar.integration.mongo.entities.IdentifiableEntity;

public class Tournament implements IdentifiableEntity{
	
	private String id;
	private String steamId;
	private String name;
	private String description;
	private String place;
	private Date startDate;
	private Date endDate;
	private Date inscriptionStartDate;
	private Date inscriptionEndDate;
	private Date creationDate;
	private List<String> teams;
	private List<String> matches;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSteamId() {
		return steamId;
	}
	public void setSteamId(String steamId) {
		this.steamId = steamId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Date getInscriptionStartDate() {
		return inscriptionStartDate;
	}
	public void setInscriptionStartDate(Date inscriptionStartDate) {
		this.inscriptionStartDate = inscriptionStartDate;
	}
	public Date getInscriptionEndDate() {
		return inscriptionEndDate;
	}
	public void setInscriptionEndDate(Date inscriptionEndDate) {
		this.inscriptionEndDate = inscriptionEndDate;
	}
	public List<String> getTeams() {
		if(teams == null){
			teams = new ArrayList<String>();
		}
		return teams;
	}
	public void setTeams(List<String> teams) {
		this.teams = teams;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public List<String> getMatches() {
		if(matches == null){
			matches = new ArrayList<String>();
		}
		return matches;
	}
	public void setMatches(List<String> matches) {
		this.matches = matches;
	}

}
