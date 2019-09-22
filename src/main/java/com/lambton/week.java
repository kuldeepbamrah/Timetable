package com.lambton;

import java.time.LocalTime;

public class week {

    public LocalTime time(String s){

        switch (s) {

            case "MONDAY":

                LocalTime st= LocalTime.parse("17:30");
                return st;

            case "TUESDAY":

                LocalTime st1= LocalTime.parse("17:30");
                return st1;

            case "WEDNESDAY":

                LocalTime st2= LocalTime.parse("17:30");
                return st2;

            case "THURSDAY":

                LocalTime s3= LocalTime.parse("17:30");
                return s3;

            case "FRIDAY":

                LocalTime s4= LocalTime.parse("17:30");
                return s4;

        }

        return null;
    }
}
