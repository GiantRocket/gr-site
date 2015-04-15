package com.giantrocket.site.data.connector.dto.steam;

import com.fasterxml.jackson.annotation.JsonProperty;

public class League {
	
	private String name;
	@JsonProperty(value="leagueid")
	private Long leagueId;
	private String description;
	@JsonProperty(value="tournament_url")
	private String tournamentUrl;
	private Long itemdef;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getLeagueId() {
		return leagueId;
	}
	public void setLeagueId(Long leagueid) {
		this.leagueId = leagueid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTournamentUrl() {
		return tournamentUrl;
	}
	public void setTournamentUrl(String tournamentUrl) {
		this.tournamentUrl = tournamentUrl;
	}
	public Long getItemdef() {
		return itemdef;
	}
	public void setItemdef(Long itemdef) {
		this.itemdef = itemdef;
	}

}
