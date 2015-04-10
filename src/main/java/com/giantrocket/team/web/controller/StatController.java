package com.giantrocket.team.web.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.giantrocket.team.data.service.TeamService;

@Controller
@RequestMapping(value = "/stat")
public class StatController {
	
	private static Logger LOGGER = Logger.getLogger(StatController.class);
	
	@Autowired
	private TeamService teamService;
		
	@RequestMapping(value = "/average/age", method = RequestMethod.GET)
	public ResponseEntity<Double> getAverageAge() {
		Double average = teamService.getAverageAge();
		LOGGER.info("returning average age among all teams");
		return new ResponseEntity<Double>(average, HttpStatus.OK);
	}
	
}
