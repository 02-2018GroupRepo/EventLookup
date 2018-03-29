package bootcamp

import bootcamp.dao.EventDao
import bootcamp.service.EventService
import bootcamp.model.Event
import spock.lang.Specification

class EventServiceSpec extends Specification {

	def "get an event by ID"(){
		given: "an event ID"
		String id = "005"
		and: "an event"
		//this is a fake event
		Event event = new Event("name","desc","loc");
		event.name="Theater"
		event.description="Musical"
		event.location="Atlanta"
		and: "an EventService"
		EventService eventService = new EventService();
		//stubing the dao
		EventDao eventDao = Stub(EventDao.class);
		//if the dao is called return the fake event
		eventDao.getEventById(id) >> event;
		eventService.eventDao=eventDao;
		when: "an event is searched by ID"
		Event returnedEvent = eventService.getEventById(id);
		then: "return an event by that ID"
		returnedEvent==event;
	}
}
