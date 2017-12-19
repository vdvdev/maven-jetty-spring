package com.sport.javaconfig.staff;

import com.sport.javaconfig.motivation.Motivation;
import org.springframework.beans.factory.annotation.Value;

public class BaseballStaff implements Staff {
    private Motivation motivation;
    @Value("${staff.firstname}")
    private String firstname;

    public BaseballStaff(Motivation motivation) {
        this.motivation = motivation;
    }

    public String showDescription() {
        return String.format("I am BaseballStaff with %s my name is %s", motivation.getDescription(), firstname);
    }
}
