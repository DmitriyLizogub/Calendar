package com.dmitriy.eventcalendar;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

/**
 * Created by dmitriy on 7/6/14.
 */
public class EventHelperImpl implements EventHelper {

    private HashMap<UUID,Event> dataSource = new HashMap<>();

    @Override
    public Event findEventById(UUID id) {
        if(dataSource.containsKey(id))
        {return dataSource.get(id);} else
            return null;
    }

    @Override
    public Event removeEvent(UUID id) {
        if(dataSource.containsKey(id)){
        return dataSource.remove(id);} else
            return null;
    }

    @Override
    public Event createEvent(String description, List<String> attenders, Date date) {
        return new Event.EventBuilder().description(description).attenders(attenders).date(date).build();

    }

    @Override
    public void addEvent(UUID id, Event event) {
        dataSource.put(id, event);

    }
}
