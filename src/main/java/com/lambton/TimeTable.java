package com.lambton;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeTable {

    public static void main(String[] args)
    {

        LocalDate today  = LocalDate.now();
        LocalTime now= LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMM-YYYY");
        RemainingTime rt = new RemainingTime();
        LocalTime tr= rt.rTime(now);
        String dn= String.valueOf(today.getDayOfWeek());


        if(dn.equalsIgnoreCase("SUNDAY")|| dn.equalsIgnoreCase("Saturday"))
        {
            int h=tr.getHour();
            h=h+24;
            System.out.println("Time remaining for next class: "+ h + " Hours " + tr.getMinute()+ " Minutes "+ " and "+ tr.getSecond() + " Seconds." );

        }
        else
            System.out.println("Time remaining for next class: "+ tr.getHour() + " Hours " + tr.getMinute()+ " Minutes "+ "and "+ tr.getSecond() + " Seconds." );



        for(int i=1; i<=7; i++) {
             LocalDate today1 = today.plusDays(i);
             String s = String.valueOf(today1.getDayOfWeek());

            if (s.equalsIgnoreCase("Sunday") || s.equalsIgnoreCase("saturday"))
            {

                System.out.println(s + ", " + formatter.format(today1) + " Week Off");
            }
            else
                {

                week w = new week();
                LocalTime st = w.time(s);
                System.out.println(s + ", " + formatter.format(today1) + " at " + st+" Till "+st.plusHours(4).plusMinutes(15));
            }
        }

   }
}
