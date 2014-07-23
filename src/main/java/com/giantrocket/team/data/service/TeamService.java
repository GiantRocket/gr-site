package com.giantrocket.team.data.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;

import com.esotericsoftware.yamlbeans.YamlReader;
import com.esotericsoftware.yamlbeans.YamlWriter;
import com.giantrocket.team.data.model.Player;
import com.giantrocket.team.data.model.Team;
import com.giantrocket.team.exceptions.ErrorType;
import com.giantrocket.team.exceptions.ManagerException;

public class TeamService {
	
    @Value("${com.giantrocket.filepath}")
	private String filePath;
    private static Logger LOGGER = Logger.getLogger(TeamService.class);
	
	public void saveTeam(Team team, String teamName) {
		String filePath = createFilePath(team.getName());
		LOGGER.info("creating file on "+filePath);
		if(teamName == null){
			File teamFile = new File(filePath);
			if(teamFile.exists()){
				LOGGER.info("team "+teamName+" already exists");
				throw new ManagerException(ErrorType.TEAM_EXISTS);
			}
		}
		Date creationDate = Calendar.getInstance().getTime();
		team.setCreationDate(creationDate);
		try {
			YamlWriter writer = new YamlWriter(new FileWriter(filePath));
			writer.getConfig().setClassTag("Team", Team.class);
			writer.getConfig().setClassTag("Player", Player.class);			
			writer.write(team);
			writer.close();
		} catch (Exception e) {
			throw new ManagerException(ErrorType.FILE_WRITE_ERROR, e);
		}		

		LOGGER.info("succesfully created team");
	}

	public Team getTeam(String teamName) throws FileNotFoundException{
		try{
			String filePath = createFilePath(teamName);
			YamlReader reader = new YamlReader(new FileReader(filePath));
			reader.getConfig().setClassTag("Team", Team.class);
			Team team = (Team) reader.read();
			reader.close();
			return team;
		}catch(Exception e){
			throw new ManagerException(ErrorType.FILE_WRITE_ERROR, e);
		}
	}
	
	public boolean deleteTeam(String teamName) {
		String filePath = createFilePath(teamName);
		File file = new File(filePath);
		return FileUtils.deleteQuietly(file);
	}
	
	private String createFilePath(String teamName) {
		String fileName = teamName.toLowerCase().replaceAll("\\s+","");
		return filePath + fileName + ".yml";
	}
	
}
