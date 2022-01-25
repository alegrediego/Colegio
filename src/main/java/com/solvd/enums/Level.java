package com.solvd.enums;

public enum Level {
    WITHOUT_EDUCATION("Without Education"),
    ELEMENTARY_SCHOOL("Elementary School"),
    MIDDLE_SCHOOL("Middle School"),
    HIGH_SCHOOL("High School"),
    ACADEMIC("Academic"),
    POSTGRADUATE("Postgraduate");

    private final String level;


    Level(String level) {
        this.level = level;
    }

    public String getLevel(){return level;}
}
