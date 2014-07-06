package com.dmitriy.eventcalendar;

import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

/**
 * Created by dmitriy on 7/6/14.
 */
public class EventHelperImpl implements EventHelper {

    private HashMap<UUID,Event> dataSource = new HashMap<>();

    @Override
    public Event findEventById(UUID id) {
        return null;
    }

    @Override
    public void removeEvent(UUID id) {

    }

    @Override
    public void createEvent(String description, String email, Date date) {

    }
}
