package com.solvd.exceptions;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exception extends Throwable {


    public Exception(String message) {
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) throws esc1 {
        while (extension.equalsIgnoreCase("txt"))
        this.extension = extension;

         {
            throw new esc1("Extension not allowed");
        }

    }

    public String extension;
    private static final Logger log = Logger.getLogger(Exception.class);

    public Exception() {

    }

    public static void esc() throws IOException {
        File file2 = new File("nothing.txt");
        BufferedReader br;
        try {
            java.io.FileReader fr = new java.io.FileReader(file2);
            br = new BufferedReader(fr);

            String line;

            while ((line = br.readLine()) != null) {
                log.info(line);
            }
        } catch (FileNotFoundException e) {
            log.error("File not found: " + file2.toString());
        }
    }

    public class esc1 extends java.lang.Exception {
        public esc1(){
            super();
        }

        public esc1(String message) {
            super(message);
        }
    }
        public static void esc1() {
        try {

        } catch (java.lang.Exception e) {
            log.error(" Extension not allowed");
        }
    }

    public static double getDivision(double n1, double n2){
        return n1/n2;
    }

    public class divideby0 extends Exception{

        public divideby0(String message){
            super(message);
        }



    }


}