package com.sport.xmlconfig.luck;

public class AdvancedLuck implements Luck{
    public String getLuckLevel() {
        return "advanced luck level";
    }

    public void luckInitiated() {
        System.out.println("Advanced Luck is initiated");
    }

    public void luckLost() {
        System.out.println("Advanced Luck is lost");
    }
}
