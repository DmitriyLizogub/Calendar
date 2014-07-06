package com.dmitriy.eventcalendar;

import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

/**
 * Created by dmitriy on 7/6/14.
 */
public class CalendarService {

    private final EventHelperImpl eventResource;


    public CalendarService(EventHelperImpl eventResource){this.eventResource = eventResource;}

    public Event findEventById(UUID id) {
        return eventResource.findEventById(id);
    }

    public void removeEvent(UUID id) {

    }

    public void createEvent(String description, String email, Date date) {

    }
}
