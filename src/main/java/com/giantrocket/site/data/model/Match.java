package com.giantrocket.site.data.model;

import java.util.Map;

import com.despegar.integration.mongo.entities.IdentifiableEntity;

public class Match implements IdentifiableEntity{
	
	private String id;
	private String dotabuff;
	private MatchStatus status;
	private Map<String,MatchResult> teams;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDotabuff() {
		return dotabuff;
	}

	public void setDotabuff(String dotabuff) {
		this.dotabuff = dotabuff;
	}

	public MatchStatus getStatus() {
		return status;
	}

	public void setStatus(MatchStatus status) {
		this.status = status;
	}

	public Map<String, MatchResult> getTeams() {
		return teams;
	}

	public void setTeams(Map<String, MatchResult> teams) {
		this.teams = teams;
	}

}
