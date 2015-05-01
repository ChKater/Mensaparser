package de.luh.sim.mensaparser.model;

/**
 * Enum für die Wochentage
 */
public enum Day {

	/**
	 * Montag
	 */
	MONDAY("Montag"),
	/**
	 * Dienstag
	 */
	TUESDAY("Dienstag"), 
	/**
	 * Mittwoch
	 */
	WEDNESDAY("Mittwoch"), 
	/**
	 * Donnerstag
	 */
	THURSDAY("Donnerstag"), 
	/**
	 * Freitag
	 */
	FRIDAY("Freitag"), 
	/**
	 * Samstag
	 */
	SATURDAY("Samstag"), 
	/**
	 * Sontag
	 */
	SUNDAY("Sonntag"), 
	/**
	 * Heute
	 */
	TODAY("Heute");

	private String german;

	private Day(String german) {
		this.german = german;
	}

	/**
	 * Gibt die deutsche Bezeichnug zurück.
	 * @return Deutsche Bezeichnung.
	 */
	public String getGerman() {
		return german;
	}
	
	/**
	 * Gibt den Tag anhand passend zum übergenen Tag in der Woche. 0 = Sonntag, 1 = Montag, ..., 6 = Samstag. Sonst = Heute
	 * @param dayOfWeek Tag der Woche. Beginnedn bei 0 = Sonntag
	 * @return Tag passend zum Wochentag
	 */
	public static Day getDay(int dayOfWeek){
		switch (dayOfWeek) {
		case 0:
			return SUNDAY;
		case 1:
			return MONDAY;
		case 2:
			return TUESDAY;
		case 3:
			return WEDNESDAY;
		case 4:
			return THURSDAY;
		case 5:
			return FRIDAY;
		case 6:
			return SATURDAY;
		default:
			return TODAY;
		}
	}
	
	/**
	 * Gibt den Tag anhand der deutschen Bezeichnung zurück. 
	 * @param german Deutsche Bezeichnung
	 * @return Day-Objekt passend zur übergebenen Bezeichnung. 
	 */
	public static Day getDay(String german){
		for (Day day : Day.values()) {
			if(german.equals(day.german)){
				return day;
			}
		}
		return TODAY;
	}

}
