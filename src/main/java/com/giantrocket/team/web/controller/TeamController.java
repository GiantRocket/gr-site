package com.giantrocket.team.web.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
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
	
	private static Logger LOGGER = Logger.getLogger(TeamController.class);
	
	@Autowired
	private TeamService teamService;
		
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView getEmptyTeamForm() {
		LOGGER.info("returning empty form to create a team");
		ModelAndView view = new ModelAndView("create-team-screen");
		view.addObject("roles", Role.values());
		view.addObject("countries", Country.values());
		view.addObject("states", State.values());
		return view;
	}
	
	@RequestMapping(value = "success", method = RequestMethod.GET)
	public ModelAndView sucessForm() {
		LOGGER.info("returning success view after creation");
		ModelAndView view = new ModelAndView("success-team-screen");
		return view;
	}
	
	@RequestMapping(value = "payment", method = RequestMethod.GET)
	public ModelAndView paymentView() {
		LOGGER.info("returning payment view");
		ModelAndView view = new ModelAndView("payment-screen");
		return view;
	}
	
	@RequestMapping(value = "/get/main", method = RequestMethod.GET)
	public ResponseEntity<List<Team>> getMainTeams() {
		List<Team> teams = teamService.getMainTeams();
		LOGGER.info("returning main teams");
		return new ResponseEntity<List<Team>>(teams, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/get/all", method = RequestMethod.GET)
	public ResponseEntity<List<Team>> getAllTeams() {
		List<Team> teams = teamService.getAllTeams();
		LOGGER.info("returning main teams");
		return new ResponseEntity<List<Team>>(teams, HttpStatus.OK);
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity<Void> saveTeam(@RequestBody Team team) {
			this.teamService.saveTeam(team, null);
			LOGGER.info("Saved team");
			return new ResponseEntity<Void>(HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/get/{teamName}", method = RequestMethod.DELETE)
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
	
	@RequestMapping(value = "/edit/{teamName}", method = RequestMethod.GET)
	public ModelAndView getTeamForm(@PathVariable String teamName) {
		LOGGER.info("Looking on db for team: " + teamName);
		Team team = this.teamService.getTeam(teamName);
		LOGGER.info("Returning team: " + teamName);
		ModelAndView view = new ModelAndView("create-team-screen");
		view.addObject("roles", Role.values());
		view.addObject("countries", Country.values());
		view.addObject("states", State.values());
		view.addObject("team", team);
		return view;
	}
	
	@RequestMapping(value = "/get/{teamName}", method = RequestMethod.GET)
	public ResponseEntity<Team> getTeam(@PathVariable String teamName) {
		LOGGER.info("Looking on db for team: " + teamName);
		Team team = this.teamService.getTeam(teamName);
		LOGGER.info("Returning team: " + teamName);
		return new ResponseEntity<Team>(team,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/get/export", method = RequestMethod.GET)
	public ModelAndView exportTeams() {
		LOGGER.info("running export teams to csv");
		teamService.exportTeams();
		ModelAndView view = new ModelAndView("index-screen");
		return view;
	}
	
	@RequestMapping(value = "/{teamName}", method = RequestMethod.POST)
	public ResponseEntity<Void> updateTeam(@PathVariable String teamName, @RequestBody Team team) {
		this.teamService.saveTeam(team, teamName);
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
}
