package bootcamp.controler;
import bootcamp.dao.EventDao;
import bootcamp.model.Event;
import bootcamp.service.EventService;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {
EventService eventService = new EventService();
    

/*    @RequestMapping("/greeting")
    public Event greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Event();
    }*/
    
    @RequestMapping("/getEvent")
    public Event getEvent(@RequestParam(value="eventId", required=true) String id) {
        return (Event) eventService.getEventById(id);
    }
}
