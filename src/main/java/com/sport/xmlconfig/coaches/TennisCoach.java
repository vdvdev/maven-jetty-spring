package com.sport.xmlconfig.coaches;

import org.springframework.stereotype.Component;

@Component("5thCoach")
public class TennisCoach implements Coach {
    public String getDescription() {
        return "I am tennis pro!";
    }
}
