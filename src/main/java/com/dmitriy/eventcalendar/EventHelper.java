package com.dmitriy.eventcalendar;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/**
 * Created by dmitriy on 7/6/14.
 */
public interface EventHelper {

    Event findEventById(UUID id);

    Event removeEvent(UUID id);

    Event createEvent(String description, List<String> attenders, Date date);

    void addEvent(UUID id,Event event);
}
