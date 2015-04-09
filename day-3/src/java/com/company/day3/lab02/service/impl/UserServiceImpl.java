package com.company.day3.lab02.service.impl;

import com.company.day1.lab08.Transactional;
import com.company.day3.lab02.dao.UserDao;
import com.company.day3.lab02.domain.Guest;
import com.company.day3.lab02.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;

    @Transactional
    @Override
    public Guest register(Guest guest) {
        return userDao.register(guest);
    }

    @Override
    public Guest findById(Long id) {
        return userDao.findById(id);
    }
}
