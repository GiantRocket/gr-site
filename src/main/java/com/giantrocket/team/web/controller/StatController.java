package com.giantrocket.team.web.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.giantrocket.team.data.model.Role;
import com.giantrocket.team.data.model.Country;
import com.giantrocket.team.data.model.State;
import com.giantrocket.team.data.model.Team;
import com.giantrocket.team.data.service.TeamService;

@Controller
@RequestMapping(value = "/stat")
public class StatController {
	
	private TeamService teamService;
	private static Logger LOGGER = Logger.getLogger(StatController.class);
	
	@RequestMapping(value = "/average/age", method = RequestMethod.GET)
	public ResponseEntity<Double> getAverageAge() {
		Double average = teamService.getAverageAge();
		LOGGER.info("returning average age among all teams");
		return new ResponseEntity<Double>(average, HttpStatus.OK);
	}
	

	public void setTeamService(TeamService teamService) {
		this.teamService = teamService;
	}
	
}
