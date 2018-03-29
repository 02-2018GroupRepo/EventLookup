package bootcamp.controller;
import bootcamp.model.Event;

import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    
    @RequestMapping("/event")
    public Event event() {
        return new Event();
    }
}
