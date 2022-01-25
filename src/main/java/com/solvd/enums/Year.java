package com.solvd.enums;

public enum Year {
    FIRST("First"),
    SECOND("Second"),
    THIRD("Third"),
    FOURTH("Fourth"),
    FIFTH("Fifth"),
    SIXTH("Sixth"),
    SEVENTH("Seventh");

    private String name;

    Year(String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }
}
