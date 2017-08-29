package com.sport.annotationsconfig.expirience;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope("prototype")
public class BaseExperience implements Experience {
    public String getDescription() {
        return "Base Experience";
    }


    @PostConstruct
    public void afterConstruct(){
        System.out.println("BaseExperience is constructed");
    }
}
