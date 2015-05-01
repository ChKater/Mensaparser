package de.luh.sim.mensaparser.parser;

import java.util.ArrayList;
import java.util.List;

import org.unbescape.html.HtmlEscape;

import de.luh.sim.mensaparser.model.Meal;

class DayParser {

	public static List<Meal> parseDay(String toParse){
		List<Meal> meals = new ArrayList<Meal>(11);
		
		String html = HtmlEscape.unescapeHtml(toParse); 
		if(!html.contains("<br />")){
			return meals;
		}
		if(html.length() > 8){
			html = html.substring(8, html.length() - 10);
		}
		String[] mealsStr = html.split("</li><li>");
		for (int j = 0; j < mealsStr.length; j++) {
			meals.add(MealParser.parseMeal(mealsStr[j]));
		}
		
		return meals;
	}
	
}
