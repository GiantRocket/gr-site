package com.giantrocket.team.data.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.despegar.integration.mongo.entities.IdentifiableEntity;

public class Team implements IdentifiableEntity{
	
	private String id;
	private String name;
	private String shortName;
	private Date creationDate;	
	private List<String> playersIds;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShortName() {
		return shortName;
	}
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public List<String> getPlayersIds() {
		return playersIds;
	}
	public void setPlayersIds(List<String> playersIds) {
		this.playersIds = playersIds;
	}
	public void addPlayerId(String playerId) {
		if (this.playersIds == null) {
			this.playersIds = new ArrayList<String>();
		}
		
		this.playersIds.add(playerId);
	}

}
