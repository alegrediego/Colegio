package com.solvd.stringutilsandfileutils;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;

import static org.apache.commons.io.FileUtils.copyURLToFile;

public class Util {

    private static final Logger log = Logger.getLogger(Util.class);

    public Util() {

    }

    public static void Count(){
    URL url = null;

    {
        try {
            url = new URL("www.ole.com.ar");
        } catch (MalformedURLException e) {
            log.error("Page not found");
        }
        File file = new File("C:\\Users\\alegr\\IdeaProjects\\Diego Alegre\\Colegio\\log\\garbage.txt");
        try {
            url = new URL("www.ole.com.ar");
            copyURLToFile(url, file);
        } catch (IOException e) {
            log.error("File not found");
        }
        try {
            String contents = FileUtils.readFileToString(file, StandardCharsets.UTF_8.name());
        } catch (IOException e) {
            log.error("Error");
        }
        int f = 0;
        try {
            f = StringUtils.countMatches(FileUtils.readFileToString(file),"Maradona");
        } catch (IOException e) {
            log.error("Word not found");
        }
        File file1 = new File("C:\\Users\\alegr\\IdeaProjects\\Diego Alegre\\Colegio\\log\\ElDiego.txt");
        try {
            FileUtils.writeStringToFile(file1,"The name Maradona is "+f+" times on this page", "UTF-8");
        } catch (IOException e) {
            log.error("Word not found");
        }

        log.info("The name Maradona is " +f+" times on this page");
    }
        String s = FileUtils.getUserDirectoryPath();
        log.info(s);
}
}

