package bootcamp.controler;
import bootcamp.model.Event;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    

/*    @RequestMapping("/greeting")
    public Event greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Event();
    }*/
    
    @RequestMapping("/event")
    public Event event() {
        return new Event();
    }
}
