package bootcamp.controller;
import bootcamp.model.Event;
import bootcamp.service.EventService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {
EventService eventService = new EventService();
    
   @RequestMapping("/event")
    public Event event() {
        return new Event();
   }
   
/*    @RequestMapping("/greeting")
    public Event greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Event();
    }*/
    
    @RequestMapping("/getEvent")
    public Event getEvent(@RequestParam(value="eventId", required=true) String id) {
        return (Event)eventService.getEventById(id);
}
    
    @RequestMapping("/setEventLocation")
    public Event setEventLocation(@RequestParam("location") String venueLocation, @RequestParam(value = "id", required=true) String id) {
		eventService.getEventById(id).setLocation(venueLocation);
        return (Event)eventService.getEventById(id);
    }
    
    @RequestMapping("/addEvent")
    public Event addEvent(@RequestParam("name") String name, 
    		@RequestParam("description") String description, 
    		@RequestParam("location") String location) {
    	Event event = new Event(name,description,location);
    	eventService.addEvent(event);
    	return event;
    }
}