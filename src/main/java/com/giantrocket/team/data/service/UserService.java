package com.giantrocket.team.data.service;

import java.net.UnknownHostException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.despegar.integration.mongo.connector.MongoCollection;
import com.despegar.integration.mongo.connector.MongoCollectionFactory;
import com.giantrocket.team.data.model.User;

@Service
public class UserService {
	
	public MongoCollection<User> users;
	
	@Autowired
	public UserService(MongoCollectionFactory mongoCollectionFactory) throws UnknownHostException {
		this.users = mongoCollectionFactory.buildMongoCollection("users", User.class); 
	}
	
	public User get(String id) {
		return this.users.findOne(id);
	}
	
	//TODO agregar validaciones
	public String add(User user) {
		user.setCreationDate(new Date());
		return this.users.add(user);		
	}	
	
}
