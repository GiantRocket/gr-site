package com.giantrocket.site.data.model;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

//TODO ver que hacemos con esto... vamos a poner todos los estados de todos los paises? quizas hay que asociarlo a un Country, y los nombres deberian estar en otro lado
public enum State {

	BUENOS_AIRES("Buenos Aires"),
	CATAMARCA("Catamarca"),
	CHACO("Chaco"),
	CHUBUT("Chubut"),
	CORDOBA("C�rdoba"),
	CORRIENTES("Corrientes"),
	ENTRE_RIOS("Entre R�os"),
	FORMOSA("Formosa"),
	JUJUY("Jujuy"),
	LA_PAMPA("La Pampa"),
	LA_RIOJA("La Rioja"),
	MENDOZA("Mendoza"),
	MISIONES("Misiones"),
	NEUQUEN("Neuqu�n"),
	RIO_NEGRO("R�o Negro"),
	SALTA("Salta"),
	SAN_JUAN("San Juan"),
	SAN_LUIS("San Luis"),
	SANTA_CRUZ("Santa Cruz"),
	SANTA_FE("Santa Fe"),
	SANTIAGO_DEL_ESTERO("Santiago del Estero"),
	TIERRA_DEL_FUEGO("Tierra del Fuego"),
	TUCUMAN("Tucum�n");
	
	private final String description; 
	private static final Map<String, State> LOOKUP = new HashMap<String, State>();

    static {
        for (State s : EnumSet.allOf(State.class)) {
            LOOKUP.put(s.getDescription(), s);
        }
    }

    private State(String description) {
        this.description = description;
    }

    public static State getByDescription(String description) {
        return LOOKUP.get(description);
    }

    public String getDescription() {
        return this.description;
    }
	
	
}
