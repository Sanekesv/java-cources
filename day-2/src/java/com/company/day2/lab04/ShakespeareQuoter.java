package com.company.day2.lab04;

import org.springframework.stereotype.Component;

@Component
public class ShakespeareQuoter implements Quoter {

    String quote;

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    @Override
    public String sayQuote() {
        return quote;
    }
}