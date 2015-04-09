package com.company.day3.lab02.service;


import com.company.day3.lab02.domain.Event;
import com.company.day3.lab02.domain.Guest;
import com.company.day3.lab02.domain.Order;

public interface OrderService {

    Order signUp(Event event, Guest guest);
}
