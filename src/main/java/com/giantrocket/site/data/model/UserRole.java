package com.giantrocket.site.data.model;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum UserRole {

	PLAYER("Player"),
	MANAGER("Manager");
	
    private final String description;
    private static final Map<String, UserRole> LOOKUP = new HashMap<String, UserRole>();

    static {
        for (UserRole s : EnumSet.allOf(UserRole.class)) {
            LOOKUP.put(s.getDescription(), s);
        }
    }

    private UserRole(String description) {
        this.description = description;
    }

    public static UserRole getByDescription(String description) {
        return LOOKUP.get(description);
    }

    public String getDescription() {
        return this.description;
    }
	
}
