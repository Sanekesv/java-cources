package com.company.day3.lab01;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@ContextConfiguration(classes = {
        ClientAppConfig.class
})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestLab03 {

    @Autowired
    SimpleObject simpleObject;


    @Test
    public void test() {
        simpleObject.insert();
        List<Account> accounts = simpleObject.call();
        Assert.assertNotNull(accounts);
        Assert.assertEquals(1, accounts.size());
    }

}
