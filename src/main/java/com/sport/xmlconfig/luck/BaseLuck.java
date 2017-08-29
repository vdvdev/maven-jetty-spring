package com.sport.xmlconfig.luck;

public class BaseLuck implements Luck{
    public String getLuckLevel() {
        return "basic luck level";
    }

    public void luckInitiated() {
        System.out.println("Base Luck is initiated");
    }

    public void luckLost() {
        System.out.println("Base Luck is lost");
    }
}
