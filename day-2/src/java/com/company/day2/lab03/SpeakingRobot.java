package com.company.day2.lab03;

public abstract class SpeakingRobot implements Robot {

    public abstract RandomQuoter getQuoter();

    public String speak() {
        return getQuoter().getRandomQuote();
    }
}