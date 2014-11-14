package com.giantrocket.team.data.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.joda.time.LocalDate;
import org.joda.time.Years;
import org.springframework.beans.factory.annotation.Value;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;
import com.esotericsoftware.yamlbeans.YamlWriter;
import com.giantrocket.team.data.model.Player;
import com.giantrocket.team.data.model.Team;
import com.giantrocket.team.exceptions.ErrorType;
import com.giantrocket.team.exceptions.ManagerException;

public class TeamService {
	
	@Value("${com.giantrocket.filepath}")
	private String filePath;
	@Value("${com.giantrocket.exportpath}")
	private String exportPath;
    private static Logger LOGGER = Logger.getLogger(TeamService.class);
    private static final char COMMA = ',';
	
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
		YamlWriter writer = null;
		try {
			writer = new YamlWriter(new FileWriter(filePath));
			writer.getConfig().setClassTag("Team", Team.class);
			writer.getConfig().setClassTag("Player", Player.class);			
			writer.write(team);
		} catch (Exception e) {
			throw new ManagerException(ErrorType.FILE_MATCH_WRITE_ERROR, e);
		}finally{
			try {
				writer.close();
			} catch (YamlException e) {
				throw new ManagerException(ErrorType.FILE_MATCH_WRITE_ERROR, e);
			}
		}

		LOGGER.info("succesfully created team");
	}

	public Team getTeam(String teamName){
		String filePath = createFilePath(teamName);
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(filePath);
		} catch (FileNotFoundException fileNotFound) {
			throw new ManagerException(ErrorType.TEAM_NOT_FOUND, fileNotFound);
		}
		YamlReader reader = null;
		try{
			reader = new YamlReader(fileReader);
			reader.getConfig().setClassTag("Team", Team.class);
			reader.getConfig().setClassTag("Player", Player.class);
			Team team = (Team) reader.read();
			reader.close();
			return team;
		}catch(Exception e){
			throw new ManagerException(ErrorType.FILE_TEAM_READ_ERROR, e);
		}finally{
			try {
				reader.close();
			} catch (Exception e) {
				throw new ManagerException(ErrorType.FILE_TEAM_READ_ERROR, e);
			}
		}
	}
	
	public Team getTeam(File teamFile){
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(teamFile);
		} catch (FileNotFoundException fileNotFound) {
			throw new ManagerException(ErrorType.TEAM_NOT_FOUND, fileNotFound);
		}
		YamlReader reader = null;
		try{
			reader = new YamlReader(fileReader);
			reader.getConfig().setClassTag("Team", Team.class);
			reader.getConfig().setClassTag("Player", Player.class);
			Team team = (Team) reader.read();
			reader.close();
			return team;
		}catch(Exception e){
			throw new ManagerException(ErrorType.FILE_TEAM_READ_ERROR, e);
		}finally{
			try {
				reader.close();
			} catch (Exception e) {
				throw new ManagerException(ErrorType.FILE_TEAM_READ_ERROR, e);
			}
		}
	}
	
	public List<Team> getAllTeams(){
		List<Team> teams = new ArrayList<Team>();
		File folder = new File(filePath);
		LOGGER.info("looking for all team files");
		File[] listOfFiles = folder.listFiles();
		for(File file:listOfFiles){
			Team team = this.getTeam(file);
			teams.add(team);
		}
		LOGGER.info("returning all teams");
		return teams;
	}
	
	
	public List<Team> getMainTeams(){
		List<Team> teams = new ArrayList<Team>();
		File folder = new File(filePath);
		LOGGER.info("looking for all team files");
		File[] listOfFiles = folder.listFiles();
		for(File file:listOfFiles){
			Team team = this.getTeam(file);
			if(team.isMain()){
				teams.add(team);
			}
		}
		LOGGER.info("returning main teams");
		return teams;
	}
	
	public void exportTeams(){
		FileWriter writer = null;
		try{
			writer = new FileWriter(exportPath + "data.csv");
		    List<Team> allTeams = this.getAllTeams();
		    writeCsvHeader(writer);
		    for(Team team:allTeams){
			    writeTeamInformation(writer, team);
			    for(Player player:team.getPlayers()){
				    writePlayerInformation(writer, player);
			    }
		 
		    }
		}
		catch(IOException e)
		{
			throw new ManagerException(ErrorType.FILE_TEAM_READ_ERROR, e);
		} finally{
			try{
			    writer.flush();
			    writer.close();
			} catch (Exception e) {
				throw new ManagerException(ErrorType.FILE_TEAM_READ_ERROR, e);
			}
		}
		
	}
	
	public Double getAverageAge() {
		List<Team> allTeams = this.getAllTeams();
		int counter = 0;
		Double total = 0.0;
		for(Team team:allTeams){
			for(Player player:team.getPlayers()){
				counter++;
				String[] split = player.getBirthday().split("/");
				LocalDate birthday = new LocalDate(Integer.valueOf(split[2]).intValue(), Integer.valueOf(split[1]).intValue(),  Integer.valueOf(split[0]).intValue());
				LocalDate now = new LocalDate();
				Years age = Years.yearsBetween(birthday, now);
				total += age.getYears();
			}
		}
		total = total/counter;
		return total;
	}
	
	public List<String> getAllTeamsNames() {
		List<String> teams = new ArrayList<String>();
		File folder = new File(filePath);
		LOGGER.info("looking for all team files");
		File[] listOfFiles = folder.listFiles();
		for(File file:listOfFiles){
			Team team = this.getTeam(file);
			teams.add(team.getName());
		}
		LOGGER.info("returning all teams names");
		return teams;
	}

	private void writePlayerInformation(FileWriter writer, Player player) throws IOException {
		writer.append(player.getName());
		writer.append(COMMA);
		writer.append(player.getLastName());
		writer.append(COMMA);
		writer.append(player.getBirthday());
		writer.append(COMMA);
		writer.append(player.getNick());
		writer.append(COMMA);
		writer.append(player.getIdNumber());
		writer.append(COMMA);
		writer.append(player.getRole().getDescription());
		writer.append(COMMA);
		if(player.isCaptain()){
		    writer.append("true");
		    writer.append(COMMA);
		}else{
			writer.append("false");
		    writer.append(COMMA);
		}
		writer.append(player.getSteam());
		writer.append(COMMA);
		writer.append(player.getDotabuff());
		writer.append(COMMA);
		writer.append(player.getCountry().getDescription());
		writer.append(COMMA);
		writer.append(player.getState());
		writer.append(COMMA);
		writer.append(player.getCity());
		writer.append(COMMA);
		writer.append(player.getNeighbourhood());
		writer.append(COMMA);
		writer.append(player.getPictureUrl());
		writer.append(COMMA);
	}

	private void writeTeamInformation(FileWriter writer, Team team) throws IOException {
		writer.append('\n');
		writer.append(team.getName());
		writer.append(COMMA);
		writer.append(team.getTag());
		writer.append(COMMA);
		writer.append(team.getCreationDate().toString());
		writer.append(COMMA);
		writer.append(team.getMail());
		writer.append(COMMA);
		writer.append(team.getTwitter());
		writer.append(COMMA);
		writer.append(team.getWeb());
		writer.append(COMMA);
		writer.append(team.getImageUrl());
		writer.append(COMMA);
	}

	private void writeCsvHeader(FileWriter writer) throws IOException {
		writer.append("Name");
		writer.append(COMMA);
		writer.append("Tag");
		writer.append(COMMA);
		writer.append("Creation Date");
		writer.append(COMMA);
		writer.append("Mail");
		writer.append(COMMA);
		writer.append("Twitter");
		writer.append(COMMA);
		writer.append("Web");
		writer.append(COMMA);
		writer.append("Logo Url");
		writer.append(COMMA);
		
		for(int i=1; i<=7; i++){
			writer.append("Player "+i+" Name");
		    writer.append(COMMA);
		    writer.append("Player "+i+" Last Name");
		    writer.append(COMMA);
		    writer.append("Player "+i+" Birthday");
		    writer.append(COMMA);
		    writer.append("Player "+i+" Nick");
		    writer.append(COMMA);
		    writer.append("Player "+i+" Id Number");
		    writer.append(COMMA);
		    writer.append("Player "+i+" Role");
		    writer.append(COMMA);
		    writer.append("Player "+i+" Captain");
		    writer.append(COMMA);
		    writer.append("Player "+i+" Steam Url");
		    writer.append(COMMA);
		    writer.append("Player "+i+" Dotabuff");
		    writer.append(COMMA);
		    writer.append("Player "+i+" Country");
		    writer.append(COMMA);
		    writer.append("Player "+i+" State");
		    writer.append(COMMA);
		    writer.append("Player "+i+" City");
		    writer.append(COMMA);
		    writer.append("Player "+i+" Neighbourhood");
		    writer.append(COMMA);
		    writer.append("Player "+i+" Picture Url");
		    writer.append(COMMA);
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
