package com.dmitriy.eventcalendar;

import java.util.*;

/**
 * Created by dmitriy on 7/6/14.
 */
public class Main {

    public static void main(String [] descriptions){

        List<String> descriptionsList = Arrays.asList(new String[]{"Mike's birthday", "Independence Day", "Project meeting"});//Arrays.asList(descriptions);
        String [] attenders = new String[]{"mike@mail.com", "troy@i.ua", "jimmy@gmail.com"};
        List<String> attendersList = Arrays.asList(attenders);

        List<GregorianCalendar> datesList = new ArrayList<>();
        for (String description : descriptions) {
            datesList.add(new GregorianCalendar(2014, (int) (Math.random() * 12), (int) (Math.random() * 30), (int) (Math.random() * 60), (int) (Math.random() * 60)));
        }

        EventHelperImpl eventHelper = new EventHelperImpl();
        CalendarService calendarService = new CalendarService(eventHelper);

        for(int k = 0; k < descriptionsList.size(); k++){
        calendarService.addEvent(UUID.randomUUID(),calendarService.createEvent(descriptionsList.get(k), attendersList, datesList.get(k)));
        }

        calendarService.showCalendar();

    }
}
