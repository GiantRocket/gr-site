package com.giantrocket.team.web.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.giantrocket.team.data.service.MatchService;
import com.giantrocket.team.data.service.TeamService;

@Controller
@RequestMapping(value = "")
public class HomeController {
	
	private MatchService matchService;
	private TeamService teamService;
	private static Logger LOGGER = Logger.getLogger(HomeController.class);
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView getHome() {
		LOGGER.info("returning index");
		ModelAndView view = new ModelAndView("index-screen");
		view.addObject("teams", teamService.getMainTeams());
		return view;
	}
	
	@RequestMapping(value = "/fixture", method = RequestMethod.GET)
	public ModelAndView getFixture() {
		LOGGER.info("returning index");
		ModelAndView view = new ModelAndView("fixture-screen");
		view.addObject("matches", matchService.getAllMatches());
		return view;
	}
	
	@RequestMapping(value = "/rules", method = RequestMethod.GET)
	public ModelAndView getRules() {
		LOGGER.info("returning rules");
		ModelAndView view = new ModelAndView("rules-screen");
		return view;
	}

	public void setMatchService(MatchService matchService) {
		this.matchService = matchService;
	}

	public void setTeamService(TeamService teamService) {
		this.teamService = teamService;
	}
	
}
