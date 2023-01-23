package com.nb.enums;

public enum SportEnum {


    FOOTBALL("1"),
    BASKETBALL("2");

    public final String name;

    private SportEnum(String name) {
        this.name = name;
    }

    public static SportEnum valueOfLabel(String label) {
        for (SportEnum e : values()) {
            if (e.name.equals(label)) {
                return e;
            }
        }
        return null;
    }
}
