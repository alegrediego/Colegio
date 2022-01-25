package com.solvd;

import com.solvd.enums.Level;
import com.solvd.enums.Subjects;
import com.solvd.enums.Year;
import com.solvd.interfaces.Attendance;
import com.solvd.interfaces.Disease;
import com.solvd.interfaces.Presenteeism;

public abstract class Person implements Attendance, Disease, Presenteeism{

    private Level Level;

    public Level getLevel(){
        return Level;
    }

    private Year Year;

    public Year getYear() { return Year;}

    public void setSubjects(Subjects subjects) {
        this.subjects = subjects;
    }

    public Subjects subjects;

    public Subjects getSubjects() {return subjects;}



    @Override
    public String yes() {
        return null;
    }

    @Override
    public String no() {
        return null;
    }
}
