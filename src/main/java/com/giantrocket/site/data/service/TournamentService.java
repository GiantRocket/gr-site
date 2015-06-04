package com.giantrocket.site.data.service;

import java.net.UnknownHostException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.despegar.integration.mongo.connector.MongoCollection;
import com.despegar.integration.mongo.connector.MongoCollectionFactory;
import com.giantrocket.site.data.model.Tournament;
import com.giantrocket.site.exceptions.ErrorType;
import com.giantrocket.site.util.validator.CustomAssert;

@Service
public class TournamentService {
	
	public MongoCollection<Tournament> tournaments;
	
	@Autowired
	public TournamentService(MongoCollectionFactory mongoCollectionFactory) throws UnknownHostException {
		this.tournaments = mongoCollectionFactory.buildMongoCollection("tournaments", Tournament.class); 
	}
	
	public Tournament get(String id) {
		return this.tournaments.findOne(id);
	}
	
	public String add(Tournament entity) {
		CustomAssert.notNull(entity.getName() != null && entity.getDescription() != null, ErrorType.TOURNAMENT_NAME_AND_DESCRIPTION_REQUIRED);
		CustomAssert.notNull(entity.getStartDate() != null && entity.getEndDate() != null && entity.getInscriptionStartDate() != null && entity.getInscriptionEndDate() != null, ErrorType.TOURNAMENT_DATES_MISSING);
		entity.setCreationDate(new Date());
		return this.tournaments.add(entity);		
	}	
	
}
