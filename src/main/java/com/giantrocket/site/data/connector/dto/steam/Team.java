package com.giantrocket.site.data.connector.dto.steam;

import java.util.Collection;

public class Team {

	private Long teamId;
	private String name;
	private String tag;
	private Long timeCreated;
	private String rating;
	private Long logo;
	private Long logoSponsor;
	private String country_code;
	private String url;
	private Integer gamesPlayedWithCurrentRoster;
	private Collection<Long> playerAccountIds;
	private Collection<Long> leagueIds;	
	private Long adminAccountId;
	public Long getTeamId() {
		return teamId;
	}
	public void setTeamId(Long team_id) {
		this.teamId = team_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public Long getTimeCreated() {
		return timeCreated;
	}
	public void setTimeCreated(Long timeCreated) {
		this.timeCreated = timeCreated;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public Long getLogo() {
		return logo;
	}
	public void setLogo(Long logo) {
		this.logo = logo;
	}
	public Long getLogoSponsor() {
		return logoSponsor;
	}
	public void setLogoSponsor(Long logoSponsor) {
		this.logoSponsor = logoSponsor;
	}
	public String getCountry_code() {
		return country_code;
	}
	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Integer getGamesPlayedWithCurrentRoster() {
		return gamesPlayedWithCurrentRoster;
	}
	public void setGamesPlayedWithCurrentRoster(Integer gamesPlayedWithCurrentRoster) {
		this.gamesPlayedWithCurrentRoster = gamesPlayedWithCurrentRoster;
	}
	public Collection<Long> getPlayerAccountIds() {
		return playerAccountIds;
	}
	public void setPlayerAccountIds(Collection<Long> playerAccountIds) {
		this.playerAccountIds = playerAccountIds;
	}
	public Collection<Long> getLeagueIds() {
		return leagueIds;
	}
	public void setLeagueIds(Collection<Long> leagueIds) {
		this.leagueIds = leagueIds;
	}
	public Long getAdminAccountId() {
		return adminAccountId;
	}
	public void setAdminAccountId(Long adminAccountId) {
		this.adminAccountId = adminAccountId;
	}	
}
