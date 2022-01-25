package com.solvd.persons;

import com.solvd.Person;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;
import com.solvd.enums.Subjects;

    public class Students extends Person {
    private String Name;
    private String LastName;
    private String DNI;
    private Enum Year;



    private static Logger log = Logger.getLogger(Students.class);

    public Students(String Name, String LastName, String DNI, Enum Year, Enum subjects) {{


        this.Name = Name;
        this.LastName = LastName;
        this.DNI = DNI;
        this.Year = Year;
        this.subjects = setSubjects();
        String sp = StringUtils.SPACE ;
        log.debug("Student"+sp+Name+sp+LastName+sp+DNI+sp+Year+sp+subjects);
    }
      /*  String Empty = StringUtils.EMPTY;
        Logjava.info(Empty);
    */
    };

        public Subjects setSubjects() {
            this.subjects = (Subjects) subjects;
            return null;
        }

        public Object getName(){

    return Name+" "+LastName;
    }



    @Override
    public String yes() {

        return null;
    }

    @Override
    public String no() {
        return null;
    }



    public String ill(){
        return "Student "+Name+" "+LastName+" is ill";
    }


        @Override
        public Number getValue() {
            return null;
        }

        @Override
        public double setValue(Number number) {

            return 0;
        }
    }

