package com.giantrocket.site.data.model;


public enum State {

	BUENOS_AIRES(Country.ARGENTINA),
	CATAMARCA(Country.ARGENTINA),
	CHACO(Country.ARGENTINA),
	CHUBUT(Country.ARGENTINA),
	CORDOBA(Country.ARGENTINA),
	CORRIENTES(Country.ARGENTINA),
	ENTRE_RIOS(Country.ARGENTINA),
	FORMOSA(Country.ARGENTINA),
	JUJUY(Country.ARGENTINA),
	LA_PAMPA(Country.ARGENTINA),
	LA_RIOJA(Country.ARGENTINA),
	MENDOZA(Country.ARGENTINA),
	MISIONES(Country.ARGENTINA),
	NEUQUEN(Country.ARGENTINA),
	RIO_NEGRO(Country.ARGENTINA),
	SALTA(Country.ARGENTINA),
	SAN_JUAN(Country.ARGENTINA),
	SAN_LUIS(Country.ARGENTINA),
	SANTA_CRUZ(Country.ARGENTINA),
	SANTA_FE(Country.ARGENTINA),
	SANTIAGO_DEL_ESTERO(Country.ARGENTINA),
	TIERRA_DEL_FUEGO(Country.ARGENTINA),
	TUCUMAN(Country.ARGENTINA);
	
	private final Country country; 

    private State(Country country) {
        this.country = country;
    }

	public Country getCountry() {
		return country;
	}

}
