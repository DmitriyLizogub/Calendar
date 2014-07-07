package com.dmitriy.eventcalendar;

import java.util.*;

/**
 * Created by dmitriy on 7/6/14.
 */
public class Main {

    public static void main(String [] descriptions){

        List<String> descriptionsList = Arrays.asList(descriptions);
        List<String> attendersList = new ArrayList<String>();
        String [] attenders = new String[]{"mike@mail.com", "troy@i.ua", "jimmy@gmail.com"};
        attendersList = Arrays.asList(attenders);



        EventHelperImpl eventHelper = new EventHelperImpl();
        CalendarService calendarService = new CalendarService(eventHelper);





    }
}
