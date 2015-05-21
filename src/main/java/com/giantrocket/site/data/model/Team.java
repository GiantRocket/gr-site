package com.giantrocket.site.data.model;

import java.util.Date;
import java.util.Map;

import com.despegar.integration.mongo.entities.IdentifiableEntity;

public class Team implements IdentifiableEntity{
	
	private String id;
	private String steamId;
	private String name;
	private String tag;
	private String logoUrl;
	private String facebook;
	private String twitter;
	private Date creationDate;
	private Map<UserRole,String> players;
	private String foundationDate;
	private Country country;
	
	
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
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getSteamId() {
		return steamId;
	}
	public void setSteamId(String steamId) {
		this.steamId = steamId;
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
	public String getFoundationDate() {
		return foundationDate;
	}
	public void setFoundationDate(String foundationDate) {
		this.foundationDate = foundationDate;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public Map<UserRole, String> getPlayers() {
		return players;
	}
	public void setPlayers(Map<UserRole, String> players) {
		this.players = players;
	}
	public String getFacebook() {
		return facebook;
	}
	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

}
