package com.sport.xmlconfig.coaches;

import com.sport.xmlconfig.luck.Luck;

public class BaseballCoachWithLuck extends BaseballCoach implements Coach {
    private Luck luck;

    public BaseballCoachWithLuck(Luck luck) {
        this.luck = luck;
    }

    @Override
    public String getDescription() {
        return String.format("%s with %s", super.getDescription(), luck.getLuckLevel());
    }
}
