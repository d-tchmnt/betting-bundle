package com.nb.enums;

public enum SpecifierEnum {


    HOME_WIN("1"),
    DRAW("X"),
    AWAY_WIN("2");

    public final String outcome;

    SpecifierEnum(String outcome) {
        this.outcome = outcome;
    }

}
