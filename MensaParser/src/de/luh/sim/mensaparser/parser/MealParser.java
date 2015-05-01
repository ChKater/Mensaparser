package de.luh.sim.mensaparser.parser;

import java.util.ArrayList;
import java.util.List;

import de.luh.sim.mensaparser.model.Ingredient;
import de.luh.sim.mensaparser.model.Meal;
import de.luh.sim.mensaparser.model.Type;

class MealParser {

	public static Meal parseMeal(String toParse) {
		// parse type. Type always ends with <br />
		int br = toParse.indexOf("<");
		Type type = null;
		try {
			type = Type.getType(toParse.substring(0, br));
		} catch (Exception e) {
			System.out.println(toParse);
			e.printStackTrace();
		}
		String remain = toParse.substring(br + 6);

		// parse name. We assume that there are no ( or ) in the name. If we do,
		// the ingredients starts with the first (
		int ingredientsStart = remain.indexOf("(");
		String name = remain.substring(0, ingredientsStart - 1);
		remain = remain.substring(ingredientsStart);

		// parse ingredients. All ingredients have the pattern (id)
		int ingrStart = remain.indexOf("(");
		int ingrEnd = remain.indexOf(")");
		List<Ingredient> ingredients = new ArrayList<>();
		while (ingrStart != -1 && ingrEnd != -1) {
			ingredients.add(Ingredient.getIngredient(remain.substring(
					ingrStart + 1, ingrEnd)));
			remain = remain.substring(ingrEnd + 1);
			ingrStart = remain.indexOf("(");
			ingrEnd = remain.indexOf(")");
		}

		// parse price. The Prices have the pattern
		// price,Studen€/price,Employee€/price,Guest€
		String[] pricesStr = remain.trim().split("/");
		double[] prices = new double[3];
		for (int i = 0; i < prices.length; i++) {
			prices[i] = Double.parseDouble(pricesStr[i].substring(0,
					pricesStr[i].length() - 1).replace(",", "."));
		}		
		
		return new Meal(ingredients, name, type, prices);

	}

}
