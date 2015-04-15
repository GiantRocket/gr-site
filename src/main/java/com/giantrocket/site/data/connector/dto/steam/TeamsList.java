package com.giantrocket.site.data.connector.dto.steam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class TeamsList {

	private Collection<Team> teams;
	private Integer status;

	public Collection<Team> getTeams() {
		return teams;
	}

	public void setTeams(Collection<Map<String, String>> teams) {
		//tuve que hacer este quilombo porque steam devuelve la listas de jugadores y torneos como properties
		
		this.teams = new ArrayList<Team>();
		
		for (Map<String, String> teamMap : teams) {
			Team team = new Team();
			team.setAdminAccountId(Long.parseLong(teamMap.get("admin_account_id")));
			team.setCountry_code(teamMap.get("country_code"));
			team.setGamesPlayedWithCurrentRoster(Integer.parseInt(teamMap.get("games_played_with_current_roster")));
			team.setLogo(Long.parseLong(teamMap.get("logo")));
			team.setLogoSponsor(Long.parseLong(teamMap.get("logo_sponsor")));
			team.setName(teamMap.get("name"));
			team.setRating(teamMap.get("rating"));
			team.setTag(teamMap.get("tag"));
			team.setTeamId(Long.parseLong(teamMap.get("team_id")));
			team.setTimeCreated(Long.parseLong(teamMap.get("time_created")));
			team.setUrl(teamMap.get("url"));
						
			Collection<Long> leagues = new ArrayList<Long>();
			int i = 0;
			while (teamMap.containsKey("league_id_" + i)) {
				leagues.add(Long.parseLong(teamMap.get("league_id_" + i)));
				i++;
			}
			team.setLeagueIds(leagues);
			
			Collection<Long> players = new ArrayList<Long>();
			int j = 0;
			while (teamMap.containsKey("player_" + j + "_account_id")) {
				players.add(Long.parseLong(teamMap.get("player_" + j + "_account_id")));
				j++;
			}
			team.setPlayerAccountIds(players);
			
			this.teams.add(team);
		}
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}		
	
}
