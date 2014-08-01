package com.giantrocket.team.web.controller;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.giantrocket.team.data.model.Role;
import com.giantrocket.team.data.model.Country;
import com.giantrocket.team.data.model.State;
import com.giantrocket.team.data.model.Team;
import com.giantrocket.team.data.service.TeamService;

@Controller
@RequestMapping(value = "/team")
public class TeamController {
	
	private TeamService teamService;
	private static Logger LOGGER = Logger.getLogger(TeamController.class);
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView getEmptyTeamForm() {
		LOGGER.info("returning empty form to create a team");
		ModelAndView view = new ModelAndView("create-team-screen");
		view.addObject("roles", Role.values());
		view.addObject("countries", Country.values());
		view.addObject("states", State.values());
		return view;
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity<Void> saveTeam(@RequestBody Team team) {
			this.teamService.saveTeam(team, null);
			LOGGER.info("Saved team");
			return new ResponseEntity<Void>(HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/{teamName}", method = RequestMethod.DELETE)
	public ModelAndView deleteTeam(@PathVariable String teamName) {
		boolean status = this.teamService.deleteTeam(teamName);
		if(status){
			ModelAndView view = new ModelAndView("success-team-screen");
			view.addObject("message", "Team has been successfully deleted");
			return view;
		}
		ModelAndView view = new ModelAndView("success-team-screen");
		view.addObject("message", "There has been errors, please try again later");
		return view;
	}
	
	@RequestMapping(value = "/{teamName}", method = RequestMethod.GET)
	public ModelAndView getTeam(@PathVariable String teamName) {
		Team team = this.teamService.getTeam(teamName);
		ModelAndView view = new ModelAndView("create-team-screen");
		view.addObject("roles", Role.values());
		view.addObject("countries", Country.values());
		view.addObject("states", State.values());
		view.addObject("team", team);
		return view;
	}
	
	@RequestMapping(value = "/export", method = RequestMethod.GET)
	public ModelAndView exportTeams() {
		teamService.exportTeams();
		ModelAndView view = new ModelAndView("index-screen");
		return view;
	}
	
	@RequestMapping(value = "/{teamName}", method = RequestMethod.PATCH)
	public ResponseEntity<Void> updateTeam(@PathVariable String teamName, @RequestBody Team team) {
		this.teamService.saveTeam(team, teamName);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

	public void setTeamService(TeamService teamService) {
		this.teamService = teamService;
	}
	
}
