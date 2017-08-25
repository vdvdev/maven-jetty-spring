package com.coaching.coachs;

import com.coaching.luck.Luck;

public class FootballCoachWithLuck extends FootbalCoach {

    private Luck luck;
    private String power;

    private String firstName;
    private String secondName;

    public String getDescription() {
        return String.format("%s with %s and %s, my name is %s", super.getDescription(), luck.getLuckLevel(), power, firstName);
    }

    public void setLuck(Luck luck) {
        this.luck = luck;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
