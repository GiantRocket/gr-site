package com.giantrocket.team.web.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.giantrocket.team.data.model.Team;
import com.giantrocket.team.data.service.TeamService;

@Controller
@RequestMapping(value = "/show/teams")
public class TeamPageController {
	
	private TeamService teamService;
	private static Logger LOGGER = Logger.getLogger(TeamPageController.class);
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView getTeamPage() {
		LOGGER.info("returning empty form to create a team");
		ModelAndView view = new ModelAndView("team-screen");
		List<Team> mainTeams = teamService.getMainTeams();
		view.addObject("teams", mainTeams);
		return view;
	}

	public void setTeamService(TeamService teamService) {
		this.teamService = teamService;
	}
	
}
