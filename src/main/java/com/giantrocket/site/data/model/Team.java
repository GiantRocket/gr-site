package com.giantrocket.site.data.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.despegar.integration.mongo.entities.IdentifiableEntity;

public class Team implements IdentifiableEntity{
	
	private String id;
	private String steamId;
	private String name;
	private String shortName;
	private String logoUrl;
	private String facebookUrl;
	private String twitter;
	private Date creationDate;
	private List<String> playersIds;
	private String managerId;
	
	
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
	public String getSteamId() {
		return steamId;
	}
	public void setSteamId(String steamId) {
		this.steamId = steamId;
	}
	public String getFacebookUrl() {
		return facebookUrl;
	}
	public void setFacebookUrl(String facebookUrl) {
		this.facebookUrl = facebookUrl;
	}
	public String getManagerId() {
		return managerId;
	}
	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}
	public String getTwitter() {
		return twitter;
	}
	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}
	public String getLogoUrl() {
		return logoUrl;
	}
	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

}
