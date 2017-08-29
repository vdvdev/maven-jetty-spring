package com.sport.javaconfig.staff;

import com.sport.javaconfig.motivation.Motivation;
import org.springframework.context.annotation.Bean;

public class BaseballStaff implements Staff {
    private Motivation motivation;

    public BaseballStaff(Motivation motivation) {
        this.motivation = motivation;
    }

    public String showDescription() {
        return String.format("I am BaseballStaff with %s", motivation.getDescription());
    }
}
