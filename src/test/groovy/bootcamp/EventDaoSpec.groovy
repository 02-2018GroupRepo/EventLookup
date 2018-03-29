package bootcamp

import bootcamp.dao.EventDao
import bootcamp.model.Event
import spock.lang.Specification

class EventDaoSpec extends Specification {

	
def "retrive the event with an id"(){
	given: "an event id"
	String id = "001";
	and: "an eventDao"
	EventDao eventDao = new EventDao();
	when: "an event with an id is requested"
	Event event = eventDao.getEventById(id);
	then: "return the event corresponding to the id"
	event.name.equals("Concert");
	}
}
