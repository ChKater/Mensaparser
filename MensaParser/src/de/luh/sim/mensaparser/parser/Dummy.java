package de.luh.sim.mensaparser.parser;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.luh.sim.mensaparser.model.Day;
import de.luh.sim.mensaparser.model.Ingredient;
import de.luh.sim.mensaparser.model.Meal;
import de.luh.sim.mensaparser.model.Mensa;
import de.luh.sim.mensaparser.model.Type;
import de.luh.sim.mensaparser.model.Week;

class Dummy {

	public static Map<Week, Map<Mensa, Map<Day, List<Meal>>>> fillDummy(){
		Map<Week, Map<Mensa, Map<Day, List<Meal>>>> mealsDummy = new HashMap<>(); 
		for (Week week : Week.values()) {
			Map<Mensa, Map<Day, List<Meal>>> mensas = new HashMap<>();
			for (Mensa mensa : Mensa.values()) {
				Map<Day, List<Meal>> mealsPerDay = new HashMap<>();
				mensas.put(mensa, mealsPerDay);
			}
			mealsDummy.put(week, mensas);
		}
		fillContineDummy(mealsDummy);
		fillHauptmensaDummy(mealsDummy);
		fillMarktstand(mealsDummy);
		fillBSDummy(mealsDummy);
		fillCabalusDummy(mealsDummy);
		fillGPDummy(mealsDummy);
		fillHMTMHDummy(mealsDummy);
		fillPZHDummy(mealsDummy);
		fillRicklDummy(mealsDummy);
		fillTihoDummy(mealsDummy);
		
		return mealsDummy;
	}
	
	private static void fillMarktstand(
			Map<Week, Map<Mensa, Map<Day, List<Meal>>>> mealsDummy) {
		Map<Day, List<Meal>> map3 = mealsDummy.get(Week.getWeek("Aktuelle")).get(Mensa.getMensa("Marktstand Hauptmensa"));

		List<Meal> meals21 = new ArrayList<>();
		List<Ingredient> ingredients134 = new ArrayList<>();
		ingredients134.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients134.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients134.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients134.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		double[] price134 = {4.6, 5.1, 6.1};
		Meal meal134 = new Meal(ingredients134, "Gurken-Fenchel-Salat mit scharfem Huhn", Type.getType("Menü"), price134);
		meals21.add(meal134);

		List<Ingredient> ingredients135 = new ArrayList<>();
		ingredients135.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients135.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients135.add(Ingredient.getIngredientFromName("Fisch und Fischerzeugnisse"));
		ingredients135.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price135 = {5.1, 6.3, 7.3};
		Meal meal135 = new Meal(ingredients135, "Kartoffel-Fisch-Auflauf mit Pinienkernen", Type.getType("Menü"), price135);
		meals21.add(meal135);

		map3.put(Day.getDay("Montag"), meals21);


		List<Meal> meals22 = new ArrayList<>();
		List<Ingredient> ingredients136 = new ArrayList<>();
		ingredients136.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients136.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients136.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients136.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		double[] price136 = {4.6, 5.1, 6.1};
		Meal meal136 = new Meal(ingredients136, "Gurken-Fenchel-Salat mit scharfem Huhn", Type.getType("Menü"), price136);
		meals22.add(meal136);

		List<Ingredient> ingredients137 = new ArrayList<>();
		ingredients137.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients137.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients137.add(Ingredient.getIngredientFromName("Fisch und Fischerzeugnisse"));
		ingredients137.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price137 = {5.1, 6.3, 7.3};
		Meal meal137 = new Meal(ingredients137, "Kartoffel-Fisch-Auflauf mit Pinienkernen", Type.getType("Menü"), price137);
		meals22.add(meal137);

		map3.put(Day.getDay("Dienstag"), meals22);


		List<Meal> meals23 = new ArrayList<>();
		List<Ingredient> ingredients138 = new ArrayList<>();
		ingredients138.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients138.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients138.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients138.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price138 = {4.0, 4.5, 5.5};
		Meal meal138 = new Meal(ingredients138, "Hausgemachte Pasta, mit grünem Spargel", Type.getType("Menü"), price138);
		meals23.add(meal138);

		List<Ingredient> ingredients139 = new ArrayList<>();
		ingredients139.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients139.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients139.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients139.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		ingredients139.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price139 = {4.0, 4.5, 5.5};
		Meal meal139 = new Meal(ingredients139, "Hausgemachte Pasta, Romanesco mit Currysauce", Type.getType("Menü"), price139);
		meals23.add(meal139);

		List<Ingredient> ingredients140 = new ArrayList<>();
		ingredients140.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients140.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients140.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients140.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients140.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients140.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price140 = {4.0, 4.5, 5.5};
		Meal meal140 = new Meal(ingredients140, "Hausgemachte Pasta, Tomatensauce, Käsesauce, Bolognese", Type.getType("Menü"), price140);
		meals23.add(meal140);

		map3.put(Day.getDay("Mittwoch"), meals23);


		List<Meal> meals24 = new ArrayList<>();
		List<Ingredient> ingredients141 = new ArrayList<>();
		ingredients141.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients141.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients141.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients141.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients141.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients141.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients141.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price141 = {4.0, 4.5, 5.5};
		Meal meal141 = new Meal(ingredients141, "Frisches Schweineschnitzel mit Pommes, Rahmsauce", Type.getType("Menü"), price141);
		meals24.add(meal141);

		List<Ingredient> ingredients142 = new ArrayList<>();
		ingredients142.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients142.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients142.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients142.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		double[] price142 = {4.0, 4.5, 5.5};
		Meal meal142 = new Meal(ingredients142, "Frisches Schweineschnitzel mit Pommes, Tomatensauce", Type.getType("Menü"), price142);
		meals24.add(meal142);

		List<Ingredient> ingredients143 = new ArrayList<>();
		ingredients143.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients143.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients143.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients143.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price143 = {4.0, 4.5, 5.5};
		Meal meal143 = new Meal(ingredients143, "Frisches Schweineschnitzel, Rösti, Chili-Hollandaise", Type.getType("Menü"), price143);
		meals24.add(meal143);

		map3.put(Day.getDay("Donnerstag"), meals24);


		List<Meal> meals25 = new ArrayList<>();
		map3.put(Day.getDay("Freitag"), meals25);


		List<Meal> meals26 = new ArrayList<>();
		map3.put(Day.getDay("Samstag"), meals26);


		List<Meal> meals27 = new ArrayList<>();
		map3.put(Day.getDay("Sonntag"), meals27);


		Map<Day, List<Meal>> map13 = mealsDummy.get(Week.getWeek("Naechste")).get(Mensa.getMensa("Marktstand Hauptmensa"));

		List<Meal> meals91 = new ArrayList<>();
		List<Ingredient> ingredients536 = new ArrayList<>();
		ingredients536.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients536.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients536.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price536 = {5.1, 6.3, 7.3};
		Meal meal536 = new Meal(ingredients536, "Fenchelrisotto mit Lammrückenstreifen, gemischter Salat", Type.getType("Menü"), price536);
		meals91.add(meal536);

		List<Ingredient> ingredients537 = new ArrayList<>();
		ingredients537.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients537.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients537.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients537.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients537.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		double[] price537 = {3.7, 4.9, 5.6};
		Meal meal537 = new Meal(ingredients537, "Schmorhähnchen mit Gurken, Hausgemachte Pasta", Type.getType("Menü"), price537);
		meals91.add(meal537);

		map13.put(Day.getDay("Montag"), meals91);


		List<Meal> meals92 = new ArrayList<>();
		List<Ingredient> ingredients538 = new ArrayList<>();
		ingredients538.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients538.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients538.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price538 = {5.1, 6.3, 7.3};
		Meal meal538 = new Meal(ingredients538, "Fenchelrisotto mit Lammrückenstreifen, gemischter Salat", Type.getType("Menü"), price538);
		meals92.add(meal538);

		List<Ingredient> ingredients539 = new ArrayList<>();
		ingredients539.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients539.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients539.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients539.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients539.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		double[] price539 = {3.7, 4.9, 5.6};
		Meal meal539 = new Meal(ingredients539, "Schmorhähnchen mit Gurken, Hausgemachte Pasta", Type.getType("Menü"), price539);
		meals92.add(meal539);

		map13.put(Day.getDay("Dienstag"), meals92);


		List<Meal> meals93 = new ArrayList<>();
		List<Ingredient> ingredients540 = new ArrayList<>();
		ingredients540.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients540.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients540.add(Ingredient.getIngredientFromName("Fisch und Fischerzeugnisse"));
		ingredients540.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients540.add(Ingredient.getIngredientFromName("Weichtiere und Weichtiererzeugnisse"));
		double[] price540 = {4.0, 4.5, 5.5};
		Meal meal540 = new Meal(ingredients540, "Hausgemachte Pasta, Fischragout", Type.getType("Menü"), price540);
		meals93.add(meal540);

		List<Ingredient> ingredients541 = new ArrayList<>();
		ingredients541.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients541.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients541.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients541.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		double[] price541 = {4.0, 4.5, 5.5};
		Meal meal541 = new Meal(ingredients541, "Hausgemachte Pasta, Pfannengemüse", Type.getType("Menü"), price541);
		meals93.add(meal541);

		List<Ingredient> ingredients542 = new ArrayList<>();
		ingredients542.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients542.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients542.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients542.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients542.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients542.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price542 = {4.0, 4.5, 5.5};
		Meal meal542 = new Meal(ingredients542, "Hausgemachte Pasta, Tomatensauce, Käsesauce, Bolognese", Type.getType("Menü"), price542);
		meals93.add(meal542);

		map13.put(Day.getDay("Mittwoch"), meals93);


		List<Meal> meals94 = new ArrayList<>();
		List<Ingredient> ingredients543 = new ArrayList<>();
		ingredients543.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients543.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients543.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients543.add(Ingredient.getIngredientFromName("Krebstiere und Krebstiererzeugnisse"));
		ingredients543.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients543.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price543 = {4.0, 4.5, 5.5};
		Meal meal543 = new Meal(ingredients543, "Frisches Schweineschnitzel mit Pommes, Paprikasauce", Type.getType("Menü"), price543);
		meals94.add(meal543);

		List<Ingredient> ingredients544 = new ArrayList<>();
		ingredients544.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients544.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients544.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients544.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients544.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients544.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price544 = {4.0, 4.5, 5.5};
		Meal meal544 = new Meal(ingredients544, "Frisches Schweineschnitzel mit Pommes, Pfeffersauce", Type.getType("Menü"), price544);
		meals94.add(meal544);

		List<Ingredient> ingredients545 = new ArrayList<>();
		ingredients545.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients545.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients545.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients545.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients545.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients545.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price545 = {4.0, 4.5, 5.5};
		Meal meal545 = new Meal(ingredients545, "Frisches Schweineschnitzel, Waldpilzsauce, Kartoffelgratin", Type.getType("Menü"), price545);
		meals94.add(meal545);

		map13.put(Day.getDay("Donnerstag"), meals94);


		List<Meal> meals95 = new ArrayList<>();
		List<Ingredient> ingredients546 = new ArrayList<>();
		ingredients546.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients546.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients546.add(Ingredient.getIngredientFromName("Fisch und Fischerzeugnisse"));
		ingredients546.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients546.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price546 = {5.1, 6.3, 7.3};
		Meal meal546 = new Meal(ingredients546, "Dorsch auf Gemüse, Reis", Type.getType("Menü"), price546);
		meals95.add(meal546);

		List<Ingredient> ingredients547 = new ArrayList<>();
		ingredients547.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients547.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients547.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients547.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients547.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price547 = {6.9, 7.9, 8.9};
		Meal meal547 = new Meal(ingredients547, "Spargel mit Schweinerückensteak, Sauce Hollandaise/Butter, Salzkartoffeln", Type.getType("Menü"), price547);
		meals95.add(meal547);

		map13.put(Day.getDay("Freitag"), meals95);


		List<Meal> meals96 = new ArrayList<>();
		map13.put(Day.getDay("Samstag"), meals96);


		List<Meal> meals97 = new ArrayList<>();
		map13.put(Day.getDay("Sonntag"), meals97);
		
	}

	private static void fillTihoDummy(Map<Week, Map<Mensa, Map<Day, List<Meal>>>> mealsDummy) {
		Map<Day, List<Meal>> map0 = mealsDummy.get(Week.getWeek("Aktuelle")).get(Mensa.getMensa("TiHo-Tower"));

		List<Meal> meals0 = new ArrayList<>();
		List<Ingredient> ingredients0 = new ArrayList<>();
		ingredients0.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients0.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients0.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price0 = {1.35, 2.8, 3.8};
		Meal meal0 = new Meal(ingredients0, "Gulascheintopf mit Möhren und Kartoffeln", Type.getType("Eintopf"), price0);
		meals0.add(meal0);

		List<Ingredient> ingredients1 = new ArrayList<>();
		ingredients1.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients1.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients1.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price1 = {1.85, 3.5, 4.3};
		Meal meal1 = new Meal(ingredients1, "Riesenrösti mit Rahmchampignons", Type.getType("Tellergericht"), price1);
		meals0.add(meal1);

		List<Ingredient> ingredients2 = new ArrayList<>();
		ingredients2.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients2.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients2.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients2.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price2 = {1.8, 2.9, 3.3};
		Meal meal2 = new Meal(ingredients2, "Putensteak, Sauce Hollandaise", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price2);
		meals0.add(meal2);

		List<Ingredient> ingredients3 = new ArrayList<>();
		ingredients3.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients3.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients3.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients3.add(Ingredient.getIngredientFromName("Sesamsamen und Sesamsamenerzeugnisse"));
		double[] price3 = {1.7, 2.8, 3.2};
		Meal meal3 = new Meal(ingredients3, "Linsen-Mangold-Curry", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price3);
		meals0.add(meal3);

		List<Ingredient> ingredients4 = new ArrayList<>();
		ingredients4.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients4.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients4.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients4.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients4.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients4.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price4 = {1.8, 2.9, 3.3};
		Meal meal4 = new Meal(ingredients4, "Ratatouille-Tarte", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price4);
		meals0.add(meal4);

		List<Ingredient> ingredients5 = new ArrayList<>();
		ingredients5.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients5.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients5.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients5.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price5 = {0.6, 0.9, 1.1};
		Meal meal5 = new Meal(ingredients5, "Gemüse-Couscous", Type.getType("Wahlmenü (Beilage)"), price5);
		meals0.add(meal5);

		List<Ingredient> ingredients6 = new ArrayList<>();
		ingredients6.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients6.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price6 = {0.6, 0.9, 1.1};
		Meal meal6 = new Meal(ingredients6, "Reis", Type.getType("Wahlmenü (Beilage)"), price6);
		meals0.add(meal6);

		List<Ingredient> ingredients7 = new ArrayList<>();
		ingredients7.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients7.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price7 = {0.65, 0.95, 1.15};
		Meal meal7 = new Meal(ingredients7, "Brokkoli", Type.getType("Wahlmenü (Gemüse)"), price7);
		meals0.add(meal7);

		List<Ingredient> ingredients8 = new ArrayList<>();
		ingredients8.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients8.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price8 = {0.65, 0.95, 1.15};
		Meal meal8 = new Meal(ingredients8, "Kohlrabi", Type.getType("Wahlmenü (Gemüse)"), price8);
		meals0.add(meal8);

		List<Ingredient> ingredients9 = new ArrayList<>();
		ingredients9.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients9.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price9 = {0.6, 0.9, 1.1};
		Meal meal9 = new Meal(ingredients9, "Tomatensalat", Type.getType("Wahlmenü (Salat)"), price9);
		meals0.add(meal9);

		List<Ingredient> ingredients10 = new ArrayList<>();
		ingredients10.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients10.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients10.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price10 = {0.4, 0.6, 0.8};
		Meal meal10 = new Meal(ingredients10, "Blumenkohlsuppe", Type.getType("Wahlmenü (Suppe)"), price10);
		meals0.add(meal10);

		List<Ingredient> ingredients11 = new ArrayList<>();
		ingredients11.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients11.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients11.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price11 = {0.8, 0.95, 1.1};
		Meal meal11 = new Meal(ingredients11, "Beerenquark", Type.getType("Wahlmenü (Dessert)"), price11);
		meals0.add(meal11);

		map0.put(Day.getDay("Montag"), meals0);


		List<Meal> meals1 = new ArrayList<>();
		List<Ingredient> ingredients12 = new ArrayList<>();
		ingredients12.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients12.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients12.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients12.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price12 = {1.35, 2.8, 3.8};
		Meal meal12 = new Meal(ingredients12, "Spargeleintopf", Type.getType("Eintopf"), price12);
		meals1.add(meal12);

		List<Ingredient> ingredients13 = new ArrayList<>();
		ingredients13.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients13.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients13.add(Ingredient.getIngredientFromName("Farbstoff"));
		ingredients13.add(Ingredient.getIngredientFromName("Konservierungsstoff"));
		ingredients13.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients13.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price13 = {1.85, 3.5, 4.3};
		Meal meal13 = new Meal(ingredients13, "Hausgemachte Pasta, Hähnchen-Paprika-Ragout, geriebener Hartkäse", Type.getType("Tellergericht"), price13);
		meals1.add(meal13);

		List<Ingredient> ingredients14 = new ArrayList<>();
		ingredients14.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients14.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients14.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients14.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price14 = {1.8, 2.9, 3.3};
		Meal meal14 = new Meal(ingredients14, "Allgäuer Käsefrikadelle, Créme-fraîche-Sauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price14);
		meals1.add(meal14);

		List<Ingredient> ingredients15 = new ArrayList<>();
		ingredients15.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients15.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients15.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price15 = {1.8, 2.9, 3.3};
		Meal meal15 = new Meal(ingredients15, "Back-Frischkäse mit Preiselbeeren", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price15);
		meals1.add(meal15);

		List<Ingredient> ingredients16 = new ArrayList<>();
		ingredients16.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients16.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients16.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients16.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		double[] price16 = {0.6, 0.9, 1.1};
		Meal meal16 = new Meal(ingredients16, "Hausgemachte Kräuterspätzle", Type.getType("Wahlmenü (Beilage)"), price16);
		meals1.add(meal16);

		List<Ingredient> ingredients17 = new ArrayList<>();
		ingredients17.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients17.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price17 = {0.6, 0.9, 1.1};
		Meal meal17 = new Meal(ingredients17, "Salzkartoffeln", Type.getType("Wahlmenü (Beilage)"), price17);
		meals1.add(meal17);

		List<Ingredient> ingredients18 = new ArrayList<>();
		ingredients18.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients18.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price18 = {0.65, 0.95, 1.15};
		Meal meal18 = new Meal(ingredients18, "Karottengemüse", Type.getType("Wahlmenü (Gemüse)"), price18);
		meals1.add(meal18);

		List<Ingredient> ingredients19 = new ArrayList<>();
		ingredients19.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients19.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price19 = {0.65, 0.95, 1.15};
		Meal meal19 = new Meal(ingredients19, "Spitzkohlgemüse", Type.getType("Wahlmenü (Gemüse)"), price19);
		meals1.add(meal19);

		List<Ingredient> ingredients20 = new ArrayList<>();
		ingredients20.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients20.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients20.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients20.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients20.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients20.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price20 = {0.6, 0.9, 1.1};
		Meal meal20 = new Meal(ingredients20, "Eisbergsalat, Dressing Sylter Art", Type.getType("Wahlmenü (Salat)"), price20);
		meals1.add(meal20);

		List<Ingredient> ingredients21 = new ArrayList<>();
		ingredients21.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients21.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients21.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients21.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price21 = {0.4, 0.6, 0.8};
		Meal meal21 = new Meal(ingredients21, "Spinatcremesuppe", Type.getType("Wahlmenü (Suppe)"), price21);
		meals1.add(meal21);

		List<Ingredient> ingredients22 = new ArrayList<>();
		ingredients22.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients22.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients22.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price22 = {0.8, 0.95, 1.1};
		Meal meal22 = new Meal(ingredients22, "Stracciatella-Joghurt", Type.getType("Wahlmenü (Dessert)"), price22);
		meals1.add(meal22);

		map0.put(Day.getDay("Dienstag"), meals1);


		List<Meal> meals2 = new ArrayList<>();
		List<Ingredient> ingredients23 = new ArrayList<>();
		ingredients23.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients23.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients23.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients23.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients23.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		double[] price23 = {1.35, 2.8, 3.8};
		Meal meal23 = new Meal(ingredients23, "Barbecueeintopf", Type.getType("Eintopf"), price23);
		meals2.add(meal23);

		List<Ingredient> ingredients24 = new ArrayList<>();
		ingredients24.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients24.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients24.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients24.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients24.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price24 = {1.85, 3.5, 4.3};
		Meal meal24 = new Meal(ingredients24, "Eier in Senfsauce, Salzkartoffeln", Type.getType("Tellergericht"), price24);
		meals2.add(meal24);

		List<Ingredient> ingredients25 = new ArrayList<>();
		ingredients25.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients25.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients25.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients25.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients25.add(Ingredient.getIngredientFromName("Geschmacksverstärker"));
		ingredients25.add(Ingredient.getIngredientFromName("Nitritpökelsalz"));
		ingredients25.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients25.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price25 = {1.8, 2.9, 3.3};
		Meal meal25 = new Meal(ingredients25, "Kasselerbraten, Rahmsauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price25);
		meals2.add(meal25);

		List<Ingredient> ingredients26 = new ArrayList<>();
		ingredients26.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients26.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients26.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price26 = {1.7, 2.8, 3.2};
		Meal meal26 = new Meal(ingredients26, "Pizza-Polenta, Tomatensugo", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price26);
		meals2.add(meal26);

		List<Ingredient> ingredients27 = new ArrayList<>();
		ingredients27.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients27.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients27.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price27 = {0.6, 0.9, 1.1};
		Meal meal27 = new Meal(ingredients27, "Kartoffelpüree", Type.getType("Wahlmenü (Beilage)"), price27);
		meals2.add(meal27);

		List<Ingredient> ingredients28 = new ArrayList<>();
		ingredients28.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price28 = {0.6, 0.9, 1.1};
		Meal meal28 = new Meal(ingredients28, "Kroketten", Type.getType("Wahlmenü (Beilage)"), price28);
		meals2.add(meal28);

		List<Ingredient> ingredients29 = new ArrayList<>();
		ingredients29.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients29.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price29 = {0.65, 0.95, 1.15};
		Meal meal29 = new Meal(ingredients29, "Champignongemüse", Type.getType("Wahlmenü (Gemüse)"), price29);
		meals2.add(meal29);

		List<Ingredient> ingredients30 = new ArrayList<>();
		ingredients30.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients30.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price30 = {0.65, 0.95, 1.15};
		Meal meal30 = new Meal(ingredients30, "Romanesco", Type.getType("Wahlmenü (Gemüse)"), price30);
		meals2.add(meal30);

		List<Ingredient> ingredients31 = new ArrayList<>();
		ingredients31.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients31.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients31.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price31 = {0.6, 0.9, 1.1};
		Meal meal31 = new Meal(ingredients31, "Lollo-Rosso-Salat, hausgemachtes Balsamicodressing", Type.getType("Wahlmenü (Salat)"), price31);
		meals2.add(meal31);

		List<Ingredient> ingredients32 = new ArrayList<>();
		ingredients32.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients32.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price32 = {0.4, 0.6, 0.8};
		Meal meal32 = new Meal(ingredients32, "Currysuppe mit Kokos", Type.getType("Wahlmenü (Suppe)"), price32);
		meals2.add(meal32);

		List<Ingredient> ingredients33 = new ArrayList<>();
		ingredients33.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients33.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients33.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price33 = {0.8, 0.95, 1.1};
		Meal meal33 = new Meal(ingredients33, "Karamellpudding", Type.getType("Wahlmenü (Dessert)"), price33);
		meals2.add(meal33);

		map0.put(Day.getDay("Mittwoch"), meals2);


		List<Meal> meals3 = new ArrayList<>();
		List<Ingredient> ingredients34 = new ArrayList<>();
		ingredients34.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients34.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients34.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price34 = {1.35, 2.8, 3.8};
		Meal meal34 = new Meal(ingredients34, "Gemüseeintopf mit saurer Sahne", Type.getType("Eintopf"), price34);
		meals3.add(meal34);

		List<Ingredient> ingredients35 = new ArrayList<>();
		ingredients35.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients35.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients35.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients35.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients35.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients35.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		ingredients35.add(Ingredient.getIngredientFromName("Sesamsamen und Sesamsamenerzeugnisse"));
		double[] price35 = {1.85, 3.5, 4.3};
		Meal meal35 = new Meal(ingredients35, "Gewürzburger, Krautsalat, American Wedges", Type.getType("Tellergericht"), price35);
		meals3.add(meal35);

		List<Ingredient> ingredients36 = new ArrayList<>();
		ingredients36.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients36.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients36.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients36.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		double[] price36 = {1.8, 2.9, 3.3};
		Meal meal36 = new Meal(ingredients36, "Hähnchenkeule Marengo", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price36);
		meals3.add(meal36);

		List<Ingredient> ingredients37 = new ArrayList<>();
		ingredients37.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients37.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients37.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients37.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price37 = {1.7, 2.8, 3.2};
		Meal meal37 = new Meal(ingredients37, "Möhren-Zucchini-Puffer, Kräuterdip", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price37);
		meals3.add(meal37);

		List<Ingredient> ingredients38 = new ArrayList<>();
		ingredients38.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients38.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		double[] price38 = {0.6, 0.9, 1.1};
		Meal meal38 = new Meal(ingredients38, "Hausgemachte Currypasta", Type.getType("Wahlmenü (Beilage)"), price38);
		meals3.add(meal38);

		List<Ingredient> ingredients39 = new ArrayList<>();
		ingredients39.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients39.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price39 = {0.6, 0.9, 1.1};
		Meal meal39 = new Meal(ingredients39, "Petersilienkartoffeln", Type.getType("Wahlmenü (Beilage)"), price39);
		meals3.add(meal39);

		List<Ingredient> ingredients40 = new ArrayList<>();
		ingredients40.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients40.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price40 = {0.65, 0.95, 1.15};
		Meal meal40 = new Meal(ingredients40, "Blumenkohlgemüse", Type.getType("Wahlmenü (Gemüse)"), price40);
		meals3.add(meal40);

		List<Ingredient> ingredients41 = new ArrayList<>();
		ingredients41.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients41.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price41 = {0.65, 0.95, 1.15};
		Meal meal41 = new Meal(ingredients41, "Maisgemüse", Type.getType("Wahlmenü (Gemüse)"), price41);
		meals3.add(meal41);

		List<Ingredient> ingredients42 = new ArrayList<>();
		ingredients42.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients42.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients42.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price42 = {0.6, 0.9, 1.1};
		Meal meal42 = new Meal(ingredients42, "Mischsalat, Curry-Dressing", Type.getType("Wahlmenü (Salat)"), price42);
		meals3.add(meal42);

		List<Ingredient> ingredients43 = new ArrayList<>();
		ingredients43.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients43.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price43 = {0.4, 0.6, 0.8};
		Meal meal43 = new Meal(ingredients43, "Spargelcremesuppe", Type.getType("Wahlmenü (Suppe)"), price43);
		meals3.add(meal43);

		List<Ingredient> ingredients44 = new ArrayList<>();
		ingredients44.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients44.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price44 = {0.8, 0.95, 1.1};
		Meal meal44 = new Meal(ingredients44, "Aprikosenquark", Type.getType("Wahlmenü (Dessert)"), price44);
		meals3.add(meal44);

		map0.put(Day.getDay("Donnerstag"), meals3);


		List<Meal> meals4 = new ArrayList<>();
		map0.put(Day.getDay("Freitag"), meals4);


		List<Meal> meals5 = new ArrayList<>();
		map0.put(Day.getDay("Samstag"), meals5);


		List<Meal> meals6 = new ArrayList<>();
		map0.put(Day.getDay("Sonntag"), meals6);

		Map<Day, List<Meal>> map9 = mealsDummy.get(Week.getWeek("Naechste")).get(Mensa.getMensa("TiHo-Tower"));

		List<Meal> meals63 = new ArrayList<>();
		List<Ingredient> ingredients361 = new ArrayList<>();
		ingredients361.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients361.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients361.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		double[] price361 = {1.35, 2.8, 3.8};
		Meal meal361 = new Meal(ingredients361, "Feuriger Bohneneintopf", Type.getType("Eintopf"), price361);
		meals63.add(meal361);

		List<Ingredient> ingredients362 = new ArrayList<>();
		ingredients362.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients362.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients362.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price362 = {1.85, 3.5, 4.3};
		Meal meal362 = new Meal(ingredients362, "Nürnberger Rostbratwürstchen, Kartoffelpüree, Wonnekraut", Type.getType("Tellergericht"), price362);
		meals63.add(meal362);

		List<Ingredient> ingredients363 = new ArrayList<>();
		ingredients363.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients363.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients363.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients363.add(Ingredient.getIngredientFromName("Konservierungsstoff"));
		ingredients363.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients363.add(Ingredient.getIngredientFromName("Phosphat"));
		ingredients363.add(Ingredient.getIngredientFromName("Nitritpökelsalz"));
		ingredients363.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients363.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		ingredients363.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price363 = {1.8, 2.9, 3.3};
		Meal meal363 = new Meal(ingredients363, "Rinderroulade mit Specksauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price363);
		meals63.add(meal363);

		List<Ingredient> ingredients364 = new ArrayList<>();
		ingredients364.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients364.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients364.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients364.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price364 = {1.8, 2.9, 3.3};
		Meal meal364 = new Meal(ingredients364, "Vegetarisches Schnitzel, Karotten-Sahne-Sauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price364);
		meals63.add(meal364);

		List<Ingredient> ingredients365 = new ArrayList<>();
		ingredients365.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients365.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients365.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price365 = {0.6, 0.9, 1.1};
		Meal meal365 = new Meal(ingredients365, "Bechamelkartoffeln", Type.getType("Wahlmenü (Beilage)"), price365);
		meals63.add(meal365);

		List<Ingredient> ingredients366 = new ArrayList<>();
		ingredients366.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients366.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients366.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		double[] price366 = {0.6, 0.9, 1.1};
		Meal meal366 = new Meal(ingredients366, "Hausgemachte Pasta", Type.getType("Wahlmenü (Beilage)"), price366);
		meals63.add(meal366);

		List<Ingredient> ingredients367 = new ArrayList<>();
		ingredients367.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price367 = {0.65, 0.95, 1.15};
		Meal meal367 = new Meal(ingredients367, "Bohnengemüse", Type.getType("Wahlmenü (Gemüse)"), price367);
		meals63.add(meal367);

		List<Ingredient> ingredients368 = new ArrayList<>();
		ingredients368.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients368.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients368.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price368 = {0.65, 0.95, 1.15};
		Meal meal368 = new Meal(ingredients368, "Rahmwirsing", Type.getType("Wahlmenü (Gemüse)"), price368);
		meals63.add(meal368);

		List<Ingredient> ingredients369 = new ArrayList<>();
		ingredients369.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price369 = {0.6, 0.9, 1.1};
		Meal meal369 = new Meal(ingredients369, "Gurkensalat", Type.getType("Wahlmenü (Salat)"), price369);
		meals63.add(meal369);

		List<Ingredient> ingredients370 = new ArrayList<>();
		ingredients370.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients370.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients370.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price370 = {0.4, 0.6, 0.8};
		Meal meal370 = new Meal(ingredients370, "Tomatensuppe", Type.getType("Wahlmenü (Suppe)"), price370);
		meals63.add(meal370);

		List<Ingredient> ingredients371 = new ArrayList<>();
		ingredients371.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients371.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price371 = {0.8, 0.95, 1.1};
		Meal meal371 = new Meal(ingredients371, "Obstsalat", Type.getType("Wahlmenü (Dessert)"), price371);
		meals63.add(meal371);

		map9.put(Day.getDay("Montag"), meals63);


		List<Meal> meals64 = new ArrayList<>();
		List<Ingredient> ingredients372 = new ArrayList<>();
		ingredients372.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients372.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients372.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		double[] price372 = {1.35, 2.8, 3.8};
		Meal meal372 = new Meal(ingredients372, "Nudelsuppe mit Rindfleisch, mit hausgemachter Pasta", Type.getType("Eintopf"), price372);
		meals64.add(meal372);

		List<Ingredient> ingredients373 = new ArrayList<>();
		ingredients373.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients373.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients373.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		double[] price373 = {1.85, 3.5, 4.3};
		Meal meal373 = new Meal(ingredients373, "Kartoffelpuffer, hausgemachtes Apfelmus", Type.getType("Tellergericht"), price373);
		meals64.add(meal373);

		List<Ingredient> ingredients374 = new ArrayList<>();
		ingredients374.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients374.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients374.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients374.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients374.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients374.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients374.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price374 = {1.8, 2.9, 3.3};
		Meal meal374 = new Meal(ingredients374, "Frikadelle, Rahmsauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price374);
		meals64.add(meal374);

		List<Ingredient> ingredients375 = new ArrayList<>();
		ingredients375.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients375.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients375.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price375 = {1.7, 2.8, 3.2};
		Meal meal375 = new Meal(ingredients375, "Gemüsegratin mit Kräutern, Bechamelsauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price375);
		meals64.add(meal375);

		List<Ingredient> ingredients376 = new ArrayList<>();
		ingredients376.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients376.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients376.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients376.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		double[] price376 = {0.6, 0.9, 1.1};
		Meal meal376 = new Meal(ingredients376, "Hausgemachte Schupfnudeln", Type.getType("Wahlmenü (Beilage)"), price376);
		meals64.add(meal376);

		List<Ingredient> ingredients377 = new ArrayList<>();
		ingredients377.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients377.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price377 = {0.6, 0.9, 1.1};
		Meal meal377 = new Meal(ingredients377, "Salzkartoffeln", Type.getType("Wahlmenü (Beilage)"), price377);
		meals64.add(meal377);

		List<Ingredient> ingredients378 = new ArrayList<>();
		ingredients378.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients378.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price378 = {0.65, 0.95, 1.15};
		Meal meal378 = new Meal(ingredients378, "Erbsengemüse", Type.getType("Wahlmenü (Gemüse)"), price378);
		meals64.add(meal378);

		List<Ingredient> ingredients379 = new ArrayList<>();
		ingredients379.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients379.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price379 = {0.65, 0.95, 1.15};
		Meal meal379 = new Meal(ingredients379, "Maisgemüse", Type.getType("Wahlmenü (Gemüse)"), price379);
		meals64.add(meal379);

		List<Ingredient> ingredients380 = new ArrayList<>();
		ingredients380.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients380.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients380.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price380 = {0.6, 0.9, 1.1};
		Meal meal380 = new Meal(ingredients380, "Lollo-Bionda-Salat, Honig-Senf-Dressing", Type.getType("Wahlmenü (Salat)"), price380);
		meals64.add(meal380);

		List<Ingredient> ingredients381 = new ArrayList<>();
		ingredients381.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients381.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price381 = {0.4, 0.6, 0.8};
		Meal meal381 = new Meal(ingredients381, "Tomaten-Paprikasuppe", Type.getType("Wahlmenü (Suppe)"), price381);
		meals64.add(meal381);

		List<Ingredient> ingredients382 = new ArrayList<>();
		ingredients382.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients382.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients382.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price382 = {0.8, 0.95, 1.1};
		Meal meal382 = new Meal(ingredients382, "Milchreis, Zimt und Zucker", Type.getType("Wahlmenü (Dessert)"), price382);
		meals64.add(meal382);

		map9.put(Day.getDay("Dienstag"), meals64);


		List<Meal> meals65 = new ArrayList<>();
		List<Ingredient> ingredients383 = new ArrayList<>();
		ingredients383.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients383.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients383.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients383.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		double[] price383 = {1.35, 2.8, 3.8};
		Meal meal383 = new Meal(ingredients383, "Chinesische Gemüsesuppe", Type.getType("Eintopf"), price383);
		meals65.add(meal383);

		List<Ingredient> ingredients384 = new ArrayList<>();
		ingredients384.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients384.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients384.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients384.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients384.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		double[] price384 = {1.85, 3.5, 4.3};
		Meal meal384 = new Meal(ingredients384, "Hackfleischpfanne mit Chinakohl, Reis", Type.getType("Tellergericht"), price384);
		meals65.add(meal384);

		List<Ingredient> ingredients385 = new ArrayList<>();
		ingredients385.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients385.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price385 = {1.8, 2.9, 3.3};
		Meal meal385 = new Meal(ingredients385, "Halbes Grillhähnchen", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price385);
		meals65.add(meal385);

		List<Ingredient> ingredients386 = new ArrayList<>();
		ingredients386.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients386.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients386.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price386 = {1.7, 2.8, 3.2};
		Meal meal386 = new Meal(ingredients386, "Champignon-Risotto-Bratling, Kressesauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price386);
		meals65.add(meal386);

		List<Ingredient> ingredients387 = new ArrayList<>();
		ingredients387.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients387.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients387.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients387.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price387 = {0.6, 0.9, 1.1};
		Meal meal387 = new Meal(ingredients387, "American Wedges", Type.getType("Wahlmenü (Beilage)"), price387);
		meals65.add(meal387);

		List<Ingredient> ingredients388 = new ArrayList<>();
		ingredients388.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients388.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price388 = {0.6, 0.9, 1.1};
		Meal meal388 = new Meal(ingredients388, "Risi-Pisi", Type.getType("Wahlmenü (Beilage)"), price388);
		meals65.add(meal388);

		List<Ingredient> ingredients389 = new ArrayList<>();
		ingredients389.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients389.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price389 = {0.65, 0.95, 1.15};
		Meal meal389 = new Meal(ingredients389, "Kaiserschoten", Type.getType("Wahlmenü (Gemüse)"), price389);
		meals65.add(meal389);

		List<Ingredient> ingredients390 = new ArrayList<>();
		ingredients390.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients390.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price390 = {0.65, 0.95, 1.15};
		Meal meal390 = new Meal(ingredients390, "Pariser Karotten", Type.getType("Wahlmenü (Gemüse)"), price390);
		meals65.add(meal390);

		List<Ingredient> ingredients391 = new ArrayList<>();
		ingredients391.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients391.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients391.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients391.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients391.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price391 = {0.6, 0.9, 1.1};
		Meal meal391 = new Meal(ingredients391, "Endiviensalat, Italien-Dressing", Type.getType("Wahlmenü (Salat)"), price391);
		meals65.add(meal391);

		List<Ingredient> ingredients392 = new ArrayList<>();
		ingredients392.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients392.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients392.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients392.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price392 = {0.4, 0.6, 0.8};
		Meal meal392 = new Meal(ingredients392, "Kartoffelsuppe", Type.getType("Wahlmenü (Suppe)"), price392);
		meals65.add(meal392);

		List<Ingredient> ingredients393 = new ArrayList<>();
		ingredients393.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients393.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients393.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price393 = {0.8, 0.95, 1.1};
		Meal meal393 = new Meal(ingredients393, "Erdbeerjoghurt", Type.getType("Wahlmenü (Dessert)"), price393);
		meals65.add(meal393);

		map9.put(Day.getDay("Mittwoch"), meals65);


		List<Meal> meals66 = new ArrayList<>();
		List<Ingredient> ingredients394 = new ArrayList<>();
		ingredients394.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients394.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients394.add(Ingredient.getIngredientFromName("Farbstoff"));
		ingredients394.add(Ingredient.getIngredientFromName("Konservierungsstoff"));
		ingredients394.add(Ingredient.getIngredientFromName("Phosphat"));
		ingredients394.add(Ingredient.getIngredientFromName("Nitritpökelsalz"));
		ingredients394.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price394 = {1.35, 2.8, 3.8};
		Meal meal394 = new Meal(ingredients394, "Kartoffel-Bärlaucheintopf mit Wienerle", Type.getType("Eintopf"), price394);
		meals66.add(meal394);

		List<Ingredient> ingredients395 = new ArrayList<>();
		ingredients395.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients395.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients395.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients395.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price395 = {1.85, 3.5, 4.3};
		Meal meal395 = new Meal(ingredients395, "Hausgemachte Pasta, Spargelragout in Rahm", Type.getType("Tellergericht"), price395);
		meals66.add(meal395);

		List<Ingredient> ingredients396 = new ArrayList<>();
		ingredients396.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients396.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients396.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients396.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients396.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price396 = {1.8, 2.9, 3.3};
		Meal meal396 = new Meal(ingredients396, "Rinder-Geschnetzeltes Stroganoff", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price396);
		meals66.add(meal396);

		List<Ingredient> ingredients397 = new ArrayList<>();
		ingredients397.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients397.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients397.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients397.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		ingredients397.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price397 = {1.8, 2.9, 3.3};
		Meal meal397 = new Meal(ingredients397, "Tofugemüse mit Rucola", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price397);
		meals66.add(meal397);

		List<Ingredient> ingredients398 = new ArrayList<>();
		ingredients398.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients398.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients398.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients398.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		double[] price398 = {0.6, 0.9, 1.1};
		Meal meal398 = new Meal(ingredients398, "Hausgemachte Spätzle", Type.getType("Wahlmenü (Beilage)"), price398);
		meals66.add(meal398);

		List<Ingredient> ingredients399 = new ArrayList<>();
		ingredients399.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients399.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price399 = {0.6, 0.9, 1.1};
		Meal meal399 = new Meal(ingredients399, "Paprikareis", Type.getType("Wahlmenü (Beilage)"), price399);
		meals66.add(meal399);

		List<Ingredient> ingredients400 = new ArrayList<>();
		ingredients400.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients400.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price400 = {0.65, 0.95, 1.15};
		Meal meal400 = new Meal(ingredients400, "Auberginengemüse", Type.getType("Wahlmenü (Gemüse)"), price400);
		meals66.add(meal400);

		List<Ingredient> ingredients401 = new ArrayList<>();
		ingredients401.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients401.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients401.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price401 = {0.65, 0.95, 1.15};
		Meal meal401 = new Meal(ingredients401, "Linsengemüse", Type.getType("Wahlmenü (Gemüse)"), price401);
		meals66.add(meal401);

		List<Ingredient> ingredients402 = new ArrayList<>();
		ingredients402.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients402.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients402.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		double[] price402 = {0.6, 0.9, 1.1};
		Meal meal402 = new Meal(ingredients402, "Kopfsalat, Tomaten-Vinaigrette", Type.getType("Wahlmenü (Salat)"), price402);
		meals66.add(meal402);

		List<Ingredient> ingredients403 = new ArrayList<>();
		ingredients403.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients403.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients403.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients403.add(Ingredient.getIngredientFromName("Schalenfrüchte"));
		double[] price403 = {0.4, 0.6, 0.8};
		Meal meal403 = new Meal(ingredients403, "Möhrensuppe mit Haselnüssen", Type.getType("Wahlmenü (Suppe)"), price403);
		meals66.add(meal403);

		List<Ingredient> ingredients404 = new ArrayList<>();
		ingredients404.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients404.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients404.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price404 = {0.8, 0.95, 1.1};
		Meal meal404 = new Meal(ingredients404, "Schlemmerquark mit Heidelbeersauce", Type.getType("Wahlmenü (Dessert)"), price404);
		meals66.add(meal404);

		map9.put(Day.getDay("Donnerstag"), meals66);


		List<Meal> meals67 = new ArrayList<>();
		List<Ingredient> ingredients405 = new ArrayList<>();
		ingredients405.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients405.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients405.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price405 = {1.35, 2.8, 3.8};
		Meal meal405 = new Meal(ingredients405, "Bunte Maissuppe", Type.getType("Eintopf"), price405);
		meals67.add(meal405);

		List<Ingredient> ingredients406 = new ArrayList<>();
		ingredients406.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients406.add(Ingredient.getIngredientFromName("Unbekannt"));
		ingredients406.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients406.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients406.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price406 = {1.85, 3.5, 4.3};
		Meal meal406 = new Meal(ingredients406, "Pizza Salami", Type.getType("Tellergericht"), price406);
		meals67.add(meal406);

		List<Ingredient> ingredients407 = new ArrayList<>();
		ingredients407.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients407.add(Ingredient.getIngredientFromName("Fisch und Fischerzeugnisse"));
		ingredients407.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients407.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price407 = {1.8, 2.9, 3.3};
		Meal meal407 = new Meal(ingredients407, "Seelachsfilet, Senfsauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price407);
		meals67.add(meal407);

		List<Ingredient> ingredients408 = new ArrayList<>();
		ingredients408.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients408.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients408.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients408.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients408.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients408.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price408 = {1.8, 2.9, 3.3};
		Meal meal408 = new Meal(ingredients408, "Gefüllte Käse-Paprika, Tomatensauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price408);
		meals67.add(meal408);

		List<Ingredient> ingredients409 = new ArrayList<>();
		ingredients409.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients409.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price409 = {0.6, 0.9, 1.1};
		Meal meal409 = new Meal(ingredients409, "Basmatireis", Type.getType("Wahlmenü (Beilage)"), price409);
		meals67.add(meal409);

		List<Ingredient> ingredients410 = new ArrayList<>();
		ingredients410.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients410.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients410.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients410.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price410 = {0.6, 0.9, 1.1};
		Meal meal410 = new Meal(ingredients410, "Kartoffelgratin", Type.getType("Wahlmenü (Beilage)"), price410);
		meals67.add(meal410);

		List<Ingredient> ingredients411 = new ArrayList<>();
		ingredients411.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients411.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients411.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price411 = {0.65, 0.95, 1.15};
		Meal meal411 = new Meal(ingredients411, "Blattspinat in Rahm", Type.getType("Wahlmenü (Gemüse)"), price411);
		meals67.add(meal411);

		List<Ingredient> ingredients412 = new ArrayList<>();
		ingredients412.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients412.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price412 = {0.65, 0.95, 1.15};
		Meal meal412 = new Meal(ingredients412, "Blumenkohlgemüse", Type.getType("Wahlmenü (Gemüse)"), price412);
		meals67.add(meal412);

		List<Ingredient> ingredients413 = new ArrayList<>();
		ingredients413.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price413 = {0.6, 0.9, 1.1};
		Meal meal413 = new Meal(ingredients413, "Mischsalat, Schnittlauch-Vinaigrette", Type.getType("Wahlmenü (Salat)"), price413);
		meals67.add(meal413);

		List<Ingredient> ingredients414 = new ArrayList<>();
		ingredients414.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients414.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price414 = {0.4, 0.6, 0.8};
		Meal meal414 = new Meal(ingredients414, "Spargelcremesuppe", Type.getType("Wahlmenü (Suppe)"), price414);
		meals67.add(meal414);

		List<Ingredient> ingredients415 = new ArrayList<>();
		ingredients415.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients415.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients415.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price415 = {0.8, 0.95, 1.1};
		Meal meal415 = new Meal(ingredients415, "Orangenjoghurt mit Flakes", Type.getType("Wahlmenü (Dessert)"), price415);
		meals67.add(meal415);

		map9.put(Day.getDay("Freitag"), meals67);


		List<Meal> meals68 = new ArrayList<>();
		map9.put(Day.getDay("Samstag"), meals68);


		List<Meal> meals69 = new ArrayList<>();
		map9.put(Day.getDay("Sonntag"), meals69);


		
	}

	private static void fillRicklDummy(Map<Week, Map<Mensa, Map<Day, List<Meal>>>> mealsDummy) {
		Map<Day, List<Meal>> map4 = mealsDummy.get(Week.getWeek("Aktuelle")).get(Mensa.getMensa("Mensa Ricklinger Stadtweg"));

		List<Meal> meals28 = new ArrayList<>();
		List<Ingredient> ingredients187 = new ArrayList<>();
		ingredients187.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients187.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients187.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price187 = {1.35, 2.8, 3.8};
		Meal meal187 = new Meal(ingredients187, "Gulascheintopf mit Möhren und Kartoffeln", Type.getType("Eintopf"), price187);
		meals28.add(meal187);

		List<Ingredient> ingredients188 = new ArrayList<>();
		ingredients188.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients188.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients188.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price188 = {1.7, 3.35, 4.15};
		Meal meal188 = new Meal(ingredients188, "Riesenrösti mit Rahmchampignons", Type.getType("Tellergericht"), price188);
		meals28.add(meal188);

		List<Ingredient> ingredients189 = new ArrayList<>();
		ingredients189.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients189.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients189.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients189.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price189 = {1.7, 2.8, 3.2};
		Meal meal189 = new Meal(ingredients189, "Putensteak, Sauce Hollandaise", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price189);
		meals28.add(meal189);

		List<Ingredient> ingredients190 = new ArrayList<>();
		ingredients190.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients190.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients190.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients190.add(Ingredient.getIngredientFromName("Sesamsamen und Sesamsamenerzeugnisse"));
		double[] price190 = {1.6, 2.7, 3.1};
		Meal meal190 = new Meal(ingredients190, "Linsen-Mangold-Curry", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price190);
		meals28.add(meal190);

		List<Ingredient> ingredients191 = new ArrayList<>();
		ingredients191.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients191.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients191.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients191.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price191 = {0.45, 0.8, 1.0};
		Meal meal191 = new Meal(ingredients191, "Gemüse-Couscous", Type.getType("Wahlmenü (Beilage)"), price191);
		meals28.add(meal191);

		List<Ingredient> ingredients192 = new ArrayList<>();
		ingredients192.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients192.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price192 = {0.45, 0.8, 1.0};
		Meal meal192 = new Meal(ingredients192, "Reis", Type.getType("Wahlmenü (Beilage)"), price192);
		meals28.add(meal192);

		List<Ingredient> ingredients193 = new ArrayList<>();
		ingredients193.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients193.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price193 = {0.5, 0.9, 1.1};
		Meal meal193 = new Meal(ingredients193, "Brokkoli", Type.getType("Wahlmenü (Gemüse)"), price193);
		meals28.add(meal193);

		List<Ingredient> ingredients194 = new ArrayList<>();
		ingredients194.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients194.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price194 = {0.5, 0.85, 1.05};
		Meal meal194 = new Meal(ingredients194, "Tomatensalat", Type.getType("Wahlmenü (Salat)"), price194);
		meals28.add(meal194);

		List<Ingredient> ingredients195 = new ArrayList<>();
		ingredients195.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients195.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients195.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price195 = {0.4, 0.6, 0.8};
		Meal meal195 = new Meal(ingredients195, "Blumenkohlsuppe", Type.getType("Wahlmenü (Suppe)"), price195);
		meals28.add(meal195);

		List<Ingredient> ingredients196 = new ArrayList<>();
		ingredients196.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients196.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients196.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price196 = {0.8, 0.95, 1.1};
		Meal meal196 = new Meal(ingredients196, "Beerenquark", Type.getType("Wahlmenü (Dessert)"), price196);
		meals28.add(meal196);

		map4.put(Day.getDay("Montag"), meals28);


		List<Meal> meals29 = new ArrayList<>();
		List<Ingredient> ingredients197 = new ArrayList<>();
		ingredients197.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients197.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients197.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients197.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price197 = {1.35, 2.8, 3.8};
		Meal meal197 = new Meal(ingredients197, "Spargeleintopf", Type.getType("Eintopf"), price197);
		meals29.add(meal197);

		List<Ingredient> ingredients198 = new ArrayList<>();
		ingredients198.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients198.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients198.add(Ingredient.getIngredientFromName("Farbstoff"));
		ingredients198.add(Ingredient.getIngredientFromName("Konservierungsstoff"));
		ingredients198.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients198.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price198 = {1.7, 3.35, 4.15};
		Meal meal198 = new Meal(ingredients198, "Hausgemachte Pasta, Hähnchen-Paprika-Ragout, geriebener Hartkäse", Type.getType("Tellergericht"), price198);
		meals29.add(meal198);

		List<Ingredient> ingredients199 = new ArrayList<>();
		ingredients199.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients199.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients199.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients199.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price199 = {1.7, 2.8, 3.2};
		Meal meal199 = new Meal(ingredients199, "Allgäuer Käsefrikadelle, Créme-fraîche-Sauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price199);
		meals29.add(meal199);

		List<Ingredient> ingredients200 = new ArrayList<>();
		ingredients200.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients200.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients200.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price200 = {1.7, 2.8, 3.2};
		Meal meal200 = new Meal(ingredients200, "Back-Frischkäse mit Preiselbeeren", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price200);
		meals29.add(meal200);

		List<Ingredient> ingredients201 = new ArrayList<>();
		ingredients201.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients201.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients201.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients201.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		double[] price201 = {0.45, 0.8, 1.0};
		Meal meal201 = new Meal(ingredients201, "Hausgemachte Kräuterspätzle", Type.getType("Wahlmenü (Beilage)"), price201);
		meals29.add(meal201);

		List<Ingredient> ingredients202 = new ArrayList<>();
		ingredients202.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients202.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price202 = {0.45, 0.8, 1.0};
		Meal meal202 = new Meal(ingredients202, "Salzkartoffeln", Type.getType("Wahlmenü (Beilage)"), price202);
		meals29.add(meal202);

		List<Ingredient> ingredients203 = new ArrayList<>();
		ingredients203.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients203.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price203 = {0.5, 0.9, 1.1};
		Meal meal203 = new Meal(ingredients203, "Karottengemüse", Type.getType("Wahlmenü (Gemüse)"), price203);
		meals29.add(meal203);

		List<Ingredient> ingredients204 = new ArrayList<>();
		ingredients204.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients204.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients204.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients204.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients204.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients204.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price204 = {0.5, 0.85, 1.05};
		Meal meal204 = new Meal(ingredients204, "Eisbergsalat, Dressing Sylter Art", Type.getType("Wahlmenü (Salat)"), price204);
		meals29.add(meal204);

		List<Ingredient> ingredients205 = new ArrayList<>();
		ingredients205.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients205.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients205.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients205.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price205 = {0.4, 0.6, 0.8};
		Meal meal205 = new Meal(ingredients205, "Spinatcremesuppe", Type.getType("Wahlmenü (Suppe)"), price205);
		meals29.add(meal205);

		List<Ingredient> ingredients206 = new ArrayList<>();
		ingredients206.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients206.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients206.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price206 = {0.8, 0.95, 1.1};
		Meal meal206 = new Meal(ingredients206, "Stracciatella-Joghurt", Type.getType("Wahlmenü (Dessert)"), price206);
		meals29.add(meal206);

		map4.put(Day.getDay("Dienstag"), meals29);


		List<Meal> meals30 = new ArrayList<>();
		List<Ingredient> ingredients207 = new ArrayList<>();
		ingredients207.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients207.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients207.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients207.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients207.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		double[] price207 = {1.35, 2.8, 3.8};
		Meal meal207 = new Meal(ingredients207, "Barbecueeintopf", Type.getType("Eintopf"), price207);
		meals30.add(meal207);

		List<Ingredient> ingredients208 = new ArrayList<>();
		ingredients208.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients208.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients208.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients208.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients208.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price208 = {1.7, 3.35, 4.15};
		Meal meal208 = new Meal(ingredients208, "Eier in Senfsauce, Salzkartoffeln", Type.getType("Tellergericht"), price208);
		meals30.add(meal208);

		List<Ingredient> ingredients209 = new ArrayList<>();
		ingredients209.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients209.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients209.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients209.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients209.add(Ingredient.getIngredientFromName("Geschmacksverstärker"));
		ingredients209.add(Ingredient.getIngredientFromName("Nitritpökelsalz"));
		ingredients209.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients209.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price209 = {1.7, 2.8, 3.2};
		Meal meal209 = new Meal(ingredients209, "Kasselerbraten, Rahmsauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price209);
		meals30.add(meal209);

		List<Ingredient> ingredients210 = new ArrayList<>();
		ingredients210.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients210.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients210.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price210 = {1.6, 2.7, 3.1};
		Meal meal210 = new Meal(ingredients210, "Pizza-Polenta, Tomatensugo", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price210);
		meals30.add(meal210);

		List<Ingredient> ingredients211 = new ArrayList<>();
		ingredients211.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients211.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients211.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price211 = {0.45, 0.8, 1.0};
		Meal meal211 = new Meal(ingredients211, "Kartoffelpüree", Type.getType("Wahlmenü (Beilage)"), price211);
		meals30.add(meal211);

		List<Ingredient> ingredients212 = new ArrayList<>();
		ingredients212.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price212 = {0.45, 0.8, 1.0};
		Meal meal212 = new Meal(ingredients212, "Kroketten", Type.getType("Wahlmenü (Beilage)"), price212);
		meals30.add(meal212);

		List<Ingredient> ingredients213 = new ArrayList<>();
		ingredients213.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients213.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price213 = {0.5, 0.9, 1.1};
		Meal meal213 = new Meal(ingredients213, "Champignongemüse", Type.getType("Wahlmenü (Gemüse)"), price213);
		meals30.add(meal213);

		List<Ingredient> ingredients214 = new ArrayList<>();
		ingredients214.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients214.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients214.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price214 = {0.5, 0.85, 1.05};
		Meal meal214 = new Meal(ingredients214, "Lollo-Rosso-Salat, hausgemachtes Balsamicodressing", Type.getType("Wahlmenü (Salat)"), price214);
		meals30.add(meal214);

		List<Ingredient> ingredients215 = new ArrayList<>();
		ingredients215.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients215.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price215 = {0.4, 0.6, 0.8};
		Meal meal215 = new Meal(ingredients215, "Currysuppe mit Kokos", Type.getType("Wahlmenü (Suppe)"), price215);
		meals30.add(meal215);

		List<Ingredient> ingredients216 = new ArrayList<>();
		ingredients216.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients216.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients216.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price216 = {0.8, 0.95, 1.1};
		Meal meal216 = new Meal(ingredients216, "Karamellpudding", Type.getType("Wahlmenü (Dessert)"), price216);
		meals30.add(meal216);

		map4.put(Day.getDay("Mittwoch"), meals30);


		List<Meal> meals31 = new ArrayList<>();
		List<Ingredient> ingredients217 = new ArrayList<>();
		ingredients217.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients217.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients217.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price217 = {1.35, 2.8, 3.8};
		Meal meal217 = new Meal(ingredients217, "Gemüseeintopf mit saurer Sahne", Type.getType("Eintopf"), price217);
		meals31.add(meal217);

		List<Ingredient> ingredients218 = new ArrayList<>();
		ingredients218.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients218.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients218.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients218.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients218.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients218.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		ingredients218.add(Ingredient.getIngredientFromName("Sesamsamen und Sesamsamenerzeugnisse"));
		double[] price218 = {1.7, 3.35, 4.15};
		Meal meal218 = new Meal(ingredients218, "Gewürzburger, Krautsalat, American Wedges", Type.getType("Tellergericht"), price218);
		meals31.add(meal218);

		List<Ingredient> ingredients219 = new ArrayList<>();
		ingredients219.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients219.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients219.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients219.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		double[] price219 = {1.7, 2.8, 3.2};
		Meal meal219 = new Meal(ingredients219, "Hähnchenkeule Marengo", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price219);
		meals31.add(meal219);

		List<Ingredient> ingredients220 = new ArrayList<>();
		ingredients220.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients220.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients220.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients220.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price220 = {1.6, 2.7, 3.1};
		Meal meal220 = new Meal(ingredients220, "Möhren-Zucchini-Puffer, Kräuterdip", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price220);
		meals31.add(meal220);

		List<Ingredient> ingredients221 = new ArrayList<>();
		ingredients221.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients221.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		double[] price221 = {0.45, 0.8, 1.0};
		Meal meal221 = new Meal(ingredients221, "Hausgemachte Currypasta", Type.getType("Wahlmenü (Beilage)"), price221);
		meals31.add(meal221);

		List<Ingredient> ingredients222 = new ArrayList<>();
		ingredients222.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients222.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price222 = {0.45, 0.8, 1.0};
		Meal meal222 = new Meal(ingredients222, "Petersilienkartoffeln", Type.getType("Wahlmenü (Beilage)"), price222);
		meals31.add(meal222);

		List<Ingredient> ingredients223 = new ArrayList<>();
		ingredients223.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients223.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price223 = {0.5, 0.9, 1.1};
		Meal meal223 = new Meal(ingredients223, "Blumenkohlgemüse", Type.getType("Wahlmenü (Gemüse)"), price223);
		meals31.add(meal223);

		List<Ingredient> ingredients224 = new ArrayList<>();
		ingredients224.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients224.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients224.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price224 = {0.5, 0.85, 1.05};
		Meal meal224 = new Meal(ingredients224, "Mischsalat, Curry-Dressing", Type.getType("Wahlmenü (Salat)"), price224);
		meals31.add(meal224);

		List<Ingredient> ingredients225 = new ArrayList<>();
		ingredients225.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients225.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price225 = {0.4, 0.6, 0.8};
		Meal meal225 = new Meal(ingredients225, "Spargelcremesuppe", Type.getType("Wahlmenü (Suppe)"), price225);
		meals31.add(meal225);

		List<Ingredient> ingredients226 = new ArrayList<>();
		ingredients226.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients226.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price226 = {0.8, 0.95, 1.1};
		Meal meal226 = new Meal(ingredients226, "Aprikosenquark", Type.getType("Wahlmenü (Dessert)"), price226);
		meals31.add(meal226);

		map4.put(Day.getDay("Donnerstag"), meals31);


		List<Meal> meals32 = new ArrayList<>();
		map4.put(Day.getDay("Freitag"), meals32);


		List<Meal> meals33 = new ArrayList<>();
		map4.put(Day.getDay("Samstag"), meals33);


		List<Meal> meals34 = new ArrayList<>();
		map4.put(Day.getDay("Sonntag"), meals34);

		Map<Day, List<Meal>> map13 = mealsDummy.get(Week.getWeek("Naechste")).get(Mensa.getMensa("Mensa Ricklinger Stadtweg"));

		List<Meal> meals91 = new ArrayList<>();
		List<Ingredient> ingredients592 = new ArrayList<>();
		ingredients592.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients592.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients592.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		double[] price592 = {1.35, 2.8, 3.8};
		Meal meal592 = new Meal(ingredients592, "Feuriger Bohneneintopf", Type.getType("Eintopf"), price592);
		meals91.add(meal592);

		List<Ingredient> ingredients593 = new ArrayList<>();
		ingredients593.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients593.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients593.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price593 = {1.7, 3.35, 4.15};
		Meal meal593 = new Meal(ingredients593, "Nürnberger Rostbratwürstchen, Kartoffelpüree, Wonnekraut", Type.getType("Tellergericht"), price593);
		meals91.add(meal593);

		List<Ingredient> ingredients594 = new ArrayList<>();
		ingredients594.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients594.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients594.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients594.add(Ingredient.getIngredientFromName("Konservierungsstoff"));
		ingredients594.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients594.add(Ingredient.getIngredientFromName("Phosphat"));
		ingredients594.add(Ingredient.getIngredientFromName("Nitritpökelsalz"));
		ingredients594.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients594.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		ingredients594.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price594 = {1.7, 2.8, 3.2};
		Meal meal594 = new Meal(ingredients594, "Rinderroulade mit Specksauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price594);
		meals91.add(meal594);

		List<Ingredient> ingredients595 = new ArrayList<>();
		ingredients595.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients595.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients595.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients595.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price595 = {1.7, 2.8, 3.2};
		Meal meal595 = new Meal(ingredients595, "Vegetarisches Schnitzel, Karotten-Sahne-Sauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price595);
		meals91.add(meal595);

		List<Ingredient> ingredients596 = new ArrayList<>();
		ingredients596.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients596.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients596.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price596 = {0.45, 0.8, 1.0};
		Meal meal596 = new Meal(ingredients596, "Bechamelkartoffeln", Type.getType("Wahlmenü (Beilage)"), price596);
		meals91.add(meal596);

		List<Ingredient> ingredients597 = new ArrayList<>();
		ingredients597.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients597.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients597.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		double[] price597 = {0.45, 0.8, 1.0};
		Meal meal597 = new Meal(ingredients597, "Hausgemachte Pasta", Type.getType("Wahlmenü (Beilage)"), price597);
		meals91.add(meal597);

		List<Ingredient> ingredients598 = new ArrayList<>();
		ingredients598.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price598 = {0.5, 0.9, 1.1};
		Meal meal598 = new Meal(ingredients598, "Bohnengemüse", Type.getType("Wahlmenü (Gemüse)"), price598);
		meals91.add(meal598);

		List<Ingredient> ingredients599 = new ArrayList<>();
		ingredients599.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price599 = {0.5, 0.85, 1.05};
		Meal meal599 = new Meal(ingredients599, "Gurkensalat", Type.getType("Wahlmenü (Salat)"), price599);
		meals91.add(meal599);

		List<Ingredient> ingredients600 = new ArrayList<>();
		ingredients600.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients600.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients600.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price600 = {0.4, 0.6, 0.8};
		Meal meal600 = new Meal(ingredients600, "Tomatensuppe", Type.getType("Wahlmenü (Suppe)"), price600);
		meals91.add(meal600);

		List<Ingredient> ingredients601 = new ArrayList<>();
		ingredients601.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients601.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price601 = {0.8, 0.95, 1.1};
		Meal meal601 = new Meal(ingredients601, "Obstsalat", Type.getType("Wahlmenü (Dessert)"), price601);
		meals91.add(meal601);

		map13.put(Day.getDay("Montag"), meals91);


		List<Meal> meals92 = new ArrayList<>();
		List<Ingredient> ingredients602 = new ArrayList<>();
		ingredients602.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients602.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients602.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		double[] price602 = {1.35, 2.8, 3.8};
		Meal meal602 = new Meal(ingredients602, "Nudelsuppe mit Rindfleisch, mit hausgemachter Pasta", Type.getType("Eintopf"), price602);
		meals92.add(meal602);

		List<Ingredient> ingredients603 = new ArrayList<>();
		ingredients603.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients603.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients603.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		double[] price603 = {1.7, 3.35, 4.15};
		Meal meal603 = new Meal(ingredients603, "Kartoffelpuffer, hausgemachtes Apfelmus", Type.getType("Tellergericht"), price603);
		meals92.add(meal603);

		List<Ingredient> ingredients604 = new ArrayList<>();
		ingredients604.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients604.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients604.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients604.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients604.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients604.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients604.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price604 = {1.7, 2.8, 3.2};
		Meal meal604 = new Meal(ingredients604, "Frikadelle, Rahmsauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price604);
		meals92.add(meal604);

		List<Ingredient> ingredients605 = new ArrayList<>();
		ingredients605.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients605.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients605.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price605 = {1.6, 2.7, 3.1};
		Meal meal605 = new Meal(ingredients605, "Gemüsegratin mit Kräutern, Bechamelsauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price605);
		meals92.add(meal605);

		List<Ingredient> ingredients606 = new ArrayList<>();
		ingredients606.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients606.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients606.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients606.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		double[] price606 = {0.45, 0.8, 1.0};
		Meal meal606 = new Meal(ingredients606, "Hausgemachte Schupfnudeln", Type.getType("Wahlmenü (Beilage)"), price606);
		meals92.add(meal606);

		List<Ingredient> ingredients607 = new ArrayList<>();
		ingredients607.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients607.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price607 = {0.45, 0.8, 1.0};
		Meal meal607 = new Meal(ingredients607, "Salzkartoffeln", Type.getType("Wahlmenü (Beilage)"), price607);
		meals92.add(meal607);

		List<Ingredient> ingredients608 = new ArrayList<>();
		ingredients608.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients608.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price608 = {0.5, 0.9, 1.1};
		Meal meal608 = new Meal(ingredients608, "Erbsengemüse", Type.getType("Wahlmenü (Gemüse)"), price608);
		meals92.add(meal608);

		List<Ingredient> ingredients609 = new ArrayList<>();
		ingredients609.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients609.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients609.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price609 = {0.5, 0.85, 1.05};
		Meal meal609 = new Meal(ingredients609, "Lollo-Bionda-Salat, Honig-Senf-Dressing", Type.getType("Wahlmenü (Salat)"), price609);
		meals92.add(meal609);

		List<Ingredient> ingredients610 = new ArrayList<>();
		ingredients610.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients610.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price610 = {0.4, 0.6, 0.8};
		Meal meal610 = new Meal(ingredients610, "Tomaten-Paprikasuppe", Type.getType("Wahlmenü (Suppe)"), price610);
		meals92.add(meal610);

		List<Ingredient> ingredients611 = new ArrayList<>();
		ingredients611.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients611.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients611.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price611 = {0.8, 0.95, 1.1};
		Meal meal611 = new Meal(ingredients611, "Milchreis, Zimt und Zucker", Type.getType("Wahlmenü (Dessert)"), price611);
		meals92.add(meal611);

		map13.put(Day.getDay("Dienstag"), meals92);


		List<Meal> meals93 = new ArrayList<>();
		List<Ingredient> ingredients612 = new ArrayList<>();
		ingredients612.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients612.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients612.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients612.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		double[] price612 = {1.35, 2.8, 3.8};
		Meal meal612 = new Meal(ingredients612, "Chinesische Gemüsesuppe", Type.getType("Eintopf"), price612);
		meals93.add(meal612);

		List<Ingredient> ingredients613 = new ArrayList<>();
		ingredients613.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients613.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients613.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients613.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients613.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		double[] price613 = {1.7, 3.35, 4.15};
		Meal meal613 = new Meal(ingredients613, "Hackfleischpfanne mit Chinakohl, Reis", Type.getType("Tellergericht"), price613);
		meals93.add(meal613);

		List<Ingredient> ingredients614 = new ArrayList<>();
		ingredients614.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients614.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price614 = {1.7, 2.8, 3.2};
		Meal meal614 = new Meal(ingredients614, "Halbes Grillhähnchen", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price614);
		meals93.add(meal614);

		List<Ingredient> ingredients615 = new ArrayList<>();
		ingredients615.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients615.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients615.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price615 = {1.6, 2.7, 3.1};
		Meal meal615 = new Meal(ingredients615, "Champignon-Risotto-Bratling, Kressesauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price615);
		meals93.add(meal615);

		List<Ingredient> ingredients616 = new ArrayList<>();
		ingredients616.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients616.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients616.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients616.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price616 = {0.45, 0.8, 1.0};
		Meal meal616 = new Meal(ingredients616, "American Wedges", Type.getType("Wahlmenü (Beilage)"), price616);
		meals93.add(meal616);

		List<Ingredient> ingredients617 = new ArrayList<>();
		ingredients617.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients617.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price617 = {0.45, 0.8, 1.0};
		Meal meal617 = new Meal(ingredients617, "Risi-Pisi", Type.getType("Wahlmenü (Beilage)"), price617);
		meals93.add(meal617);

		List<Ingredient> ingredients618 = new ArrayList<>();
		ingredients618.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients618.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price618 = {0.5, 0.9, 1.1};
		Meal meal618 = new Meal(ingredients618, "Kaiserschoten", Type.getType("Wahlmenü (Gemüse)"), price618);
		meals93.add(meal618);

		List<Ingredient> ingredients619 = new ArrayList<>();
		ingredients619.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients619.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients619.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients619.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients619.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price619 = {0.5, 0.85, 1.05};
		Meal meal619 = new Meal(ingredients619, "Endiviensalat, Italien-Dressing", Type.getType("Wahlmenü (Salat)"), price619);
		meals93.add(meal619);

		List<Ingredient> ingredients620 = new ArrayList<>();
		ingredients620.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients620.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients620.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients620.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price620 = {0.4, 0.6, 0.8};
		Meal meal620 = new Meal(ingredients620, "Kartoffelsuppe", Type.getType("Wahlmenü (Suppe)"), price620);
		meals93.add(meal620);

		List<Ingredient> ingredients621 = new ArrayList<>();
		ingredients621.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients621.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients621.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price621 = {0.8, 0.95, 1.1};
		Meal meal621 = new Meal(ingredients621, "Erdbeerjoghurt", Type.getType("Wahlmenü (Dessert)"), price621);
		meals93.add(meal621);

		map13.put(Day.getDay("Mittwoch"), meals93);


		List<Meal> meals94 = new ArrayList<>();
		List<Ingredient> ingredients622 = new ArrayList<>();
		ingredients622.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients622.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients622.add(Ingredient.getIngredientFromName("Farbstoff"));
		ingredients622.add(Ingredient.getIngredientFromName("Konservierungsstoff"));
		ingredients622.add(Ingredient.getIngredientFromName("Phosphat"));
		ingredients622.add(Ingredient.getIngredientFromName("Nitritpökelsalz"));
		ingredients622.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price622 = {1.35, 2.8, 3.8};
		Meal meal622 = new Meal(ingredients622, "Kartoffel-Bärlaucheintopf mit Wienerle", Type.getType("Eintopf"), price622);
		meals94.add(meal622);

		List<Ingredient> ingredients623 = new ArrayList<>();
		ingredients623.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients623.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients623.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients623.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price623 = {1.7, 3.35, 4.15};
		Meal meal623 = new Meal(ingredients623, "Hausgemachte Pasta, Spargelragout in Rahm", Type.getType("Tellergericht"), price623);
		meals94.add(meal623);

		List<Ingredient> ingredients624 = new ArrayList<>();
		ingredients624.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients624.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients624.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients624.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients624.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price624 = {1.7, 2.8, 3.2};
		Meal meal624 = new Meal(ingredients624, "Rinder-Geschnetzeltes Stroganoff", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price624);
		meals94.add(meal624);

		List<Ingredient> ingredients625 = new ArrayList<>();
		ingredients625.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients625.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients625.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients625.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		ingredients625.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price625 = {1.7, 2.8, 3.2};
		Meal meal625 = new Meal(ingredients625, "Tofugemüse mit Rucola", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price625);
		meals94.add(meal625);

		List<Ingredient> ingredients626 = new ArrayList<>();
		ingredients626.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients626.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients626.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients626.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		double[] price626 = {0.45, 0.8, 1.0};
		Meal meal626 = new Meal(ingredients626, "Hausgemachte Spätzle", Type.getType("Wahlmenü (Beilage)"), price626);
		meals94.add(meal626);

		List<Ingredient> ingredients627 = new ArrayList<>();
		ingredients627.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients627.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price627 = {0.45, 0.8, 1.0};
		Meal meal627 = new Meal(ingredients627, "Paprikareis", Type.getType("Wahlmenü (Beilage)"), price627);
		meals94.add(meal627);

		List<Ingredient> ingredients628 = new ArrayList<>();
		ingredients628.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients628.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price628 = {0.5, 0.9, 1.1};
		Meal meal628 = new Meal(ingredients628, "Auberginengemüse", Type.getType("Wahlmenü (Gemüse)"), price628);
		meals94.add(meal628);

		List<Ingredient> ingredients629 = new ArrayList<>();
		ingredients629.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients629.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients629.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price629 = {0.5, 0.9, 1.1};
		Meal meal629 = new Meal(ingredients629, "Linsengemüse", Type.getType("Wahlmenü (Gemüse)"), price629);
		meals94.add(meal629);

		List<Ingredient> ingredients630 = new ArrayList<>();
		ingredients630.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients630.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients630.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		double[] price630 = {0.5, 0.85, 1.05};
		Meal meal630 = new Meal(ingredients630, "Kopfsalat, Tomaten-Vinaigrette", Type.getType("Wahlmenü (Salat)"), price630);
		meals94.add(meal630);

		List<Ingredient> ingredients631 = new ArrayList<>();
		ingredients631.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients631.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients631.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients631.add(Ingredient.getIngredientFromName("Schalenfrüchte"));
		double[] price631 = {0.4, 0.6, 0.8};
		Meal meal631 = new Meal(ingredients631, "Möhrensuppe mit Haselnüssen", Type.getType("Wahlmenü (Suppe)"), price631);
		meals94.add(meal631);

		List<Ingredient> ingredients632 = new ArrayList<>();
		ingredients632.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients632.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients632.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price632 = {0.8, 0.95, 1.1};
		Meal meal632 = new Meal(ingredients632, "Schlemmerquark mit Heidelbeersauce", Type.getType("Wahlmenü (Dessert)"), price632);
		meals94.add(meal632);

		map13.put(Day.getDay("Donnerstag"), meals94);


		List<Meal> meals95 = new ArrayList<>();
		List<Ingredient> ingredients633 = new ArrayList<>();
		ingredients633.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients633.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients633.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price633 = {1.35, 2.8, 3.8};
		Meal meal633 = new Meal(ingredients633, "Bunte Maissuppe", Type.getType("Eintopf"), price633);
		meals95.add(meal633);

		List<Ingredient> ingredients634 = new ArrayList<>();
		ingredients634.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients634.add(Ingredient.getIngredientFromName("Unbekannt"));
		ingredients634.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients634.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients634.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price634 = {1.7, 3.35, 4.15};
		Meal meal634 = new Meal(ingredients634, "Pizza Salami", Type.getType("Tellergericht"), price634);
		meals95.add(meal634);

		List<Ingredient> ingredients635 = new ArrayList<>();
		ingredients635.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients635.add(Ingredient.getIngredientFromName("Fisch und Fischerzeugnisse"));
		ingredients635.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients635.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price635 = {1.7, 2.8, 3.2};
		Meal meal635 = new Meal(ingredients635, "Seelachsfilet, Senfsauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price635);
		meals95.add(meal635);

		List<Ingredient> ingredients636 = new ArrayList<>();
		ingredients636.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients636.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients636.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients636.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients636.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients636.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price636 = {1.7, 2.8, 3.2};
		Meal meal636 = new Meal(ingredients636, "Gefüllte Käse-Paprika, Tomatensauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price636);
		meals95.add(meal636);

		List<Ingredient> ingredients637 = new ArrayList<>();
		ingredients637.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients637.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price637 = {0.45, 0.8, 1.0};
		Meal meal637 = new Meal(ingredients637, "Basmatireis", Type.getType("Wahlmenü (Beilage)"), price637);
		meals95.add(meal637);

		List<Ingredient> ingredients638 = new ArrayList<>();
		ingredients638.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients638.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients638.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients638.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price638 = {0.45, 0.8, 1.0};
		Meal meal638 = new Meal(ingredients638, "Kartoffelgratin", Type.getType("Wahlmenü (Beilage)"), price638);
		meals95.add(meal638);

		List<Ingredient> ingredients639 = new ArrayList<>();
		ingredients639.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients639.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients639.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price639 = {0.5, 0.9, 1.1};
		Meal meal639 = new Meal(ingredients639, "Blattspinat in Rahm", Type.getType("Wahlmenü (Gemüse)"), price639);
		meals95.add(meal639);

		List<Ingredient> ingredients640 = new ArrayList<>();
		ingredients640.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price640 = {0.5, 0.85, 1.05};
		Meal meal640 = new Meal(ingredients640, "Mischsalat, Schnittlauch-Vinaigrette", Type.getType("Wahlmenü (Salat)"), price640);
		meals95.add(meal640);

		List<Ingredient> ingredients641 = new ArrayList<>();
		ingredients641.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients641.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price641 = {0.4, 0.6, 0.8};
		Meal meal641 = new Meal(ingredients641, "Spargelcremesuppe", Type.getType("Wahlmenü (Suppe)"), price641);
		meals95.add(meal641);

		List<Ingredient> ingredients642 = new ArrayList<>();
		ingredients642.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients642.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients642.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price642 = {0.8, 0.95, 1.1};
		Meal meal642 = new Meal(ingredients642, "Orangenjoghurt mit Flakes", Type.getType("Wahlmenü (Dessert)"), price642);
		meals95.add(meal642);

		map13.put(Day.getDay("Freitag"), meals95);


		List<Meal> meals96 = new ArrayList<>();
		map13.put(Day.getDay("Samstag"), meals96);


		List<Meal> meals97 = new ArrayList<>();
		map13.put(Day.getDay("Sonntag"), meals97);


		
	}

	private static void fillPZHDummy(Map<Week, Map<Mensa, Map<Day, List<Meal>>>> mealsDummy) {
		Map<Day, List<Meal>> map7 = mealsDummy.get(Week.getWeek("Aktuelle")).get(Mensa.getMensa("Mensa PZH"));

		List<Meal> meals49 = new ArrayList<>();
		List<Ingredient> ingredients300 = new ArrayList<>();
		ingredients300.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients300.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients300.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price300 = {1.35, 2.8, 3.8};
		Meal meal300 = new Meal(ingredients300, "Gulascheintopf mit Möhren und Kartoffeln", Type.getType("Eintopf"), price300);
		meals49.add(meal300);

		List<Ingredient> ingredients301 = new ArrayList<>();
		ingredients301.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients301.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients301.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price301 = {1.7, 3.35, 4.15};
		Meal meal301 = new Meal(ingredients301, "Riesenrösti mit Rahmchampignons", Type.getType("Tellergericht"), price301);
		meals49.add(meal301);

		List<Ingredient> ingredients302 = new ArrayList<>();
		ingredients302.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients302.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients302.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients302.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price302 = {1.7, 2.8, 3.2};
		Meal meal302 = new Meal(ingredients302, "Putensteak, Sauce Hollandaise", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price302);
		meals49.add(meal302);

		List<Ingredient> ingredients303 = new ArrayList<>();
		ingredients303.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients303.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients303.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients303.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price303 = {0.45, 0.8, 1.0};
		Meal meal303 = new Meal(ingredients303, "Gemüse-Couscous", Type.getType("Wahlmenü (Beilage)"), price303);
		meals49.add(meal303);

		List<Ingredient> ingredients304 = new ArrayList<>();
		ingredients304.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients304.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price304 = {0.45, 0.8, 1.0};
		Meal meal304 = new Meal(ingredients304, "Reis", Type.getType("Wahlmenü (Beilage)"), price304);
		meals49.add(meal304);

		List<Ingredient> ingredients305 = new ArrayList<>();
		ingredients305.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients305.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price305 = {0.5, 0.9, 1.1};
		Meal meal305 = new Meal(ingredients305, "Brokkoli", Type.getType("Wahlmenü (Gemüse)"), price305);
		meals49.add(meal305);

		List<Ingredient> ingredients306 = new ArrayList<>();
		ingredients306.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients306.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price306 = {0.5, 0.85, 1.05};
		Meal meal306 = new Meal(ingredients306, "Tomatensalat", Type.getType("Wahlmenü (Salat)"), price306);
		meals49.add(meal306);

		List<Ingredient> ingredients307 = new ArrayList<>();
		ingredients307.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients307.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients307.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price307 = {0.4, 0.6, 0.8};
		Meal meal307 = new Meal(ingredients307, "Blumenkohlsuppe", Type.getType("Wahlmenü (Suppe)"), price307);
		meals49.add(meal307);

		List<Ingredient> ingredients308 = new ArrayList<>();
		ingredients308.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients308.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients308.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price308 = {0.8, 0.95, 1.1};
		Meal meal308 = new Meal(ingredients308, "Beerenquark", Type.getType("Wahlmenü (Dessert)"), price308);
		meals49.add(meal308);

		map7.put(Day.getDay("Montag"), meals49);


		List<Meal> meals50 = new ArrayList<>();
		List<Ingredient> ingredients309 = new ArrayList<>();
		ingredients309.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients309.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients309.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients309.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price309 = {1.35, 2.8, 3.8};
		Meal meal309 = new Meal(ingredients309, "Spargeleintopf", Type.getType("Eintopf"), price309);
		meals50.add(meal309);

		List<Ingredient> ingredients310 = new ArrayList<>();
		ingredients310.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients310.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients310.add(Ingredient.getIngredientFromName("Farbstoff"));
		ingredients310.add(Ingredient.getIngredientFromName("Konservierungsstoff"));
		ingredients310.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients310.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price310 = {1.7, 3.35, 4.15};
		Meal meal310 = new Meal(ingredients310, "Hausgemachte Pasta, Hähnchen-Paprika-Ragout, geriebener Hartkäse", Type.getType("Tellergericht"), price310);
		meals50.add(meal310);

		List<Ingredient> ingredients311 = new ArrayList<>();
		ingredients311.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients311.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients311.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients311.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price311 = {1.7, 2.8, 3.2};
		Meal meal311 = new Meal(ingredients311, "Allgäuer Käsefrikadelle, Créme-fraîche-Sauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price311);
		meals50.add(meal311);

		List<Ingredient> ingredients312 = new ArrayList<>();
		ingredients312.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients312.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients312.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price312 = {1.7, 2.8, 3.2};
		Meal meal312 = new Meal(ingredients312, "Back-Frischkäse mit Preiselbeeren", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price312);
		meals50.add(meal312);

		List<Ingredient> ingredients313 = new ArrayList<>();
		ingredients313.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients313.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price313 = {0.45, 0.8, 1.0};
		Meal meal313 = new Meal(ingredients313, "Salzkartoffeln", Type.getType("Wahlmenü (Beilage)"), price313);
		meals50.add(meal313);

		List<Ingredient> ingredients314 = new ArrayList<>();
		ingredients314.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients314.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price314 = {0.5, 0.9, 1.1};
		Meal meal314 = new Meal(ingredients314, "Spitzkohlgemüse", Type.getType("Wahlmenü (Gemüse)"), price314);
		meals50.add(meal314);

		List<Ingredient> ingredients315 = new ArrayList<>();
		ingredients315.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients315.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients315.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients315.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients315.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients315.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price315 = {0.5, 0.85, 1.05};
		Meal meal315 = new Meal(ingredients315, "Eisbergsalat, Dressing Sylter Art", Type.getType("Wahlmenü (Salat)"), price315);
		meals50.add(meal315);

		List<Ingredient> ingredients316 = new ArrayList<>();
		ingredients316.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients316.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients316.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients316.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price316 = {0.4, 0.6, 0.8};
		Meal meal316 = new Meal(ingredients316, "Spinatcremesuppe", Type.getType("Wahlmenü (Suppe)"), price316);
		meals50.add(meal316);

		List<Ingredient> ingredients317 = new ArrayList<>();
		ingredients317.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients317.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients317.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price317 = {0.8, 0.95, 1.1};
		Meal meal317 = new Meal(ingredients317, "Stracciatella-Joghurt", Type.getType("Wahlmenü (Dessert)"), price317);
		meals50.add(meal317);

		map7.put(Day.getDay("Dienstag"), meals50);


		List<Meal> meals51 = new ArrayList<>();
		List<Ingredient> ingredients318 = new ArrayList<>();
		ingredients318.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients318.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients318.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients318.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients318.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		double[] price318 = {1.35, 2.8, 3.8};
		Meal meal318 = new Meal(ingredients318, "Barbecueeintopf", Type.getType("Eintopf"), price318);
		meals51.add(meal318);

		List<Ingredient> ingredients319 = new ArrayList<>();
		ingredients319.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients319.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients319.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients319.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients319.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price319 = {1.7, 3.35, 4.15};
		Meal meal319 = new Meal(ingredients319, "Eier in Senfsauce, Salzkartoffeln", Type.getType("Tellergericht"), price319);
		meals51.add(meal319);

		List<Ingredient> ingredients320 = new ArrayList<>();
		ingredients320.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients320.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients320.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients320.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients320.add(Ingredient.getIngredientFromName("Geschmacksverstärker"));
		ingredients320.add(Ingredient.getIngredientFromName("Nitritpökelsalz"));
		ingredients320.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients320.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price320 = {1.7, 2.8, 3.2};
		Meal meal320 = new Meal(ingredients320, "Kasselerbraten, Rahmsauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price320);
		meals51.add(meal320);

		List<Ingredient> ingredients321 = new ArrayList<>();
		ingredients321.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients321.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients321.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price321 = {1.6, 2.7, 3.1};
		Meal meal321 = new Meal(ingredients321, "Pizza-Polenta, Tomatensugo", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price321);
		meals51.add(meal321);

		List<Ingredient> ingredients322 = new ArrayList<>();
		ingredients322.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients322.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients322.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price322 = {0.45, 0.8, 1.0};
		Meal meal322 = new Meal(ingredients322, "Kartoffelpüree", Type.getType("Wahlmenü (Beilage)"), price322);
		meals51.add(meal322);

		List<Ingredient> ingredients323 = new ArrayList<>();
		ingredients323.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price323 = {0.45, 0.8, 1.0};
		Meal meal323 = new Meal(ingredients323, "Kroketten", Type.getType("Wahlmenü (Beilage)"), price323);
		meals51.add(meal323);

		List<Ingredient> ingredients324 = new ArrayList<>();
		ingredients324.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients324.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price324 = {0.5, 0.9, 1.1};
		Meal meal324 = new Meal(ingredients324, "Romanesco", Type.getType("Wahlmenü (Gemüse)"), price324);
		meals51.add(meal324);

		List<Ingredient> ingredients325 = new ArrayList<>();
		ingredients325.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients325.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients325.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price325 = {0.5, 0.85, 1.05};
		Meal meal325 = new Meal(ingredients325, "Lollo-Rosso-Salat, hausgemachtes Balsamicodressing", Type.getType("Wahlmenü (Salat)"), price325);
		meals51.add(meal325);

		List<Ingredient> ingredients326 = new ArrayList<>();
		ingredients326.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients326.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price326 = {0.4, 0.6, 0.8};
		Meal meal326 = new Meal(ingredients326, "Currysuppe mit Kokos", Type.getType("Wahlmenü (Suppe)"), price326);
		meals51.add(meal326);

		List<Ingredient> ingredients327 = new ArrayList<>();
		ingredients327.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients327.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients327.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price327 = {0.8, 0.95, 1.1};
		Meal meal327 = new Meal(ingredients327, "Karamellpudding", Type.getType("Wahlmenü (Dessert)"), price327);
		meals51.add(meal327);

		map7.put(Day.getDay("Mittwoch"), meals51);


		List<Meal> meals52 = new ArrayList<>();
		List<Ingredient> ingredients328 = new ArrayList<>();
		ingredients328.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients328.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients328.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price328 = {1.35, 2.8, 3.8};
		Meal meal328 = new Meal(ingredients328, "Gemüseeintopf mit saurer Sahne", Type.getType("Eintopf"), price328);
		meals52.add(meal328);

		List<Ingredient> ingredients329 = new ArrayList<>();
		ingredients329.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients329.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients329.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients329.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		double[] price329 = {1.7, 2.8, 3.2};
		Meal meal329 = new Meal(ingredients329, "Hähnchenkeule Marengo", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price329);
		meals52.add(meal329);

		List<Ingredient> ingredients330 = new ArrayList<>();
		ingredients330.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients330.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients330.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients330.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price330 = {1.6, 2.7, 3.1};
		Meal meal330 = new Meal(ingredients330, "Möhren-Zucchini-Puffer, Kräuterdip", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price330);
		meals52.add(meal330);

		List<Ingredient> ingredients331 = new ArrayList<>();
		ingredients331.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients331.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price331 = {0.45, 0.8, 1.0};
		Meal meal331 = new Meal(ingredients331, "Petersilienkartoffeln", Type.getType("Wahlmenü (Beilage)"), price331);
		meals52.add(meal331);

		List<Ingredient> ingredients332 = new ArrayList<>();
		ingredients332.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients332.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients332.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price332 = {0.5, 0.85, 1.05};
		Meal meal332 = new Meal(ingredients332, "Mischsalat, Curry-Dressing", Type.getType("Wahlmenü (Salat)"), price332);
		meals52.add(meal332);

		List<Ingredient> ingredients333 = new ArrayList<>();
		ingredients333.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients333.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price333 = {0.8, 0.95, 1.1};
		Meal meal333 = new Meal(ingredients333, "Aprikosenquark", Type.getType("Wahlmenü (Dessert)"), price333);
		meals52.add(meal333);

		map7.put(Day.getDay("Donnerstag"), meals52);


		List<Meal> meals53 = new ArrayList<>();
		map7.put(Day.getDay("Freitag"), meals53);


		List<Meal> meals54 = new ArrayList<>();
		map7.put(Day.getDay("Samstag"), meals54);


		List<Meal> meals55 = new ArrayList<>();
		map7.put(Day.getDay("Sonntag"), meals55);

		Map<Day, List<Meal>> map16 = mealsDummy.get(Week.getWeek("Naechste")).get(Mensa.getMensa("Mensa PZH"));

		List<Meal> meals112 = new ArrayList<>();
		List<Ingredient> ingredients733 = new ArrayList<>();
		ingredients733.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients733.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients733.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		double[] price733 = {1.35, 2.8, 3.8};
		Meal meal733 = new Meal(ingredients733, "Feuriger Bohneneintopf", Type.getType("Eintopf"), price733);
		meals112.add(meal733);

		List<Ingredient> ingredients734 = new ArrayList<>();
		ingredients734.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients734.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients734.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price734 = {1.7, 3.35, 4.15};
		Meal meal734 = new Meal(ingredients734, "Nürnberger Rostbratwürstchen, Kartoffelpüree, Wonnekraut", Type.getType("Tellergericht"), price734);
		meals112.add(meal734);

		List<Ingredient> ingredients735 = new ArrayList<>();
		ingredients735.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients735.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients735.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients735.add(Ingredient.getIngredientFromName("Konservierungsstoff"));
		ingredients735.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients735.add(Ingredient.getIngredientFromName("Phosphat"));
		ingredients735.add(Ingredient.getIngredientFromName("Nitritpökelsalz"));
		ingredients735.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients735.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		ingredients735.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price735 = {1.7, 2.8, 3.2};
		Meal meal735 = new Meal(ingredients735, "Rinderroulade mit Specksauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price735);
		meals112.add(meal735);

		List<Ingredient> ingredients736 = new ArrayList<>();
		ingredients736.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients736.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients736.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients736.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price736 = {1.7, 2.8, 3.2};
		Meal meal736 = new Meal(ingredients736, "Vegetarisches Schnitzel, Karotten-Sahne-Sauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price736);
		meals112.add(meal736);

		List<Ingredient> ingredients737 = new ArrayList<>();
		ingredients737.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients737.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients737.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price737 = {0.45, 0.8, 1.0};
		Meal meal737 = new Meal(ingredients737, "Bechamelkartoffeln", Type.getType("Wahlmenü (Beilage)"), price737);
		meals112.add(meal737);

		List<Ingredient> ingredients738 = new ArrayList<>();
		ingredients738.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients738.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients738.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price738 = {0.5, 0.9, 1.1};
		Meal meal738 = new Meal(ingredients738, "Rahmwirsing", Type.getType("Wahlmenü (Gemüse)"), price738);
		meals112.add(meal738);

		List<Ingredient> ingredients739 = new ArrayList<>();
		ingredients739.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price739 = {0.5, 0.85, 1.05};
		Meal meal739 = new Meal(ingredients739, "Gurkensalat", Type.getType("Wahlmenü (Salat)"), price739);
		meals112.add(meal739);

		List<Ingredient> ingredients740 = new ArrayList<>();
		ingredients740.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients740.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients740.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price740 = {0.4, 0.6, 0.8};
		Meal meal740 = new Meal(ingredients740, "Tomatensuppe", Type.getType("Wahlmenü (Suppe)"), price740);
		meals112.add(meal740);

		List<Ingredient> ingredients741 = new ArrayList<>();
		ingredients741.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients741.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price741 = {0.8, 0.95, 1.1};
		Meal meal741 = new Meal(ingredients741, "Obstsalat", Type.getType("Wahlmenü (Dessert)"), price741);
		meals112.add(meal741);

		map16.put(Day.getDay("Montag"), meals112);


		List<Meal> meals113 = new ArrayList<>();
		List<Ingredient> ingredients742 = new ArrayList<>();
		ingredients742.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients742.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients742.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		double[] price742 = {1.35, 2.8, 3.8};
		Meal meal742 = new Meal(ingredients742, "Nudelsuppe mit Rindfleisch, mit hausgemachter Pasta", Type.getType("Eintopf"), price742);
		meals113.add(meal742);

		List<Ingredient> ingredients743 = new ArrayList<>();
		ingredients743.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients743.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients743.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		double[] price743 = {1.7, 3.35, 4.15};
		Meal meal743 = new Meal(ingredients743, "Kartoffelpuffer, hausgemachtes Apfelmus", Type.getType("Tellergericht"), price743);
		meals113.add(meal743);

		List<Ingredient> ingredients744 = new ArrayList<>();
		ingredients744.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients744.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients744.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients744.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients744.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients744.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients744.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price744 = {1.7, 2.8, 3.2};
		Meal meal744 = new Meal(ingredients744, "Frikadelle, Rahmsauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price744);
		meals113.add(meal744);

		List<Ingredient> ingredients745 = new ArrayList<>();
		ingredients745.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients745.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients745.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price745 = {1.6, 2.7, 3.1};
		Meal meal745 = new Meal(ingredients745, "Gemüsegratin mit Kräutern, Bechamelsauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price745);
		meals113.add(meal745);

		List<Ingredient> ingredients746 = new ArrayList<>();
		ingredients746.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients746.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients746.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients746.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		double[] price746 = {0.45, 0.8, 1.0};
		Meal meal746 = new Meal(ingredients746, "Hausgemachte Schupfnudeln", Type.getType("Wahlmenü (Beilage)"), price746);
		meals113.add(meal746);

		List<Ingredient> ingredients747 = new ArrayList<>();
		ingredients747.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients747.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price747 = {0.45, 0.8, 1.0};
		Meal meal747 = new Meal(ingredients747, "Salzkartoffeln", Type.getType("Wahlmenü (Beilage)"), price747);
		meals113.add(meal747);

		List<Ingredient> ingredients748 = new ArrayList<>();
		ingredients748.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients748.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price748 = {0.5, 0.9, 1.1};
		Meal meal748 = new Meal(ingredients748, "Erbsengemüse", Type.getType("Wahlmenü (Gemüse)"), price748);
		meals113.add(meal748);

		List<Ingredient> ingredients749 = new ArrayList<>();
		ingredients749.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients749.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients749.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price749 = {0.5, 0.85, 1.05};
		Meal meal749 = new Meal(ingredients749, "Lollo-Bionda-Salat, Honig-Senf-Dressing", Type.getType("Wahlmenü (Salat)"), price749);
		meals113.add(meal749);

		List<Ingredient> ingredients750 = new ArrayList<>();
		ingredients750.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients750.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price750 = {0.4, 0.6, 0.8};
		Meal meal750 = new Meal(ingredients750, "Tomaten-Paprikasuppe", Type.getType("Wahlmenü (Suppe)"), price750);
		meals113.add(meal750);

		List<Ingredient> ingredients751 = new ArrayList<>();
		ingredients751.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients751.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients751.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price751 = {0.8, 0.95, 1.1};
		Meal meal751 = new Meal(ingredients751, "Milchreis, Zimt und Zucker", Type.getType("Wahlmenü (Dessert)"), price751);
		meals113.add(meal751);

		map16.put(Day.getDay("Dienstag"), meals113);


		List<Meal> meals114 = new ArrayList<>();
		List<Ingredient> ingredients752 = new ArrayList<>();
		ingredients752.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients752.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients752.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients752.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		double[] price752 = {1.35, 2.8, 3.8};
		Meal meal752 = new Meal(ingredients752, "Chinesische Gemüsesuppe", Type.getType("Eintopf"), price752);
		meals114.add(meal752);

		List<Ingredient> ingredients753 = new ArrayList<>();
		ingredients753.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients753.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients753.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients753.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients753.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		double[] price753 = {1.7, 3.35, 4.15};
		Meal meal753 = new Meal(ingredients753, "Hackfleischpfanne mit Chinakohl, Reis", Type.getType("Tellergericht"), price753);
		meals114.add(meal753);

		List<Ingredient> ingredients754 = new ArrayList<>();
		ingredients754.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients754.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price754 = {1.7, 2.8, 3.2};
		Meal meal754 = new Meal(ingredients754, "Halbes Grillhähnchen", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price754);
		meals114.add(meal754);

		List<Ingredient> ingredients755 = new ArrayList<>();
		ingredients755.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients755.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients755.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price755 = {1.6, 2.7, 3.1};
		Meal meal755 = new Meal(ingredients755, "Champignon-Risotto-Bratling, Kressesauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price755);
		meals114.add(meal755);

		List<Ingredient> ingredients756 = new ArrayList<>();
		ingredients756.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients756.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients756.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients756.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price756 = {0.45, 0.8, 1.0};
		Meal meal756 = new Meal(ingredients756, "American Wedges", Type.getType("Wahlmenü (Beilage)"), price756);
		meals114.add(meal756);

		List<Ingredient> ingredients757 = new ArrayList<>();
		ingredients757.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients757.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price757 = {0.45, 0.8, 1.0};
		Meal meal757 = new Meal(ingredients757, "Risi-Pisi", Type.getType("Wahlmenü (Beilage)"), price757);
		meals114.add(meal757);

		List<Ingredient> ingredients758 = new ArrayList<>();
		ingredients758.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients758.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price758 = {0.5, 0.9, 1.1};
		Meal meal758 = new Meal(ingredients758, "Pariser Karotten", Type.getType("Wahlmenü (Gemüse)"), price758);
		meals114.add(meal758);

		List<Ingredient> ingredients759 = new ArrayList<>();
		ingredients759.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients759.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients759.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients759.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients759.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price759 = {0.5, 0.85, 1.05};
		Meal meal759 = new Meal(ingredients759, "Endiviensalat, Italien-Dressing", Type.getType("Wahlmenü (Salat)"), price759);
		meals114.add(meal759);

		List<Ingredient> ingredients760 = new ArrayList<>();
		ingredients760.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients760.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients760.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients760.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price760 = {0.4, 0.6, 0.8};
		Meal meal760 = new Meal(ingredients760, "Kartoffelsuppe", Type.getType("Wahlmenü (Suppe)"), price760);
		meals114.add(meal760);

		List<Ingredient> ingredients761 = new ArrayList<>();
		ingredients761.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients761.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients761.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price761 = {0.8, 0.95, 1.1};
		Meal meal761 = new Meal(ingredients761, "Erdbeerjoghurt", Type.getType("Wahlmenü (Dessert)"), price761);
		meals114.add(meal761);

		map16.put(Day.getDay("Mittwoch"), meals114);


		List<Meal> meals115 = new ArrayList<>();
		List<Ingredient> ingredients762 = new ArrayList<>();
		ingredients762.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients762.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients762.add(Ingredient.getIngredientFromName("Farbstoff"));
		ingredients762.add(Ingredient.getIngredientFromName("Konservierungsstoff"));
		ingredients762.add(Ingredient.getIngredientFromName("Phosphat"));
		ingredients762.add(Ingredient.getIngredientFromName("Nitritpökelsalz"));
		ingredients762.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price762 = {1.35, 2.8, 3.8};
		Meal meal762 = new Meal(ingredients762, "Kartoffel-Bärlaucheintopf mit Wienerle", Type.getType("Eintopf"), price762);
		meals115.add(meal762);

		List<Ingredient> ingredients763 = new ArrayList<>();
		ingredients763.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients763.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients763.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients763.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price763 = {1.7, 3.35, 4.15};
		Meal meal763 = new Meal(ingredients763, "Hausgemachte Pasta, Spargelragout in Rahm", Type.getType("Tellergericht"), price763);
		meals115.add(meal763);

		List<Ingredient> ingredients764 = new ArrayList<>();
		ingredients764.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients764.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients764.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients764.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients764.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price764 = {1.7, 2.8, 3.2};
		Meal meal764 = new Meal(ingredients764, "Rinder-Geschnetzeltes Stroganoff", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price764);
		meals115.add(meal764);

		List<Ingredient> ingredients765 = new ArrayList<>();
		ingredients765.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients765.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients765.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients765.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		ingredients765.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price765 = {1.7, 2.8, 3.2};
		Meal meal765 = new Meal(ingredients765, "Tofugemüse mit Rucola", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price765);
		meals115.add(meal765);

		List<Ingredient> ingredients766 = new ArrayList<>();
		ingredients766.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients766.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price766 = {0.45, 0.8, 1.0};
		Meal meal766 = new Meal(ingredients766, "Paprikareis", Type.getType("Wahlmenü (Beilage)"), price766);
		meals115.add(meal766);

		List<Ingredient> ingredients767 = new ArrayList<>();
		ingredients767.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients767.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price767 = {0.5, 0.9, 1.1};
		Meal meal767 = new Meal(ingredients767, "Auberginengemüse", Type.getType("Wahlmenü (Gemüse)"), price767);
		meals115.add(meal767);

		List<Ingredient> ingredients768 = new ArrayList<>();
		ingredients768.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients768.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients768.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		double[] price768 = {0.5, 0.85, 1.05};
		Meal meal768 = new Meal(ingredients768, "Kopfsalat, Tomaten-Vinaigrette", Type.getType("Wahlmenü (Salat)"), price768);
		meals115.add(meal768);

		List<Ingredient> ingredients769 = new ArrayList<>();
		ingredients769.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients769.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients769.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients769.add(Ingredient.getIngredientFromName("Schalenfrüchte"));
		double[] price769 = {0.4, 0.6, 0.8};
		Meal meal769 = new Meal(ingredients769, "Möhrensuppe mit Haselnüssen", Type.getType("Wahlmenü (Suppe)"), price769);
		meals115.add(meal769);

		List<Ingredient> ingredients770 = new ArrayList<>();
		ingredients770.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients770.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients770.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price770 = {0.8, 0.95, 1.1};
		Meal meal770 = new Meal(ingredients770, "Schlemmerquark mit Heidelbeersauce", Type.getType("Wahlmenü (Dessert)"), price770);
		meals115.add(meal770);

		map16.put(Day.getDay("Donnerstag"), meals115);


		List<Meal> meals116 = new ArrayList<>();
		List<Ingredient> ingredients771 = new ArrayList<>();
		ingredients771.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients771.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients771.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price771 = {1.35, 2.8, 3.8};
		Meal meal771 = new Meal(ingredients771, "Bunte Maissuppe", Type.getType("Eintopf"), price771);
		meals116.add(meal771);

		List<Ingredient> ingredients772 = new ArrayList<>();
		ingredients772.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients772.add(Ingredient.getIngredientFromName("Fisch und Fischerzeugnisse"));
		ingredients772.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients772.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price772 = {1.7, 2.8, 3.2};
		Meal meal772 = new Meal(ingredients772, "Seelachsfilet, Senfsauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price772);
		meals116.add(meal772);

		List<Ingredient> ingredients773 = new ArrayList<>();
		ingredients773.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients773.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients773.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients773.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients773.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients773.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price773 = {1.7, 2.8, 3.2};
		Meal meal773 = new Meal(ingredients773, "Gefüllte Käse-Paprika, Tomatensauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price773);
		meals116.add(meal773);

		List<Ingredient> ingredients774 = new ArrayList<>();
		ingredients774.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients774.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price774 = {0.45, 0.8, 1.0};
		Meal meal774 = new Meal(ingredients774, "Basmatireis", Type.getType("Wahlmenü (Beilage)"), price774);
		meals116.add(meal774);

		List<Ingredient> ingredients775 = new ArrayList<>();
		ingredients775.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients775.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients775.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price775 = {0.5, 0.9, 1.1};
		Meal meal775 = new Meal(ingredients775, "Blattspinat in Rahm", Type.getType("Wahlmenü (Gemüse)"), price775);
		meals116.add(meal775);

		List<Ingredient> ingredients776 = new ArrayList<>();
		ingredients776.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price776 = {0.5, 0.85, 1.05};
		Meal meal776 = new Meal(ingredients776, "Mischsalat, Schnittlauch-Vinaigrette", Type.getType("Wahlmenü (Salat)"), price776);
		meals116.add(meal776);

		List<Ingredient> ingredients777 = new ArrayList<>();
		ingredients777.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients777.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients777.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price777 = {0.8, 0.95, 1.1};
		Meal meal777 = new Meal(ingredients777, "Orangenjoghurt mit Flakes", Type.getType("Wahlmenü (Dessert)"), price777);
		meals116.add(meal777);

		map16.put(Day.getDay("Freitag"), meals116);


		List<Meal> meals117 = new ArrayList<>();
		map16.put(Day.getDay("Samstag"), meals117);


		List<Meal> meals118 = new ArrayList<>();
		map16.put(Day.getDay("Sonntag"), meals118);


		
	}

	private static void fillHMTMHDummy(Map<Week, Map<Mensa, Map<Day, List<Meal>>>> mealsDummy) {
		Map<Day, List<Meal>> map6 = mealsDummy.get(Week.getWeek("Aktuelle")).get(Mensa.getMensa("Mensa HMTMH"));

		List<Meal> meals42 = new ArrayList<>();
		List<Ingredient> ingredients272 = new ArrayList<>();
		ingredients272.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients272.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients272.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price272 = {1.35, 2.8, 3.8};
		Meal meal272 = new Meal(ingredients272, "Gulascheintopf mit Möhren und Kartoffeln", Type.getType("Eintopf"), price272);
		meals42.add(meal272);

		List<Ingredient> ingredients273 = new ArrayList<>();
		ingredients273.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients273.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients273.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price273 = {1.7, 3.35, 4.15};
		Meal meal273 = new Meal(ingredients273, "Riesenrösti mit Rahmchampignons", Type.getType("Tellergericht"), price273);
		meals42.add(meal273);

		List<Ingredient> ingredients274 = new ArrayList<>();
		ingredients274.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients274.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients274.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients274.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price274 = {1.7, 2.8, 3.2};
		Meal meal274 = new Meal(ingredients274, "Putensteak, Sauce Hollandaise", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price274);
		meals42.add(meal274);

		List<Ingredient> ingredients275 = new ArrayList<>();
		ingredients275.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients275.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients275.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients275.add(Ingredient.getIngredientFromName("Sesamsamen und Sesamsamenerzeugnisse"));
		double[] price275 = {1.6, 2.7, 3.1};
		Meal meal275 = new Meal(ingredients275, "Linsen-Mangold-Curry", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price275);
		meals42.add(meal275);

		List<Ingredient> ingredients276 = new ArrayList<>();
		ingredients276.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients276.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients276.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients276.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price276 = {0.45, 0.8, 1.0};
		Meal meal276 = new Meal(ingredients276, "Gemüse-Couscous", Type.getType("Wahlmenü (Beilage)"), price276);
		meals42.add(meal276);

		List<Ingredient> ingredients277 = new ArrayList<>();
		ingredients277.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients277.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price277 = {0.5, 0.9, 1.1};
		Meal meal277 = new Meal(ingredients277, "Brokkoli", Type.getType("Wahlmenü (Gemüse)"), price277);
		meals42.add(meal277);

		List<Ingredient> ingredients278 = new ArrayList<>();
		ingredients278.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients278.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients278.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price278 = {0.8, 0.95, 1.1};
		Meal meal278 = new Meal(ingredients278, "Beerenquark", Type.getType("Wahlmenü (Dessert)"), price278);
		meals42.add(meal278);

		map6.put(Day.getDay("Montag"), meals42);


		List<Meal> meals43 = new ArrayList<>();
		List<Ingredient> ingredients279 = new ArrayList<>();
		ingredients279.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients279.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients279.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients279.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price279 = {1.35, 2.8, 3.8};
		Meal meal279 = new Meal(ingredients279, "Spargeleintopf", Type.getType("Eintopf"), price279);
		meals43.add(meal279);

		List<Ingredient> ingredients280 = new ArrayList<>();
		ingredients280.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients280.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients280.add(Ingredient.getIngredientFromName("Farbstoff"));
		ingredients280.add(Ingredient.getIngredientFromName("Konservierungsstoff"));
		ingredients280.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients280.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price280 = {1.7, 3.35, 4.15};
		Meal meal280 = new Meal(ingredients280, "Hausgemachte Pasta, Hähnchen-Paprika-Ragout, geriebener Hartkäse", Type.getType("Tellergericht"), price280);
		meals43.add(meal280);

		List<Ingredient> ingredients281 = new ArrayList<>();
		ingredients281.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients281.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients281.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients281.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price281 = {1.7, 2.8, 3.2};
		Meal meal281 = new Meal(ingredients281, "Allgäuer Käsefrikadelle, Créme-fraîche-Sauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price281);
		meals43.add(meal281);

		List<Ingredient> ingredients282 = new ArrayList<>();
		ingredients282.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients282.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients282.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price282 = {1.7, 2.8, 3.2};
		Meal meal282 = new Meal(ingredients282, "Back-Frischkäse mit Preiselbeeren", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price282);
		meals43.add(meal282);

		List<Ingredient> ingredients283 = new ArrayList<>();
		ingredients283.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients283.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price283 = {0.45, 0.8, 1.0};
		Meal meal283 = new Meal(ingredients283, "Salzkartoffeln", Type.getType("Wahlmenü (Beilage)"), price283);
		meals43.add(meal283);

		List<Ingredient> ingredients284 = new ArrayList<>();
		ingredients284.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients284.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients284.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients284.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients284.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients284.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price284 = {0.5, 0.85, 1.05};
		Meal meal284 = new Meal(ingredients284, "Eisbergsalat, Dressing Sylter Art", Type.getType("Wahlmenü (Salat)"), price284);
		meals43.add(meal284);

		List<Ingredient> ingredients285 = new ArrayList<>();
		ingredients285.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients285.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients285.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price285 = {0.8, 0.95, 1.1};
		Meal meal285 = new Meal(ingredients285, "Stracciatella-Joghurt", Type.getType("Wahlmenü (Dessert)"), price285);
		meals43.add(meal285);

		map6.put(Day.getDay("Dienstag"), meals43);


		List<Meal> meals44 = new ArrayList<>();
		List<Ingredient> ingredients286 = new ArrayList<>();
		ingredients286.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients286.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients286.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients286.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients286.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		double[] price286 = {1.35, 2.8, 3.8};
		Meal meal286 = new Meal(ingredients286, "Barbecueeintopf", Type.getType("Eintopf"), price286);
		meals44.add(meal286);

		List<Ingredient> ingredients287 = new ArrayList<>();
		ingredients287.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients287.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients287.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients287.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients287.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price287 = {1.7, 3.35, 4.15};
		Meal meal287 = new Meal(ingredients287, "Eier in Senfsauce, Salzkartoffeln", Type.getType("Tellergericht"), price287);
		meals44.add(meal287);

		List<Ingredient> ingredients288 = new ArrayList<>();
		ingredients288.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients288.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients288.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients288.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients288.add(Ingredient.getIngredientFromName("Geschmacksverstärker"));
		ingredients288.add(Ingredient.getIngredientFromName("Nitritpökelsalz"));
		ingredients288.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients288.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price288 = {1.7, 2.8, 3.2};
		Meal meal288 = new Meal(ingredients288, "Kasselerbraten, Rahmsauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price288);
		meals44.add(meal288);

		List<Ingredient> ingredients289 = new ArrayList<>();
		ingredients289.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients289.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients289.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price289 = {1.6, 2.7, 3.1};
		Meal meal289 = new Meal(ingredients289, "Pizza-Polenta, Tomatensugo", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price289);
		meals44.add(meal289);

		List<Ingredient> ingredients290 = new ArrayList<>();
		ingredients290.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price290 = {0.45, 0.8, 1.0};
		Meal meal290 = new Meal(ingredients290, "Kroketten", Type.getType("Wahlmenü (Beilage)"), price290);
		meals44.add(meal290);

		List<Ingredient> ingredients291 = new ArrayList<>();
		ingredients291.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients291.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price291 = {0.5, 0.9, 1.1};
		Meal meal291 = new Meal(ingredients291, "Champignongemüse", Type.getType("Wahlmenü (Gemüse)"), price291);
		meals44.add(meal291);

		List<Ingredient> ingredients292 = new ArrayList<>();
		ingredients292.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients292.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients292.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price292 = {0.8, 0.95, 1.1};
		Meal meal292 = new Meal(ingredients292, "Karamellpudding", Type.getType("Wahlmenü (Dessert)"), price292);
		meals44.add(meal292);

		map6.put(Day.getDay("Mittwoch"), meals44);


		List<Meal> meals45 = new ArrayList<>();
		List<Ingredient> ingredients293 = new ArrayList<>();
		ingredients293.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients293.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients293.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price293 = {1.35, 2.8, 3.8};
		Meal meal293 = new Meal(ingredients293, "Gemüseeintopf mit saurer Sahne", Type.getType("Eintopf"), price293);
		meals45.add(meal293);

		List<Ingredient> ingredients294 = new ArrayList<>();
		ingredients294.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients294.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients294.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients294.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients294.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients294.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		ingredients294.add(Ingredient.getIngredientFromName("Sesamsamen und Sesamsamenerzeugnisse"));
		double[] price294 = {1.7, 3.35, 4.15};
		Meal meal294 = new Meal(ingredients294, "Gewürzburger, Krautsalat, American Wedges", Type.getType("Tellergericht"), price294);
		meals45.add(meal294);

		List<Ingredient> ingredients295 = new ArrayList<>();
		ingredients295.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients295.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients295.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients295.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		double[] price295 = {1.7, 2.8, 3.2};
		Meal meal295 = new Meal(ingredients295, "Hähnchenkeule Marengo", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price295);
		meals45.add(meal295);

		List<Ingredient> ingredients296 = new ArrayList<>();
		ingredients296.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients296.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients296.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients296.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price296 = {1.6, 2.7, 3.1};
		Meal meal296 = new Meal(ingredients296, "Möhren-Zucchini-Puffer, Kräuterdip", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price296);
		meals45.add(meal296);

		List<Ingredient> ingredients297 = new ArrayList<>();
		ingredients297.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients297.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price297 = {0.45, 0.8, 1.0};
		Meal meal297 = new Meal(ingredients297, "Petersilienkartoffeln", Type.getType("Wahlmenü (Beilage)"), price297);
		meals45.add(meal297);

		List<Ingredient> ingredients298 = new ArrayList<>();
		ingredients298.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients298.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price298 = {0.5, 0.9, 1.1};
		Meal meal298 = new Meal(ingredients298, "Blumenkohlgemüse", Type.getType("Wahlmenü (Gemüse)"), price298);
		meals45.add(meal298);

		List<Ingredient> ingredients299 = new ArrayList<>();
		ingredients299.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients299.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price299 = {0.8, 0.95, 1.1};
		Meal meal299 = new Meal(ingredients299, "Aprikosenquark", Type.getType("Wahlmenü (Dessert)"), price299);
		meals45.add(meal299);

		map6.put(Day.getDay("Donnerstag"), meals45);


		List<Meal> meals46 = new ArrayList<>();
		map6.put(Day.getDay("Freitag"), meals46);


		List<Meal> meals47 = new ArrayList<>();
		map6.put(Day.getDay("Samstag"), meals47);


		List<Meal> meals48 = new ArrayList<>();
		map6.put(Day.getDay("Sonntag"), meals48);

		Map<Day, List<Meal>> map15 = mealsDummy.get(Week.getWeek("Naechste")).get(Mensa.getMensa("Mensa HMTMH"));

		List<Meal> meals105 = new ArrayList<>();
		List<Ingredient> ingredients698 = new ArrayList<>();
		ingredients698.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients698.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients698.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		double[] price698 = {1.35, 2.8, 3.8};
		Meal meal698 = new Meal(ingredients698, "Feuriger Bohneneintopf", Type.getType("Eintopf"), price698);
		meals105.add(meal698);

		List<Ingredient> ingredients699 = new ArrayList<>();
		ingredients699.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients699.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients699.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price699 = {1.7, 3.35, 4.15};
		Meal meal699 = new Meal(ingredients699, "Nürnberger Rostbratwürstchen, Kartoffelpüree, Wonnekraut", Type.getType("Tellergericht"), price699);
		meals105.add(meal699);

		List<Ingredient> ingredients700 = new ArrayList<>();
		ingredients700.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients700.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients700.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients700.add(Ingredient.getIngredientFromName("Konservierungsstoff"));
		ingredients700.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients700.add(Ingredient.getIngredientFromName("Phosphat"));
		ingredients700.add(Ingredient.getIngredientFromName("Nitritpökelsalz"));
		ingredients700.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients700.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		ingredients700.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price700 = {1.7, 2.8, 3.2};
		Meal meal700 = new Meal(ingredients700, "Rinderroulade mit Specksauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price700);
		meals105.add(meal700);

		List<Ingredient> ingredients701 = new ArrayList<>();
		ingredients701.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients701.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients701.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients701.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price701 = {1.7, 2.8, 3.2};
		Meal meal701 = new Meal(ingredients701, "Vegetarisches Schnitzel, Karotten-Sahne-Sauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price701);
		meals105.add(meal701);

		List<Ingredient> ingredients702 = new ArrayList<>();
		ingredients702.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients702.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients702.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price702 = {0.45, 0.8, 1.0};
		Meal meal702 = new Meal(ingredients702, "Bechamelkartoffeln", Type.getType("Wahlmenü (Beilage)"), price702);
		meals105.add(meal702);

		List<Ingredient> ingredients703 = new ArrayList<>();
		ingredients703.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price703 = {0.5, 0.9, 1.1};
		Meal meal703 = new Meal(ingredients703, "Bohnengemüse", Type.getType("Wahlmenü (Gemüse)"), price703);
		meals105.add(meal703);

		List<Ingredient> ingredients704 = new ArrayList<>();
		ingredients704.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients704.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price704 = {0.8, 0.95, 1.1};
		Meal meal704 = new Meal(ingredients704, "Obstsalat", Type.getType("Wahlmenü (Dessert)"), price704);
		meals105.add(meal704);

		map15.put(Day.getDay("Montag"), meals105);


		List<Meal> meals106 = new ArrayList<>();
		List<Ingredient> ingredients705 = new ArrayList<>();
		ingredients705.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients705.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients705.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		double[] price705 = {1.35, 2.8, 3.8};
		Meal meal705 = new Meal(ingredients705, "Nudelsuppe mit Rindfleisch, mit hausgemachter Pasta", Type.getType("Eintopf"), price705);
		meals106.add(meal705);

		List<Ingredient> ingredients706 = new ArrayList<>();
		ingredients706.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients706.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients706.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		double[] price706 = {1.7, 3.35, 4.15};
		Meal meal706 = new Meal(ingredients706, "Kartoffelpuffer, hausgemachtes Apfelmus", Type.getType("Tellergericht"), price706);
		meals106.add(meal706);

		List<Ingredient> ingredients707 = new ArrayList<>();
		ingredients707.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients707.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients707.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients707.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients707.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients707.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients707.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price707 = {1.7, 2.8, 3.2};
		Meal meal707 = new Meal(ingredients707, "Frikadelle, Rahmsauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price707);
		meals106.add(meal707);

		List<Ingredient> ingredients708 = new ArrayList<>();
		ingredients708.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients708.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients708.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price708 = {1.6, 2.7, 3.1};
		Meal meal708 = new Meal(ingredients708, "Gemüsegratin mit Kräutern, Bechamelsauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price708);
		meals106.add(meal708);

		List<Ingredient> ingredients709 = new ArrayList<>();
		ingredients709.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients709.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price709 = {0.45, 0.8, 1.0};
		Meal meal709 = new Meal(ingredients709, "Salzkartoffeln", Type.getType("Wahlmenü (Beilage)"), price709);
		meals106.add(meal709);

		List<Ingredient> ingredients710 = new ArrayList<>();
		ingredients710.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients710.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients710.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price710 = {0.5, 0.85, 1.05};
		Meal meal710 = new Meal(ingredients710, "Lollo-Bionda-Salat, Honig-Senf-Dressing", Type.getType("Wahlmenü (Salat)"), price710);
		meals106.add(meal710);

		List<Ingredient> ingredients711 = new ArrayList<>();
		ingredients711.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients711.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients711.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price711 = {0.8, 0.95, 1.1};
		Meal meal711 = new Meal(ingredients711, "Milchreis, Zimt und Zucker", Type.getType("Wahlmenü (Dessert)"), price711);
		meals106.add(meal711);

		map15.put(Day.getDay("Dienstag"), meals106);


		List<Meal> meals107 = new ArrayList<>();
		List<Ingredient> ingredients712 = new ArrayList<>();
		ingredients712.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients712.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients712.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients712.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		double[] price712 = {1.35, 2.8, 3.8};
		Meal meal712 = new Meal(ingredients712, "Chinesische Gemüsesuppe", Type.getType("Eintopf"), price712);
		meals107.add(meal712);

		List<Ingredient> ingredients713 = new ArrayList<>();
		ingredients713.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients713.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients713.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients713.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients713.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		double[] price713 = {1.7, 3.35, 4.15};
		Meal meal713 = new Meal(ingredients713, "Hackfleischpfanne mit Chinakohl, Reis", Type.getType("Tellergericht"), price713);
		meals107.add(meal713);

		List<Ingredient> ingredients714 = new ArrayList<>();
		ingredients714.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients714.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price714 = {1.7, 2.8, 3.2};
		Meal meal714 = new Meal(ingredients714, "Halbes Grillhähnchen", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price714);
		meals107.add(meal714);

		List<Ingredient> ingredients715 = new ArrayList<>();
		ingredients715.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients715.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients715.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price715 = {1.6, 2.7, 3.1};
		Meal meal715 = new Meal(ingredients715, "Champignon-Risotto-Bratling, Kressesauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price715);
		meals107.add(meal715);

		List<Ingredient> ingredients716 = new ArrayList<>();
		ingredients716.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients716.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price716 = {0.45, 0.8, 1.0};
		Meal meal716 = new Meal(ingredients716, "Risi-Pisi", Type.getType("Wahlmenü (Beilage)"), price716);
		meals107.add(meal716);

		List<Ingredient> ingredients717 = new ArrayList<>();
		ingredients717.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients717.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price717 = {0.5, 0.9, 1.1};
		Meal meal717 = new Meal(ingredients717, "Pariser Karotten", Type.getType("Wahlmenü (Gemüse)"), price717);
		meals107.add(meal717);

		List<Ingredient> ingredients718 = new ArrayList<>();
		ingredients718.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients718.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients718.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price718 = {0.8, 0.95, 1.1};
		Meal meal718 = new Meal(ingredients718, "Erdbeerjoghurt", Type.getType("Wahlmenü (Dessert)"), price718);
		meals107.add(meal718);

		map15.put(Day.getDay("Mittwoch"), meals107);


		List<Meal> meals108 = new ArrayList<>();
		List<Ingredient> ingredients719 = new ArrayList<>();
		ingredients719.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients719.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients719.add(Ingredient.getIngredientFromName("Farbstoff"));
		ingredients719.add(Ingredient.getIngredientFromName("Konservierungsstoff"));
		ingredients719.add(Ingredient.getIngredientFromName("Phosphat"));
		ingredients719.add(Ingredient.getIngredientFromName("Nitritpökelsalz"));
		ingredients719.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price719 = {1.35, 2.8, 3.8};
		Meal meal719 = new Meal(ingredients719, "Kartoffel-Bärlaucheintopf mit Wienerle", Type.getType("Eintopf"), price719);
		meals108.add(meal719);

		List<Ingredient> ingredients720 = new ArrayList<>();
		ingredients720.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients720.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients720.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients720.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price720 = {1.7, 3.35, 4.15};
		Meal meal720 = new Meal(ingredients720, "Hausgemachte Pasta, Spargelragout in Rahm", Type.getType("Tellergericht"), price720);
		meals108.add(meal720);

		List<Ingredient> ingredients721 = new ArrayList<>();
		ingredients721.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients721.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients721.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients721.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients721.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price721 = {1.7, 2.8, 3.2};
		Meal meal721 = new Meal(ingredients721, "Rinder-Geschnetzeltes Stroganoff", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price721);
		meals108.add(meal721);

		List<Ingredient> ingredients722 = new ArrayList<>();
		ingredients722.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients722.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients722.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients722.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		ingredients722.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price722 = {1.7, 2.8, 3.2};
		Meal meal722 = new Meal(ingredients722, "Tofugemüse mit Rucola", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price722);
		meals108.add(meal722);

		List<Ingredient> ingredients723 = new ArrayList<>();
		ingredients723.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients723.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price723 = {0.45, 0.8, 1.0};
		Meal meal723 = new Meal(ingredients723, "Paprikareis", Type.getType("Wahlmenü (Beilage)"), price723);
		meals108.add(meal723);

		List<Ingredient> ingredients724 = new ArrayList<>();
		ingredients724.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients724.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price724 = {0.5, 0.9, 1.1};
		Meal meal724 = new Meal(ingredients724, "Auberginengemüse", Type.getType("Wahlmenü (Gemüse)"), price724);
		meals108.add(meal724);

		List<Ingredient> ingredients725 = new ArrayList<>();
		ingredients725.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients725.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients725.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price725 = {0.8, 0.95, 1.1};
		Meal meal725 = new Meal(ingredients725, "Schlemmerquark mit Heidelbeersauce", Type.getType("Wahlmenü (Dessert)"), price725);
		meals108.add(meal725);

		map15.put(Day.getDay("Donnerstag"), meals108);


		List<Meal> meals109 = new ArrayList<>();
		List<Ingredient> ingredients726 = new ArrayList<>();
		ingredients726.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients726.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients726.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price726 = {1.35, 2.8, 3.8};
		Meal meal726 = new Meal(ingredients726, "Bunte Maissuppe", Type.getType("Eintopf"), price726);
		meals109.add(meal726);

		List<Ingredient> ingredients727 = new ArrayList<>();
		ingredients727.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients727.add(Ingredient.getIngredientFromName("Unbekannt"));
		ingredients727.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients727.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients727.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price727 = {1.7, 3.35, 4.15};
		Meal meal727 = new Meal(ingredients727, "Pizza Salami", Type.getType("Tellergericht"), price727);
		meals109.add(meal727);

		List<Ingredient> ingredients728 = new ArrayList<>();
		ingredients728.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients728.add(Ingredient.getIngredientFromName("Fisch und Fischerzeugnisse"));
		ingredients728.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients728.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price728 = {1.7, 2.8, 3.2};
		Meal meal728 = new Meal(ingredients728, "Seelachsfilet, Senfsauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price728);
		meals109.add(meal728);

		List<Ingredient> ingredients729 = new ArrayList<>();
		ingredients729.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients729.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients729.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients729.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients729.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients729.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price729 = {1.7, 2.8, 3.2};
		Meal meal729 = new Meal(ingredients729, "Gefüllte Käse-Paprika, Tomatensauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price729);
		meals109.add(meal729);

		List<Ingredient> ingredients730 = new ArrayList<>();
		ingredients730.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients730.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients730.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients730.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price730 = {0.45, 0.8, 1.0};
		Meal meal730 = new Meal(ingredients730, "Kartoffelgratin", Type.getType("Wahlmenü (Beilage)"), price730);
		meals109.add(meal730);

		List<Ingredient> ingredients731 = new ArrayList<>();
		ingredients731.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price731 = {0.5, 0.85, 1.05};
		Meal meal731 = new Meal(ingredients731, "Mischsalat, Schnittlauch-Vinaigrette", Type.getType("Wahlmenü (Salat)"), price731);
		meals109.add(meal731);

		List<Ingredient> ingredients732 = new ArrayList<>();
		ingredients732.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients732.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients732.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price732 = {0.8, 0.95, 1.1};
		Meal meal732 = new Meal(ingredients732, "Orangenjoghurt mit Flakes", Type.getType("Wahlmenü (Dessert)"), price732);
		meals109.add(meal732);

		map15.put(Day.getDay("Freitag"), meals109);


		List<Meal> meals110 = new ArrayList<>();
		map15.put(Day.getDay("Samstag"), meals110);


		List<Meal> meals111 = new ArrayList<>();
		map15.put(Day.getDay("Sonntag"), meals111);


		
	}

	private static void fillGPDummy(Map<Week, Map<Mensa, Map<Day, List<Meal>>>> mealsDummy) {
		Map<Day, List<Meal>> map5 = mealsDummy.get(Week.getWeek("Aktuelle")).get(Mensa.getMensa("Mensa Große Pause"));

		List<Meal> meals35 = new ArrayList<>();
		List<Ingredient> ingredients227 = new ArrayList<>();
		ingredients227.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients227.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients227.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price227 = {1.35, 2.8, 3.95};
		Meal meal227 = new Meal(ingredients227, "Gulascheintopf mit Möhren und Kartoffeln", Type.getType("Eintopf"), price227);
		meals35.add(meal227);

		List<Ingredient> ingredients228 = new ArrayList<>();
		ingredients228.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients228.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients228.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price228 = {1.85, 3.5, 4.45};
		Meal meal228 = new Meal(ingredients228, "Riesenrösti mit Rahmchampignons", Type.getType("Tellergericht"), price228);
		meals35.add(meal228);

		List<Ingredient> ingredients229 = new ArrayList<>();
		ingredients229.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients229.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients229.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients229.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price229 = {1.8, 2.9, 3.5};
		Meal meal229 = new Meal(ingredients229, "Putensteak, Sauce Hollandaise", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price229);
		meals35.add(meal229);

		List<Ingredient> ingredients230 = new ArrayList<>();
		ingredients230.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients230.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients230.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients230.add(Ingredient.getIngredientFromName("Sesamsamen und Sesamsamenerzeugnisse"));
		double[] price230 = {1.7, 2.8, 3.4};
		Meal meal230 = new Meal(ingredients230, "Linsen-Mangold-Curry", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price230);
		meals35.add(meal230);

		List<Ingredient> ingredients231 = new ArrayList<>();
		ingredients231.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients231.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients231.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients231.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients231.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients231.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price231 = {3.5, 3.5, 3.5};
		Meal meal231 = new Meal(ingredients231, "Ratatouille-Tarte", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price231);
		meals35.add(meal231);

		List<Ingredient> ingredients232 = new ArrayList<>();
		ingredients232.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients232.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients232.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients232.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price232 = {0.6, 0.9, 1.1};
		Meal meal232 = new Meal(ingredients232, "Gemüse-Couscous", Type.getType("Wahlmenü (Beilage)"), price232);
		meals35.add(meal232);

		List<Ingredient> ingredients233 = new ArrayList<>();
		ingredients233.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients233.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price233 = {0.6, 0.9, 1.1};
		Meal meal233 = new Meal(ingredients233, "Reis", Type.getType("Wahlmenü (Beilage)"), price233);
		meals35.add(meal233);

		List<Ingredient> ingredients234 = new ArrayList<>();
		ingredients234.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients234.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price234 = {0.65, 0.95, 1.15};
		Meal meal234 = new Meal(ingredients234, "Brokkoli", Type.getType("Wahlmenü (Gemüse)"), price234);
		meals35.add(meal234);

		List<Ingredient> ingredients235 = new ArrayList<>();
		ingredients235.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients235.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price235 = {0.65, 0.95, 1.15};
		Meal meal235 = new Meal(ingredients235, "Kohlrabi", Type.getType("Wahlmenü (Gemüse)"), price235);
		meals35.add(meal235);

		List<Ingredient> ingredients236 = new ArrayList<>();
		ingredients236.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients236.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price236 = {0.6, 0.9, 1.1};
		Meal meal236 = new Meal(ingredients236, "Tomatensalat", Type.getType("Wahlmenü (Salat)"), price236);
		meals35.add(meal236);

		List<Ingredient> ingredients237 = new ArrayList<>();
		ingredients237.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients237.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients237.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price237 = {0.4, 0.6, 0.8};
		Meal meal237 = new Meal(ingredients237, "Blumenkohlsuppe", Type.getType("Wahlmenü (Suppe)"), price237);
		meals35.add(meal237);

		List<Ingredient> ingredients238 = new ArrayList<>();
		ingredients238.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients238.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients238.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price238 = {0.8, 0.95, 1.1};
		Meal meal238 = new Meal(ingredients238, "Beerenquark", Type.getType("Wahlmenü (Dessert)"), price238);
		meals35.add(meal238);

		map5.put(Day.getDay("Montag"), meals35);


		List<Meal> meals36 = new ArrayList<>();
		List<Ingredient> ingredients239 = new ArrayList<>();
		ingredients239.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients239.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients239.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients239.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price239 = {1.35, 2.8, 3.95};
		Meal meal239 = new Meal(ingredients239, "Spargeleintopf", Type.getType("Eintopf"), price239);
		meals36.add(meal239);

		List<Ingredient> ingredients240 = new ArrayList<>();
		ingredients240.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients240.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients240.add(Ingredient.getIngredientFromName("Farbstoff"));
		ingredients240.add(Ingredient.getIngredientFromName("Konservierungsstoff"));
		ingredients240.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients240.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price240 = {1.85, 3.5, 4.45};
		Meal meal240 = new Meal(ingredients240, "Hausgemachte Pasta, Hähnchen-Paprika-Ragout, geriebener Hartkäse", Type.getType("Tellergericht"), price240);
		meals36.add(meal240);

		List<Ingredient> ingredients241 = new ArrayList<>();
		ingredients241.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients241.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients241.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients241.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price241 = {1.8, 2.9, 3.5};
		Meal meal241 = new Meal(ingredients241, "Allgäuer Käsefrikadelle, Créme-fraîche-Sauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price241);
		meals36.add(meal241);

		List<Ingredient> ingredients242 = new ArrayList<>();
		ingredients242.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients242.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients242.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price242 = {1.8, 2.9, 3.5};
		Meal meal242 = new Meal(ingredients242, "Back-Frischkäse mit Preiselbeeren", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price242);
		meals36.add(meal242);

		List<Ingredient> ingredients243 = new ArrayList<>();
		ingredients243.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients243.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients243.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients243.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		double[] price243 = {0.6, 0.9, 1.1};
		Meal meal243 = new Meal(ingredients243, "Hausgemachte Kräuterspätzle", Type.getType("Wahlmenü (Beilage)"), price243);
		meals36.add(meal243);

		List<Ingredient> ingredients244 = new ArrayList<>();
		ingredients244.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients244.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price244 = {0.6, 0.9, 1.1};
		Meal meal244 = new Meal(ingredients244, "Salzkartoffeln", Type.getType("Wahlmenü (Beilage)"), price244);
		meals36.add(meal244);

		List<Ingredient> ingredients245 = new ArrayList<>();
		ingredients245.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients245.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price245 = {0.65, 0.95, 1.15};
		Meal meal245 = new Meal(ingredients245, "Karottengemüse", Type.getType("Wahlmenü (Gemüse)"), price245);
		meals36.add(meal245);

		List<Ingredient> ingredients246 = new ArrayList<>();
		ingredients246.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients246.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price246 = {0.65, 0.95, 1.15};
		Meal meal246 = new Meal(ingredients246, "Spitzkohlgemüse", Type.getType("Wahlmenü (Gemüse)"), price246);
		meals36.add(meal246);

		List<Ingredient> ingredients247 = new ArrayList<>();
		ingredients247.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients247.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients247.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients247.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients247.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients247.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price247 = {0.6, 0.9, 1.1};
		Meal meal247 = new Meal(ingredients247, "Eisbergsalat, Dressing Sylter Art", Type.getType("Wahlmenü (Salat)"), price247);
		meals36.add(meal247);

		List<Ingredient> ingredients248 = new ArrayList<>();
		ingredients248.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients248.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients248.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients248.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price248 = {0.4, 0.6, 0.8};
		Meal meal248 = new Meal(ingredients248, "Spinatcremesuppe", Type.getType("Wahlmenü (Suppe)"), price248);
		meals36.add(meal248);

		List<Ingredient> ingredients249 = new ArrayList<>();
		ingredients249.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients249.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients249.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price249 = {0.8, 0.95, 1.1};
		Meal meal249 = new Meal(ingredients249, "Stracciatella-Joghurt", Type.getType("Wahlmenü (Dessert)"), price249);
		meals36.add(meal249);

		map5.put(Day.getDay("Dienstag"), meals36);


		List<Meal> meals37 = new ArrayList<>();
		List<Ingredient> ingredients250 = new ArrayList<>();
		ingredients250.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients250.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients250.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients250.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients250.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		double[] price250 = {1.35, 2.8, 3.95};
		Meal meal250 = new Meal(ingredients250, "Barbecueeintopf", Type.getType("Eintopf"), price250);
		meals37.add(meal250);

		List<Ingredient> ingredients251 = new ArrayList<>();
		ingredients251.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients251.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients251.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients251.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients251.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price251 = {1.85, 3.5, 4.45};
		Meal meal251 = new Meal(ingredients251, "Eier in Senfsauce, Salzkartoffeln", Type.getType("Tellergericht"), price251);
		meals37.add(meal251);

		List<Ingredient> ingredients252 = new ArrayList<>();
		ingredients252.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients252.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients252.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients252.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients252.add(Ingredient.getIngredientFromName("Geschmacksverstärker"));
		ingredients252.add(Ingredient.getIngredientFromName("Nitritpökelsalz"));
		ingredients252.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients252.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price252 = {1.8, 2.9, 3.5};
		Meal meal252 = new Meal(ingredients252, "Kasselerbraten, Rahmsauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price252);
		meals37.add(meal252);

		List<Ingredient> ingredients253 = new ArrayList<>();
		ingredients253.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients253.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients253.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price253 = {1.7, 2.8, 3.4};
		Meal meal253 = new Meal(ingredients253, "Pizza-Polenta, Tomatensugo", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price253);
		meals37.add(meal253);

		List<Ingredient> ingredients254 = new ArrayList<>();
		ingredients254.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients254.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients254.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price254 = {0.6, 0.9, 1.1};
		Meal meal254 = new Meal(ingredients254, "Kartoffelpüree", Type.getType("Wahlmenü (Beilage)"), price254);
		meals37.add(meal254);

		List<Ingredient> ingredients255 = new ArrayList<>();
		ingredients255.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price255 = {0.6, 0.9, 1.1};
		Meal meal255 = new Meal(ingredients255, "Kroketten", Type.getType("Wahlmenü (Beilage)"), price255);
		meals37.add(meal255);

		List<Ingredient> ingredients256 = new ArrayList<>();
		ingredients256.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients256.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price256 = {0.65, 0.95, 1.15};
		Meal meal256 = new Meal(ingredients256, "Champignongemüse", Type.getType("Wahlmenü (Gemüse)"), price256);
		meals37.add(meal256);

		List<Ingredient> ingredients257 = new ArrayList<>();
		ingredients257.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients257.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price257 = {0.65, 0.95, 1.15};
		Meal meal257 = new Meal(ingredients257, "Romanesco", Type.getType("Wahlmenü (Gemüse)"), price257);
		meals37.add(meal257);

		List<Ingredient> ingredients258 = new ArrayList<>();
		ingredients258.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients258.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients258.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price258 = {0.6, 0.9, 1.1};
		Meal meal258 = new Meal(ingredients258, "Lollo-Rosso-Salat, hausgemachtes Balsamicodressing", Type.getType("Wahlmenü (Salat)"), price258);
		meals37.add(meal258);

		List<Ingredient> ingredients259 = new ArrayList<>();
		ingredients259.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients259.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price259 = {0.4, 0.6, 0.8};
		Meal meal259 = new Meal(ingredients259, "Currysuppe mit Kokos", Type.getType("Wahlmenü (Suppe)"), price259);
		meals37.add(meal259);

		List<Ingredient> ingredients260 = new ArrayList<>();
		ingredients260.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients260.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients260.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price260 = {0.8, 0.95, 1.1};
		Meal meal260 = new Meal(ingredients260, "Karamellpudding", Type.getType("Wahlmenü (Dessert)"), price260);
		meals37.add(meal260);

		map5.put(Day.getDay("Mittwoch"), meals37);


		List<Meal> meals38 = new ArrayList<>();
		List<Ingredient> ingredients261 = new ArrayList<>();
		ingredients261.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients261.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients261.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price261 = {1.35, 2.8, 3.95};
		Meal meal261 = new Meal(ingredients261, "Gemüseeintopf mit saurer Sahne", Type.getType("Eintopf"), price261);
		meals38.add(meal261);

		List<Ingredient> ingredients262 = new ArrayList<>();
		ingredients262.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients262.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients262.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients262.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients262.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients262.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		ingredients262.add(Ingredient.getIngredientFromName("Sesamsamen und Sesamsamenerzeugnisse"));
		double[] price262 = {1.85, 3.5, 4.45};
		Meal meal262 = new Meal(ingredients262, "Gewürzburger, Krautsalat, American Wedges", Type.getType("Tellergericht"), price262);
		meals38.add(meal262);

		List<Ingredient> ingredients263 = new ArrayList<>();
		ingredients263.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients263.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients263.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients263.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		double[] price263 = {1.8, 2.9, 3.5};
		Meal meal263 = new Meal(ingredients263, "Hähnchenkeule Marengo", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price263);
		meals38.add(meal263);

		List<Ingredient> ingredients264 = new ArrayList<>();
		ingredients264.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients264.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients264.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients264.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price264 = {1.7, 2.8, 3.4};
		Meal meal264 = new Meal(ingredients264, "Möhren-Zucchini-Puffer, Kräuterdip", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price264);
		meals38.add(meal264);

		List<Ingredient> ingredients265 = new ArrayList<>();
		ingredients265.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients265.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		double[] price265 = {0.6, 0.9, 1.1};
		Meal meal265 = new Meal(ingredients265, "Hausgemachte Currypasta", Type.getType("Wahlmenü (Beilage)"), price265);
		meals38.add(meal265);

		List<Ingredient> ingredients266 = new ArrayList<>();
		ingredients266.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients266.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price266 = {0.6, 0.9, 1.1};
		Meal meal266 = new Meal(ingredients266, "Petersilienkartoffeln", Type.getType("Wahlmenü (Beilage)"), price266);
		meals38.add(meal266);

		List<Ingredient> ingredients267 = new ArrayList<>();
		ingredients267.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients267.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price267 = {0.65, 0.95, 1.15};
		Meal meal267 = new Meal(ingredients267, "Blumenkohlgemüse", Type.getType("Wahlmenü (Gemüse)"), price267);
		meals38.add(meal267);

		List<Ingredient> ingredients268 = new ArrayList<>();
		ingredients268.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients268.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price268 = {0.65, 0.95, 1.15};
		Meal meal268 = new Meal(ingredients268, "Maisgemüse", Type.getType("Wahlmenü (Gemüse)"), price268);
		meals38.add(meal268);

		List<Ingredient> ingredients269 = new ArrayList<>();
		ingredients269.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients269.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients269.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price269 = {0.6, 0.9, 1.1};
		Meal meal269 = new Meal(ingredients269, "Mischsalat, Curry-Dressing", Type.getType("Wahlmenü (Salat)"), price269);
		meals38.add(meal269);

		List<Ingredient> ingredients270 = new ArrayList<>();
		ingredients270.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients270.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price270 = {0.4, 0.6, 0.8};
		Meal meal270 = new Meal(ingredients270, "Spargelcremesuppe", Type.getType("Wahlmenü (Suppe)"), price270);
		meals38.add(meal270);

		List<Ingredient> ingredients271 = new ArrayList<>();
		ingredients271.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients271.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price271 = {0.8, 0.95, 1.1};
		Meal meal271 = new Meal(ingredients271, "Aprikosenquark", Type.getType("Wahlmenü (Dessert)"), price271);
		meals38.add(meal271);

		map5.put(Day.getDay("Donnerstag"), meals38);


		List<Meal> meals39 = new ArrayList<>();
		map5.put(Day.getDay("Freitag"), meals39);


		List<Meal> meals40 = new ArrayList<>();
		map5.put(Day.getDay("Samstag"), meals40);


		List<Meal> meals41 = new ArrayList<>();
		map5.put(Day.getDay("Sonntag"), meals41);

		Map<Day, List<Meal>> map14 = mealsDummy.get(Week.getWeek("Naechste")).get(Mensa.getMensa("Mensa Große Pause"));

		List<Meal> meals98 = new ArrayList<>();
		List<Ingredient> ingredients643 = new ArrayList<>();
		ingredients643.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients643.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients643.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		double[] price643 = {1.35, 2.8, 3.95};
		Meal meal643 = new Meal(ingredients643, "Feuriger Bohneneintopf", Type.getType("Eintopf"), price643);
		meals98.add(meal643);

		List<Ingredient> ingredients644 = new ArrayList<>();
		ingredients644.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients644.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients644.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price644 = {1.85, 3.5, 4.45};
		Meal meal644 = new Meal(ingredients644, "Nürnberger Rostbratwürstchen, Kartoffelpüree, Wonnekraut", Type.getType("Tellergericht"), price644);
		meals98.add(meal644);

		List<Ingredient> ingredients645 = new ArrayList<>();
		ingredients645.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients645.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients645.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients645.add(Ingredient.getIngredientFromName("Konservierungsstoff"));
		ingredients645.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients645.add(Ingredient.getIngredientFromName("Phosphat"));
		ingredients645.add(Ingredient.getIngredientFromName("Nitritpökelsalz"));
		ingredients645.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients645.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		ingredients645.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price645 = {1.8, 2.9, 3.5};
		Meal meal645 = new Meal(ingredients645, "Rinderroulade mit Specksauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price645);
		meals98.add(meal645);

		List<Ingredient> ingredients646 = new ArrayList<>();
		ingredients646.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients646.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients646.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients646.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price646 = {1.8, 2.9, 3.5};
		Meal meal646 = new Meal(ingredients646, "Vegetarisches Schnitzel, Karotten-Sahne-Sauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price646);
		meals98.add(meal646);

		List<Ingredient> ingredients647 = new ArrayList<>();
		ingredients647.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients647.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients647.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price647 = {0.6, 0.9, 1.1};
		Meal meal647 = new Meal(ingredients647, "Bechamelkartoffeln", Type.getType("Wahlmenü (Beilage)"), price647);
		meals98.add(meal647);

		List<Ingredient> ingredients648 = new ArrayList<>();
		ingredients648.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients648.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients648.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		double[] price648 = {0.6, 0.9, 1.1};
		Meal meal648 = new Meal(ingredients648, "Hausgemachte Pasta", Type.getType("Wahlmenü (Beilage)"), price648);
		meals98.add(meal648);

		List<Ingredient> ingredients649 = new ArrayList<>();
		ingredients649.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price649 = {0.65, 0.95, 1.15};
		Meal meal649 = new Meal(ingredients649, "Bohnengemüse", Type.getType("Wahlmenü (Gemüse)"), price649);
		meals98.add(meal649);

		List<Ingredient> ingredients650 = new ArrayList<>();
		ingredients650.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients650.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients650.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price650 = {0.65, 0.95, 1.15};
		Meal meal650 = new Meal(ingredients650, "Rahmwirsing", Type.getType("Wahlmenü (Gemüse)"), price650);
		meals98.add(meal650);

		List<Ingredient> ingredients651 = new ArrayList<>();
		ingredients651.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price651 = {0.6, 0.9, 1.1};
		Meal meal651 = new Meal(ingredients651, "Gurkensalat", Type.getType("Wahlmenü (Salat)"), price651);
		meals98.add(meal651);

		List<Ingredient> ingredients652 = new ArrayList<>();
		ingredients652.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients652.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients652.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price652 = {0.4, 0.6, 0.8};
		Meal meal652 = new Meal(ingredients652, "Tomatensuppe", Type.getType("Wahlmenü (Suppe)"), price652);
		meals98.add(meal652);

		List<Ingredient> ingredients653 = new ArrayList<>();
		ingredients653.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients653.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price653 = {0.8, 0.95, 1.1};
		Meal meal653 = new Meal(ingredients653, "Obstsalat", Type.getType("Wahlmenü (Dessert)"), price653);
		meals98.add(meal653);

		map14.put(Day.getDay("Montag"), meals98);


		List<Meal> meals99 = new ArrayList<>();
		List<Ingredient> ingredients654 = new ArrayList<>();
		ingredients654.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients654.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients654.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		double[] price654 = {1.35, 2.8, 3.95};
		Meal meal654 = new Meal(ingredients654, "Nudelsuppe mit Rindfleisch, mit hausgemachter Pasta", Type.getType("Eintopf"), price654);
		meals99.add(meal654);

		List<Ingredient> ingredients655 = new ArrayList<>();
		ingredients655.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients655.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients655.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		double[] price655 = {1.85, 3.5, 4.45};
		Meal meal655 = new Meal(ingredients655, "Kartoffelpuffer, hausgemachtes Apfelmus", Type.getType("Tellergericht"), price655);
		meals99.add(meal655);

		List<Ingredient> ingredients656 = new ArrayList<>();
		ingredients656.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients656.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients656.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients656.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients656.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients656.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients656.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price656 = {1.8, 2.9, 3.5};
		Meal meal656 = new Meal(ingredients656, "Frikadelle, Rahmsauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price656);
		meals99.add(meal656);

		List<Ingredient> ingredients657 = new ArrayList<>();
		ingredients657.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients657.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients657.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price657 = {1.7, 2.8, 3.4};
		Meal meal657 = new Meal(ingredients657, "Gemüsegratin mit Kräutern, Bechamelsauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price657);
		meals99.add(meal657);

		List<Ingredient> ingredients658 = new ArrayList<>();
		ingredients658.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients658.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients658.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients658.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		double[] price658 = {0.6, 0.9, 1.1};
		Meal meal658 = new Meal(ingredients658, "Hausgemachte Schupfnudeln", Type.getType("Wahlmenü (Beilage)"), price658);
		meals99.add(meal658);

		List<Ingredient> ingredients659 = new ArrayList<>();
		ingredients659.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients659.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price659 = {0.6, 0.9, 1.1};
		Meal meal659 = new Meal(ingredients659, "Salzkartoffeln", Type.getType("Wahlmenü (Beilage)"), price659);
		meals99.add(meal659);

		List<Ingredient> ingredients660 = new ArrayList<>();
		ingredients660.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients660.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price660 = {0.65, 0.95, 1.15};
		Meal meal660 = new Meal(ingredients660, "Erbsengemüse", Type.getType("Wahlmenü (Gemüse)"), price660);
		meals99.add(meal660);

		List<Ingredient> ingredients661 = new ArrayList<>();
		ingredients661.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients661.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price661 = {0.65, 0.95, 1.15};
		Meal meal661 = new Meal(ingredients661, "Maisgemüse", Type.getType("Wahlmenü (Gemüse)"), price661);
		meals99.add(meal661);

		List<Ingredient> ingredients662 = new ArrayList<>();
		ingredients662.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients662.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients662.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price662 = {0.6, 0.9, 1.1};
		Meal meal662 = new Meal(ingredients662, "Lollo-Bionda-Salat, Honig-Senf-Dressing", Type.getType("Wahlmenü (Salat)"), price662);
		meals99.add(meal662);

		List<Ingredient> ingredients663 = new ArrayList<>();
		ingredients663.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients663.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price663 = {0.4, 0.6, 0.8};
		Meal meal663 = new Meal(ingredients663, "Tomaten-Paprikasuppe", Type.getType("Wahlmenü (Suppe)"), price663);
		meals99.add(meal663);

		List<Ingredient> ingredients664 = new ArrayList<>();
		ingredients664.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients664.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients664.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price664 = {0.8, 0.95, 1.1};
		Meal meal664 = new Meal(ingredients664, "Milchreis, Zimt und Zucker", Type.getType("Wahlmenü (Dessert)"), price664);
		meals99.add(meal664);

		map14.put(Day.getDay("Dienstag"), meals99);


		List<Meal> meals100 = new ArrayList<>();
		List<Ingredient> ingredients665 = new ArrayList<>();
		ingredients665.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients665.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients665.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients665.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		double[] price665 = {1.35, 2.8, 3.95};
		Meal meal665 = new Meal(ingredients665, "Chinesische Gemüsesuppe", Type.getType("Eintopf"), price665);
		meals100.add(meal665);

		List<Ingredient> ingredients666 = new ArrayList<>();
		ingredients666.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients666.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients666.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients666.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients666.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		double[] price666 = {1.85, 3.5, 4.45};
		Meal meal666 = new Meal(ingredients666, "Hackfleischpfanne mit Chinakohl, Reis", Type.getType("Tellergericht"), price666);
		meals100.add(meal666);

		List<Ingredient> ingredients667 = new ArrayList<>();
		ingredients667.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients667.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price667 = {1.8, 2.9, 3.5};
		Meal meal667 = new Meal(ingredients667, "Halbes Grillhähnchen", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price667);
		meals100.add(meal667);

		List<Ingredient> ingredients668 = new ArrayList<>();
		ingredients668.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients668.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients668.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price668 = {1.7, 2.8, 3.4};
		Meal meal668 = new Meal(ingredients668, "Champignon-Risotto-Bratling, Kressesauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price668);
		meals100.add(meal668);

		List<Ingredient> ingredients669 = new ArrayList<>();
		ingredients669.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients669.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients669.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients669.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price669 = {0.6, 0.9, 1.1};
		Meal meal669 = new Meal(ingredients669, "American Wedges", Type.getType("Wahlmenü (Beilage)"), price669);
		meals100.add(meal669);

		List<Ingredient> ingredients670 = new ArrayList<>();
		ingredients670.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients670.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price670 = {0.6, 0.9, 1.1};
		Meal meal670 = new Meal(ingredients670, "Risi-Pisi", Type.getType("Wahlmenü (Beilage)"), price670);
		meals100.add(meal670);

		List<Ingredient> ingredients671 = new ArrayList<>();
		ingredients671.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients671.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price671 = {0.65, 0.95, 1.15};
		Meal meal671 = new Meal(ingredients671, "Kaiserschoten", Type.getType("Wahlmenü (Gemüse)"), price671);
		meals100.add(meal671);

		List<Ingredient> ingredients672 = new ArrayList<>();
		ingredients672.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients672.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price672 = {0.65, 0.95, 1.15};
		Meal meal672 = new Meal(ingredients672, "Pariser Karotten", Type.getType("Wahlmenü (Gemüse)"), price672);
		meals100.add(meal672);

		List<Ingredient> ingredients673 = new ArrayList<>();
		ingredients673.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients673.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients673.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients673.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients673.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price673 = {0.6, 0.9, 1.1};
		Meal meal673 = new Meal(ingredients673, "Endiviensalat, Italien-Dressing", Type.getType("Wahlmenü (Salat)"), price673);
		meals100.add(meal673);

		List<Ingredient> ingredients674 = new ArrayList<>();
		ingredients674.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients674.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients674.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients674.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price674 = {0.4, 0.6, 0.8};
		Meal meal674 = new Meal(ingredients674, "Kartoffelsuppe", Type.getType("Wahlmenü (Suppe)"), price674);
		meals100.add(meal674);

		List<Ingredient> ingredients675 = new ArrayList<>();
		ingredients675.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients675.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients675.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price675 = {0.8, 0.95, 1.1};
		Meal meal675 = new Meal(ingredients675, "Erdbeerjoghurt", Type.getType("Wahlmenü (Dessert)"), price675);
		meals100.add(meal675);

		map14.put(Day.getDay("Mittwoch"), meals100);


		List<Meal> meals101 = new ArrayList<>();
		List<Ingredient> ingredients676 = new ArrayList<>();
		ingredients676.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients676.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients676.add(Ingredient.getIngredientFromName("Farbstoff"));
		ingredients676.add(Ingredient.getIngredientFromName("Konservierungsstoff"));
		ingredients676.add(Ingredient.getIngredientFromName("Phosphat"));
		ingredients676.add(Ingredient.getIngredientFromName("Nitritpökelsalz"));
		ingredients676.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price676 = {1.35, 2.8, 3.95};
		Meal meal676 = new Meal(ingredients676, "Kartoffel-Bärlaucheintopf mit Wienerle", Type.getType("Eintopf"), price676);
		meals101.add(meal676);

		List<Ingredient> ingredients677 = new ArrayList<>();
		ingredients677.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients677.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients677.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients677.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price677 = {1.85, 3.5, 4.45};
		Meal meal677 = new Meal(ingredients677, "Hausgemachte Pasta, Spargelragout in Rahm", Type.getType("Tellergericht"), price677);
		meals101.add(meal677);

		List<Ingredient> ingredients678 = new ArrayList<>();
		ingredients678.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients678.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients678.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients678.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients678.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price678 = {1.8, 2.9, 3.5};
		Meal meal678 = new Meal(ingredients678, "Rinder-Geschnetzeltes Stroganoff", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price678);
		meals101.add(meal678);

		List<Ingredient> ingredients679 = new ArrayList<>();
		ingredients679.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients679.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients679.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients679.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		ingredients679.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price679 = {1.8, 2.9, 3.5};
		Meal meal679 = new Meal(ingredients679, "Tofugemüse mit Rucola", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price679);
		meals101.add(meal679);

		List<Ingredient> ingredients680 = new ArrayList<>();
		ingredients680.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients680.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients680.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients680.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		double[] price680 = {0.6, 0.9, 1.1};
		Meal meal680 = new Meal(ingredients680, "Hausgemachte Spätzle", Type.getType("Wahlmenü (Beilage)"), price680);
		meals101.add(meal680);

		List<Ingredient> ingredients681 = new ArrayList<>();
		ingredients681.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients681.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price681 = {0.6, 0.9, 1.1};
		Meal meal681 = new Meal(ingredients681, "Paprikareis", Type.getType("Wahlmenü (Beilage)"), price681);
		meals101.add(meal681);

		List<Ingredient> ingredients682 = new ArrayList<>();
		ingredients682.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients682.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price682 = {0.65, 0.95, 1.15};
		Meal meal682 = new Meal(ingredients682, "Auberginengemüse", Type.getType("Wahlmenü (Gemüse)"), price682);
		meals101.add(meal682);

		List<Ingredient> ingredients683 = new ArrayList<>();
		ingredients683.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients683.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients683.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price683 = {0.65, 0.95, 1.15};
		Meal meal683 = new Meal(ingredients683, "Linsengemüse", Type.getType("Wahlmenü (Gemüse)"), price683);
		meals101.add(meal683);

		List<Ingredient> ingredients684 = new ArrayList<>();
		ingredients684.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients684.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients684.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		double[] price684 = {0.6, 0.9, 1.1};
		Meal meal684 = new Meal(ingredients684, "Kopfsalat, Tomaten-Vinaigrette", Type.getType("Wahlmenü (Salat)"), price684);
		meals101.add(meal684);

		List<Ingredient> ingredients685 = new ArrayList<>();
		ingredients685.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients685.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients685.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients685.add(Ingredient.getIngredientFromName("Schalenfrüchte"));
		double[] price685 = {0.4, 0.6, 0.8};
		Meal meal685 = new Meal(ingredients685, "Möhrensuppe mit Haselnüssen", Type.getType("Wahlmenü (Suppe)"), price685);
		meals101.add(meal685);

		List<Ingredient> ingredients686 = new ArrayList<>();
		ingredients686.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients686.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients686.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price686 = {0.8, 0.95, 1.1};
		Meal meal686 = new Meal(ingredients686, "Schlemmerquark mit Heidelbeersauce", Type.getType("Wahlmenü (Dessert)"), price686);
		meals101.add(meal686);

		map14.put(Day.getDay("Donnerstag"), meals101);


		List<Meal> meals102 = new ArrayList<>();
		List<Ingredient> ingredients687 = new ArrayList<>();
		ingredients687.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients687.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients687.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price687 = {1.35, 2.8, 3.95};
		Meal meal687 = new Meal(ingredients687, "Bunte Maissuppe", Type.getType("Eintopf"), price687);
		meals102.add(meal687);

		List<Ingredient> ingredients688 = new ArrayList<>();
		ingredients688.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients688.add(Ingredient.getIngredientFromName("Unbekannt"));
		ingredients688.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients688.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients688.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price688 = {1.85, 3.5, 4.45};
		Meal meal688 = new Meal(ingredients688, "Pizza Salami", Type.getType("Tellergericht"), price688);
		meals102.add(meal688);

		List<Ingredient> ingredients689 = new ArrayList<>();
		ingredients689.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients689.add(Ingredient.getIngredientFromName("Fisch und Fischerzeugnisse"));
		ingredients689.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients689.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price689 = {1.8, 2.9, 3.5};
		Meal meal689 = new Meal(ingredients689, "Seelachsfilet, Senfsauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price689);
		meals102.add(meal689);

		List<Ingredient> ingredients690 = new ArrayList<>();
		ingredients690.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients690.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients690.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients690.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients690.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients690.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price690 = {1.8, 2.9, 3.5};
		Meal meal690 = new Meal(ingredients690, "Gefüllte Käse-Paprika, Tomatensauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price690);
		meals102.add(meal690);

		List<Ingredient> ingredients691 = new ArrayList<>();
		ingredients691.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients691.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price691 = {0.6, 0.9, 1.1};
		Meal meal691 = new Meal(ingredients691, "Basmatireis", Type.getType("Wahlmenü (Beilage)"), price691);
		meals102.add(meal691);

		List<Ingredient> ingredients692 = new ArrayList<>();
		ingredients692.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients692.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients692.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients692.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price692 = {0.6, 0.9, 1.1};
		Meal meal692 = new Meal(ingredients692, "Kartoffelgratin", Type.getType("Wahlmenü (Beilage)"), price692);
		meals102.add(meal692);

		List<Ingredient> ingredients693 = new ArrayList<>();
		ingredients693.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients693.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients693.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price693 = {0.65, 0.95, 1.15};
		Meal meal693 = new Meal(ingredients693, "Blattspinat in Rahm", Type.getType("Wahlmenü (Gemüse)"), price693);
		meals102.add(meal693);

		List<Ingredient> ingredients694 = new ArrayList<>();
		ingredients694.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients694.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price694 = {0.65, 0.95, 1.15};
		Meal meal694 = new Meal(ingredients694, "Blumenkohlgemüse", Type.getType("Wahlmenü (Gemüse)"), price694);
		meals102.add(meal694);

		List<Ingredient> ingredients695 = new ArrayList<>();
		ingredients695.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price695 = {0.6, 0.9, 1.1};
		Meal meal695 = new Meal(ingredients695, "Mischsalat, Schnittlauch-Vinaigrette", Type.getType("Wahlmenü (Salat)"), price695);
		meals102.add(meal695);

		List<Ingredient> ingredients696 = new ArrayList<>();
		ingredients696.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients696.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price696 = {0.4, 0.6, 0.8};
		Meal meal696 = new Meal(ingredients696, "Spargelcremesuppe", Type.getType("Wahlmenü (Suppe)"), price696);
		meals102.add(meal696);

		List<Ingredient> ingredients697 = new ArrayList<>();
		ingredients697.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients697.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients697.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price697 = {0.8, 0.95, 1.1};
		Meal meal697 = new Meal(ingredients697, "Orangenjoghurt mit Flakes", Type.getType("Wahlmenü (Dessert)"), price697);
		meals102.add(meal697);

		map14.put(Day.getDay("Freitag"), meals102);


		List<Meal> meals103 = new ArrayList<>();
		map14.put(Day.getDay("Samstag"), meals103);


		List<Meal> meals104 = new ArrayList<>();
		map14.put(Day.getDay("Sonntag"), meals104);


		
	}

	private static void fillCabalusDummy(Map<Week, Map<Mensa, Map<Day, List<Meal>>>> mealsDummy) {
		Map<Day, List<Meal>> map1 = mealsDummy.get(Week.getWeek("Aktuelle")).get(Mensa.getMensa("Mensa Caballus"));

		List<Meal> meals7 = new ArrayList<>();
		List<Ingredient> ingredients45 = new ArrayList<>();
		ingredients45.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients45.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients45.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price45 = {1.35, 2.8, 3.8};
		Meal meal45 = new Meal(ingredients45, "Gulascheintopf mit Möhren und Kartoffeln", Type.getType("Eintopf"), price45);
		meals7.add(meal45);

		List<Ingredient> ingredients46 = new ArrayList<>();
		ingredients46.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients46.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients46.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price46 = {1.85, 3.5, 4.3};
		Meal meal46 = new Meal(ingredients46, "Riesenrösti mit Rahmchampignons", Type.getType("Tellergericht"), price46);
		meals7.add(meal46);

		List<Ingredient> ingredients47 = new ArrayList<>();
		ingredients47.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients47.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients47.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients47.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price47 = {1.8, 2.9, 3.3};
		Meal meal47 = new Meal(ingredients47, "Putensteak, Sauce Hollandaise", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price47);
		meals7.add(meal47);

		List<Ingredient> ingredients48 = new ArrayList<>();
		ingredients48.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients48.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients48.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients48.add(Ingredient.getIngredientFromName("Sesamsamen und Sesamsamenerzeugnisse"));
		double[] price48 = {1.7, 2.8, 3.2};
		Meal meal48 = new Meal(ingredients48, "Linsen-Mangold-Curry", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price48);
		meals7.add(meal48);

		List<Ingredient> ingredients49 = new ArrayList<>();
		ingredients49.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients49.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients49.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients49.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients49.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients49.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price49 = {1.8, 2.9, 3.3};
		Meal meal49 = new Meal(ingredients49, "Ratatouille-Tarte", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price49);
		meals7.add(meal49);

		List<Ingredient> ingredients50 = new ArrayList<>();
		ingredients50.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients50.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients50.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients50.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price50 = {0.6, 0.9, 1.1};
		Meal meal50 = new Meal(ingredients50, "Gemüse-Couscous", Type.getType("Wahlmenü (Beilage)"), price50);
		meals7.add(meal50);

		List<Ingredient> ingredients51 = new ArrayList<>();
		ingredients51.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients51.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price51 = {0.6, 0.9, 1.1};
		Meal meal51 = new Meal(ingredients51, "Reis", Type.getType("Wahlmenü (Beilage)"), price51);
		meals7.add(meal51);

		List<Ingredient> ingredients52 = new ArrayList<>();
		ingredients52.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients52.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price52 = {0.65, 0.95, 1.15};
		Meal meal52 = new Meal(ingredients52, "Brokkoli", Type.getType("Wahlmenü (Gemüse)"), price52);
		meals7.add(meal52);

		List<Ingredient> ingredients53 = new ArrayList<>();
		ingredients53.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients53.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price53 = {0.65, 0.95, 1.15};
		Meal meal53 = new Meal(ingredients53, "Kohlrabi", Type.getType("Wahlmenü (Gemüse)"), price53);
		meals7.add(meal53);

		List<Ingredient> ingredients54 = new ArrayList<>();
		ingredients54.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients54.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price54 = {0.6, 0.9, 1.1};
		Meal meal54 = new Meal(ingredients54, "Tomatensalat", Type.getType("Wahlmenü (Salat)"), price54);
		meals7.add(meal54);

		List<Ingredient> ingredients55 = new ArrayList<>();
		ingredients55.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients55.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients55.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price55 = {0.4, 0.6, 0.8};
		Meal meal55 = new Meal(ingredients55, "Blumenkohlsuppe", Type.getType("Wahlmenü (Suppe)"), price55);
		meals7.add(meal55);

		List<Ingredient> ingredients56 = new ArrayList<>();
		ingredients56.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients56.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients56.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price56 = {0.8, 0.95, 1.1};
		Meal meal56 = new Meal(ingredients56, "Beerenquark", Type.getType("Wahlmenü (Dessert)"), price56);
		meals7.add(meal56);

		map1.put(Day.getDay("Montag"), meals7);


		List<Meal> meals8 = new ArrayList<>();
		List<Ingredient> ingredients57 = new ArrayList<>();
		ingredients57.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients57.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients57.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients57.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price57 = {1.35, 2.8, 3.8};
		Meal meal57 = new Meal(ingredients57, "Spargeleintopf", Type.getType("Eintopf"), price57);
		meals8.add(meal57);

		List<Ingredient> ingredients58 = new ArrayList<>();
		ingredients58.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients58.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients58.add(Ingredient.getIngredientFromName("Farbstoff"));
		ingredients58.add(Ingredient.getIngredientFromName("Konservierungsstoff"));
		ingredients58.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients58.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price58 = {1.85, 3.5, 4.3};
		Meal meal58 = new Meal(ingredients58, "Hausgemachte Pasta, Hähnchen-Paprika-Ragout, geriebener Hartkäse", Type.getType("Tellergericht"), price58);
		meals8.add(meal58);

		List<Ingredient> ingredients59 = new ArrayList<>();
		ingredients59.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients59.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients59.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients59.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price59 = {1.8, 2.9, 3.3};
		Meal meal59 = new Meal(ingredients59, "Allgäuer Käsefrikadelle, Créme-fraîche-Sauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price59);
		meals8.add(meal59);

		List<Ingredient> ingredients60 = new ArrayList<>();
		ingredients60.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients60.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients60.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price60 = {1.8, 2.9, 3.3};
		Meal meal60 = new Meal(ingredients60, "Back-Frischkäse mit Preiselbeeren", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price60);
		meals8.add(meal60);

		List<Ingredient> ingredients61 = new ArrayList<>();
		ingredients61.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients61.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients61.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients61.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		double[] price61 = {0.6, 0.9, 1.1};
		Meal meal61 = new Meal(ingredients61, "Hausgemachte Kräuterspätzle", Type.getType("Wahlmenü (Beilage)"), price61);
		meals8.add(meal61);

		List<Ingredient> ingredients62 = new ArrayList<>();
		ingredients62.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients62.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price62 = {0.6, 0.9, 1.1};
		Meal meal62 = new Meal(ingredients62, "Salzkartoffeln", Type.getType("Wahlmenü (Beilage)"), price62);
		meals8.add(meal62);

		List<Ingredient> ingredients63 = new ArrayList<>();
		ingredients63.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients63.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price63 = {0.65, 0.95, 1.15};
		Meal meal63 = new Meal(ingredients63, "Karottengemüse", Type.getType("Wahlmenü (Gemüse)"), price63);
		meals8.add(meal63);

		List<Ingredient> ingredients64 = new ArrayList<>();
		ingredients64.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients64.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price64 = {0.65, 0.95, 1.15};
		Meal meal64 = new Meal(ingredients64, "Spitzkohlgemüse", Type.getType("Wahlmenü (Gemüse)"), price64);
		meals8.add(meal64);

		List<Ingredient> ingredients65 = new ArrayList<>();
		ingredients65.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients65.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients65.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients65.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients65.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients65.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price65 = {0.6, 0.9, 1.1};
		Meal meal65 = new Meal(ingredients65, "Eisbergsalat, Dressing Sylter Art", Type.getType("Wahlmenü (Salat)"), price65);
		meals8.add(meal65);

		List<Ingredient> ingredients66 = new ArrayList<>();
		ingredients66.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients66.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients66.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients66.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price66 = {0.4, 0.6, 0.8};
		Meal meal66 = new Meal(ingredients66, "Spinatcremesuppe", Type.getType("Wahlmenü (Suppe)"), price66);
		meals8.add(meal66);

		List<Ingredient> ingredients67 = new ArrayList<>();
		ingredients67.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients67.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients67.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price67 = {0.8, 0.95, 1.1};
		Meal meal67 = new Meal(ingredients67, "Stracciatella-Joghurt", Type.getType("Wahlmenü (Dessert)"), price67);
		meals8.add(meal67);

		map1.put(Day.getDay("Dienstag"), meals8);


		List<Meal> meals9 = new ArrayList<>();
		List<Ingredient> ingredients68 = new ArrayList<>();
		ingredients68.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients68.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients68.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients68.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients68.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		double[] price68 = {1.35, 2.8, 3.8};
		Meal meal68 = new Meal(ingredients68, "Barbecueeintopf", Type.getType("Eintopf"), price68);
		meals9.add(meal68);

		List<Ingredient> ingredients69 = new ArrayList<>();
		ingredients69.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients69.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients69.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients69.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients69.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price69 = {1.85, 3.5, 4.3};
		Meal meal69 = new Meal(ingredients69, "Eier in Senfsauce, Salzkartoffeln", Type.getType("Tellergericht"), price69);
		meals9.add(meal69);

		List<Ingredient> ingredients70 = new ArrayList<>();
		ingredients70.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients70.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients70.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients70.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients70.add(Ingredient.getIngredientFromName("Geschmacksverstärker"));
		ingredients70.add(Ingredient.getIngredientFromName("Nitritpökelsalz"));
		ingredients70.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients70.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price70 = {1.8, 2.9, 3.3};
		Meal meal70 = new Meal(ingredients70, "Kasselerbraten, Rahmsauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price70);
		meals9.add(meal70);

		List<Ingredient> ingredients71 = new ArrayList<>();
		ingredients71.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients71.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients71.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price71 = {1.7, 2.8, 3.2};
		Meal meal71 = new Meal(ingredients71, "Pizza-Polenta, Tomatensugo", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price71);
		meals9.add(meal71);

		List<Ingredient> ingredients72 = new ArrayList<>();
		ingredients72.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients72.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients72.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price72 = {0.6, 0.9, 1.1};
		Meal meal72 = new Meal(ingredients72, "Kartoffelpüree", Type.getType("Wahlmenü (Beilage)"), price72);
		meals9.add(meal72);

		List<Ingredient> ingredients73 = new ArrayList<>();
		ingredients73.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price73 = {0.6, 0.9, 1.1};
		Meal meal73 = new Meal(ingredients73, "Kroketten", Type.getType("Wahlmenü (Beilage)"), price73);
		meals9.add(meal73);

		List<Ingredient> ingredients74 = new ArrayList<>();
		ingredients74.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients74.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price74 = {0.65, 0.95, 1.15};
		Meal meal74 = new Meal(ingredients74, "Champignongemüse", Type.getType("Wahlmenü (Gemüse)"), price74);
		meals9.add(meal74);

		List<Ingredient> ingredients75 = new ArrayList<>();
		ingredients75.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients75.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price75 = {0.65, 0.95, 1.15};
		Meal meal75 = new Meal(ingredients75, "Romanesco", Type.getType("Wahlmenü (Gemüse)"), price75);
		meals9.add(meal75);

		List<Ingredient> ingredients76 = new ArrayList<>();
		ingredients76.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients76.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients76.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price76 = {0.6, 0.9, 1.1};
		Meal meal76 = new Meal(ingredients76, "Lollo-Rosso-Salat, hausgemachtes Balsamicodressing", Type.getType("Wahlmenü (Salat)"), price76);
		meals9.add(meal76);

		List<Ingredient> ingredients77 = new ArrayList<>();
		ingredients77.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients77.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price77 = {0.4, 0.6, 0.8};
		Meal meal77 = new Meal(ingredients77, "Currysuppe mit Kokos", Type.getType("Wahlmenü (Suppe)"), price77);
		meals9.add(meal77);

		List<Ingredient> ingredients78 = new ArrayList<>();
		ingredients78.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients78.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients78.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price78 = {0.8, 0.95, 1.1};
		Meal meal78 = new Meal(ingredients78, "Karamellpudding", Type.getType("Wahlmenü (Dessert)"), price78);
		meals9.add(meal78);

		map1.put(Day.getDay("Mittwoch"), meals9);


		List<Meal> meals10 = new ArrayList<>();
		List<Ingredient> ingredients79 = new ArrayList<>();
		ingredients79.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients79.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients79.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price79 = {1.35, 2.8, 3.8};
		Meal meal79 = new Meal(ingredients79, "Gemüseeintopf mit saurer Sahne", Type.getType("Eintopf"), price79);
		meals10.add(meal79);

		List<Ingredient> ingredients80 = new ArrayList<>();
		ingredients80.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients80.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients80.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients80.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients80.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients80.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		ingredients80.add(Ingredient.getIngredientFromName("Sesamsamen und Sesamsamenerzeugnisse"));
		double[] price80 = {1.85, 3.5, 4.3};
		Meal meal80 = new Meal(ingredients80, "Gewürzburger, Krautsalat, American Wedges", Type.getType("Tellergericht"), price80);
		meals10.add(meal80);

		List<Ingredient> ingredients81 = new ArrayList<>();
		ingredients81.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients81.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients81.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients81.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		double[] price81 = {1.8, 2.9, 3.3};
		Meal meal81 = new Meal(ingredients81, "Hähnchenkeule Marengo", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price81);
		meals10.add(meal81);

		List<Ingredient> ingredients82 = new ArrayList<>();
		ingredients82.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients82.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients82.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients82.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price82 = {1.7, 2.8, 3.2};
		Meal meal82 = new Meal(ingredients82, "Möhren-Zucchini-Puffer, Kräuterdip", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price82);
		meals10.add(meal82);

		List<Ingredient> ingredients83 = new ArrayList<>();
		ingredients83.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients83.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		double[] price83 = {0.6, 0.9, 1.1};
		Meal meal83 = new Meal(ingredients83, "Hausgemachte Currypasta", Type.getType("Wahlmenü (Beilage)"), price83);
		meals10.add(meal83);

		List<Ingredient> ingredients84 = new ArrayList<>();
		ingredients84.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients84.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price84 = {0.6, 0.9, 1.1};
		Meal meal84 = new Meal(ingredients84, "Petersilienkartoffeln", Type.getType("Wahlmenü (Beilage)"), price84);
		meals10.add(meal84);

		List<Ingredient> ingredients85 = new ArrayList<>();
		ingredients85.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients85.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price85 = {0.65, 0.95, 1.15};
		Meal meal85 = new Meal(ingredients85, "Blumenkohlgemüse", Type.getType("Wahlmenü (Gemüse)"), price85);
		meals10.add(meal85);

		List<Ingredient> ingredients86 = new ArrayList<>();
		ingredients86.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients86.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price86 = {0.65, 0.95, 1.15};
		Meal meal86 = new Meal(ingredients86, "Maisgemüse", Type.getType("Wahlmenü (Gemüse)"), price86);
		meals10.add(meal86);

		List<Ingredient> ingredients87 = new ArrayList<>();
		ingredients87.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients87.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients87.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price87 = {0.6, 0.9, 1.1};
		Meal meal87 = new Meal(ingredients87, "Mischsalat, Curry-Dressing", Type.getType("Wahlmenü (Salat)"), price87);
		meals10.add(meal87);

		List<Ingredient> ingredients88 = new ArrayList<>();
		ingredients88.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients88.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price88 = {0.4, 0.6, 0.8};
		Meal meal88 = new Meal(ingredients88, "Spargelcremesuppe", Type.getType("Wahlmenü (Suppe)"), price88);
		meals10.add(meal88);

		List<Ingredient> ingredients89 = new ArrayList<>();
		ingredients89.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients89.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price89 = {0.8, 0.95, 1.1};
		Meal meal89 = new Meal(ingredients89, "Aprikosenquark", Type.getType("Wahlmenü (Dessert)"), price89);
		meals10.add(meal89);

		map1.put(Day.getDay("Donnerstag"), meals10);


		List<Meal> meals11 = new ArrayList<>();
		map1.put(Day.getDay("Freitag"), meals11);


		List<Meal> meals12 = new ArrayList<>();
		map1.put(Day.getDay("Samstag"), meals12);


		List<Meal> meals13 = new ArrayList<>();
		map1.put(Day.getDay("Sonntag"), meals13);

		Map<Day, List<Meal>> map10 = mealsDummy.get(Week.getWeek("Naechste")).get(Mensa.getMensa("Mensa Caballus"));

		List<Meal> meals70 = new ArrayList<>();
		List<Ingredient> ingredients416 = new ArrayList<>();
		ingredients416.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients416.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients416.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		double[] price416 = {1.35, 2.8, 3.8};
		Meal meal416 = new Meal(ingredients416, "Feuriger Bohneneintopf", Type.getType("Eintopf"), price416);
		meals70.add(meal416);

		List<Ingredient> ingredients417 = new ArrayList<>();
		ingredients417.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients417.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients417.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price417 = {1.85, 3.5, 4.3};
		Meal meal417 = new Meal(ingredients417, "Nürnberger Rostbratwürstchen, Kartoffelpüree, Wonnekraut", Type.getType("Tellergericht"), price417);
		meals70.add(meal417);

		List<Ingredient> ingredients418 = new ArrayList<>();
		ingredients418.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients418.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients418.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients418.add(Ingredient.getIngredientFromName("Konservierungsstoff"));
		ingredients418.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients418.add(Ingredient.getIngredientFromName("Phosphat"));
		ingredients418.add(Ingredient.getIngredientFromName("Nitritpökelsalz"));
		ingredients418.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients418.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		ingredients418.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price418 = {1.8, 2.9, 3.3};
		Meal meal418 = new Meal(ingredients418, "Rinderroulade mit Specksauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price418);
		meals70.add(meal418);

		List<Ingredient> ingredients419 = new ArrayList<>();
		ingredients419.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients419.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients419.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients419.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price419 = {1.8, 2.9, 3.3};
		Meal meal419 = new Meal(ingredients419, "Vegetarisches Schnitzel, Karotten-Sahne-Sauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price419);
		meals70.add(meal419);

		List<Ingredient> ingredients420 = new ArrayList<>();
		ingredients420.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients420.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients420.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price420 = {0.6, 0.9, 1.1};
		Meal meal420 = new Meal(ingredients420, "Bechamelkartoffeln", Type.getType("Wahlmenü (Beilage)"), price420);
		meals70.add(meal420);

		List<Ingredient> ingredients421 = new ArrayList<>();
		ingredients421.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients421.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients421.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		double[] price421 = {0.6, 0.9, 1.1};
		Meal meal421 = new Meal(ingredients421, "Hausgemachte Pasta", Type.getType("Wahlmenü (Beilage)"), price421);
		meals70.add(meal421);

		List<Ingredient> ingredients422 = new ArrayList<>();
		ingredients422.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price422 = {0.65, 0.95, 1.15};
		Meal meal422 = new Meal(ingredients422, "Bohnengemüse", Type.getType("Wahlmenü (Gemüse)"), price422);
		meals70.add(meal422);

		List<Ingredient> ingredients423 = new ArrayList<>();
		ingredients423.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients423.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients423.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price423 = {0.65, 0.95, 1.15};
		Meal meal423 = new Meal(ingredients423, "Rahmwirsing", Type.getType("Wahlmenü (Gemüse)"), price423);
		meals70.add(meal423);

		List<Ingredient> ingredients424 = new ArrayList<>();
		ingredients424.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price424 = {0.6, 0.9, 1.1};
		Meal meal424 = new Meal(ingredients424, "Gurkensalat", Type.getType("Wahlmenü (Salat)"), price424);
		meals70.add(meal424);

		List<Ingredient> ingredients425 = new ArrayList<>();
		ingredients425.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients425.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients425.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price425 = {0.4, 0.6, 0.8};
		Meal meal425 = new Meal(ingredients425, "Tomatensuppe", Type.getType("Wahlmenü (Suppe)"), price425);
		meals70.add(meal425);

		List<Ingredient> ingredients426 = new ArrayList<>();
		ingredients426.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients426.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price426 = {0.8, 0.95, 1.1};
		Meal meal426 = new Meal(ingredients426, "Obstsalat", Type.getType("Wahlmenü (Dessert)"), price426);
		meals70.add(meal426);

		map10.put(Day.getDay("Montag"), meals70);


		List<Meal> meals71 = new ArrayList<>();
		List<Ingredient> ingredients427 = new ArrayList<>();
		ingredients427.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients427.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients427.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		double[] price427 = {1.35, 2.8, 3.8};
		Meal meal427 = new Meal(ingredients427, "Nudelsuppe mit Rindfleisch, mit hausgemachter Pasta", Type.getType("Eintopf"), price427);
		meals71.add(meal427);

		List<Ingredient> ingredients428 = new ArrayList<>();
		ingredients428.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients428.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients428.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		double[] price428 = {1.85, 3.5, 4.3};
		Meal meal428 = new Meal(ingredients428, "Kartoffelpuffer, hausgemachtes Apfelmus", Type.getType("Tellergericht"), price428);
		meals71.add(meal428);

		List<Ingredient> ingredients429 = new ArrayList<>();
		ingredients429.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients429.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients429.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients429.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients429.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients429.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients429.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price429 = {1.8, 2.9, 3.3};
		Meal meal429 = new Meal(ingredients429, "Frikadelle, Rahmsauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price429);
		meals71.add(meal429);

		List<Ingredient> ingredients430 = new ArrayList<>();
		ingredients430.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients430.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients430.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price430 = {1.7, 2.8, 3.2};
		Meal meal430 = new Meal(ingredients430, "Gemüsegratin mit Kräutern, Bechamelsauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price430);
		meals71.add(meal430);

		List<Ingredient> ingredients431 = new ArrayList<>();
		ingredients431.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients431.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients431.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients431.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		double[] price431 = {0.6, 0.9, 1.1};
		Meal meal431 = new Meal(ingredients431, "Hausgemachte Schupfnudeln", Type.getType("Wahlmenü (Beilage)"), price431);
		meals71.add(meal431);

		List<Ingredient> ingredients432 = new ArrayList<>();
		ingredients432.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients432.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price432 = {0.6, 0.9, 1.1};
		Meal meal432 = new Meal(ingredients432, "Salzkartoffeln", Type.getType("Wahlmenü (Beilage)"), price432);
		meals71.add(meal432);

		List<Ingredient> ingredients433 = new ArrayList<>();
		ingredients433.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients433.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price433 = {0.65, 0.95, 1.15};
		Meal meal433 = new Meal(ingredients433, "Erbsengemüse", Type.getType("Wahlmenü (Gemüse)"), price433);
		meals71.add(meal433);

		List<Ingredient> ingredients434 = new ArrayList<>();
		ingredients434.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients434.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price434 = {0.65, 0.95, 1.15};
		Meal meal434 = new Meal(ingredients434, "Maisgemüse", Type.getType("Wahlmenü (Gemüse)"), price434);
		meals71.add(meal434);

		List<Ingredient> ingredients435 = new ArrayList<>();
		ingredients435.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients435.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients435.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price435 = {0.6, 0.9, 1.1};
		Meal meal435 = new Meal(ingredients435, "Lollo-Bionda-Salat, Honig-Senf-Dressing", Type.getType("Wahlmenü (Salat)"), price435);
		meals71.add(meal435);

		List<Ingredient> ingredients436 = new ArrayList<>();
		ingredients436.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients436.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price436 = {0.4, 0.6, 0.8};
		Meal meal436 = new Meal(ingredients436, "Tomaten-Paprikasuppe", Type.getType("Wahlmenü (Suppe)"), price436);
		meals71.add(meal436);

		List<Ingredient> ingredients437 = new ArrayList<>();
		ingredients437.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients437.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients437.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price437 = {0.8, 0.95, 1.1};
		Meal meal437 = new Meal(ingredients437, "Milchreis, Zimt und Zucker", Type.getType("Wahlmenü (Dessert)"), price437);
		meals71.add(meal437);

		map10.put(Day.getDay("Dienstag"), meals71);


		List<Meal> meals72 = new ArrayList<>();
		List<Ingredient> ingredients438 = new ArrayList<>();
		ingredients438.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients438.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients438.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients438.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		double[] price438 = {1.35, 2.8, 3.8};
		Meal meal438 = new Meal(ingredients438, "Chinesische Gemüsesuppe", Type.getType("Eintopf"), price438);
		meals72.add(meal438);

		List<Ingredient> ingredients439 = new ArrayList<>();
		ingredients439.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients439.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients439.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients439.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients439.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		double[] price439 = {1.85, 3.5, 4.3};
		Meal meal439 = new Meal(ingredients439, "Hackfleischpfanne mit Chinakohl, Reis", Type.getType("Tellergericht"), price439);
		meals72.add(meal439);

		List<Ingredient> ingredients440 = new ArrayList<>();
		ingredients440.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients440.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price440 = {1.8, 2.9, 3.3};
		Meal meal440 = new Meal(ingredients440, "Halbes Grillhähnchen", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price440);
		meals72.add(meal440);

		List<Ingredient> ingredients441 = new ArrayList<>();
		ingredients441.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients441.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients441.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price441 = {1.7, 2.8, 3.2};
		Meal meal441 = new Meal(ingredients441, "Champignon-Risotto-Bratling, Kressesauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price441);
		meals72.add(meal441);

		List<Ingredient> ingredients442 = new ArrayList<>();
		ingredients442.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients442.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients442.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients442.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price442 = {0.6, 0.9, 1.1};
		Meal meal442 = new Meal(ingredients442, "American Wedges", Type.getType("Wahlmenü (Beilage)"), price442);
		meals72.add(meal442);

		List<Ingredient> ingredients443 = new ArrayList<>();
		ingredients443.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients443.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price443 = {0.6, 0.9, 1.1};
		Meal meal443 = new Meal(ingredients443, "Risi-Pisi", Type.getType("Wahlmenü (Beilage)"), price443);
		meals72.add(meal443);

		List<Ingredient> ingredients444 = new ArrayList<>();
		ingredients444.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients444.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price444 = {0.65, 0.95, 1.15};
		Meal meal444 = new Meal(ingredients444, "Kaiserschoten", Type.getType("Wahlmenü (Gemüse)"), price444);
		meals72.add(meal444);

		List<Ingredient> ingredients445 = new ArrayList<>();
		ingredients445.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients445.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price445 = {0.65, 0.95, 1.15};
		Meal meal445 = new Meal(ingredients445, "Pariser Karotten", Type.getType("Wahlmenü (Gemüse)"), price445);
		meals72.add(meal445);

		List<Ingredient> ingredients446 = new ArrayList<>();
		ingredients446.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients446.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients446.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients446.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients446.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price446 = {0.6, 0.9, 1.1};
		Meal meal446 = new Meal(ingredients446, "Endiviensalat, Italien-Dressing", Type.getType("Wahlmenü (Salat)"), price446);
		meals72.add(meal446);

		List<Ingredient> ingredients447 = new ArrayList<>();
		ingredients447.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients447.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients447.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients447.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price447 = {0.4, 0.6, 0.8};
		Meal meal447 = new Meal(ingredients447, "Kartoffelsuppe", Type.getType("Wahlmenü (Suppe)"), price447);
		meals72.add(meal447);

		List<Ingredient> ingredients448 = new ArrayList<>();
		ingredients448.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients448.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients448.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price448 = {0.8, 0.95, 1.1};
		Meal meal448 = new Meal(ingredients448, "Erdbeerjoghurt", Type.getType("Wahlmenü (Dessert)"), price448);
		meals72.add(meal448);

		map10.put(Day.getDay("Mittwoch"), meals72);


		List<Meal> meals73 = new ArrayList<>();
		List<Ingredient> ingredients449 = new ArrayList<>();
		ingredients449.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients449.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients449.add(Ingredient.getIngredientFromName("Farbstoff"));
		ingredients449.add(Ingredient.getIngredientFromName("Konservierungsstoff"));
		ingredients449.add(Ingredient.getIngredientFromName("Phosphat"));
		ingredients449.add(Ingredient.getIngredientFromName("Nitritpökelsalz"));
		ingredients449.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price449 = {1.35, 2.8, 3.8};
		Meal meal449 = new Meal(ingredients449, "Kartoffel-Bärlaucheintopf mit Wienerle", Type.getType("Eintopf"), price449);
		meals73.add(meal449);

		List<Ingredient> ingredients450 = new ArrayList<>();
		ingredients450.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients450.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients450.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients450.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price450 = {1.85, 3.5, 4.3};
		Meal meal450 = new Meal(ingredients450, "Hausgemachte Pasta, Spargelragout in Rahm", Type.getType("Tellergericht"), price450);
		meals73.add(meal450);

		List<Ingredient> ingredients451 = new ArrayList<>();
		ingredients451.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients451.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients451.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients451.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients451.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price451 = {1.8, 2.9, 3.3};
		Meal meal451 = new Meal(ingredients451, "Rinder-Geschnetzeltes Stroganoff", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price451);
		meals73.add(meal451);

		List<Ingredient> ingredients452 = new ArrayList<>();
		ingredients452.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients452.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients452.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients452.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		ingredients452.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price452 = {1.8, 2.9, 3.3};
		Meal meal452 = new Meal(ingredients452, "Tofugemüse mit Rucola", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price452);
		meals73.add(meal452);

		List<Ingredient> ingredients453 = new ArrayList<>();
		ingredients453.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients453.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients453.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients453.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		double[] price453 = {0.6, 0.9, 1.1};
		Meal meal453 = new Meal(ingredients453, "Hausgemachte Spätzle", Type.getType("Wahlmenü (Beilage)"), price453);
		meals73.add(meal453);

		List<Ingredient> ingredients454 = new ArrayList<>();
		ingredients454.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients454.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price454 = {0.6, 0.9, 1.1};
		Meal meal454 = new Meal(ingredients454, "Paprikareis", Type.getType("Wahlmenü (Beilage)"), price454);
		meals73.add(meal454);

		List<Ingredient> ingredients455 = new ArrayList<>();
		ingredients455.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients455.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price455 = {0.65, 0.95, 1.15};
		Meal meal455 = new Meal(ingredients455, "Auberginengemüse", Type.getType("Wahlmenü (Gemüse)"), price455);
		meals73.add(meal455);

		List<Ingredient> ingredients456 = new ArrayList<>();
		ingredients456.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients456.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients456.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price456 = {0.65, 0.95, 1.15};
		Meal meal456 = new Meal(ingredients456, "Linsengemüse", Type.getType("Wahlmenü (Gemüse)"), price456);
		meals73.add(meal456);

		List<Ingredient> ingredients457 = new ArrayList<>();
		ingredients457.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients457.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients457.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		double[] price457 = {0.6, 0.9, 1.1};
		Meal meal457 = new Meal(ingredients457, "Kopfsalat, Tomaten-Vinaigrette", Type.getType("Wahlmenü (Salat)"), price457);
		meals73.add(meal457);

		List<Ingredient> ingredients458 = new ArrayList<>();
		ingredients458.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients458.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients458.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients458.add(Ingredient.getIngredientFromName("Schalenfrüchte"));
		double[] price458 = {0.4, 0.6, 0.8};
		Meal meal458 = new Meal(ingredients458, "Möhrensuppe mit Haselnüssen", Type.getType("Wahlmenü (Suppe)"), price458);
		meals73.add(meal458);

		List<Ingredient> ingredients459 = new ArrayList<>();
		ingredients459.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients459.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients459.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price459 = {0.8, 0.95, 1.1};
		Meal meal459 = new Meal(ingredients459, "Schlemmerquark mit Heidelbeersauce", Type.getType("Wahlmenü (Dessert)"), price459);
		meals73.add(meal459);

		map10.put(Day.getDay("Donnerstag"), meals73);


		List<Meal> meals74 = new ArrayList<>();
		List<Ingredient> ingredients460 = new ArrayList<>();
		ingredients460.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients460.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients460.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price460 = {1.35, 2.8, 3.8};
		Meal meal460 = new Meal(ingredients460, "Bunte Maissuppe", Type.getType("Eintopf"), price460);
		meals74.add(meal460);

		List<Ingredient> ingredients461 = new ArrayList<>();
		ingredients461.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients461.add(Ingredient.getIngredientFromName("Unbekannt"));
		ingredients461.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients461.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients461.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price461 = {1.85, 3.5, 4.3};
		Meal meal461 = new Meal(ingredients461, "Pizza Salami", Type.getType("Tellergericht"), price461);
		meals74.add(meal461);

		List<Ingredient> ingredients462 = new ArrayList<>();
		ingredients462.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients462.add(Ingredient.getIngredientFromName("Fisch und Fischerzeugnisse"));
		ingredients462.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients462.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price462 = {1.8, 2.9, 3.3};
		Meal meal462 = new Meal(ingredients462, "Seelachsfilet, Senfsauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price462);
		meals74.add(meal462);

		List<Ingredient> ingredients463 = new ArrayList<>();
		ingredients463.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients463.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients463.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients463.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients463.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients463.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price463 = {1.8, 2.9, 3.3};
		Meal meal463 = new Meal(ingredients463, "Gefüllte Käse-Paprika, Tomatensauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price463);
		meals74.add(meal463);

		List<Ingredient> ingredients464 = new ArrayList<>();
		ingredients464.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients464.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price464 = {0.6, 0.9, 1.1};
		Meal meal464 = new Meal(ingredients464, "Basmatireis", Type.getType("Wahlmenü (Beilage)"), price464);
		meals74.add(meal464);

		List<Ingredient> ingredients465 = new ArrayList<>();
		ingredients465.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients465.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients465.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients465.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price465 = {0.6, 0.9, 1.1};
		Meal meal465 = new Meal(ingredients465, "Kartoffelgratin", Type.getType("Wahlmenü (Beilage)"), price465);
		meals74.add(meal465);

		List<Ingredient> ingredients466 = new ArrayList<>();
		ingredients466.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients466.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients466.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price466 = {0.65, 0.95, 1.15};
		Meal meal466 = new Meal(ingredients466, "Blattspinat in Rahm", Type.getType("Wahlmenü (Gemüse)"), price466);
		meals74.add(meal466);

		List<Ingredient> ingredients467 = new ArrayList<>();
		ingredients467.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients467.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price467 = {0.65, 0.95, 1.15};
		Meal meal467 = new Meal(ingredients467, "Blumenkohlgemüse", Type.getType("Wahlmenü (Gemüse)"), price467);
		meals74.add(meal467);

		List<Ingredient> ingredients468 = new ArrayList<>();
		ingredients468.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price468 = {0.6, 0.9, 1.1};
		Meal meal468 = new Meal(ingredients468, "Mischsalat, Schnittlauch-Vinaigrette", Type.getType("Wahlmenü (Salat)"), price468);
		meals74.add(meal468);

		List<Ingredient> ingredients469 = new ArrayList<>();
		ingredients469.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients469.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price469 = {0.4, 0.6, 0.8};
		Meal meal469 = new Meal(ingredients469, "Spargelcremesuppe", Type.getType("Wahlmenü (Suppe)"), price469);
		meals74.add(meal469);

		List<Ingredient> ingredients470 = new ArrayList<>();
		ingredients470.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients470.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients470.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price470 = {0.8, 0.95, 1.1};
		Meal meal470 = new Meal(ingredients470, "Orangenjoghurt mit Flakes", Type.getType("Wahlmenü (Dessert)"), price470);
		meals74.add(meal470);

		map10.put(Day.getDay("Freitag"), meals74);


		List<Meal> meals75 = new ArrayList<>();
		map10.put(Day.getDay("Samstag"), meals75);


		List<Meal> meals76 = new ArrayList<>();
		map10.put(Day.getDay("Sonntag"), meals76);


		
	}

	private static void fillBSDummy(Map<Week, Map<Mensa, Map<Day, List<Meal>>>> mealsDummy) {
		Map<Day, List<Meal>> map8 = mealsDummy.get(Week.getWeek("Aktuelle")).get(Mensa.getMensa("Mensa Blumhardtstraße"));

		List<Meal> meals56 = new ArrayList<>();
		List<Ingredient> ingredients334 = new ArrayList<>();
		ingredients334.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients334.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients334.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price334 = {1.7, 3.35, 4.15};
		Meal meal334 = new Meal(ingredients334, "Riesenrösti mit Rahmchampignons", Type.getType("Tellergericht"), price334);
		meals56.add(meal334);

		List<Ingredient> ingredients335 = new ArrayList<>();
		ingredients335.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients335.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients335.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients335.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price335 = {1.7, 2.8, 3.2};
		Meal meal335 = new Meal(ingredients335, "Putensteak, Sauce Hollandaise", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price335);
		meals56.add(meal335);

		List<Ingredient> ingredients336 = new ArrayList<>();
		ingredients336.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients336.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients336.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients336.add(Ingredient.getIngredientFromName("Sesamsamen und Sesamsamenerzeugnisse"));
		double[] price336 = {1.6, 2.7, 3.1};
		Meal meal336 = new Meal(ingredients336, "Linsen-Mangold-Curry", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price336);
		meals56.add(meal336);

		List<Ingredient> ingredients337 = new ArrayList<>();
		ingredients337.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients337.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price337 = {0.45, 0.8, 1.0};
		Meal meal337 = new Meal(ingredients337, "Reis", Type.getType("Wahlmenü (Beilage)"), price337);
		meals56.add(meal337);

		List<Ingredient> ingredients338 = new ArrayList<>();
		ingredients338.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients338.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price338 = {0.5, 0.9, 1.1};
		Meal meal338 = new Meal(ingredients338, "Brokkoli", Type.getType("Wahlmenü (Gemüse)"), price338);
		meals56.add(meal338);

		List<Ingredient> ingredients339 = new ArrayList<>();
		ingredients339.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients339.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price339 = {0.5, 0.85, 1.05};
		Meal meal339 = new Meal(ingredients339, "Tomatensalat", Type.getType("Wahlmenü (Salat)"), price339);
		meals56.add(meal339);

		List<Ingredient> ingredients340 = new ArrayList<>();
		ingredients340.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients340.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients340.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price340 = {0.8, 0.95, 1.1};
		Meal meal340 = new Meal(ingredients340, "Beerenquark", Type.getType("Wahlmenü (Dessert)"), price340);
		meals56.add(meal340);

		map8.put(Day.getDay("Montag"), meals56);


		List<Meal> meals57 = new ArrayList<>();
		List<Ingredient> ingredients341 = new ArrayList<>();
		ingredients341.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients341.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients341.add(Ingredient.getIngredientFromName("Farbstoff"));
		ingredients341.add(Ingredient.getIngredientFromName("Konservierungsstoff"));
		ingredients341.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients341.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price341 = {1.7, 3.35, 4.15};
		Meal meal341 = new Meal(ingredients341, "Hausgemachte Pasta, Hähnchen-Paprika-Ragout, geriebener Hartkäse", Type.getType("Tellergericht"), price341);
		meals57.add(meal341);

		List<Ingredient> ingredients342 = new ArrayList<>();
		ingredients342.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients342.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients342.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients342.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price342 = {1.7, 2.8, 3.2};
		Meal meal342 = new Meal(ingredients342, "Allgäuer Käsefrikadelle, Créme-fraîche-Sauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price342);
		meals57.add(meal342);

		List<Ingredient> ingredients343 = new ArrayList<>();
		ingredients343.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients343.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients343.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price343 = {1.7, 2.8, 3.2};
		Meal meal343 = new Meal(ingredients343, "Back-Frischkäse mit Preiselbeeren", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price343);
		meals57.add(meal343);

		List<Ingredient> ingredients344 = new ArrayList<>();
		ingredients344.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients344.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients344.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients344.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		double[] price344 = {0.45, 0.8, 1.0};
		Meal meal344 = new Meal(ingredients344, "Hausgemachte Kräuterspätzle", Type.getType("Wahlmenü (Beilage)"), price344);
		meals57.add(meal344);

		List<Ingredient> ingredients345 = new ArrayList<>();
		ingredients345.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients345.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price345 = {0.45, 0.8, 1.0};
		Meal meal345 = new Meal(ingredients345, "Salzkartoffeln", Type.getType("Wahlmenü (Beilage)"), price345);
		meals57.add(meal345);

		List<Ingredient> ingredients346 = new ArrayList<>();
		ingredients346.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients346.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price346 = {0.5, 0.9, 1.1};
		Meal meal346 = new Meal(ingredients346, "Karottengemüse", Type.getType("Wahlmenü (Gemüse)"), price346);
		meals57.add(meal346);

		List<Ingredient> ingredients347 = new ArrayList<>();
		ingredients347.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients347.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients347.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients347.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients347.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients347.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price347 = {0.5, 0.85, 1.05};
		Meal meal347 = new Meal(ingredients347, "Eisbergsalat, Dressing Sylter Art", Type.getType("Wahlmenü (Salat)"), price347);
		meals57.add(meal347);

		List<Ingredient> ingredients348 = new ArrayList<>();
		ingredients348.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients348.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients348.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price348 = {0.8, 0.95, 1.1};
		Meal meal348 = new Meal(ingredients348, "Stracciatella-Joghurt", Type.getType("Wahlmenü (Dessert)"), price348);
		meals57.add(meal348);

		map8.put(Day.getDay("Dienstag"), meals57);


		List<Meal> meals58 = new ArrayList<>();
		List<Ingredient> ingredients349 = new ArrayList<>();
		ingredients349.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients349.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients349.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients349.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients349.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price349 = {1.7, 3.35, 4.15};
		Meal meal349 = new Meal(ingredients349, "Eier in Senfsauce, Salzkartoffeln", Type.getType("Tellergericht"), price349);
		meals58.add(meal349);

		List<Ingredient> ingredients350 = new ArrayList<>();
		ingredients350.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients350.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients350.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients350.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients350.add(Ingredient.getIngredientFromName("Geschmacksverstärker"));
		ingredients350.add(Ingredient.getIngredientFromName("Nitritpökelsalz"));
		ingredients350.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients350.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price350 = {1.7, 2.8, 3.2};
		Meal meal350 = new Meal(ingredients350, "Kasselerbraten, Rahmsauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price350);
		meals58.add(meal350);

		List<Ingredient> ingredients351 = new ArrayList<>();
		ingredients351.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients351.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients351.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price351 = {1.6, 2.7, 3.1};
		Meal meal351 = new Meal(ingredients351, "Pizza-Polenta, Tomatensugo", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price351);
		meals58.add(meal351);

		List<Ingredient> ingredients352 = new ArrayList<>();
		ingredients352.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients352.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients352.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price352 = {0.45, 0.8, 1.0};
		Meal meal352 = new Meal(ingredients352, "Kartoffelpüree", Type.getType("Wahlmenü (Beilage)"), price352);
		meals58.add(meal352);

		List<Ingredient> ingredients353 = new ArrayList<>();
		ingredients353.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients353.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price353 = {0.5, 0.9, 1.1};
		Meal meal353 = new Meal(ingredients353, "Champignongemüse", Type.getType("Wahlmenü (Gemüse)"), price353);
		meals58.add(meal353);

		List<Ingredient> ingredients354 = new ArrayList<>();
		ingredients354.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients354.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price354 = {0.5, 0.9, 1.1};
		Meal meal354 = new Meal(ingredients354, "Romanesco", Type.getType("Wahlmenü (Gemüse)"), price354);
		meals58.add(meal354);

		List<Ingredient> ingredients355 = new ArrayList<>();
		ingredients355.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients355.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients355.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price355 = {0.8, 0.95, 1.1};
		Meal meal355 = new Meal(ingredients355, "Karamellpudding", Type.getType("Wahlmenü (Dessert)"), price355);
		meals58.add(meal355);

		map8.put(Day.getDay("Mittwoch"), meals58);


		List<Meal> meals59 = new ArrayList<>();
		List<Ingredient> ingredients356 = new ArrayList<>();
		ingredients356.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients356.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients356.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients356.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		double[] price356 = {1.7, 2.8, 3.2};
		Meal meal356 = new Meal(ingredients356, "Hähnchenkeule Marengo", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price356);
		meals59.add(meal356);

		List<Ingredient> ingredients357 = new ArrayList<>();
		ingredients357.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients357.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients357.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients357.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price357 = {1.6, 2.7, 3.1};
		Meal meal357 = new Meal(ingredients357, "Möhren-Zucchini-Puffer, Kräuterdip", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price357);
		meals59.add(meal357);

		List<Ingredient> ingredients358 = new ArrayList<>();
		ingredients358.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients358.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price358 = {0.45, 0.8, 1.0};
		Meal meal358 = new Meal(ingredients358, "Petersilienkartoffeln", Type.getType("Wahlmenü (Beilage)"), price358);
		meals59.add(meal358);

		List<Ingredient> ingredients359 = new ArrayList<>();
		ingredients359.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients359.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price359 = {0.5, 0.9, 1.1};
		Meal meal359 = new Meal(ingredients359, "Blumenkohlgemüse", Type.getType("Wahlmenü (Gemüse)"), price359);
		meals59.add(meal359);

		List<Ingredient> ingredients360 = new ArrayList<>();
		ingredients360.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients360.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price360 = {0.8, 0.95, 1.1};
		Meal meal360 = new Meal(ingredients360, "Aprikosenquark", Type.getType("Wahlmenü (Dessert)"), price360);
		meals59.add(meal360);

		map8.put(Day.getDay("Donnerstag"), meals59);


		List<Meal> meals60 = new ArrayList<>();
		map8.put(Day.getDay("Freitag"), meals60);


		List<Meal> meals61 = new ArrayList<>();
		map8.put(Day.getDay("Samstag"), meals61);


		List<Meal> meals62 = new ArrayList<>();
		map8.put(Day.getDay("Sonntag"), meals62);

		Map<Day, List<Meal>> map17 = mealsDummy.get(Week.getWeek("Naechste")).get(Mensa.getMensa("Mensa Blumhardtstraße"));

		List<Meal> meals119 = new ArrayList<>();
		List<Ingredient> ingredients778 = new ArrayList<>();
		ingredients778.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients778.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients778.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price778 = {1.7, 3.35, 4.15};
		Meal meal778 = new Meal(ingredients778, "Nürnberger Rostbratwürstchen, Kartoffelpüree, Wonnekraut", Type.getType("Tellergericht"), price778);
		meals119.add(meal778);

		List<Ingredient> ingredients779 = new ArrayList<>();
		ingredients779.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients779.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients779.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients779.add(Ingredient.getIngredientFromName("Konservierungsstoff"));
		ingredients779.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients779.add(Ingredient.getIngredientFromName("Phosphat"));
		ingredients779.add(Ingredient.getIngredientFromName("Nitritpökelsalz"));
		ingredients779.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients779.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		ingredients779.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price779 = {1.7, 2.8, 3.2};
		Meal meal779 = new Meal(ingredients779, "Rinderroulade mit Specksauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price779);
		meals119.add(meal779);

		List<Ingredient> ingredients780 = new ArrayList<>();
		ingredients780.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients780.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients780.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients780.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price780 = {1.7, 2.8, 3.2};
		Meal meal780 = new Meal(ingredients780, "Vegetarisches Schnitzel, Karotten-Sahne-Sauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price780);
		meals119.add(meal780);

		List<Ingredient> ingredients781 = new ArrayList<>();
		ingredients781.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients781.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients781.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price781 = {0.45, 0.8, 1.0};
		Meal meal781 = new Meal(ingredients781, "Bechamelkartoffeln", Type.getType("Wahlmenü (Beilage)"), price781);
		meals119.add(meal781);

		List<Ingredient> ingredients782 = new ArrayList<>();
		ingredients782.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients782.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients782.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price782 = {0.5, 0.9, 1.1};
		Meal meal782 = new Meal(ingredients782, "Rahmwirsing", Type.getType("Wahlmenü (Gemüse)"), price782);
		meals119.add(meal782);

		List<Ingredient> ingredients783 = new ArrayList<>();
		ingredients783.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price783 = {0.5, 0.85, 1.05};
		Meal meal783 = new Meal(ingredients783, "Gurkensalat", Type.getType("Wahlmenü (Salat)"), price783);
		meals119.add(meal783);

		List<Ingredient> ingredients784 = new ArrayList<>();
		ingredients784.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients784.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price784 = {0.8, 0.95, 1.1};
		Meal meal784 = new Meal(ingredients784, "Obstsalat", Type.getType("Wahlmenü (Dessert)"), price784);
		meals119.add(meal784);

		map17.put(Day.getDay("Montag"), meals119);


		List<Meal> meals120 = new ArrayList<>();
		List<Ingredient> ingredients785 = new ArrayList<>();
		ingredients785.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients785.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients785.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		double[] price785 = {1.7, 3.35, 4.15};
		Meal meal785 = new Meal(ingredients785, "Kartoffelpuffer, hausgemachtes Apfelmus", Type.getType("Tellergericht"), price785);
		meals120.add(meal785);

		List<Ingredient> ingredients786 = new ArrayList<>();
		ingredients786.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients786.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients786.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients786.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients786.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients786.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients786.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price786 = {1.7, 2.8, 3.2};
		Meal meal786 = new Meal(ingredients786, "Frikadelle, Rahmsauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price786);
		meals120.add(meal786);

		List<Ingredient> ingredients787 = new ArrayList<>();
		ingredients787.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients787.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients787.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price787 = {1.6, 2.7, 3.1};
		Meal meal787 = new Meal(ingredients787, "Gemüsegratin mit Kräutern, Bechamelsauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price787);
		meals120.add(meal787);

		List<Ingredient> ingredients788 = new ArrayList<>();
		ingredients788.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients788.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price788 = {0.45, 0.8, 1.0};
		Meal meal788 = new Meal(ingredients788, "Salzkartoffeln", Type.getType("Wahlmenü (Beilage)"), price788);
		meals120.add(meal788);

		List<Ingredient> ingredients789 = new ArrayList<>();
		ingredients789.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients789.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price789 = {0.5, 0.9, 1.1};
		Meal meal789 = new Meal(ingredients789, "Erbsengemüse", Type.getType("Wahlmenü (Gemüse)"), price789);
		meals120.add(meal789);

		List<Ingredient> ingredients790 = new ArrayList<>();
		ingredients790.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients790.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price790 = {0.5, 0.9, 1.1};
		Meal meal790 = new Meal(ingredients790, "Maisgemüse", Type.getType("Wahlmenü (Gemüse)"), price790);
		meals120.add(meal790);

		List<Ingredient> ingredients791 = new ArrayList<>();
		ingredients791.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients791.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients791.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price791 = {0.5, 0.85, 1.05};
		Meal meal791 = new Meal(ingredients791, "Lollo-Bionda-Salat, Honig-Senf-Dressing", Type.getType("Wahlmenü (Salat)"), price791);
		meals120.add(meal791);

		List<Ingredient> ingredients792 = new ArrayList<>();
		ingredients792.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients792.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients792.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price792 = {0.8, 0.95, 1.1};
		Meal meal792 = new Meal(ingredients792, "Milchreis, Zimt und Zucker", Type.getType("Wahlmenü (Dessert)"), price792);
		meals120.add(meal792);

		map17.put(Day.getDay("Dienstag"), meals120);


		List<Meal> meals121 = new ArrayList<>();
		List<Ingredient> ingredients793 = new ArrayList<>();
		ingredients793.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients793.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients793.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients793.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients793.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		double[] price793 = {1.7, 3.35, 4.15};
		Meal meal793 = new Meal(ingredients793, "Hackfleischpfanne mit Chinakohl, Reis", Type.getType("Tellergericht"), price793);
		meals121.add(meal793);

		List<Ingredient> ingredients794 = new ArrayList<>();
		ingredients794.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients794.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price794 = {1.7, 2.8, 3.2};
		Meal meal794 = new Meal(ingredients794, "Halbes Grillhähnchen", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price794);
		meals121.add(meal794);

		List<Ingredient> ingredients795 = new ArrayList<>();
		ingredients795.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients795.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients795.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price795 = {1.6, 2.7, 3.1};
		Meal meal795 = new Meal(ingredients795, "Champignon-Risotto-Bratling, Kressesauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price795);
		meals121.add(meal795);

		List<Ingredient> ingredients796 = new ArrayList<>();
		ingredients796.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients796.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients796.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients796.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price796 = {0.45, 0.8, 1.0};
		Meal meal796 = new Meal(ingredients796, "American Wedges", Type.getType("Wahlmenü (Beilage)"), price796);
		meals121.add(meal796);

		List<Ingredient> ingredients797 = new ArrayList<>();
		ingredients797.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients797.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price797 = {0.5, 0.9, 1.1};
		Meal meal797 = new Meal(ingredients797, "Pariser Karotten", Type.getType("Wahlmenü (Gemüse)"), price797);
		meals121.add(meal797);

		List<Ingredient> ingredients798 = new ArrayList<>();
		ingredients798.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients798.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients798.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients798.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients798.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price798 = {0.5, 0.85, 1.05};
		Meal meal798 = new Meal(ingredients798, "Endiviensalat, Italien-Dressing", Type.getType("Wahlmenü (Salat)"), price798);
		meals121.add(meal798);

		List<Ingredient> ingredients799 = new ArrayList<>();
		ingredients799.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients799.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients799.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price799 = {0.8, 0.95, 1.1};
		Meal meal799 = new Meal(ingredients799, "Erdbeerjoghurt", Type.getType("Wahlmenü (Dessert)"), price799);
		meals121.add(meal799);

		map17.put(Day.getDay("Mittwoch"), meals121);


		List<Meal> meals122 = new ArrayList<>();
		List<Ingredient> ingredients800 = new ArrayList<>();
		ingredients800.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients800.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients800.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients800.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price800 = {1.7, 3.35, 4.15};
		Meal meal800 = new Meal(ingredients800, "Hausgemachte Pasta, Spargelragout in Rahm", Type.getType("Tellergericht"), price800);
		meals122.add(meal800);

		List<Ingredient> ingredients801 = new ArrayList<>();
		ingredients801.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients801.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients801.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients801.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients801.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price801 = {1.7, 2.8, 3.2};
		Meal meal801 = new Meal(ingredients801, "Rinder-Geschnetzeltes Stroganoff", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price801);
		meals122.add(meal801);

		List<Ingredient> ingredients802 = new ArrayList<>();
		ingredients802.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients802.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients802.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients802.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		ingredients802.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price802 = {1.7, 2.8, 3.2};
		Meal meal802 = new Meal(ingredients802, "Tofugemüse mit Rucola", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price802);
		meals122.add(meal802);

		List<Ingredient> ingredients803 = new ArrayList<>();
		ingredients803.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients803.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients803.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients803.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		double[] price803 = {0.45, 0.8, 1.0};
		Meal meal803 = new Meal(ingredients803, "Hausgemachte Spätzle", Type.getType("Wahlmenü (Beilage)"), price803);
		meals122.add(meal803);

		List<Ingredient> ingredients804 = new ArrayList<>();
		ingredients804.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients804.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price804 = {0.45, 0.8, 1.0};
		Meal meal804 = new Meal(ingredients804, "Paprikareis", Type.getType("Wahlmenü (Beilage)"), price804);
		meals122.add(meal804);

		List<Ingredient> ingredients805 = new ArrayList<>();
		ingredients805.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients805.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients805.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		double[] price805 = {0.5, 0.85, 1.05};
		Meal meal805 = new Meal(ingredients805, "Kopfsalat, Tomaten-Vinaigrette", Type.getType("Wahlmenü (Salat)"), price805);
		meals122.add(meal805);

		List<Ingredient> ingredients806 = new ArrayList<>();
		ingredients806.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients806.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients806.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price806 = {0.8, 0.95, 1.1};
		Meal meal806 = new Meal(ingredients806, "Schlemmerquark mit Heidelbeersauce", Type.getType("Wahlmenü (Dessert)"), price806);
		meals122.add(meal806);

		map17.put(Day.getDay("Donnerstag"), meals122);


		List<Meal> meals123 = new ArrayList<>();
		List<Ingredient> ingredients807 = new ArrayList<>();
		ingredients807.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients807.add(Ingredient.getIngredientFromName("Fisch und Fischerzeugnisse"));
		ingredients807.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients807.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price807 = {1.7, 2.8, 3.2};
		Meal meal807 = new Meal(ingredients807, "Seelachsfilet, Senfsauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price807);
		meals123.add(meal807);

		List<Ingredient> ingredients808 = new ArrayList<>();
		ingredients808.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients808.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients808.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients808.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients808.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients808.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price808 = {1.7, 2.8, 3.2};
		Meal meal808 = new Meal(ingredients808, "Gefüllte Käse-Paprika, Tomatensauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price808);
		meals123.add(meal808);

		List<Ingredient> ingredients809 = new ArrayList<>();
		ingredients809.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients809.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients809.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients809.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price809 = {0.45, 0.8, 1.0};
		Meal meal809 = new Meal(ingredients809, "Kartoffelgratin", Type.getType("Wahlmenü (Beilage)"), price809);
		meals123.add(meal809);

		List<Ingredient> ingredients810 = new ArrayList<>();
		ingredients810.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients810.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients810.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price810 = {0.5, 0.9, 1.1};
		Meal meal810 = new Meal(ingredients810, "Blattspinat in Rahm", Type.getType("Wahlmenü (Gemüse)"), price810);
		meals123.add(meal810);

		List<Ingredient> ingredients811 = new ArrayList<>();
		ingredients811.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients811.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients811.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price811 = {0.8, 0.95, 1.1};
		Meal meal811 = new Meal(ingredients811, "Orangenjoghurt mit Flakes", Type.getType("Wahlmenü (Dessert)"), price811);
		meals123.add(meal811);

		map17.put(Day.getDay("Freitag"), meals123);


		List<Meal> meals124 = new ArrayList<>();
		map17.put(Day.getDay("Samstag"), meals124);


		List<Meal> meals125 = new ArrayList<>();
		map17.put(Day.getDay("Sonntag"), meals125);


		
	}

	private static void fillHauptmensaDummy(Map<Week, Map<Mensa, Map<Day, List<Meal>>>> mealsDummy) {
		Map<Day, List<Meal>> map2 = mealsDummy.get(Week.getWeek("Aktuelle")).get(Mensa.getMensa("Hauptmensa"));

		List<Meal> meals14 = new ArrayList<>();
		List<Ingredient> ingredients90 = new ArrayList<>();
		ingredients90.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients90.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients90.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price90 = {1.35, 2.8, 3.8};
		Meal meal90 = new Meal(ingredients90, "Gulascheintopf mit Möhren und Kartoffeln", Type.getType("Eintopf"), price90);
		meals14.add(meal90);

		List<Ingredient> ingredients91 = new ArrayList<>();
		ingredients91.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients91.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients91.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price91 = {1.85, 3.5, 4.3};
		Meal meal91 = new Meal(ingredients91, "Riesenrösti mit Rahmchampignons", Type.getType("Tellergericht"), price91);
		meals14.add(meal91);

		List<Ingredient> ingredients92 = new ArrayList<>();
		ingredients92.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients92.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients92.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients92.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price92 = {1.8, 2.9, 3.3};
		Meal meal92 = new Meal(ingredients92, "Putensteak, Sauce Hollandaise", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price92);
		meals14.add(meal92);

		List<Ingredient> ingredients93 = new ArrayList<>();
		ingredients93.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients93.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients93.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients93.add(Ingredient.getIngredientFromName("Sesamsamen und Sesamsamenerzeugnisse"));
		double[] price93 = {1.7, 2.8, 3.2};
		Meal meal93 = new Meal(ingredients93, "Linsen-Mangold-Curry", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price93);
		meals14.add(meal93);

		List<Ingredient> ingredients94 = new ArrayList<>();
		ingredients94.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients94.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients94.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients94.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price94 = {0.6, 0.9, 1.1};
		Meal meal94 = new Meal(ingredients94, "Gemüse-Couscous", Type.getType("Wahlmenü (Beilage)"), price94);
		meals14.add(meal94);

		List<Ingredient> ingredients95 = new ArrayList<>();
		ingredients95.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients95.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price95 = {0.6, 0.9, 1.1};
		Meal meal95 = new Meal(ingredients95, "Reis", Type.getType("Wahlmenü (Beilage)"), price95);
		meals14.add(meal95);

		List<Ingredient> ingredients96 = new ArrayList<>();
		ingredients96.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients96.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price96 = {0.65, 0.95, 1.15};
		Meal meal96 = new Meal(ingredients96, "Brokkoli", Type.getType("Wahlmenü (Gemüse)"), price96);
		meals14.add(meal96);

		List<Ingredient> ingredients97 = new ArrayList<>();
		ingredients97.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients97.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price97 = {0.65, 0.95, 1.15};
		Meal meal97 = new Meal(ingredients97, "Kohlrabi", Type.getType("Wahlmenü (Gemüse)"), price97);
		meals14.add(meal97);

		List<Ingredient> ingredients98 = new ArrayList<>();
		ingredients98.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients98.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price98 = {0.6, 0.9, 1.1};
		Meal meal98 = new Meal(ingredients98, "Tomatensalat", Type.getType("Wahlmenü (Salat)"), price98);
		meals14.add(meal98);

		List<Ingredient> ingredients99 = new ArrayList<>();
		ingredients99.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients99.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients99.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price99 = {0.4, 0.6, 0.8};
		Meal meal99 = new Meal(ingredients99, "Blumenkohlsuppe", Type.getType("Wahlmenü (Suppe)"), price99);
		meals14.add(meal99);

		List<Ingredient> ingredients100 = new ArrayList<>();
		ingredients100.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients100.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients100.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price100 = {0.8, 0.95, 1.1};
		Meal meal100 = new Meal(ingredients100, "Tagesdessert", Type.getType("Wahlmenü (Dessert)"), price100);
		meals14.add(meal100);

		map2.put(Day.getDay("Montag"), meals14);


		List<Meal> meals15 = new ArrayList<>();
		List<Ingredient> ingredients101 = new ArrayList<>();
		ingredients101.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients101.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients101.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients101.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price101 = {1.35, 2.8, 3.8};
		Meal meal101 = new Meal(ingredients101, "Spargeleintopf", Type.getType("Eintopf"), price101);
		meals15.add(meal101);

		List<Ingredient> ingredients102 = new ArrayList<>();
		ingredients102.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients102.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients102.add(Ingredient.getIngredientFromName("Farbstoff"));
		ingredients102.add(Ingredient.getIngredientFromName("Konservierungsstoff"));
		ingredients102.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients102.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price102 = {1.85, 3.5, 4.3};
		Meal meal102 = new Meal(ingredients102, "Hausgemachte Pasta, Hähnchen-Paprika-Ragout, geriebener Hartkäse", Type.getType("Tellergericht"), price102);
		meals15.add(meal102);

		List<Ingredient> ingredients103 = new ArrayList<>();
		ingredients103.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients103.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients103.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients103.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price103 = {1.8, 2.9, 3.3};
		Meal meal103 = new Meal(ingredients103, "Allgäuer Käsefrikadelle, Créme-fraîche-Sauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price103);
		meals15.add(meal103);

		List<Ingredient> ingredients104 = new ArrayList<>();
		ingredients104.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients104.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients104.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price104 = {1.8, 2.9, 3.3};
		Meal meal104 = new Meal(ingredients104, "Back-Frischkäse mit Preiselbeeren", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price104);
		meals15.add(meal104);

		List<Ingredient> ingredients105 = new ArrayList<>();
		ingredients105.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients105.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients105.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients105.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		double[] price105 = {0.6, 0.9, 1.1};
		Meal meal105 = new Meal(ingredients105, "Hausgemachte Kräuterspätzle", Type.getType("Wahlmenü (Beilage)"), price105);
		meals15.add(meal105);

		List<Ingredient> ingredients106 = new ArrayList<>();
		ingredients106.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients106.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price106 = {0.6, 0.9, 1.1};
		Meal meal106 = new Meal(ingredients106, "Salzkartoffeln", Type.getType("Wahlmenü (Beilage)"), price106);
		meals15.add(meal106);

		List<Ingredient> ingredients107 = new ArrayList<>();
		ingredients107.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients107.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price107 = {0.65, 0.95, 1.15};
		Meal meal107 = new Meal(ingredients107, "Karottengemüse", Type.getType("Wahlmenü (Gemüse)"), price107);
		meals15.add(meal107);

		List<Ingredient> ingredients108 = new ArrayList<>();
		ingredients108.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients108.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price108 = {0.65, 0.95, 1.15};
		Meal meal108 = new Meal(ingredients108, "Spitzkohlgemüse", Type.getType("Wahlmenü (Gemüse)"), price108);
		meals15.add(meal108);

		List<Ingredient> ingredients109 = new ArrayList<>();
		ingredients109.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients109.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients109.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients109.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients109.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients109.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price109 = {0.6, 0.9, 1.1};
		Meal meal109 = new Meal(ingredients109, "Eisbergsalat, Dressing Sylter Art", Type.getType("Wahlmenü (Salat)"), price109);
		meals15.add(meal109);

		List<Ingredient> ingredients110 = new ArrayList<>();
		ingredients110.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients110.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients110.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients110.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price110 = {0.4, 0.6, 0.8};
		Meal meal110 = new Meal(ingredients110, "Spinatcremesuppe", Type.getType("Wahlmenü (Suppe)"), price110);
		meals15.add(meal110);

		List<Ingredient> ingredients111 = new ArrayList<>();
		ingredients111.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients111.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients111.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price111 = {0.8, 0.95, 1.1};
		Meal meal111 = new Meal(ingredients111, "Stracciatella-Joghurt", Type.getType("Wahlmenü (Dessert)"), price111);
		meals15.add(meal111);

		map2.put(Day.getDay("Dienstag"), meals15);


		List<Meal> meals16 = new ArrayList<>();
		List<Ingredient> ingredients112 = new ArrayList<>();
		ingredients112.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients112.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients112.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients112.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients112.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		double[] price112 = {1.35, 2.8, 3.8};
		Meal meal112 = new Meal(ingredients112, "Barbecueeintopf", Type.getType("Eintopf"), price112);
		meals16.add(meal112);

		List<Ingredient> ingredients113 = new ArrayList<>();
		ingredients113.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients113.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients113.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients113.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients113.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price113 = {1.85, 3.5, 4.3};
		Meal meal113 = new Meal(ingredients113, "Eier in Senfsauce, Salzkartoffeln", Type.getType("Tellergericht"), price113);
		meals16.add(meal113);

		List<Ingredient> ingredients114 = new ArrayList<>();
		ingredients114.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients114.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients114.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients114.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients114.add(Ingredient.getIngredientFromName("Geschmacksverstärker"));
		ingredients114.add(Ingredient.getIngredientFromName("Nitritpökelsalz"));
		ingredients114.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients114.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price114 = {1.8, 2.9, 3.3};
		Meal meal114 = new Meal(ingredients114, "Kasselerbraten, Rahmsauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price114);
		meals16.add(meal114);

		List<Ingredient> ingredients115 = new ArrayList<>();
		ingredients115.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients115.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients115.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price115 = {1.7, 2.8, 3.2};
		Meal meal115 = new Meal(ingredients115, "Pizza-Polenta, Tomatensugo", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price115);
		meals16.add(meal115);

		List<Ingredient> ingredients116 = new ArrayList<>();
		ingredients116.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients116.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients116.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price116 = {0.6, 0.9, 1.1};
		Meal meal116 = new Meal(ingredients116, "Kartoffelpüree", Type.getType("Wahlmenü (Beilage)"), price116);
		meals16.add(meal116);

		List<Ingredient> ingredients117 = new ArrayList<>();
		ingredients117.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price117 = {0.6, 0.9, 1.1};
		Meal meal117 = new Meal(ingredients117, "Kroketten", Type.getType("Wahlmenü (Beilage)"), price117);
		meals16.add(meal117);

		List<Ingredient> ingredients118 = new ArrayList<>();
		ingredients118.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients118.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price118 = {0.65, 0.95, 1.15};
		Meal meal118 = new Meal(ingredients118, "Champignongemüse", Type.getType("Wahlmenü (Gemüse)"), price118);
		meals16.add(meal118);

		List<Ingredient> ingredients119 = new ArrayList<>();
		ingredients119.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients119.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price119 = {0.65, 0.95, 1.15};
		Meal meal119 = new Meal(ingredients119, "Romanesco", Type.getType("Wahlmenü (Gemüse)"), price119);
		meals16.add(meal119);

		List<Ingredient> ingredients120 = new ArrayList<>();
		ingredients120.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients120.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients120.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price120 = {0.6, 0.9, 1.1};
		Meal meal120 = new Meal(ingredients120, "Lollo-Rosso-Salat, hausgemachtes Balsamicodressing", Type.getType("Wahlmenü (Salat)"), price120);
		meals16.add(meal120);

		List<Ingredient> ingredients121 = new ArrayList<>();
		ingredients121.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients121.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price121 = {0.4, 0.6, 0.8};
		Meal meal121 = new Meal(ingredients121, "Currysuppe mit Kokos", Type.getType("Wahlmenü (Suppe)"), price121);
		meals16.add(meal121);

		List<Ingredient> ingredients122 = new ArrayList<>();
		ingredients122.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients122.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients122.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price122 = {0.8, 0.95, 1.1};
		Meal meal122 = new Meal(ingredients122, "Karamellpudding", Type.getType("Wahlmenü (Dessert)"), price122);
		meals16.add(meal122);

		map2.put(Day.getDay("Mittwoch"), meals16);


		List<Meal> meals17 = new ArrayList<>();
		List<Ingredient> ingredients123 = new ArrayList<>();
		ingredients123.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients123.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients123.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price123 = {1.35, 2.8, 3.8};
		Meal meal123 = new Meal(ingredients123, "Gemüseeintopf mit saurer Sahne", Type.getType("Eintopf"), price123);
		meals17.add(meal123);

		List<Ingredient> ingredients124 = new ArrayList<>();
		ingredients124.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients124.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients124.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients124.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients124.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients124.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		ingredients124.add(Ingredient.getIngredientFromName("Sesamsamen und Sesamsamenerzeugnisse"));
		double[] price124 = {1.85, 3.5, 4.3};
		Meal meal124 = new Meal(ingredients124, "Gewürzburger, Krautsalat, American Wedges", Type.getType("Tellergericht"), price124);
		meals17.add(meal124);

		List<Ingredient> ingredients125 = new ArrayList<>();
		ingredients125.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients125.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients125.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients125.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		double[] price125 = {1.8, 2.9, 3.3};
		Meal meal125 = new Meal(ingredients125, "Hähnchenkeule Marengo", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price125);
		meals17.add(meal125);

		List<Ingredient> ingredients126 = new ArrayList<>();
		ingredients126.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients126.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients126.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients126.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price126 = {1.7, 2.8, 3.2};
		Meal meal126 = new Meal(ingredients126, "Möhren-Zucchini-Puffer, Kräuterdip", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price126);
		meals17.add(meal126);

		List<Ingredient> ingredients127 = new ArrayList<>();
		ingredients127.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients127.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		double[] price127 = {0.6, 0.9, 1.1};
		Meal meal127 = new Meal(ingredients127, "Hausgemachte Currypasta", Type.getType("Wahlmenü (Beilage)"), price127);
		meals17.add(meal127);

		List<Ingredient> ingredients128 = new ArrayList<>();
		ingredients128.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients128.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price128 = {0.6, 0.9, 1.1};
		Meal meal128 = new Meal(ingredients128, "Petersilienkartoffeln", Type.getType("Wahlmenü (Beilage)"), price128);
		meals17.add(meal128);

		List<Ingredient> ingredients129 = new ArrayList<>();
		ingredients129.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients129.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price129 = {0.65, 0.95, 1.15};
		Meal meal129 = new Meal(ingredients129, "Blumenkohlgemüse", Type.getType("Wahlmenü (Gemüse)"), price129);
		meals17.add(meal129);

		List<Ingredient> ingredients130 = new ArrayList<>();
		ingredients130.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients130.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price130 = {0.65, 0.95, 1.15};
		Meal meal130 = new Meal(ingredients130, "Maisgemüse", Type.getType("Wahlmenü (Gemüse)"), price130);
		meals17.add(meal130);

		List<Ingredient> ingredients131 = new ArrayList<>();
		ingredients131.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients131.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients131.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price131 = {0.6, 0.9, 1.1};
		Meal meal131 = new Meal(ingredients131, "Mischsalat, Curry-Dressing", Type.getType("Wahlmenü (Salat)"), price131);
		meals17.add(meal131);

		List<Ingredient> ingredients132 = new ArrayList<>();
		ingredients132.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients132.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price132 = {0.4, 0.6, 0.8};
		Meal meal132 = new Meal(ingredients132, "Spargelcremesuppe", Type.getType("Wahlmenü (Suppe)"), price132);
		meals17.add(meal132);

		List<Ingredient> ingredients133 = new ArrayList<>();
		ingredients133.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients133.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price133 = {0.8, 0.95, 1.1};
		Meal meal133 = new Meal(ingredients133, "Aprikosenquark", Type.getType("Wahlmenü (Dessert)"), price133);
		meals17.add(meal133);

		map2.put(Day.getDay("Donnerstag"), meals17);


		List<Meal> meals18 = new ArrayList<>();
		map2.put(Day.getDay("Freitag"), meals18);


		List<Meal> meals19 = new ArrayList<>();
		map2.put(Day.getDay("Samstag"), meals19);


		List<Meal> meals20 = new ArrayList<>();
		map2.put(Day.getDay("Sonntag"), meals20);

		Map<Day, List<Meal>> map11 = mealsDummy.get(Week.getWeek("Naechste")).get(Mensa.getMensa("Hauptmensa"));

		List<Meal> meals77 = new ArrayList<>();
		List<Ingredient> ingredients471 = new ArrayList<>();
		ingredients471.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients471.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients471.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		double[] price471 = {1.35, 2.8, 3.8};
		Meal meal471 = new Meal(ingredients471, "Feuriger Bohneneintopf", Type.getType("Eintopf"), price471);
		meals77.add(meal471);

		List<Ingredient> ingredients472 = new ArrayList<>();
		ingredients472.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients472.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients472.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price472 = {1.85, 3.5, 4.3};
		Meal meal472 = new Meal(ingredients472, "Nürnberger Rostbratwürstchen, Kartoffelpüree, Wonnekraut", Type.getType("Tellergericht"), price472);
		meals77.add(meal472);

		List<Ingredient> ingredients473 = new ArrayList<>();
		ingredients473.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients473.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients473.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients473.add(Ingredient.getIngredientFromName("Konservierungsstoff"));
		ingredients473.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients473.add(Ingredient.getIngredientFromName("Phosphat"));
		ingredients473.add(Ingredient.getIngredientFromName("Nitritpökelsalz"));
		ingredients473.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients473.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		ingredients473.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price473 = {1.8, 2.9, 3.3};
		Meal meal473 = new Meal(ingredients473, "Rinderroulade mit Specksauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price473);
		meals77.add(meal473);

		List<Ingredient> ingredients474 = new ArrayList<>();
		ingredients474.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients474.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients474.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients474.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price474 = {1.8, 2.9, 3.3};
		Meal meal474 = new Meal(ingredients474, "Vegetarisches Schnitzel, Karotten-Sahne-Sauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price474);
		meals77.add(meal474);

		List<Ingredient> ingredients475 = new ArrayList<>();
		ingredients475.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients475.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients475.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price475 = {0.6, 0.9, 1.1};
		Meal meal475 = new Meal(ingredients475, "Bechamelkartoffeln", Type.getType("Wahlmenü (Beilage)"), price475);
		meals77.add(meal475);

		List<Ingredient> ingredients476 = new ArrayList<>();
		ingredients476.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients476.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients476.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		double[] price476 = {0.6, 0.9, 1.1};
		Meal meal476 = new Meal(ingredients476, "Hausgemachte Pasta", Type.getType("Wahlmenü (Beilage)"), price476);
		meals77.add(meal476);

		List<Ingredient> ingredients477 = new ArrayList<>();
		ingredients477.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price477 = {0.65, 0.95, 1.15};
		Meal meal477 = new Meal(ingredients477, "Bohnengemüse", Type.getType("Wahlmenü (Gemüse)"), price477);
		meals77.add(meal477);

		List<Ingredient> ingredients478 = new ArrayList<>();
		ingredients478.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients478.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients478.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price478 = {0.65, 0.95, 1.15};
		Meal meal478 = new Meal(ingredients478, "Rahmwirsing", Type.getType("Wahlmenü (Gemüse)"), price478);
		meals77.add(meal478);

		List<Ingredient> ingredients479 = new ArrayList<>();
		ingredients479.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price479 = {0.6, 0.9, 1.1};
		Meal meal479 = new Meal(ingredients479, "Gurkensalat", Type.getType("Wahlmenü (Salat)"), price479);
		meals77.add(meal479);

		List<Ingredient> ingredients480 = new ArrayList<>();
		ingredients480.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients480.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients480.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price480 = {0.4, 0.6, 0.8};
		Meal meal480 = new Meal(ingredients480, "Tomatensuppe", Type.getType("Wahlmenü (Suppe)"), price480);
		meals77.add(meal480);

		List<Ingredient> ingredients481 = new ArrayList<>();
		ingredients481.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients481.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price481 = {0.8, 0.95, 1.1};
		Meal meal481 = new Meal(ingredients481, "Obstsalat", Type.getType("Wahlmenü (Dessert)"), price481);
		meals77.add(meal481);

		map11.put(Day.getDay("Montag"), meals77);


		List<Meal> meals78 = new ArrayList<>();
		List<Ingredient> ingredients482 = new ArrayList<>();
		ingredients482.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients482.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients482.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		double[] price482 = {1.35, 2.8, 3.8};
		Meal meal482 = new Meal(ingredients482, "Nudelsuppe mit Rindfleisch, mit hausgemachter Pasta", Type.getType("Eintopf"), price482);
		meals78.add(meal482);

		List<Ingredient> ingredients483 = new ArrayList<>();
		ingredients483.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients483.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients483.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		double[] price483 = {1.85, 3.5, 4.3};
		Meal meal483 = new Meal(ingredients483, "Kartoffelpuffer, hausgemachtes Apfelmus", Type.getType("Tellergericht"), price483);
		meals78.add(meal483);

		List<Ingredient> ingredients484 = new ArrayList<>();
		ingredients484.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients484.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients484.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients484.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients484.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients484.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients484.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price484 = {1.8, 2.9, 3.3};
		Meal meal484 = new Meal(ingredients484, "Frikadelle, Rahmsauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price484);
		meals78.add(meal484);

		List<Ingredient> ingredients485 = new ArrayList<>();
		ingredients485.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients485.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients485.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price485 = {1.7, 2.8, 3.2};
		Meal meal485 = new Meal(ingredients485, "Gemüsegratin mit Kräutern, Bechamelsauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price485);
		meals78.add(meal485);

		List<Ingredient> ingredients486 = new ArrayList<>();
		ingredients486.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients486.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients486.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients486.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		double[] price486 = {0.6, 0.9, 1.1};
		Meal meal486 = new Meal(ingredients486, "Hausgemachte Schupfnudeln", Type.getType("Wahlmenü (Beilage)"), price486);
		meals78.add(meal486);

		List<Ingredient> ingredients487 = new ArrayList<>();
		ingredients487.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients487.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price487 = {0.6, 0.9, 1.1};
		Meal meal487 = new Meal(ingredients487, "Salzkartoffeln", Type.getType("Wahlmenü (Beilage)"), price487);
		meals78.add(meal487);

		List<Ingredient> ingredients488 = new ArrayList<>();
		ingredients488.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients488.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price488 = {0.65, 0.95, 1.15};
		Meal meal488 = new Meal(ingredients488, "Erbsengemüse", Type.getType("Wahlmenü (Gemüse)"), price488);
		meals78.add(meal488);

		List<Ingredient> ingredients489 = new ArrayList<>();
		ingredients489.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients489.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price489 = {0.65, 0.95, 1.15};
		Meal meal489 = new Meal(ingredients489, "Maisgemüse", Type.getType("Wahlmenü (Gemüse)"), price489);
		meals78.add(meal489);

		List<Ingredient> ingredients490 = new ArrayList<>();
		ingredients490.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients490.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients490.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price490 = {0.6, 0.9, 1.1};
		Meal meal490 = new Meal(ingredients490, "Lollo-Bionda-Salat, Honig-Senf-Dressing", Type.getType("Wahlmenü (Salat)"), price490);
		meals78.add(meal490);

		List<Ingredient> ingredients491 = new ArrayList<>();
		ingredients491.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients491.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price491 = {0.4, 0.6, 0.8};
		Meal meal491 = new Meal(ingredients491, "Tomaten-Paprikasuppe", Type.getType("Wahlmenü (Suppe)"), price491);
		meals78.add(meal491);

		List<Ingredient> ingredients492 = new ArrayList<>();
		ingredients492.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients492.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients492.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price492 = {0.8, 0.95, 1.1};
		Meal meal492 = new Meal(ingredients492, "Milchreis, Zimt und Zucker", Type.getType("Wahlmenü (Dessert)"), price492);
		meals78.add(meal492);

		map11.put(Day.getDay("Dienstag"), meals78);


		List<Meal> meals79 = new ArrayList<>();
		List<Ingredient> ingredients493 = new ArrayList<>();
		ingredients493.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients493.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients493.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients493.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		double[] price493 = {1.35, 2.8, 3.8};
		Meal meal493 = new Meal(ingredients493, "Chinesische Gemüsesuppe", Type.getType("Eintopf"), price493);
		meals79.add(meal493);

		List<Ingredient> ingredients494 = new ArrayList<>();
		ingredients494.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients494.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients494.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients494.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients494.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		double[] price494 = {1.85, 3.5, 4.3};
		Meal meal494 = new Meal(ingredients494, "Hackfleischpfanne mit Chinakohl, Reis", Type.getType("Tellergericht"), price494);
		meals79.add(meal494);

		List<Ingredient> ingredients495 = new ArrayList<>();
		ingredients495.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients495.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price495 = {1.8, 2.9, 3.3};
		Meal meal495 = new Meal(ingredients495, "Halbes Grillhähnchen", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price495);
		meals79.add(meal495);

		List<Ingredient> ingredients496 = new ArrayList<>();
		ingredients496.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients496.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients496.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price496 = {1.7, 2.8, 3.2};
		Meal meal496 = new Meal(ingredients496, "Champignon-Risotto-Bratling, Kressesauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price496);
		meals79.add(meal496);

		List<Ingredient> ingredients497 = new ArrayList<>();
		ingredients497.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients497.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients497.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients497.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price497 = {0.6, 0.9, 1.1};
		Meal meal497 = new Meal(ingredients497, "American Wedges", Type.getType("Wahlmenü (Beilage)"), price497);
		meals79.add(meal497);

		List<Ingredient> ingredients498 = new ArrayList<>();
		ingredients498.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients498.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price498 = {0.6, 0.9, 1.1};
		Meal meal498 = new Meal(ingredients498, "Risi-Pisi", Type.getType("Wahlmenü (Beilage)"), price498);
		meals79.add(meal498);

		List<Ingredient> ingredients499 = new ArrayList<>();
		ingredients499.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients499.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price499 = {0.65, 0.95, 1.15};
		Meal meal499 = new Meal(ingredients499, "Kaiserschoten", Type.getType("Wahlmenü (Gemüse)"), price499);
		meals79.add(meal499);

		List<Ingredient> ingredients500 = new ArrayList<>();
		ingredients500.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients500.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price500 = {0.65, 0.95, 1.15};
		Meal meal500 = new Meal(ingredients500, "Pariser Karotten", Type.getType("Wahlmenü (Gemüse)"), price500);
		meals79.add(meal500);

		List<Ingredient> ingredients501 = new ArrayList<>();
		ingredients501.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients501.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients501.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients501.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients501.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price501 = {0.6, 0.9, 1.1};
		Meal meal501 = new Meal(ingredients501, "Endiviensalat, Italien-Dressing", Type.getType("Wahlmenü (Salat)"), price501);
		meals79.add(meal501);

		List<Ingredient> ingredients502 = new ArrayList<>();
		ingredients502.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients502.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients502.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients502.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price502 = {0.4, 0.6, 0.8};
		Meal meal502 = new Meal(ingredients502, "Kartoffelsuppe", Type.getType("Wahlmenü (Suppe)"), price502);
		meals79.add(meal502);

		List<Ingredient> ingredients503 = new ArrayList<>();
		ingredients503.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients503.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients503.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price503 = {0.8, 0.95, 1.1};
		Meal meal503 = new Meal(ingredients503, "Erdbeerjoghurt", Type.getType("Wahlmenü (Dessert)"), price503);
		meals79.add(meal503);

		map11.put(Day.getDay("Mittwoch"), meals79);


		List<Meal> meals80 = new ArrayList<>();
		List<Ingredient> ingredients504 = new ArrayList<>();
		ingredients504.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients504.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients504.add(Ingredient.getIngredientFromName("Farbstoff"));
		ingredients504.add(Ingredient.getIngredientFromName("Konservierungsstoff"));
		ingredients504.add(Ingredient.getIngredientFromName("Phosphat"));
		ingredients504.add(Ingredient.getIngredientFromName("Nitritpökelsalz"));
		ingredients504.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price504 = {1.35, 2.8, 3.8};
		Meal meal504 = new Meal(ingredients504, "Kartoffel-Bärlaucheintopf mit Wienerle", Type.getType("Eintopf"), price504);
		meals80.add(meal504);

		List<Ingredient> ingredients505 = new ArrayList<>();
		ingredients505.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients505.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients505.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients505.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price505 = {1.85, 3.5, 4.3};
		Meal meal505 = new Meal(ingredients505, "Hausgemachte Pasta, Spargelragout in Rahm", Type.getType("Tellergericht"), price505);
		meals80.add(meal505);

		List<Ingredient> ingredients506 = new ArrayList<>();
		ingredients506.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients506.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients506.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients506.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients506.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price506 = {1.8, 2.9, 3.3};
		Meal meal506 = new Meal(ingredients506, "Rinder-Geschnetzeltes Stroganoff", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price506);
		meals80.add(meal506);

		List<Ingredient> ingredients507 = new ArrayList<>();
		ingredients507.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients507.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients507.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients507.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		ingredients507.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price507 = {1.8, 2.9, 3.3};
		Meal meal507 = new Meal(ingredients507, "Tofugemüse mit Rucola", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price507);
		meals80.add(meal507);

		List<Ingredient> ingredients508 = new ArrayList<>();
		ingredients508.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients508.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients508.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients508.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		double[] price508 = {0.6, 0.9, 1.1};
		Meal meal508 = new Meal(ingredients508, "Hausgemachte Spätzle", Type.getType("Wahlmenü (Beilage)"), price508);
		meals80.add(meal508);

		List<Ingredient> ingredients509 = new ArrayList<>();
		ingredients509.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients509.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price509 = {0.6, 0.9, 1.1};
		Meal meal509 = new Meal(ingredients509, "Paprikareis", Type.getType("Wahlmenü (Beilage)"), price509);
		meals80.add(meal509);

		List<Ingredient> ingredients510 = new ArrayList<>();
		ingredients510.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients510.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price510 = {0.65, 0.95, 1.15};
		Meal meal510 = new Meal(ingredients510, "Auberginengemüse", Type.getType("Wahlmenü (Gemüse)"), price510);
		meals80.add(meal510);

		List<Ingredient> ingredients511 = new ArrayList<>();
		ingredients511.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients511.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients511.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price511 = {0.65, 0.95, 1.15};
		Meal meal511 = new Meal(ingredients511, "Linsengemüse", Type.getType("Wahlmenü (Gemüse)"), price511);
		meals80.add(meal511);

		List<Ingredient> ingredients512 = new ArrayList<>();
		ingredients512.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients512.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients512.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		double[] price512 = {0.6, 0.9, 1.1};
		Meal meal512 = new Meal(ingredients512, "Kopfsalat, Tomaten-Vinaigrette", Type.getType("Wahlmenü (Salat)"), price512);
		meals80.add(meal512);

		List<Ingredient> ingredients513 = new ArrayList<>();
		ingredients513.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients513.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients513.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients513.add(Ingredient.getIngredientFromName("Schalenfrüchte"));
		double[] price513 = {0.4, 0.6, 0.8};
		Meal meal513 = new Meal(ingredients513, "Möhrensuppe mit Haselnüssen", Type.getType("Wahlmenü (Suppe)"), price513);
		meals80.add(meal513);

		List<Ingredient> ingredients514 = new ArrayList<>();
		ingredients514.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients514.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients514.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price514 = {0.8, 0.95, 1.1};
		Meal meal514 = new Meal(ingredients514, "Schlemmerquark mit Heidelbeersauce", Type.getType("Wahlmenü (Dessert)"), price514);
		meals80.add(meal514);

		map11.put(Day.getDay("Donnerstag"), meals80);


		List<Meal> meals81 = new ArrayList<>();
		List<Ingredient> ingredients515 = new ArrayList<>();
		ingredients515.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients515.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients515.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price515 = {1.35, 2.8, 3.8};
		Meal meal515 = new Meal(ingredients515, "Bunte Maissuppe", Type.getType("Eintopf"), price515);
		meals81.add(meal515);

		List<Ingredient> ingredients516 = new ArrayList<>();
		ingredients516.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients516.add(Ingredient.getIngredientFromName("Unbekannt"));
		ingredients516.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients516.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients516.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price516 = {1.85, 3.5, 4.3};
		Meal meal516 = new Meal(ingredients516, "Pizza Salami", Type.getType("Tellergericht"), price516);
		meals81.add(meal516);

		List<Ingredient> ingredients517 = new ArrayList<>();
		ingredients517.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients517.add(Ingredient.getIngredientFromName("Fisch und Fischerzeugnisse"));
		ingredients517.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients517.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price517 = {1.8, 2.9, 3.3};
		Meal meal517 = new Meal(ingredients517, "Seelachsfilet, Senfsauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price517);
		meals81.add(meal517);

		List<Ingredient> ingredients518 = new ArrayList<>();
		ingredients518.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients518.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients518.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients518.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients518.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients518.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price518 = {1.8, 2.9, 3.3};
		Meal meal518 = new Meal(ingredients518, "Gefüllte Käse-Paprika, Tomatensauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price518);
		meals81.add(meal518);

		List<Ingredient> ingredients519 = new ArrayList<>();
		ingredients519.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients519.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price519 = {0.6, 0.9, 1.1};
		Meal meal519 = new Meal(ingredients519, "Basmatireis", Type.getType("Wahlmenü (Beilage)"), price519);
		meals81.add(meal519);

		List<Ingredient> ingredients520 = new ArrayList<>();
		ingredients520.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients520.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients520.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients520.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price520 = {0.6, 0.9, 1.1};
		Meal meal520 = new Meal(ingredients520, "Kartoffelgratin", Type.getType("Wahlmenü (Beilage)"), price520);
		meals81.add(meal520);

		List<Ingredient> ingredients521 = new ArrayList<>();
		ingredients521.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients521.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients521.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price521 = {0.65, 0.95, 1.15};
		Meal meal521 = new Meal(ingredients521, "Blattspinat in Rahm", Type.getType("Wahlmenü (Gemüse)"), price521);
		meals81.add(meal521);

		List<Ingredient> ingredients522 = new ArrayList<>();
		ingredients522.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients522.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price522 = {0.65, 0.95, 1.15};
		Meal meal522 = new Meal(ingredients522, "Blumenkohlgemüse", Type.getType("Wahlmenü (Gemüse)"), price522);
		meals81.add(meal522);

		List<Ingredient> ingredients523 = new ArrayList<>();
		ingredients523.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price523 = {0.6, 0.9, 1.1};
		Meal meal523 = new Meal(ingredients523, "Mischsalat, Schnittlauch-Vinaigrette", Type.getType("Wahlmenü (Salat)"), price523);
		meals81.add(meal523);

		List<Ingredient> ingredients524 = new ArrayList<>();
		ingredients524.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients524.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price524 = {0.4, 0.6, 0.8};
		Meal meal524 = new Meal(ingredients524, "Spargelcremesuppe", Type.getType("Wahlmenü (Suppe)"), price524);
		meals81.add(meal524);

		List<Ingredient> ingredients525 = new ArrayList<>();
		ingredients525.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients525.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients525.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price525 = {0.8, 0.95, 1.1};
		Meal meal525 = new Meal(ingredients525, "Orangenjoghurt mit Flakes", Type.getType("Wahlmenü (Dessert)"), price525);
		meals81.add(meal525);

		map11.put(Day.getDay("Freitag"), meals81);


		List<Meal> meals82 = new ArrayList<>();
		map11.put(Day.getDay("Samstag"), meals82);


		List<Meal> meals83 = new ArrayList<>();
		map11.put(Day.getDay("Sonntag"), meals83);


		
	}

	private static void fillContineDummy(Map<Week, Map<Mensa, Map<Day, List<Meal>>>> mealsDummy){
		Map<Day, List<Meal>> map3 = mealsDummy.get(Week.getWeek("Aktuelle")).get(Mensa.getMensa("Contine"));

		List<Meal> meals21 = new ArrayList<>();
		List<Ingredient> ingredients134 = new ArrayList<>();
		ingredients134.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients134.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients134.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price134 = {1.35, 2.8, 3.8};
		Meal meal134 = new Meal(ingredients134, "Gulascheintopf mit Möhren und Kartoffeln", Type.getType("Eintopf"), price134);
		meals21.add(meal134);

		List<Ingredient> ingredients135 = new ArrayList<>();
		ingredients135.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients135.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients135.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price135 = {1.85, 3.5, 4.3};
		Meal meal135 = new Meal(ingredients135, "Riesenrösti mit Rahmchampignons", Type.getType("Tellergericht"), price135);
		meals21.add(meal135);

		List<Ingredient> ingredients136 = new ArrayList<>();
		ingredients136.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients136.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients136.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients136.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price136 = {1.8, 2.9, 3.3};
		Meal meal136 = new Meal(ingredients136, "Putensteak, Sauce Hollandaise", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price136);
		meals21.add(meal136);

		List<Ingredient> ingredients137 = new ArrayList<>();
		ingredients137.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients137.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients137.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients137.add(Ingredient.getIngredientFromName("Sesamsamen und Sesamsamenerzeugnisse"));
		double[] price137 = {1.7, 2.8, 3.2};
		Meal meal137 = new Meal(ingredients137, "Linsen-Mangold-Curry", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price137);
		meals21.add(meal137);

		List<Ingredient> ingredients138 = new ArrayList<>();
		ingredients138.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients138.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients138.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients138.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients138.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients138.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price138 = {1.8, 2.9, 3.3};
		Meal meal138 = new Meal(ingredients138, "Ratatouille-Tarte", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price138);
		meals21.add(meal138);

		List<Ingredient> ingredients139 = new ArrayList<>();
		ingredients139.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients139.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients139.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients139.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price139 = {0.6, 0.9, 1.1};
		Meal meal139 = new Meal(ingredients139, "Gemüse-Couscous", Type.getType("Wahlmenü (Beilage)"), price139);
		meals21.add(meal139);

		List<Ingredient> ingredients140 = new ArrayList<>();
		ingredients140.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients140.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price140 = {0.6, 0.9, 1.1};
		Meal meal140 = new Meal(ingredients140, "Reis", Type.getType("Wahlmenü (Beilage)"), price140);
		meals21.add(meal140);

		List<Ingredient> ingredients141 = new ArrayList<>();
		ingredients141.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price141 = {0.65, 0.95, 1.15};
		Meal meal141 = new Meal(ingredients141, "Tagesangebot", Type.getType("Wahlmenü (Beilage)"), price141);
		meals21.add(meal141);

		List<Ingredient> ingredients142 = new ArrayList<>();
		ingredients142.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients142.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price142 = {0.65, 0.95, 1.15};
		Meal meal142 = new Meal(ingredients142, "Brokkoli", Type.getType("Wahlmenü (Gemüse)"), price142);
		meals21.add(meal142);

		List<Ingredient> ingredients143 = new ArrayList<>();
		ingredients143.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients143.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price143 = {0.65, 0.95, 1.15};
		Meal meal143 = new Meal(ingredients143, "Kohlrabi", Type.getType("Wahlmenü (Gemüse)"), price143);
		meals21.add(meal143);

		List<Ingredient> ingredients144 = new ArrayList<>();
		ingredients144.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price144 = {0.65, 0.95, 1.15};
		Meal meal144 = new Meal(ingredients144, "Tagesangebot", Type.getType("Wahlmenü (Gemüse)"), price144);
		meals21.add(meal144);

		List<Ingredient> ingredients145 = new ArrayList<>();
		ingredients145.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients145.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price145 = {0.6, 0.9, 1.1};
		Meal meal145 = new Meal(ingredients145, "Tomatensalat", Type.getType("Wahlmenü (Salat)"), price145);
		meals21.add(meal145);

		List<Ingredient> ingredients146 = new ArrayList<>();
		ingredients146.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients146.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients146.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price146 = {0.4, 0.6, 0.8};
		Meal meal146 = new Meal(ingredients146, "Blumenkohlsuppe", Type.getType("Wahlmenü (Suppe)"), price146);
		meals21.add(meal146);

		List<Ingredient> ingredients147 = new ArrayList<>();
		ingredients147.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients147.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients147.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price147 = {0.8, 0.95, 1.1};
		Meal meal147 = new Meal(ingredients147, "Beerenquark", Type.getType("Wahlmenü (Dessert)"), price147);
		meals21.add(meal147);

		map3.put(Day.getDay("Montag"), meals21);


		List<Meal> meals22 = new ArrayList<>();
		List<Ingredient> ingredients148 = new ArrayList<>();
		ingredients148.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients148.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients148.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients148.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price148 = {1.35, 2.8, 3.8};
		Meal meal148 = new Meal(ingredients148, "Spargeleintopf", Type.getType("Eintopf"), price148);
		meals22.add(meal148);

		List<Ingredient> ingredients149 = new ArrayList<>();
		ingredients149.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients149.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients149.add(Ingredient.getIngredientFromName("Farbstoff"));
		ingredients149.add(Ingredient.getIngredientFromName("Konservierungsstoff"));
		ingredients149.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients149.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price149 = {1.85, 3.5, 4.3};
		Meal meal149 = new Meal(ingredients149, "Hausgemachte Pasta, Hähnchen-Paprika-Ragout, geriebener Hartkäse", Type.getType("Tellergericht"), price149);
		meals22.add(meal149);

		List<Ingredient> ingredients150 = new ArrayList<>();
		ingredients150.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients150.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients150.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients150.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price150 = {1.8, 2.9, 3.3};
		Meal meal150 = new Meal(ingredients150, "Allgäuer Käsefrikadelle, Créme-fraîche-Sauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price150);
		meals22.add(meal150);

		List<Ingredient> ingredients151 = new ArrayList<>();
		ingredients151.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients151.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients151.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price151 = {1.8, 2.9, 3.3};
		Meal meal151 = new Meal(ingredients151, "Back-Frischkäse mit Preiselbeeren", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price151);
		meals22.add(meal151);

		List<Ingredient> ingredients152 = new ArrayList<>();
		ingredients152.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients152.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients152.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients152.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		double[] price152 = {0.6, 0.9, 1.1};
		Meal meal152 = new Meal(ingredients152, "Hausgemachte Kräuterspätzle", Type.getType("Wahlmenü (Beilage)"), price152);
		meals22.add(meal152);

		List<Ingredient> ingredients153 = new ArrayList<>();
		ingredients153.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients153.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price153 = {0.6, 0.9, 1.1};
		Meal meal153 = new Meal(ingredients153, "Salzkartoffeln", Type.getType("Wahlmenü (Beilage)"), price153);
		meals22.add(meal153);

		List<Ingredient> ingredients154 = new ArrayList<>();
		ingredients154.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price154 = {0.65, 0.95, 1.15};
		Meal meal154 = new Meal(ingredients154, "Tagesangebot", Type.getType("Wahlmenü (Beilage)"), price154);
		meals22.add(meal154);

		List<Ingredient> ingredients155 = new ArrayList<>();
		ingredients155.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients155.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price155 = {0.65, 0.95, 1.15};
		Meal meal155 = new Meal(ingredients155, "Karottengemüse", Type.getType("Wahlmenü (Gemüse)"), price155);
		meals22.add(meal155);

		List<Ingredient> ingredients156 = new ArrayList<>();
		ingredients156.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients156.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price156 = {0.65, 0.95, 1.15};
		Meal meal156 = new Meal(ingredients156, "Spitzkohlgemüse", Type.getType("Wahlmenü (Gemüse)"), price156);
		meals22.add(meal156);

		List<Ingredient> ingredients157 = new ArrayList<>();
		ingredients157.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price157 = {0.65, 0.95, 1.15};
		Meal meal157 = new Meal(ingredients157, "Tagesangebot", Type.getType("Wahlmenü (Gemüse)"), price157);
		meals22.add(meal157);

		List<Ingredient> ingredients158 = new ArrayList<>();
		ingredients158.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients158.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients158.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients158.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients158.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients158.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price158 = {0.6, 0.9, 1.1};
		Meal meal158 = new Meal(ingredients158, "Eisbergsalat, Dressing Sylter Art", Type.getType("Wahlmenü (Salat)"), price158);
		meals22.add(meal158);

		List<Ingredient> ingredients159 = new ArrayList<>();
		ingredients159.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients159.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients159.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients159.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price159 = {0.4, 0.6, 0.8};
		Meal meal159 = new Meal(ingredients159, "Spinatcremesuppe", Type.getType("Wahlmenü (Suppe)"), price159);
		meals22.add(meal159);

		List<Ingredient> ingredients160 = new ArrayList<>();
		ingredients160.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients160.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients160.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price160 = {0.8, 0.95, 1.1};
		Meal meal160 = new Meal(ingredients160, "Stracciatella-Joghurt", Type.getType("Wahlmenü (Dessert)"), price160);
		meals22.add(meal160);

		map3.put(Day.getDay("Dienstag"), meals22);


		List<Meal> meals23 = new ArrayList<>();
		List<Ingredient> ingredients161 = new ArrayList<>();
		ingredients161.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients161.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients161.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients161.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients161.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		double[] price161 = {1.35, 2.8, 3.8};
		Meal meal161 = new Meal(ingredients161, "Barbecueeintopf", Type.getType("Eintopf"), price161);
		meals23.add(meal161);

		List<Ingredient> ingredients162 = new ArrayList<>();
		ingredients162.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients162.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients162.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients162.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients162.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price162 = {1.85, 3.5, 4.3};
		Meal meal162 = new Meal(ingredients162, "Eier in Senfsauce, Salzkartoffeln", Type.getType("Tellergericht"), price162);
		meals23.add(meal162);

		List<Ingredient> ingredients163 = new ArrayList<>();
		ingredients163.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients163.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients163.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients163.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients163.add(Ingredient.getIngredientFromName("Geschmacksverstärker"));
		ingredients163.add(Ingredient.getIngredientFromName("Nitritpökelsalz"));
		ingredients163.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients163.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price163 = {1.8, 2.9, 3.3};
		Meal meal163 = new Meal(ingredients163, "Kasselerbraten, Rahmsauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price163);
		meals23.add(meal163);

		List<Ingredient> ingredients164 = new ArrayList<>();
		ingredients164.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients164.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients164.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price164 = {1.7, 2.8, 3.2};
		Meal meal164 = new Meal(ingredients164, "Pizza-Polenta, Tomatensugo", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price164);
		meals23.add(meal164);

		List<Ingredient> ingredients165 = new ArrayList<>();
		ingredients165.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients165.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients165.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price165 = {0.6, 0.9, 1.1};
		Meal meal165 = new Meal(ingredients165, "Kartoffelpüree", Type.getType("Wahlmenü (Beilage)"), price165);
		meals23.add(meal165);

		List<Ingredient> ingredients166 = new ArrayList<>();
		ingredients166.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price166 = {0.6, 0.9, 1.1};
		Meal meal166 = new Meal(ingredients166, "Kroketten", Type.getType("Wahlmenü (Beilage)"), price166);
		meals23.add(meal166);

		List<Ingredient> ingredients167 = new ArrayList<>();
		ingredients167.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price167 = {0.6, 0.9, 1.1};
		Meal meal167 = new Meal(ingredients167, "Tagesangebot", Type.getType("Wahlmenü (Beilage)"), price167);
		meals23.add(meal167);

		List<Ingredient> ingredients168 = new ArrayList<>();
		ingredients168.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients168.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price168 = {0.65, 0.95, 1.15};
		Meal meal168 = new Meal(ingredients168, "Champignongemüse", Type.getType("Wahlmenü (Gemüse)"), price168);
		meals23.add(meal168);

		List<Ingredient> ingredients169 = new ArrayList<>();
		ingredients169.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients169.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price169 = {0.65, 0.95, 1.15};
		Meal meal169 = new Meal(ingredients169, "Romanesco", Type.getType("Wahlmenü (Gemüse)"), price169);
		meals23.add(meal169);

		List<Ingredient> ingredients170 = new ArrayList<>();
		ingredients170.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price170 = {0.65, 0.95, 1.15};
		Meal meal170 = new Meal(ingredients170, "Tagesangebot", Type.getType("Wahlmenü (Gemüse)"), price170);
		meals23.add(meal170);

		List<Ingredient> ingredients171 = new ArrayList<>();
		ingredients171.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients171.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients171.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price171 = {0.6, 0.9, 1.1};
		Meal meal171 = new Meal(ingredients171, "Lollo-Rosso-Salat, hausgemachtes Balsamicodressing", Type.getType("Wahlmenü (Salat)"), price171);
		meals23.add(meal171);

		List<Ingredient> ingredients172 = new ArrayList<>();
		ingredients172.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients172.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price172 = {0.4, 0.6, 0.8};
		Meal meal172 = new Meal(ingredients172, "Currysuppe mit Kokos", Type.getType("Wahlmenü (Suppe)"), price172);
		meals23.add(meal172);

		List<Ingredient> ingredients173 = new ArrayList<>();
		ingredients173.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients173.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients173.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price173 = {0.8, 0.95, 1.1};
		Meal meal173 = new Meal(ingredients173, "Karamellpudding", Type.getType("Wahlmenü (Dessert)"), price173);
		meals23.add(meal173);

		map3.put(Day.getDay("Mittwoch"), meals23);


		List<Meal> meals24 = new ArrayList<>();
		List<Ingredient> ingredients174 = new ArrayList<>();
		ingredients174.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients174.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients174.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price174 = {1.35, 2.8, 3.8};
		Meal meal174 = new Meal(ingredients174, "Gemüseeintopf mit saurer Sahne", Type.getType("Eintopf"), price174);
		meals24.add(meal174);

		List<Ingredient> ingredients175 = new ArrayList<>();
		ingredients175.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients175.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients175.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients175.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients175.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients175.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		ingredients175.add(Ingredient.getIngredientFromName("Sesamsamen und Sesamsamenerzeugnisse"));
		double[] price175 = {1.85, 3.5, 4.3};
		Meal meal175 = new Meal(ingredients175, "Gewürzburger, Krautsalat, American Wedges", Type.getType("Tellergericht"), price175);
		meals24.add(meal175);

		List<Ingredient> ingredients176 = new ArrayList<>();
		ingredients176.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients176.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients176.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients176.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		double[] price176 = {1.8, 2.9, 3.3};
		Meal meal176 = new Meal(ingredients176, "Hähnchenkeule Marengo", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price176);
		meals24.add(meal176);

		List<Ingredient> ingredients177 = new ArrayList<>();
		ingredients177.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients177.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients177.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients177.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price177 = {1.7, 2.8, 3.2};
		Meal meal177 = new Meal(ingredients177, "Möhren-Zucchini-Puffer, Kräuterdip", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price177);
		meals24.add(meal177);

		List<Ingredient> ingredients178 = new ArrayList<>();
		ingredients178.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients178.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		double[] price178 = {0.6, 0.9, 1.1};
		Meal meal178 = new Meal(ingredients178, "Hausgemachte Currypasta", Type.getType("Wahlmenü (Beilage)"), price178);
		meals24.add(meal178);

		List<Ingredient> ingredients179 = new ArrayList<>();
		ingredients179.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients179.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price179 = {0.6, 0.9, 1.1};
		Meal meal179 = new Meal(ingredients179, "Petersilienkartoffeln", Type.getType("Wahlmenü (Beilage)"), price179);
		meals24.add(meal179);

		List<Ingredient> ingredients180 = new ArrayList<>();
		ingredients180.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price180 = {0.6, 0.9, 1.1};
		Meal meal180 = new Meal(ingredients180, "Tagesangebot", Type.getType("Wahlmenü (Beilage)"), price180);
		meals24.add(meal180);

		List<Ingredient> ingredients181 = new ArrayList<>();
		ingredients181.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients181.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price181 = {0.65, 0.95, 1.15};
		Meal meal181 = new Meal(ingredients181, "Blumenkohlgemüse", Type.getType("Wahlmenü (Gemüse)"), price181);
		meals24.add(meal181);

		List<Ingredient> ingredients182 = new ArrayList<>();
		ingredients182.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients182.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price182 = {0.65, 0.95, 1.15};
		Meal meal182 = new Meal(ingredients182, "Maisgemüse", Type.getType("Wahlmenü (Gemüse)"), price182);
		meals24.add(meal182);

		List<Ingredient> ingredients183 = new ArrayList<>();
		ingredients183.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price183 = {0.65, 0.95, 1.15};
		Meal meal183 = new Meal(ingredients183, "Tagesangebot", Type.getType("Wahlmenü (Gemüse)"), price183);
		meals24.add(meal183);

		List<Ingredient> ingredients184 = new ArrayList<>();
		ingredients184.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients184.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients184.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price184 = {0.6, 0.9, 1.1};
		Meal meal184 = new Meal(ingredients184, "Mischsalat, Curry-Dressing", Type.getType("Wahlmenü (Salat)"), price184);
		meals24.add(meal184);

		List<Ingredient> ingredients185 = new ArrayList<>();
		ingredients185.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients185.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price185 = {0.4, 0.6, 0.8};
		Meal meal185 = new Meal(ingredients185, "Spargelcremesuppe", Type.getType("Wahlmenü (Suppe)"), price185);
		meals24.add(meal185);

		List<Ingredient> ingredients186 = new ArrayList<>();
		ingredients186.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients186.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price186 = {0.8, 0.95, 1.1};
		Meal meal186 = new Meal(ingredients186, "Aprikosenquark", Type.getType("Wahlmenü (Dessert)"), price186);
		meals24.add(meal186);

		map3.put(Day.getDay("Donnerstag"), meals24);


		List<Meal> meals25 = new ArrayList<>();
		map3.put(Day.getDay("Freitag"), meals25);


		List<Meal> meals26 = new ArrayList<>();
		map3.put(Day.getDay("Samstag"), meals26);


		List<Meal> meals27 = new ArrayList<>();
		map3.put(Day.getDay("Sonntag"), meals27);


		Map<Day, List<Meal>> map12 = mealsDummy.get(Week.getWeek("Naechste")).get(Mensa.getMensa("Contine"));

		List<Meal> meals84 = new ArrayList<>();
		List<Ingredient> ingredients526 = new ArrayList<>();
		ingredients526.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients526.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients526.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		double[] price526 = {1.35, 2.8, 3.8};
		Meal meal526 = new Meal(ingredients526, "Feuriger Bohneneintopf", Type.getType("Eintopf"), price526);
		meals84.add(meal526);

		List<Ingredient> ingredients527 = new ArrayList<>();
		ingredients527.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients527.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients527.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price527 = {1.85, 3.5, 4.3};
		Meal meal527 = new Meal(ingredients527, "Nürnberger Rostbratwürstchen, Kartoffelpüree, Wonnekraut", Type.getType("Tellergericht"), price527);
		meals84.add(meal527);

		List<Ingredient> ingredients528 = new ArrayList<>();
		ingredients528.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients528.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients528.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients528.add(Ingredient.getIngredientFromName("Konservierungsstoff"));
		ingredients528.add(Ingredient.getIngredientFromName("Antioxidationsmittel"));
		ingredients528.add(Ingredient.getIngredientFromName("Phosphat"));
		ingredients528.add(Ingredient.getIngredientFromName("Nitritpökelsalz"));
		ingredients528.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients528.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		ingredients528.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price528 = {1.8, 2.9, 3.3};
		Meal meal528 = new Meal(ingredients528, "Rinderroulade mit Specksauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price528);
		meals84.add(meal528);

		List<Ingredient> ingredients529 = new ArrayList<>();
		ingredients529.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients529.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients529.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients529.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price529 = {1.8, 2.9, 3.3};
		Meal meal529 = new Meal(ingredients529, "Vegetarisches Schnitzel, Karotten-Sahne-Sauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price529);
		meals84.add(meal529);

		List<Ingredient> ingredients530 = new ArrayList<>();
		ingredients530.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients530.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients530.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price530 = {0.6, 0.9, 1.1};
		Meal meal530 = new Meal(ingredients530, "Bechamelkartoffeln", Type.getType("Wahlmenü (Beilage)"), price530);
		meals84.add(meal530);

		List<Ingredient> ingredients531 = new ArrayList<>();
		ingredients531.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients531.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients531.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		double[] price531 = {0.6, 0.9, 1.1};
		Meal meal531 = new Meal(ingredients531, "Hausgemachte Pasta", Type.getType("Wahlmenü (Beilage)"), price531);
		meals84.add(meal531);

		List<Ingredient> ingredients532 = new ArrayList<>();
		ingredients532.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price532 = {0.6, 0.9, 1.1};
		Meal meal532 = new Meal(ingredients532, "Tagesangebot", Type.getType("Wahlmenü (Beilage)"), price532);
		meals84.add(meal532);

		List<Ingredient> ingredients533 = new ArrayList<>();
		ingredients533.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price533 = {0.65, 0.95, 1.15};
		Meal meal533 = new Meal(ingredients533, "Bohnengemüse", Type.getType("Wahlmenü (Gemüse)"), price533);
		meals84.add(meal533);

		List<Ingredient> ingredients534 = new ArrayList<>();
		ingredients534.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients534.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients534.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price534 = {0.65, 0.95, 1.15};
		Meal meal534 = new Meal(ingredients534, "Rahmwirsing", Type.getType("Wahlmenü (Gemüse)"), price534);
		meals84.add(meal534);

		List<Ingredient> ingredients535 = new ArrayList<>();
		ingredients535.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price535 = {0.65, 0.95, 1.15};
		Meal meal535 = new Meal(ingredients535, "Tagesangebot", Type.getType("Wahlmenü (Gemüse)"), price535);
		meals84.add(meal535);

		List<Ingredient> ingredients536 = new ArrayList<>();
		ingredients536.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price536 = {0.6, 0.9, 1.1};
		Meal meal536 = new Meal(ingredients536, "Gurkensalat", Type.getType("Wahlmenü (Salat)"), price536);
		meals84.add(meal536);

		List<Ingredient> ingredients537 = new ArrayList<>();
		ingredients537.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients537.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients537.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price537 = {0.4, 0.6, 0.8};
		Meal meal537 = new Meal(ingredients537, "Tomatensuppe", Type.getType("Wahlmenü (Suppe)"), price537);
		meals84.add(meal537);

		List<Ingredient> ingredients538 = new ArrayList<>();
		ingredients538.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients538.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price538 = {0.8, 0.95, 1.1};
		Meal meal538 = new Meal(ingredients538, "Obstsalat", Type.getType("Wahlmenü (Dessert)"), price538);
		meals84.add(meal538);

		map12.put(Day.getDay("Montag"), meals84);


		List<Meal> meals85 = new ArrayList<>();
		List<Ingredient> ingredients539 = new ArrayList<>();
		ingredients539.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients539.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients539.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		double[] price539 = {1.35, 2.8, 3.8};
		Meal meal539 = new Meal(ingredients539, "Nudelsuppe mit Rindfleisch, mit hausgemachter Pasta", Type.getType("Eintopf"), price539);
		meals85.add(meal539);

		List<Ingredient> ingredients540 = new ArrayList<>();
		ingredients540.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients540.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients540.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		double[] price540 = {1.85, 3.5, 4.3};
		Meal meal540 = new Meal(ingredients540, "Kartoffelpuffer, hausgemachtes Apfelmus", Type.getType("Tellergericht"), price540);
		meals85.add(meal540);

		List<Ingredient> ingredients541 = new ArrayList<>();
		ingredients541.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients541.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients541.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients541.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients541.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients541.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients541.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price541 = {1.8, 2.9, 3.3};
		Meal meal541 = new Meal(ingredients541, "Frikadelle, Rahmsauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price541);
		meals85.add(meal541);

		List<Ingredient> ingredients542 = new ArrayList<>();
		ingredients542.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients542.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients542.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price542 = {1.7, 2.8, 3.2};
		Meal meal542 = new Meal(ingredients542, "Gemüsegratin mit Kräutern, Bechamelsauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price542);
		meals85.add(meal542);

		List<Ingredient> ingredients543 = new ArrayList<>();
		ingredients543.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients543.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients543.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients543.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		double[] price543 = {0.6, 0.9, 1.1};
		Meal meal543 = new Meal(ingredients543, "Hausgemachte Schupfnudeln", Type.getType("Wahlmenü (Beilage)"), price543);
		meals85.add(meal543);

		List<Ingredient> ingredients544 = new ArrayList<>();
		ingredients544.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients544.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price544 = {0.6, 0.9, 1.1};
		Meal meal544 = new Meal(ingredients544, "Salzkartoffeln", Type.getType("Wahlmenü (Beilage)"), price544);
		meals85.add(meal544);

		List<Ingredient> ingredients545 = new ArrayList<>();
		ingredients545.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price545 = {0.6, 0.9, 1.1};
		Meal meal545 = new Meal(ingredients545, "Tagesangebot", Type.getType("Wahlmenü (Beilage)"), price545);
		meals85.add(meal545);

		List<Ingredient> ingredients546 = new ArrayList<>();
		ingredients546.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients546.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price546 = {0.65, 0.95, 1.15};
		Meal meal546 = new Meal(ingredients546, "Erbsengemüse", Type.getType("Wahlmenü (Gemüse)"), price546);
		meals85.add(meal546);

		List<Ingredient> ingredients547 = new ArrayList<>();
		ingredients547.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients547.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price547 = {0.65, 0.95, 1.15};
		Meal meal547 = new Meal(ingredients547, "Maisgemüse", Type.getType("Wahlmenü (Gemüse)"), price547);
		meals85.add(meal547);

		List<Ingredient> ingredients548 = new ArrayList<>();
		ingredients548.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price548 = {0.65, 0.95, 1.15};
		Meal meal548 = new Meal(ingredients548, "Tagesangebot", Type.getType("Wahlmenü (Gemüse)"), price548);
		meals85.add(meal548);

		List<Ingredient> ingredients549 = new ArrayList<>();
		ingredients549.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients549.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients549.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price549 = {0.6, 0.9, 1.1};
		Meal meal549 = new Meal(ingredients549, "Lollo-Bionda-Salat, Honig-Senf-Dressing", Type.getType("Wahlmenü (Salat)"), price549);
		meals85.add(meal549);

		List<Ingredient> ingredients550 = new ArrayList<>();
		ingredients550.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients550.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price550 = {0.4, 0.6, 0.8};
		Meal meal550 = new Meal(ingredients550, "Tomaten-Paprikasuppe", Type.getType("Wahlmenü (Suppe)"), price550);
		meals85.add(meal550);

		List<Ingredient> ingredients551 = new ArrayList<>();
		ingredients551.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients551.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients551.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price551 = {0.8, 0.95, 1.1};
		Meal meal551 = new Meal(ingredients551, "Milchreis, Zimt und Zucker", Type.getType("Wahlmenü (Dessert)"), price551);
		meals85.add(meal551);

		map12.put(Day.getDay("Dienstag"), meals85);


		List<Meal> meals86 = new ArrayList<>();
		List<Ingredient> ingredients552 = new ArrayList<>();
		ingredients552.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients552.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients552.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients552.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		double[] price552 = {1.35, 2.8, 3.8};
		Meal meal552 = new Meal(ingredients552, "Chinesische Gemüsesuppe", Type.getType("Eintopf"), price552);
		meals86.add(meal552);

		List<Ingredient> ingredients553 = new ArrayList<>();
		ingredients553.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients553.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients553.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients553.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients553.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		double[] price553 = {1.85, 3.5, 4.3};
		Meal meal553 = new Meal(ingredients553, "Hackfleischpfanne mit Chinakohl, Reis", Type.getType("Tellergericht"), price553);
		meals86.add(meal553);

		List<Ingredient> ingredients554 = new ArrayList<>();
		ingredients554.add(Ingredient.getIngredientFromName("Geflügelfleisch"));
		ingredients554.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price554 = {1.8, 2.9, 3.3};
		Meal meal554 = new Meal(ingredients554, "Halbes Grillhähnchen", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price554);
		meals86.add(meal554);

		List<Ingredient> ingredients555 = new ArrayList<>();
		ingredients555.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients555.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients555.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price555 = {1.7, 2.8, 3.2};
		Meal meal555 = new Meal(ingredients555, "Champignon-Risotto-Bratling, Kressesauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price555);
		meals86.add(meal555);

		List<Ingredient> ingredients556 = new ArrayList<>();
		ingredients556.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients556.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients556.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients556.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price556 = {0.6, 0.9, 1.1};
		Meal meal556 = new Meal(ingredients556, "American Wedges", Type.getType("Wahlmenü (Beilage)"), price556);
		meals86.add(meal556);

		List<Ingredient> ingredients557 = new ArrayList<>();
		ingredients557.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients557.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price557 = {0.6, 0.9, 1.1};
		Meal meal557 = new Meal(ingredients557, "Risi-Pisi", Type.getType("Wahlmenü (Beilage)"), price557);
		meals86.add(meal557);

		List<Ingredient> ingredients558 = new ArrayList<>();
		ingredients558.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price558 = {0.6, 0.9, 1.1};
		Meal meal558 = new Meal(ingredients558, "Tagesangebot", Type.getType("Wahlmenü (Beilage)"), price558);
		meals86.add(meal558);

		List<Ingredient> ingredients559 = new ArrayList<>();
		ingredients559.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients559.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price559 = {0.65, 0.95, 1.15};
		Meal meal559 = new Meal(ingredients559, "Kaiserschoten", Type.getType("Wahlmenü (Gemüse)"), price559);
		meals86.add(meal559);

		List<Ingredient> ingredients560 = new ArrayList<>();
		ingredients560.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients560.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price560 = {0.65, 0.95, 1.15};
		Meal meal560 = new Meal(ingredients560, "Pariser Karotten", Type.getType("Wahlmenü (Gemüse)"), price560);
		meals86.add(meal560);

		List<Ingredient> ingredients561 = new ArrayList<>();
		ingredients561.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price561 = {0.65, 0.95, 1.15};
		Meal meal561 = new Meal(ingredients561, "Tagesangebot", Type.getType("Wahlmenü (Gemüse)"), price561);
		meals86.add(meal561);

		List<Ingredient> ingredients562 = new ArrayList<>();
		ingredients562.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients562.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients562.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients562.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients562.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price562 = {0.6, 0.9, 1.1};
		Meal meal562 = new Meal(ingredients562, "Endiviensalat, Italien-Dressing", Type.getType("Wahlmenü (Salat)"), price562);
		meals86.add(meal562);

		List<Ingredient> ingredients563 = new ArrayList<>();
		ingredients563.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients563.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients563.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients563.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price563 = {0.4, 0.6, 0.8};
		Meal meal563 = new Meal(ingredients563, "Kartoffelsuppe", Type.getType("Wahlmenü (Suppe)"), price563);
		meals86.add(meal563);

		List<Ingredient> ingredients564 = new ArrayList<>();
		ingredients564.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients564.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients564.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price564 = {0.8, 0.95, 1.1};
		Meal meal564 = new Meal(ingredients564, "Erdbeerjoghurt", Type.getType("Wahlmenü (Dessert)"), price564);
		meals86.add(meal564);

		map12.put(Day.getDay("Mittwoch"), meals86);


		List<Meal> meals87 = new ArrayList<>();
		List<Ingredient> ingredients565 = new ArrayList<>();
		ingredients565.add(Ingredient.getIngredientFromName("Schweinefleisch"));
		ingredients565.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients565.add(Ingredient.getIngredientFromName("Farbstoff"));
		ingredients565.add(Ingredient.getIngredientFromName("Konservierungsstoff"));
		ingredients565.add(Ingredient.getIngredientFromName("Phosphat"));
		ingredients565.add(Ingredient.getIngredientFromName("Nitritpökelsalz"));
		ingredients565.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price565 = {1.35, 2.8, 3.8};
		Meal meal565 = new Meal(ingredients565, "Kartoffel-Bärlaucheintopf mit Wienerle", Type.getType("Eintopf"), price565);
		meals87.add(meal565);

		List<Ingredient> ingredients566 = new ArrayList<>();
		ingredients566.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients566.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients566.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients566.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price566 = {1.85, 3.5, 4.3};
		Meal meal566 = new Meal(ingredients566, "Hausgemachte Pasta, Spargelragout in Rahm", Type.getType("Tellergericht"), price566);
		meals87.add(meal566);

		List<Ingredient> ingredients567 = new ArrayList<>();
		ingredients567.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients567.add(Ingredient.getIngredientFromName("mit Alkohol"));
		ingredients567.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients567.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients567.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price567 = {1.8, 2.9, 3.3};
		Meal meal567 = new Meal(ingredients567, "Rinder-Geschnetzeltes Stroganoff", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price567);
		meals87.add(meal567);

		List<Ingredient> ingredients568 = new ArrayList<>();
		ingredients568.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients568.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients568.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients568.add(Ingredient.getIngredientFromName("Soja und Sojaerzeugnisse"));
		ingredients568.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price568 = {1.8, 2.9, 3.3};
		Meal meal568 = new Meal(ingredients568, "Tofugemüse mit Rucola", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price568);
		meals87.add(meal568);

		List<Ingredient> ingredients569 = new ArrayList<>();
		ingredients569.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients569.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients569.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients569.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		double[] price569 = {0.6, 0.9, 1.1};
		Meal meal569 = new Meal(ingredients569, "Hausgemachte Spätzle", Type.getType("Wahlmenü (Beilage)"), price569);
		meals87.add(meal569);

		List<Ingredient> ingredients570 = new ArrayList<>();
		ingredients570.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients570.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price570 = {0.6, 0.9, 1.1};
		Meal meal570 = new Meal(ingredients570, "Paprikareis", Type.getType("Wahlmenü (Beilage)"), price570);
		meals87.add(meal570);

		List<Ingredient> ingredients571 = new ArrayList<>();
		ingredients571.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price571 = {0.6, 0.9, 1.1};
		Meal meal571 = new Meal(ingredients571, "Tagesangebot", Type.getType("Wahlmenü (Beilage)"), price571);
		meals87.add(meal571);

		List<Ingredient> ingredients572 = new ArrayList<>();
		ingredients572.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients572.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price572 = {0.65, 0.95, 1.15};
		Meal meal572 = new Meal(ingredients572, "Auberginengemüse", Type.getType("Wahlmenü (Gemüse)"), price572);
		meals87.add(meal572);

		List<Ingredient> ingredients573 = new ArrayList<>();
		ingredients573.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients573.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients573.add(Ingredient.getIngredientFromName("Sellerie und Sellerieerzeugnisse"));
		double[] price573 = {0.65, 0.95, 1.15};
		Meal meal573 = new Meal(ingredients573, "Linsengemüse", Type.getType("Wahlmenü (Gemüse)"), price573);
		meals87.add(meal573);

		List<Ingredient> ingredients574 = new ArrayList<>();
		ingredients574.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price574 = {0.65, 0.95, 1.15};
		Meal meal574 = new Meal(ingredients574, "Tagesangebot", Type.getType("Wahlmenü (Gemüse)"), price574);
		meals87.add(meal574);

		List<Ingredient> ingredients575 = new ArrayList<>();
		ingredients575.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients575.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients575.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		double[] price575 = {0.6, 0.9, 1.1};
		Meal meal575 = new Meal(ingredients575, "Kopfsalat, Tomaten-Vinaigrette", Type.getType("Wahlmenü (Salat)"), price575);
		meals87.add(meal575);

		List<Ingredient> ingredients576 = new ArrayList<>();
		ingredients576.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients576.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients576.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients576.add(Ingredient.getIngredientFromName("Schalenfrüchte"));
		double[] price576 = {0.4, 0.6, 0.8};
		Meal meal576 = new Meal(ingredients576, "Möhrensuppe mit Haselnüssen", Type.getType("Wahlmenü (Suppe)"), price576);
		meals87.add(meal576);

		List<Ingredient> ingredients577 = new ArrayList<>();
		ingredients577.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients577.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients577.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price577 = {0.8, 0.95, 1.1};
		Meal meal577 = new Meal(ingredients577, "Schlemmerquark mit Heidelbeersauce", Type.getType("Wahlmenü (Dessert)"), price577);
		meals87.add(meal577);

		map12.put(Day.getDay("Donnerstag"), meals87);


		List<Meal> meals88 = new ArrayList<>();
		List<Ingredient> ingredients578 = new ArrayList<>();
		ingredients578.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients578.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients578.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price578 = {1.35, 2.8, 3.8};
		Meal meal578 = new Meal(ingredients578, "Bunte Maissuppe", Type.getType("Eintopf"), price578);
		meals88.add(meal578);

		List<Ingredient> ingredients579 = new ArrayList<>();
		ingredients579.add(Ingredient.getIngredientFromName("Rindfleisch"));
		ingredients579.add(Ingredient.getIngredientFromName("Unbekannt"));
		ingredients579.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients579.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients579.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price579 = {1.85, 3.5, 4.3};
		Meal meal579 = new Meal(ingredients579, "Pizza Salami", Type.getType("Tellergericht"), price579);
		meals88.add(meal579);

		List<Ingredient> ingredients580 = new ArrayList<>();
		ingredients580.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients580.add(Ingredient.getIngredientFromName("Fisch und Fischerzeugnisse"));
		ingredients580.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		ingredients580.add(Ingredient.getIngredientFromName("Senf und Senferzeugnisse"));
		double[] price580 = {1.8, 2.9, 3.3};
		Meal meal580 = new Meal(ingredients580, "Seelachsfilet, Senfsauce", Type.getType("Wahlmenü (Komponente mit Fleisch)"), price580);
		meals88.add(meal580);

		List<Ingredient> ingredients581 = new ArrayList<>();
		ingredients581.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients581.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients581.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients581.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients581.add(Ingredient.getIngredientFromName("Eier und Eiererzeugnisse"));
		ingredients581.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price581 = {1.8, 2.9, 3.3};
		Meal meal581 = new Meal(ingredients581, "Gefüllte Käse-Paprika, Tomatensauce", Type.getType("Wahlmenü (Komponente ohne Fleisch)"), price581);
		meals88.add(meal581);

		List<Ingredient> ingredients582 = new ArrayList<>();
		ingredients582.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients582.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price582 = {0.6, 0.9, 1.1};
		Meal meal582 = new Meal(ingredients582, "Basmatireis", Type.getType("Wahlmenü (Beilage)"), price582);
		meals88.add(meal582);

		List<Ingredient> ingredients583 = new ArrayList<>();
		ingredients583.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients583.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		ingredients583.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients583.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price583 = {0.6, 0.9, 1.1};
		Meal meal583 = new Meal(ingredients583, "Kartoffelgratin", Type.getType("Wahlmenü (Beilage)"), price583);
		meals88.add(meal583);

		List<Ingredient> ingredients584 = new ArrayList<>();
		ingredients584.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price584 = {0.6, 0.9, 1.1};
		Meal meal584 = new Meal(ingredients584, "Tagesangebot", Type.getType("Wahlmenü (Beilage)"), price584);
		meals88.add(meal584);

		List<Ingredient> ingredients585 = new ArrayList<>();
		ingredients585.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients585.add(Ingredient.getIngredientFromName("mit Knoblauch"));
		ingredients585.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price585 = {0.65, 0.95, 1.15};
		Meal meal585 = new Meal(ingredients585, "Blattspinat in Rahm", Type.getType("Wahlmenü (Gemüse)"), price585);
		meals88.add(meal585);

		List<Ingredient> ingredients586 = new ArrayList<>();
		ingredients586.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients586.add(Ingredient.getIngredientFromName("Natürlich frisch!"));
		double[] price586 = {0.65, 0.95, 1.15};
		Meal meal586 = new Meal(ingredients586, "Blumenkohlgemüse", Type.getType("Wahlmenü (Gemüse)"), price586);
		meals88.add(meal586);

		List<Ingredient> ingredients587 = new ArrayList<>();
		ingredients587.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price587 = {0.65, 0.95, 1.15};
		Meal meal587 = new Meal(ingredients587, "Tagesangebot", Type.getType("Wahlmenü (Gemüse)"), price587);
		meals88.add(meal587);

		List<Ingredient> ingredients588 = new ArrayList<>();
		ingredients588.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price588 = {0.6, 0.9, 1.1};
		Meal meal588 = new Meal(ingredients588, "Mischsalat, Schnittlauch-Vinaigrette", Type.getType("Wahlmenü (Salat)"), price588);
		meals88.add(meal588);

		List<Ingredient> ingredients589 = new ArrayList<>();
		ingredients589.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients589.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price589 = {0.4, 0.6, 0.8};
		Meal meal589 = new Meal(ingredients589, "Spargelcremesuppe", Type.getType("Wahlmenü (Suppe)"), price589);
		meals88.add(meal589);

		List<Ingredient> ingredients590 = new ArrayList<>();
		ingredients590.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		ingredients590.add(Ingredient.getIngredientFromName("Glutenhaltiges Getreide"));
		ingredients590.add(Ingredient.getIngredientFromName("Milch und Milcherzeugnisse"));
		double[] price590 = {0.8, 0.95, 1.1};
		Meal meal590 = new Meal(ingredients590, "Orangenjoghurt mit Flakes", Type.getType("Wahlmenü (Dessert)"), price590);
		meals88.add(meal590);

		map12.put(Day.getDay("Freitag"), meals88);


		List<Meal> meals89 = new ArrayList<>();
		List<Ingredient> ingredients591 = new ArrayList<>();
		ingredients591.add(Ingredient.getIngredientFromName("ohne Fleisch"));
		double[] price591 = {0.0, 0.0, 0.0};
		Meal meal591 = new Meal(ingredients591, "Tagesangebot", Type.getType("Menü"), price591);
		meals89.add(meal591);

		map12.put(Day.getDay("Samstag"), meals89);


		List<Meal> meals90 = new ArrayList<>();
		map12.put(Day.getDay("Sonntag"), meals90);


	}
	
	
	
	
}
