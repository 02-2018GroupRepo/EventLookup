package bootcamp.dao;
import java.util.HashMap;
import java.util.Map;

import bootcamp.model.Event;

public class EventDao {

	private Map<String, Event> events = new HashMap<Integer, Event>();
	int counter = 4;
	
	public EventDao() {
		events.put(1, new Event("Concert", "Two bands", "Atlanta"));
		events.put(2, new Event("Circus", "UniverSoul", "Miami"));
		events.put(3, new Event("Festival", "Music", "Chicago"));
		events.put(4, new Event("Theater", "Wichita", "Philadelphia"));	
	}
	
	public Event getEventById(String id) {
		return events.get(id);
	}
	
	public Event addEvent(Event event) {
		counter++;
		events.put(counter, event);
		return events.get(counter);
	}
}