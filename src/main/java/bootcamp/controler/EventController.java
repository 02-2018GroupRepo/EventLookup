package bootcamp.controler;
import bootcamp.dao.EventDao;
import bootcamp.model.Event;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {
EventDao eventDao = new EventDao();
    

/*    @RequestMapping("/greeting")
    public Event greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Event();
    }*/
    
    @RequestMapping("/getEvent")
    public Event getEvent(@RequestParam(value="eventId", required=true) String id) {
        return (Event) eventDao.getEventById(id);
    }
}
