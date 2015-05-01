package de.luh.sim.mensaparser.model;

/**
 * Enum für die Inhalststoffe
 */
public enum Ingredient {

	/**
	 * Farbstoff
	 */
	FARBSTOFF("1", "Farbstoff"), 
	/**
	 * Konservierungsstoff
	 */
	KONSERVIERUNGSSTOFF("2", "Konservierungsstoff"), 
	/**
	 * Antioxidationsmittel
	 */
	ANTIOXIDATIONSMITTEL("3", "Antioxidationsmittel"), 
	/**
	 * Geschmacksverstärker
	 */
	GESCHMACKSVERSTAERKER("4", "Geschmacksverstärker"), 
	/**
	 * geschwefelt
	 */
	GESCHWEFELT("5", "geschwefelt"), 
	/**
	 * geschwärzt
	 */
	GESCHWAERZT("6", "geschwärzt"), 
	/**
	 * gewachst
	 */
	GEWACHST("7", "gewachst"), 
	/**
	 * Phosphat
	 */
	PHOSPHAT("8","Phosphat"), 
	/**
	 * Süßungsmittel
	 */
	SUESSUNGSMITTEL("9", "Süßungsmittel"), 
	/**
	 * mit einer Zuckerart u. Süßungsmittel
	 */
	ZUCKER("11","mit einer Zuckerart u. Süßungsmittel"), 
	/**
	 * Nitritpökelsalz
	 */
	NITRITPOEKELSALZ("12", "Nitritpökelsalz"), 
	/**
	 * Glutenhaltiges Getreide
	 */
	GLUTEN("20", "Glutenhaltiges Getreide"),
	/**
	 * Krebstiere und Krebstiererzeugnisse
	 */
	KREBS("21", "Krebstiere und Krebstiererzeugnisse"),
	/**
	 * Eier und Eiererzeugnisse
	 */
	EIER("22","Eier und Eiererzeugnisse"),
	/**
	 * Fisch und Fischerzeugnisse
	 */
	FISCH("23","Fisch und Fischerzeugnisse"),
	/**
	 * Erdnüsse und Erdnusserzeugnisse
	 */
	ERDNUSS("24", "Erdnüsse und Erdnusserzeugnisse"),
	/**
	 * Soja und Sojaerzeugnisse
	 */
	SOJA("25","Soja und Sojaerzeugnisse"),
	/**
	 * Milch und Milcherzeugnisse
	 */
	MILCH("26", "Milch und Milcherzeugnisse"),
	/**
	 * Schalenfrüchte
	 */
	SCHALENFRUECHTE("27", "Schalenfrüchte"),
	/**
	 * Sellerie und Sellerieerzeugnisse
	 */
	SELLERIE("28", "Sellerie und Sellerieerzeugnisse"),
	/**
	 * Senf und Senferzeugnisse
	 */
	SENF("29","Senf und Senferzeugnisse"),
	/**
	 * Sesamsamen und Sesamsamenerzeugnisse
	 */
	SESAM("30", "Sesamsamen und Sesamsamenerzeugnisse"),
	/**
	 * Schwefeldioxid und Sulfite > 10 mg/kg
	 */
	SCHWEFEL("31","Schwefeldioxid und Sulfite > 10 mg/kg"),
	/**
	 * Lupine und Lupinenerzeugnisse
	 */
	LUPINE("32", "Lupine und Lupinenerzeugnisse"),
	/**
	 * Weichtiere und Weichtiererzeugnisse
	 */
	WEICHTIERE("33", "Weichtiere und Weichtiererzeugnisse"),
	/**
	 * mit Alkohol
	 */
	ALKOHOL("a", "mit Alkohol"),
	/**
	 * nachhaltige Fischerei
	 */
	NACHHALTIGE_FISCHEREI("", "nachhaltige Fischerei"),
	/**
	 * Geflügelfleisch
	 */
	GEFLUEGEL("g", "Geflügelfleisch"),
	/**
	 * artger. Tierhaltung
	 */
	ARTGERECHTE_TIERHALTUNG("", "artger. Tierhaltung"),
	/**
	 * mit Knoblauch
	 */
	KNOBLAUCH("k", "mit Knoblauch"),
	/**
	 * Natürlich frisch!
	 */
	NATUERLICH_FRISCH("n", "Natürlich frisch!"),
	/**
	 * Rindfleisch
	 */
	RIND("r", "Rindfleisch"),
	/**
	 * Schweinefleisch
	 */
	SCHWEIN("s", "Schweinefleisch"),
	/**
	 * ohne Fleisch
	 */
	VEGETARISCH("v", "ohne Fleisch"),
	/**
	 * Unbekannt
	 */
	UNBEKANNT("" , "Unbekannt");

	private String id;
	private String name;

	private Ingredient(String id, String name) {
		this.name = name;
		this.id = id;
	}
	
	/**
	 * Gibt den Namen des Inhalststoffs zurück.
	 * @return Name des Inhalststoffs
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * Gibt die Studentenwerk interne RSS Bezeichnung des Inhaltsstoffs zurück
	 * @return Interne RSS Bezeichnung des Inhalststoffs
	 */
	public String getID(){
		return id;
	}
	
	/**
	 * Gibt den Inhaltsstoff anhand der internen RSS Bezeichnung zurück. Wenn keine Übereinstimmung gefunden wird, wird UNBEKANNT zurückgegeben. 
	 * @param id Interne RSS Bezeichnung 
	 * @return Inhaltsstoff
	 */
	public static Ingredient getIngredient(String id){
		for (Ingredient ingredient : Ingredient.values()) {
			if(id.equals(ingredient.getID())){
				return ingredient;
			}
		}
		return UNBEKANNT;
	}
	
	/**
	 * Gibt den Inhaltsstoff anhand des Names zurück. Wenn keine Übereinstimmung gefunden wird, wird UNBEKANNT zurückgegeben. 
	 * @param name Name des Inhalststoffs
	 * @return Inhaltsstoff
	 */
	public static Ingredient getIngredientFromName(String name){
		for (Ingredient ingredient : Ingredient.values()) {
			if(name.equals(ingredient.getName())){
				return ingredient;
			}
		}
		return UNBEKANNT;
	}
	
	/**
	 * Gibt den Namen des Inhaltsstoffs zurück
	 * @return Name des Inhalststoffs
	 */
	public String toString(){
		return name;
	}
	

	
}
