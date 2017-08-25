package com.coaching.coachs;

import com.coaching.luck.Luck;

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
