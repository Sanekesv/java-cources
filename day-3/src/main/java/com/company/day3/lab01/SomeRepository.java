package com.company.day3.lab01;

import java.util.List;

public interface SomeRepository {
    void saveGuest(Guest guest);
    Event getEvent(Long id);
    List<Event> getEvents();
    List<Guest> getGuests();
    Guest findByName(String name);
    void run ();
    void saveEvent(Event event);
}