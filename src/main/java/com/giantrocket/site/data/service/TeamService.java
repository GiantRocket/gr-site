package com.giantrocket.site.data.service;

import java.net.UnknownHostException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.despegar.integration.mongo.connector.MongoCollection;
import com.despegar.integration.mongo.connector.MongoCollectionFactory;
import com.giantrocket.site.data.model.Team;
import com.giantrocket.site.data.model.Tournament;
import com.giantrocket.site.exceptions.ErrorType;
import com.giantrocket.site.util.validator.CustomAssert;

@Service
public class TeamService {
	
	public MongoCollection<Team> teams;
	
	@Autowired
	public TeamService(MongoCollectionFactory mongoCollectionFactory) throws UnknownHostException {
		this.teams = mongoCollectionFactory.buildMongoCollection("teams", Team.class); 
	}
	
	public Team get(String id) {
		return this.teams.findOne(id);
	}
	
	//TODO: Analizar si validar uniqueness en name y tag.
	public String add(Team entity) {
		CustomAssert.notNull(entity.getName() != null, ErrorType.TOURNAMENT_NAME_AND_DESCRIPTION_REQUIRED);
		CustomAssert.notNull(entity.getTag() != null, ErrorType.TOURNAMENT_DATES_MISSING);
		entity.setCreationDate(new Date());
		return this.teams.add(entity);		
	}	
	
}
