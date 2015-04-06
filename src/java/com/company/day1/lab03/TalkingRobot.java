package com.company.day1.lab03;

import com.company.day1.lab01.RunThisMethod;
import com.company.day1.lab02.Quoter;
import com.company.day1.lab03.Robot;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by Александр on 06.04.2015.
 */
public class TalkingRobot implements Robot {

    public void setQuoters(List<Quoter> quoters) {
        this.quoters = quoters;
    }

    List<Quoter> quoters;

    @Override
    @RunThisMethod(repeat = 10)
    public void talk() {
        System.out.println("I'm robot "+ toString());
        for(Quoter quoter: quoters)
            quoter.sayQuote();
    }
}
