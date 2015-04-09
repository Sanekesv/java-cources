package com.company.day3.lab02.dao;

import com.company.day3.lab02.domain.Guest;

public interface UserDao {

    Guest register(Guest guest);

    Guest findById(Long id);
}
