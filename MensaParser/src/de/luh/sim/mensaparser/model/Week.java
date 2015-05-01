package de.luh.sim.mensaparser.model;

/**
 * Enum für die Woche. Es können Gerichte der Aktuellen oder Nächsten Woche angezeigt werden. 
 *
 */
public enum Week {
	
	/**
	 * Aktuelle
	 */
	THIS(2, "Aktuelle"), 
	/**
	 * Naechste
	 */
	NEXT(3, "Naechste");
	
	private int timeID;
	private String name;

	
	private Week(int timeID, String name) {
		this.timeID = timeID;
		this.name = name;
	}


	/**
	 * Gibt die Studentenwerk interne ID der Woche zurück.
	 * @return Studentenwerk interne ID
	 */
	public int getTimeID() {
		return timeID;
	}


	/**
	 * Gibt den Namen der Woche zurück. 
	 * @return Namen der Woche.
	 */
	public String getName() {
		return name;
	}


	/**
	 * Gibt die Woche anhand des Namens zurück. Wenn keine Übereinstimmung gefunden wird, wird THIS zurückgegeben. 
	 * @param name Name der Woche (Aktuelle oder Naechste)
	 * @return Woche
	 */
	public static Week getWeek(String name){
		for (Week week : values()) {
			if(name.equals(week.getName())){
				return week;
			}
		}
		return THIS;
	}

	
	
	
	
	
}
