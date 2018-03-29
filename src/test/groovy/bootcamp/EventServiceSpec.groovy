package bootcamp

import java.awt.Event
import spock.lang.Specification

class EventServiceSpec extends Specification {
def "parse venue capacity from json response"(){
	given: "a json response from the venue server"
	json = "{"id":"002","venueName":"west hall","address":"Atlanta","parking":"available","event":"concert","capacity":"100"}"
	when: "venueCapacity is called"
	capacity = json.venueCapacity();
	then: "return the venue capacity"
	capacity == 100
	}
	
def "get venue capacity"(){
given: "an event with a location"
Event event = new Event()
//this is a fake object
event.location = "west hall"
and: "a venueManager that sends back a json response"
//we don't care how the venueManager gets the json respone, we just care that it gets us a response.
//this is the part of code that makes a call to venue and gets a response back, which we need to stub
when: "getVenueCapacity is called"
EventService.getVenueCapacity(event.location);
//is a static method
//this is a method in service class
then: "set the event max number of guests to be equal to the venue capacity"
//event.maxGuest == venueCapacity
	}
	
}
