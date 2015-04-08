package com.company.day2.lab10;

import org.springframework.stereotype.Component;

@Component
public class Service {
    @MyDeprecated(replaceWith = Integer.class)
    public Number replace() {
        return 3;
    }

    public String noReplace() {
        return "";
    }
}