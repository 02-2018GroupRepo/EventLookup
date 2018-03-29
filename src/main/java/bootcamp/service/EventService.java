package bootcamp.service;

import bootcamp.dao.EventDao;
import bootcamp.model.Event;

public class EventService {
	EventDao eventDao = new EventDao();
	
	public Event getEventById(String id){
		return eventDao.getEventById(id);
	}
}
