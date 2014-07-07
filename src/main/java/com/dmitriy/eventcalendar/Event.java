package com.dmitriy.eventcalendar;


import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by dmitriy on 7/6/14.
 */
public class Event {

    private final String description;
    private  final List<String> attenders; //user email
    private final GregorianCalendar date;

    private  Event(EventBuilder builder){
        this.description = builder.description;
        this.attenders = builder.attenders;
        this.date = builder.date;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getAttenders() {
        return attenders;
    }

    public GregorianCalendar getDate() {
        return date;
    }





    public static class EventBuilder{

        private String description;
        private List<String> attenders;
        private GregorianCalendar date;

        public EventBuilder(){}

        public EventBuilder(Event event){
            this.description = event.description;
            this.attenders = event.attenders;
            this.date = event.date;
        }

        public EventBuilder description(String description){
            this.description = description;
            return this;
        }

        public EventBuilder attenders(List<String> attenders){
            this.attenders = attenders;
            return this;
        }

        public EventBuilder date(GregorianCalendar date){
            this.date = date;
            return this;
        }

        public Event build(){return new Event(this);}

    }
}
