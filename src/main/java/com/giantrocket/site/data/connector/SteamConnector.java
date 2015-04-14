package com.giantrocket.site.data.connector;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.giantrocket.site.data.connector.dto.steam.Player;
import com.giantrocket.site.data.connector.dto.steam.PlayersContainer;

@Service
public class SteamConnector {
	
	public Player getPlayer(String steamId) {
		String steamKey = "";		
		String url = "http://api.steampowered.com/ISteamUser/GetPlayerSummaries/v0002/?key=%s&steamids=%s";
		 
		RestTemplate restTemplate= new RestTemplate();		
		ResponseEntity<PlayersContainer> response = restTemplate.getForEntity(String.format(url, steamKey, steamId), PlayersContainer.class);
		
		if (!HttpStatus.OK.equals(response.getStatusCode())) {
			//TODO: ver que error devolver en caso de que steam no funcione
		}	
		
		return response.getBody().getResponse().getPlayers().iterator().next();
	}

}
