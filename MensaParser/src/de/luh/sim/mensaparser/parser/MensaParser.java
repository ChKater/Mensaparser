package de.luh.sim.mensaparser.parser;

import it.sauronsoftware.feed4j.FeedIOException;
import it.sauronsoftware.feed4j.FeedParser;
import it.sauronsoftware.feed4j.FeedXMLParseException;
import it.sauronsoftware.feed4j.UnsupportedFeedException;
import it.sauronsoftware.feed4j.bean.Feed;
import it.sauronsoftware.feed4j.bean.FeedItem;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import de.luh.sim.mensaparser.model.Day;
import de.luh.sim.mensaparser.model.Meal;
import de.luh.sim.mensaparser.model.Mensa;
import de.luh.sim.mensaparser.model.Week;

/**
 * Parser für den Mensa-Speiseplan des Studentwerks Hannover
 */
public class MensaParser {

	private static Map<Week, Map<Mensa, Map<Day, List<Meal>>>> meals;

	private static void init() {
		meals = new HashMap<>();
		for (Week week : Week.values()) {
			Map<Mensa, Map<Day, List<Meal>>> mensas = new HashMap<>();
			for (Mensa mensa : Mensa.values()) {
				Map<Day, List<Meal>> mealsPerDay = new HashMap<>();
				mensas.put(mensa, mealsPerDay);
			}
			meals.put(week, mensas);
		}

	}

	private static void readFeed(Week week, Mensa mensa) {
		try {
			URL url = new URL("http://www.stwh-portal.de/mensa/index.php?wo="
					+ mensa.getId() + "&wann=" + week.getTimeID()
					+ "&format=rss");
			Feed feed = FeedParser.parse(url);

			int itemsCount = feed.getItemCount();
			Map<Day, List<Meal>> mealsPerDay = meals.get(week).get(mensa);
			for (int i = 0; i < itemsCount; i++) {
				FeedItem item = feed.getItem(i);
				Day day = Day.getDay(item.getTitle().split(" ")[0]);
				mealsPerDay.put(day,
						DayParser.parseDay(item.getDescriptionAsHTML()));

			}
		} catch (MalformedURLException e) {
			handleException();
			return;
		} catch (FeedIOException e) {
			handleException();
			return;
		} catch (FeedXMLParseException e) {
			handleException();
			return;
		} catch (UnsupportedFeedException e) {
			handleException();
			return;
		} catch (IndexOutOfBoundsException e) {
			handleException();
			return;
		}

	}

	/**
	 * Gibt alle Gerichte entsprechend der ausgewählten Mensa, Woche und des
	 * Tages zurück.
	 * 
	 * @param week
	 *            Woche
	 * @param mensa
	 *            Mensa
	 * @param day
	 *            Tag
	 * @return Alle Gerichte die in der gewählten Woche/Tag in der gewählten
	 *         Mensa ausgegeben werden.
	 */
	public static List<Meal> getMeals(Week week, Mensa mensa, Day day) {
		if (meals == null) {
			init();
		}
		Day feedDay = day;
		if (day == Day.TODAY) {
			Calendar calendar = Calendar.getInstance();
			int today = calendar.get(Calendar.DAY_OF_WEEK);
			feedDay = Day.getDay(today - 1);
		}
		List<Meal> list = meals.get(week).get(mensa).get(feedDay);
		if (list == null) {
			readFeed(week, mensa);
			return meals.get(week).get(mensa).get(feedDay);
		}
		return list;
	}
	
	private static void handleException(){
		meals = Dummy.fillDummy();
		System.out.println("dummy loaded");
	}
	
	
}
