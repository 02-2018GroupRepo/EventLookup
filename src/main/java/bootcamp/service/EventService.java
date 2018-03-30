package bootcamp.service;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import bootcamp.dao.EventDao;
import bootcamp.model.Event;

public class EventService {
	EventDao eventDao = new EventDao();
	
	public Event getEventById(String id){
		return eventDao.getEventById(id);
	}
	
	public Event addEvent(Event event) {
		eventDao.addEvent(event);
		return event;
	}
	
//	public void getVenueCapacity(String venueName, String serverIp) {
//    String tURL = "http://192.168.88." + serverIp + ":8080/venue?name=" + venueName;
//    UriComponentsBuilder builder = UriComponentsBuilder.
//            fromUriString(tURL);
//
//    RestTemplate restTemplate = new RestTemplate();
//
//    Venue response = restTemplate.getForObject(builder.toUriString(), Venue.class);
//    
//	}
}
