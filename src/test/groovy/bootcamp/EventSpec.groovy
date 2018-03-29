package bootcamp

import bootcamp.model.Event
import spock.lang.Specification

class EventSpec extends Specification {

	def "make an event"(){
		given: "an event"
		
		when: "make an event"
		Event concert = new Event();
		then: "return the name"
		concert.getName()=="concert";
		and: "return description"
		concert.getDescription()=="two bands";
		and:"return location"
		concert.getLocation()=="Georgia";
	}
	def "set location"(){
		given: "a location"
		String newLocation = "location"
		and: "an event"
		Event concert = new Event();
		when: "location is set"
		concert.setLocation(newLocation)
		then: "location changes"
		concert.getLocation()== newLocation
	}
	
}
