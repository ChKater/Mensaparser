package de.luh.sim.mensaparser.model;

/**
 * Enum für den Aufgang in einer Mensa
 *
 */
public enum Type {

	/**
	 * Eintopf
	 */
	EINTOPF("Eintopf"),
	/**
	 * Tellergericht
	 */
	TELLERGERICHT("Tellergericht"),
	/**
	 * Wahlmenü (Komponente mit Fleisch)
	 */
	WAHLMENUE_MIT_FLEISCH("Wahlmenü (Komponente mit Fleisch)"),
	/**
	 * Wahlmenü (Komponente ohne Fleisch)
	 */
	WAHLMENUE_OHNE_FLEISCH("Wahlmenü (Komponente ohne Fleisch)"),
	/**
	 * Wahlmenü (Beilage)
	 */
	WAHLMENUE_BEILAGE("Wahlmenü (Beilage)"),
	/**
	 * Wahlmenü (Gemüse)
	 */
	WAHLMENUE_GEMUESE("Wahlmenü (Gemüse)"),
	/**
	 * Wahlmenü (Salat)
	 */
	WAHLMENUE_SALAT("Wahlmenü (Salat)"),
	/**
	 * Wahlmenü (Dessert)
	 */
	WAHLMENUE_DESSERT("Wahlmenü (Dessert)"),
	/**
	 * Wahlmenü (Suppe)
	 */
	WAHLMENUE_SUPPE("Wahlmenü (Suppe)"),
	/**
	 * Menü
	 */
	MENUE("Menü"),
	/**
	 * Unbekannt
	 */
	UNBEKANNT("Unbekannt");
	
	
	private String name;
	
	private Type(String name){
		this.name = name;
	}
	
	/**
	 * Gibt den Namen des Aufgangs zurück
	 * @return Name
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * Gibt den Namen des Aufgangs zurück
	 * @return Name
	 */
	public String toString(){
		return name;
	}
	
	
	/**
	 * Gibt die Aufgang anhand des Namens zurück. Wenn keine Übereinstimmung gefunden wird, wird UNBEKANNT zurückgegeben. 
	 * @param name Name des Aufgangs
	 * @return Aufgang
	 */
	public static Type getType(String name){
		for (Type type : Type.values()) {
			if(name.equals(type.getName())){
				return type;
			}
		}
		return UNBEKANNT;
	}
}
