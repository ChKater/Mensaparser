package de.luh.sim.mensaparser.model;

/**
 * Enum für die Mensen des Studentwerks Hannover
 *
 */
public enum Mensa implements Comparable<Mensa>{

	/**
	 * TiHo-Tower
	 */
	TIHO_TOWER("TiHo-Tower", 0),
	/**
	 * Mensa Caballus
	 */
	CABALLUS("Mensa Caballus",1),
	/**
	 * Hauptmensa
	 */
	HAUPTMENSA("Hauptmensa", 2), 
	/**
	 * Marktstand Hauptmensa
	 */
	MARKTSTAND("Marktstand Hauptmensa", 9),
	/**
	 * Contine
	 */
	CONTINE("Contine",3), 
	/**
	 * Mensa Ricklinger Stadtweg
	 */
	RICKLINGER_STADTWEG("Mensa Ricklinger Stadtweg", 6),
	/**
	 * Mensa Große Pause
	 */
	GROSSE_PAUSE("Mensa Große Pause", 7),
	/**
	 * Mensa HMTMH
	 */
	HMTMH("Mensa HMTMH", 8),
	/**
	 * Mensa PZH
	 */
	PZH("Mensa PZH", 13), 
	/**
	 * Mensa Blumhardtstraße
	 */
	BLUMHARDSTRASSE("Mensa Blumhardtstraße", 14);
	
	
	
	String name;
	int id;
	
	private Mensa(String name, int id) {
		this.name = name;
		this.id = id;
	}

	/**
	 * Gibt den Namen der Mensa zurück
	 * @return Name der Mensa
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gibt die Studentenwerk interne ID der Mensa zurück. 
	 * @return Interne Mensa ID
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Gibt die Mensa anhand des Namens zurück. Wenn keine Übereinstimmung gefunden wird, wird HAUPTMENSA zurückgegeben. 
	 * @param name Name der Mensa
	 * @return Mensa
	 */
	public static Mensa getMensa(String name){
		for (Mensa mensa : Mensa.values()) {
			if(name.equals(mensa.getName())){
				return mensa;
			}
		}
		return HAUPTMENSA;
	}
	

	
	
}
