package com.giantrocket.site.data.connector.dto.steam;

import java.util.Collection;

public class PlayersList {

	private Collection<PlayerDTO> players;

	public Collection<PlayerDTO> getPlayers() {
		return players;
	}

	public void setPlayers(Collection<PlayerDTO> players) {
		this.players = players;
	}		
}
