package bootcamp.dao;
import java.util.HashMap;
import java.util.Map;

import bootcamp.model.Event;

public class EventDao {

	private Map<String, Event> events = new HashMap<String, Event>();
	
	public EventDao() {
		events.put("001", new Event("Concert", "Two bands", "Atlanta"));
		events.put("002", new Event("Circus", "UniverSoul", "Miami"));
		events.put("003", new Event("Festival", "Music", "Chicago"));
		events.put("004", new Event("Theater", "Wichita", "Philadelphia"));
		
	}
	
	public Event getEventById(String id) {
		Event event = new Event();
		for (Map.Entry<String, Event> entry : events.entrySet()) {
			if (entry.getKey().equals(id)) {
				event=entry.getValue();
			}
		}
		return event;
	}
}
