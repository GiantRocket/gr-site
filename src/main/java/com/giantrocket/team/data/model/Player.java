package com.giantrocket.team.data.model;

import com.giantrocket.team.data.model.dota.Role;




public class Player {
	
	private String name;
	private String lastName;
	private String nick;
	private String birthday;
	private String idNumber;
	private Role role;
	private boolean captain;
//	private List<Hero> favouriteHeroes;
	private String steam;
	private String dotabuff;
	private Country country;
	private String state;
	private String city;
	private String neighbourhood;
	private String pictureUrl;
	
	public String getName() {
		if(name==null){
			name="";
		}
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		if(lastName==null){
			lastName="";
		}
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getNick() {
		if(nick==null){
			nick="";
		}
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
//	public List<Hero> getFavouriteHeroes() {
//		return favouriteHeroes;
//	}
//	public void setFavouriteHeroes(List<Hero> favouriteHeroes) {
//		this.favouriteHeroes = favouriteHeroes;
//	}
	public String getSteam() {
		if(steam==null){
			steam="";
		}
		return steam;
	}
	public void setSteam(String steam) {
		this.steam = steam;
	}
	public String getDotabuff() {
		if(dotabuff==null){
			dotabuff="";
		}
		return dotabuff;
	}
	public void setDotabuff(String dotabuff) {
		this.dotabuff = dotabuff;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public String getState() {
		if(state==null){
			state="";
		}
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		if(city==null){
			city="";
		}
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getNeighbourhood() {
		if(neighbourhood==null){
			neighbourhood="";
		}
		return neighbourhood;
	}
	public void setNeighbourhood(String neighbourhood) {
		this.neighbourhood = neighbourhood;
	}
	public String getPictureUrl() {
		if(pictureUrl==null){
			pictureUrl="";
		}
		return pictureUrl;
	}
	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}
	public boolean isCaptain() {
		return captain;
	}
	public void setCaptain(boolean captain) {
		this.captain = captain;
	}
	public String getIdNumber() {
		if(idNumber==null){
			idNumber="";
		}
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public String getBirthday() {
		if(birthday==null){
			birthday="";
		}
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	
}
