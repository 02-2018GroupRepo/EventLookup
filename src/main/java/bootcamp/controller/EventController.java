package bootcamp.controller;
import bootcamp.dao.EventDao;
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
        return (Event) eventDao.getEventById(id);
}
    
    @RequestMapping("/setEventLocation")
    public Event setEventLocation(@RequestParam(value = "location") String venueLocation) {
    	Event event = new Event();
		event.setLocation(venueLocation);
        return (Event) eventService.getEventById(id);
    }
   
    
}
