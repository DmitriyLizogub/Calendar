package com.dmitriy.eventcalendar;

import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

/**
 * Created by dmitriy on 7/6/14.
 */
public interface EventHelper {

    Event findEventById(UUID id);

    void removeEvent(UUID id);

    void createEvent(String description, String email, Date date);
}