package com.solvd.enums;

public enum Subjects {

        MATHS("Mathematics School Textbooks & Study Guides"),
        GEOGRAPHY("High School Geography & Geosciences Study Guides"),
        MUSIC("School of Music "),
        ARTS("The Arts - School Level Textbooks"),
        HISTORY("The Best World History Books For High Schoolers"),
        SCIENCE("The Art of Teaching Science");

  private final String book;


    Subjects(String book) {
        this.book = book;
    }

    public String getBook(){return book;}


}


