package com.giantrocket.team.data.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;

import com.esotericsoftware.yamlbeans.YamlException;
import com.esotericsoftware.yamlbeans.YamlReader;
import com.esotericsoftware.yamlbeans.YamlWriter;
import com.giantrocket.team.data.model.Match;
import com.giantrocket.team.exceptions.ErrorType;
import com.giantrocket.team.exceptions.ManagerException;

public class MatchService {
	
	@Value("${com.giantrocket.match.filepath}")
	private String filePath;
    private static Logger LOGGER = Logger.getLogger(MatchService.class);
	
	public void saveMatch(Match match) {
		String filePath = createFilePath(match.getId());
		LOGGER.info("creating file on "+filePath);
		File matchFile = new File(filePath);
		YamlWriter writer = null;
		try {
			writer = new YamlWriter(new FileWriter(matchFile));
			writer.getConfig().setClassTag("Match", Match.class);
			writer.write(match);
		} catch (Exception e) {
			throw new ManagerException(ErrorType.FILE_MATCH_WRITE_ERROR, e);
		}finally{
			try {
				writer.close();
			} catch (YamlException e) {
				throw new ManagerException(ErrorType.FILE_MATCH_WRITE_ERROR, e);
			}
		}

		LOGGER.info("succesfully created match");
	}

	public Match getMatch(String matchId){
		String filePath = createFilePath(matchId);
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(filePath);
		} catch (FileNotFoundException fileNotFound) {
			throw new ManagerException(ErrorType.MATCH_NOT_FOUND, fileNotFound);
		}
		YamlReader reader = null;
		try{
			reader = new YamlReader(fileReader);
			reader.getConfig().setClassTag("Match", Match.class);
			Match match = (Match) reader.read();
			reader.close();
			return match;
		}catch(Exception e){
			throw new ManagerException(ErrorType.FILE_MATCH_READ_ERROR, e);
		}finally{
			try {
				reader.close();
			} catch (Exception e) {
				throw new ManagerException(ErrorType.FILE_MATCH_READ_ERROR, e);
			}
		}
	}
	
	public Match getMatch(File matchFile){
		FileReader fileReader = null;
		try {
			fileReader = new FileReader(matchFile);
		} catch (FileNotFoundException fileNotFound) {
			throw new ManagerException(ErrorType.MATCH_NOT_FOUND, fileNotFound);
		}
		YamlReader reader = null;
		try{
			reader = new YamlReader(fileReader);
			reader.getConfig().setClassTag("Match", Match.class);
			Match match = (Match) reader.read();
			reader.close();
			return match;
		}catch(Exception e){
			throw new ManagerException(ErrorType.FILE_MATCH_READ_ERROR, e);
		}finally{
			try {
				reader.close();
			} catch (Exception e) {
				throw new ManagerException(ErrorType.FILE_MATCH_READ_ERROR, e);
			}
		}
	}
	
	public Map<String,Match> getAllMatches(){
		Map<String,Match> matches = new HashMap<String,Match>();
		File folder = new File(filePath);
		LOGGER.info("looking for all match files");
		File[] listOfFiles = folder.listFiles();
		for(File file:listOfFiles){
			Match match = this.getMatch(file);
			matches.put(match.getId(),match);
		}
		LOGGER.info("returning all matches");
		return matches;
	}
	
	public List<Match> getFinishedMatches(){
		List<Match> matches = new ArrayList<Match>();
		File folder = new File(filePath);
		LOGGER.info("looking for all match files");
		File[] listOfFiles = folder.listFiles();
		for(File file:listOfFiles){
			Match match = this.getMatch(file);
			if(!StringUtils.isEmpty(match.getWinner())){
				matches.add(match);
			}
		}
		LOGGER.info("returning all matches");
		return matches;
	}
	
	public boolean deleteMatch(String matchId) {
		String filePath = createFilePath(matchId);
		File file = new File(filePath);
		return FileUtils.deleteQuietly(file);
	}
	
	private String createFilePath(String matchId) {
		String fileName = matchId.toLowerCase().replaceAll("\\s+","");
		return filePath + fileName + ".yml";
	}

}
