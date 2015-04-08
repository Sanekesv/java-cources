package com.company.day2.lab05;

import com.company.day2.lab04.Quoter;

public class CustomQuoter implements Quoter {

    private StringBuilder stringBuilder;

    public CustomQuoter(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    @Override
    public String sayQuote() {
        return null;
    }
}