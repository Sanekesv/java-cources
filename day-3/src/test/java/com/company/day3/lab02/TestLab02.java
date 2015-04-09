package com.company.day3.lab02;

import com.company.day3.lab02.domain.Guest;
import com.company.day3.lab02.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(classes = {
        AppConfig.class
})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestLab02 {

    @Autowired
    UserService userService;

    @Test
    public void testSaveUser() {
        Guest register = userService.register(new Guest());
        Assert.assertNotNull(register.getId());
        Guest byId = userService.findById(register.getId());
        Assert.assertNotNull(byId);
    }
}