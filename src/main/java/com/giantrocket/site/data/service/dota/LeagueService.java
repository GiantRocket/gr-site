package com.giantrocket.site.data.service.dota;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.giantrocket.site.data.connector.SteamConnector;
import com.giantrocket.site.data.connector.dto.steam.LeagueDTO;
import com.giantrocket.site.util.cache.CacheWrapper;

@Service
public class LeagueService {

	private SteamConnector steamConnector;
	private Integer leagueTTL;
	
	@Autowired
	public LeagueService(SteamConnector steamConnector, @Value("${com.giantrocket.dota.league.ttl}") Integer leagueTTL) {
		this.steamConnector = steamConnector;
		this.leagueTTL = leagueTTL;
	}
	
	// cuando este el objeto league de nuestro modelo iria aca en lugar del DTO
	public LeagueDTO getLeague(final Long leagueId) {
		return (new CacheWrapper<LeagueDTO>(this.leagueTTL) {
			
			@Override
			protected LeagueDTO run() {
				return LeagueService.this.steamConnector.getLeague(leagueId);
			}
			
			@Override
			protected String generateKey() {
				return "dota-league-" + leagueId;
			}
			
		}).execute();						
	}
	
}
