package com.giantrocket.team.web.controller;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.giantrocket.team.data.model.Match;
import com.giantrocket.team.data.service.MatchService;
import com.giantrocket.team.data.service.TeamService;

@Controller
@RequestMapping(value = "/match")
public class MatchController {
	
	private MatchService matchService;
	private TeamService teamService;
	private static Logger LOGGER = Logger.getLogger(MatchController.class);
	
	@RequestMapping(value = "/edit", method = RequestMethod.GET)
	public ModelAndView getEmptyMatchForm() {
		LOGGER.info("returning empty form to create a team");
		ModelAndView view = new ModelAndView("update-match-screen");
		List<String> allTeamsNames = teamService.getAllTeamsNames();
		view.addObject("teams", allTeamsNames);
		return view;
	}
	
	@RequestMapping(value = "/edit/{matchId}", method = RequestMethod.GET)
	public ModelAndView getMatchForm(@PathVariable String matchId) {
		LOGGER.info("returning empty form to create a team");
		ModelAndView view = new ModelAndView("update-match-screen");
		List<String> allTeamsNames = teamService.getAllTeamsNames();
		Match match = matchService.getMatch(matchId);
		view.addObject("match", match);
		view.addObject("teams", allTeamsNames);
		return view;
	}
	
	@RequestMapping(value = "/get/all", method = RequestMethod.GET)
	public ResponseEntity<Map<String,Match>> getAllMatches() {
		Map<String,Match> matches = this.matchService.getAllMatches();
		LOGGER.info("returning all matches");
		return new ResponseEntity<Map<String,Match>>(matches, HttpStatus.OK);
	}
	
	@RequestMapping(value = "/get/finished", method = RequestMethod.GET)
	public ResponseEntity<List<Match>> getFinishedMatches() {
		List<Match> matches = this.matchService.getFinishedMatches();
		LOGGER.info("returning all matches");
		return new ResponseEntity<List<Match>>(matches, HttpStatus.OK);
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST)
	public ResponseEntity<Void> saveTeam(@RequestBody Match match) {
			this.matchService.saveMatch(match);
			LOGGER.info("Saved match");
			return new ResponseEntity<Void>(HttpStatus.OK);
		
	}
	
	@RequestMapping(value = "/delete/{matchId}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteTeam(@PathVariable String matchId) {
		boolean status = this.matchService.deleteMatch(matchId);
		if(status){
			LOGGER.info("Deleted match");
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
		LOGGER.info("There has been errors trying to delete match: "+ matchId);
		return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
	}
	
	@RequestMapping(value = "/get/{matchId}", method = RequestMethod.GET)
	public ResponseEntity<Match> getTeam(@PathVariable String matchId) {
		LOGGER.info("Looking on db for match: " + matchId);
		Match match = this.matchService.getMatch(matchId);
		LOGGER.info("Returning match: " + matchId);
		return new ResponseEntity<Match>(match,HttpStatus.OK);
	}

	public void setMatchService(MatchService matchService) {
		this.matchService = matchService;
	}

	public void setTeamService(TeamService teamService) {
		this.teamService = teamService;
	}
	
}
