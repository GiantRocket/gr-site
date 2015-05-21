package com.giantrocket.site.web.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.giantrocket.site.data.service.UserService;
import com.giantrocket.site.data.service.dota.LeagueService;
import com.giantrocket.site.web.annotation.SessionRequired;

@Controller
@RequestMapping(value = "")
public class HomeController {
	
	private static Logger LOGGER = Logger.getLogger(HomeController.class);

	private UserService userService;
	private LeagueService leagueService;
	
	@Autowired
	public HomeController(UserService userService, LeagueService leagueService) {
		this.userService = userService;
		this.leagueService = leagueService;
	}
		
	// TODO: el @SessionRequired esta para probar que requiera login y que la pagina sea https
	@RequestMapping(value = "", method = RequestMethod.GET)
	@SessionRequired 
	public ModelAndView getHome() {
		LOGGER.info("returning index");		
		ModelAndView view = new ModelAndView("home");
//		User user = new User();
//		user.setCountry(Country.ARGENTINA);	
//		user.setUserName("elBarba");
//		user.addRole(UserRole.PLAYER);
//		
//		this.userService.add(user);
		
		return view;
	}
}
