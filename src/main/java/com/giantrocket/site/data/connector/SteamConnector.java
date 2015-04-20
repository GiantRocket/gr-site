package com.giantrocket.site.data.connector;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.giantrocket.site.data.connector.dto.steam.League;
import com.giantrocket.site.data.connector.dto.steam.LeaguesContainer;
import com.giantrocket.site.data.connector.dto.steam.Player;
import com.giantrocket.site.data.connector.dto.steam.PlayersContainer;
import com.giantrocket.site.data.connector.dto.steam.Team;
import com.giantrocket.site.data.connector.dto.steam.TeamsContainer;
import com.giantrocket.site.data.connector.rest.factory.CacheClientHttpRequestFactory;

@Service
public class SteamConnector {
		
	private String steamKey;
	
	private RestTemplate restTemplate;
	
	private static final String PLAYER_URL = "http://api.steampowered.com/ISteamUser/GetPlayerSummaries/v0002/?key=%s&steamids=%s";
	private static final String TEAM_URL = "http://api.steampowered.com/IDOTA2Match_570/GetTeamInfoByTeamID/v1?key=%s&start_at_team_id=%s&teams_requested=1";
	private static final String LEAGUE_URL = "http://api.steampowered.com/IDOTA2Match_570/GetLeagueListing/v0001/?key=%s";
	
	@Autowired
	public SteamConnector(@Value("${com.giantrocket.steam.appid}") String steamKey, @Value("${com.giantrocket.steam.cache}") Boolean useCache, @Value("${com.giantrocket.steam.ttl}") Integer cacheTTL) {
		this.steamKey = steamKey;
		
		this.restTemplate = new RestTemplate();
		if (useCache) {
			restTemplate.setRequestFactory(new CacheClientHttpRequestFactory(restTemplate.getRequestFactory(), cacheTTL));
		}
	}
	
	public Player getPlayer(Long steamId) {							 			
		ResponseEntity<PlayersContainer> response = this.restTemplate.getForEntity(String.format(PLAYER_URL, steamKey, steamId), PlayersContainer.class);
		
		if (!HttpStatus.OK.equals(response.getStatusCode())) {
			//TODO: ver que error devolver en caso de que steam no funcione
		}	
		
		return response.getBody().getResponse().getPlayers().iterator().next();
	}
	
	public Team getTeam(Long teamId) {		
		ResponseEntity<TeamsContainer> response = this.restTemplate.getForEntity(String.format(TEAM_URL, steamKey, teamId), TeamsContainer.class);
		
		if (!HttpStatus.OK.equals(response.getStatusCode())) {
			//TODO: ver que error devolver en caso de que steam no funcione
		}	
		
		return response.getBody().getResult().getTeams().iterator().next();
	}
	
	public League getLeague(Long leagueId) {				
		ResponseEntity<LeaguesContainer> response = this.restTemplate.getForEntity(String.format(LEAGUE_URL, steamKey), LeaguesContainer.class);		
		
		if (!HttpStatus.OK.equals(response.getStatusCode())) {
			//TODO: ver que error devolver en caso de que steam no funcione
		}	
		
		Collection<League> leagues = response.getBody().getResult().getLeagues();
		
		for (League league : leagues) {
			if (leagueId.equals(league.getLeagueId())) {
				return league;
			}
		}
		
		return null;
	}

}
