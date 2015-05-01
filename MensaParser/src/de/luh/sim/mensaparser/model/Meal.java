package de.luh.sim.mensaparser.model;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Collection;
import java.util.List;
import java.util.Locale;

/**
 * Ein Gericht des Studentenwerks Hannover<br>
 * 
 * Ein Gericht hat einen Namen, sowie einen Preis für Studenten / Mitarbeiter / Gäste. Sowie den Aufgang (type) und eine Liste der Inhaltsstoffe.
 */
public class Meal {

	private static NumberFormat formatter = DecimalFormat
			.getCurrencyInstance(Locale.GERMANY);
	private List<Ingredient> ingredients;
	private String name;
	private Type type;
	private double[] price;

	/**
	 * Erzeugt eine neues Meal-Objekt
	 * 
	 * @param ingredients
	 *            Inhaltsstoffe
	 * @param name
	 *            Name des Gerichts
	 * @param type
	 *            Aufgang des Gerichts
	 * @param price
	 *            Preise für Studenten / Mitarbeiter / Gäste
	 */
	public Meal(List<Ingredient> ingredients, String name, Type type,
			double[] price) {
		super();
		this.ingredients = ingredients;
		this.name = name;
		this.type = type;
		this.price = price;
	}

	/**
	 * Gibt die Inhaltsstoffe zurück.
	 * 
	 * @return Inhaltsstoffe
	 */
	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	/**
	 * Gibt den Namen des Gerichts zurück.
	 * 
	 * @return Name des Gerichts.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Gibt die Preise des Gerichts an. Am Index 0 ist der Preis für Studenten
	 * hinterlegt. Am Index 1 ist der Preis für Mitarbeiter hinterlegt. Am Index
	 * 2 ist der Preis für Gäste hinterlegt.
	 * 
	 * @return Preise des Gerichts
	 */
	public double[] getPrice() {
		return price;
	}

	/**
	 * Gibt den Aufgang des Gerichts zurück. 
	 * @return Aufgang
	 */
	public Type getType() {
		return type;
	}

	/**
	 * Gibt das Gericht nach Folgendem Muster zurück:<br>
	 * 
	 * type<br>
	 * Name<br>
	 * InhalteStoffe: Inhalststoff 1, Inhalststoff 2, ...<br>
	 * Preis (Student/Mitarbeiter/Gast): Preis_Student € / Preis_Mitarbeiter € / Preis_Gast €<br>
	 */
	public String toString() {
		String toString = type + "\n";
		toString += name + "\n";
		toString += "Inhaltsstoffe: ";
		for (Ingredient ingredient : ingredients) {
			toString += ingredient + ", ";
		}
		toString += "\n";
		toString += "Preis (Student/Mitarbeiter/Gast): "
				+ formatter.format(price[0]) + " / "
				+ formatter.format(price[1]) + " / "
				+ formatter.format(price[2]) + "\n";

		return toString;
	}

	/**
	 * Gibt an, ob dieses Gericht mindestens eins der Übergebenen Inhaltsstoffe beinhaltet. 
	 * @param ingredients Zu überprüfende Inhaltsstoffe
	 * @return false, wenn keins der übergebenen Inhalststoffe im Gericht vorkommt. Sonst true.
	 */
	public boolean containsIngredient(Collection<Ingredient> ingredients) {
		for (Ingredient ingredient : ingredients) {
			if (this.ingredients.contains(ingredient)) {
				return true;
			}
		}
		return false;
	}

}
