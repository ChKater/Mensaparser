package de.luh.sim.mensaparser.parser;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import de.luh.sim.mensaparser.model.Day;
import de.luh.sim.mensaparser.model.Ingredient;
import de.luh.sim.mensaparser.model.Meal;
import de.luh.sim.mensaparser.model.Mensa;
import de.luh.sim.mensaparser.model.Week;

class DummyGenerator {

	static void generateDummy() throws IOException{
		int listCount = 0;
		int mealCount = 0;
		int mapCount = 0;
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(
				"Test.txt", false));
		
		for (Week week : Week.values()) {
			for (Mensa mensa : Mensa.values()) {
				bw = new BufferedWriter(new FileWriter(
						mensa.getName() +  "_" + week.getName() +".txt", false));
				bw.write("Map<Day, List<Meal>> map" + mapCount + " = mealsDummy.get(Week.getWeek(\"" + week.getName() + "\")).get(Mensa.getMensa(\"" + mensa.getName() + "\"));\n");
				for (Day day : Day.values()) {
					if(day == Day.TODAY){
						continue;
					}
					List<Meal> meals = MensaParser.getMeals(week, mensa, day);
					bw.write("\n");
					bw.write("List<Meal> meals" + listCount + " = new ArrayList<>();\n");
					for (Meal meal : meals) {
						bw.write("List<Ingredient> ingredients" + mealCount + " = new ArrayList<>();\n");
						for (Ingredient ingredient : meal.getIngredients()) {
							bw.write("ingredients" + mealCount + ".add(Ingredient.getIngredientFromName(\"" +ingredient.getName()+ "\"));\n");
						}
						bw.write("double[] price" + mealCount + " = {" + meal.getPrice()[0] + ", " + meal.getPrice()[1] + ", " +meal.getPrice()[2] +"};\n");
						bw.write("Meal meal" + mealCount + " = new Meal(ingredients" + mealCount + ", \"" + meal.getName() + "\", Type.getType(\"" + meal.getType().getName() + "\"), price" + mealCount + ");\n");
						bw.write("meals" + listCount + ".add(meal" + mealCount + ");\n");
						bw.write("\n");
						mealCount++;
					}
					
					bw.write("map" + mapCount + ".put(Day.getDay(\"" + day.getGerman() + "\"), meals" + listCount + ");\n");
					listCount++;
					bw.write("\n");
					
				}
				mapCount++;
				bw.close();
			}
			
		}
	}
}
