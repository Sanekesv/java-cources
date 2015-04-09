package com.company.day3.lab02.service;


import com.company.day3.lab02.domain.Guest;

public interface UserService {
    Guest register(Guest guest);

    Guest findById(Long id);
}
